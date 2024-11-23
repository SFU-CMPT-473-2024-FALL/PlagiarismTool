import java.io.*;
import java.nio.file.*;
import java.security.MessageDigest;
import java.util.*;

public class PlagiarismTool {

    private static final int K_GRAM_SIZE = 20; // k-gram size (smaller value = handles shorter text)
    private static final int WINDOW_SIZE = 3; // window size (smaller value = better matching)

    public static void main(String[] args) throws IOException {

        // Read files
        String file1 = Files.readString(Paths.get(args[0]));
        String file2 = Files.readString(Paths.get(args[1]));

        // Normalize content
        String normFile1 = normalize(file1);
        String normFile2 = normalize(file2);

        // Debug: Print normalized content for both files
        System.out.println("Normalized File 1: " + normFile1 + "\n");
        System.out.println("Normalized File 2: " + normFile2);

        // Generate k-grams, hashes, and fingerprints
        List<KGram> kGrams1 = generateKGrams(normFile1);
        List<KGram> kGrams2 = generateKGrams(normFile2);

        List<Integer> hashList1 = getHashes(kGrams1);
        List<Integer> hashList2 = getHashes(kGrams2);

        List<Integer> fingerprints1 = generateFingerprints(hashList1);
        List<Integer> fingerprints2 = generateFingerprints(hashList2);

        System.out.println("Comparing fingerprints:");
        List<Region> matchedRegions = compareFingerprints(kGrams1, kGrams2, fingerprints1, fingerprints2);

        double plagiarismRatio = calculatePlagiarismPercentage(matchedRegions, file1.length());
        System.out.printf("Approximate plagiarism percentage: %.2f%%\n", plagiarismRatio * 100);

        System.out.println("Plagiarized content:");
        System.out.println(highlightPlagiarism(file1, matchedRegions));
    }

    // Normalize input (removes comments, whitespace, case normalization)
    private static String normalize(String code) {
        return code.replaceAll("//.*|/\\*.*?\\*/", "") 
                .replaceAll("\\s+", " ") 
                .toLowerCase(); 
    }

    // Generate k-grams and calculate their hash values
    private static List<KGram> generateKGrams(String text) {
        List<KGram> kGrams = new ArrayList<>();
        for (int i = 0; i <= text.length() - K_GRAM_SIZE; i++) {
            String kGramText = text.substring(i, i + K_GRAM_SIZE);
            int hash = hashSHA1(kGramText);
            kGrams.add(new KGram(kGramText, hash, i, i + K_GRAM_SIZE));
        }
        return kGrams;
    }

    // Hash function (SHA-1)
    private static int hashSHA1(String text) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-1");
            byte[] hashBytes = digest.digest(text.getBytes("UTF-8"));
            String hexHash = bytesToHex(hashBytes);
            return Integer.parseInt(hexHash.substring(hexHash.length() - 4), 16);
        } catch (Exception e) {
            throw new RuntimeException("Hasing Error", e);
        }
    }

    private static String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }

    // Extract hash values from k-grams
    private static List<Integer> getHashes(List<KGram> kGrams) {
        List<Integer> hashes = new ArrayList<>();
        for (KGram kGram : kGrams) {
            hashes.add(kGram.hash);
        }
        return hashes;
    }

    // Create fingerprints using Winnowing algorithm
    private static List<Integer> generateFingerprints(List<Integer> hashes) {
        List<Integer> fingerprints = new ArrayList<>();
        int prevMinIndex = -1;

        for (int i = 0; i <= hashes.size() - WINDOW_SIZE; i++) {
            List<Integer> window = hashes.subList(i, i + WINDOW_SIZE);
            int minIndex = i + findMinIndex(window);

            if (minIndex != prevMinIndex) {
                fingerprints.add(hashes.get(minIndex));
                prevMinIndex = minIndex;
            }
        }

        // Debug:check fingerprints generated
        // System.out.println("Fingerprints generated: " + fingerprints);
        return fingerprints;
    }

    private static int findMinIndex(List<Integer> window) {
        int minIndex = 0;
        for (int i = 1; i < window.size(); i++) {
            if (window.get(i) < window.get(minIndex)) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    // Compare fingerprints and find matching regions
    private static List<Region> compareFingerprints(List<KGram> kGrams1, List<KGram> kGrams2,
            List<Integer> fingerprints1, List<Integer> fingerprints2) {
        // Create maps from fingerprints to KGrams
        Map<Integer, KGram> kGramMap1 = new HashMap<>();
        for (KGram kGram : kGrams1) {
            kGramMap1.put(kGram.hash, kGram);
        }

        Map<Integer, KGram> kGramMap2 = new HashMap<>();
        for (KGram kGram : kGrams2) {
            kGramMap2.put(kGram.hash, kGram);
        }

        // Match fingerprints
        Set<Integer> fingerprintSet2 = new HashSet<>(fingerprints2);
        List<Region> regions = new ArrayList<>();
        for (int fp1 : fingerprints1) {
            if (fingerprintSet2.contains(fp1) && kGramMap1.containsKey(fp1)) {
                KGram matched1 = kGramMap1.get(fp1);
                regions.add(new Region(matched1.start, matched1.end));
            }
        }

        return mergeOverlappingRegions(regions);
    }

    private static List<Region> mergeOverlappingRegions(List<Region> regions) {
        if (regions.isEmpty())
            return regions;

        regions.sort(Comparator.comparingInt(r -> r.start));
        List<Region> merged = new ArrayList<>();
        Region prev = regions.get(0);

        for (int i = 1; i < regions.size(); i++) {
            Region curr = regions.get(i);
            if (curr.start <= prev.end) {
                prev.end = Math.max(prev.end, curr.end);
            } else {
                merged.add(prev);
                prev = curr;
            }
        }
        merged.add(prev);

        // Debugging: Output merged regions
        // System.out.println("Merged regions: " + merged);
        return merged;
    }

    // Calculate plagiarism percentage
    private static double calculatePlagiarismPercentage(List<Region> regions, int codeLength) {
        int plagiarizedLength = 0;
        for (Region region : regions) {
            plagiarizedLength += (region.end - region.start);
        }

        // Debugging: Output total plagiarized length
        // System.out.println("Total plagiarized length: " + plagiarizedLength);
        return (double) plagiarizedLength / codeLength;
    }

    // Highlight plagiarized portion of file
    private static String highlightPlagiarism(String code, List<Region> regions) {
        StringBuilder highlightedCode = new StringBuilder();
        int lastIndex = 0;

        for (Region region : regions) {
            highlightedCode.append(code, lastIndex, region.start);
            highlightedCode.append("\033[42m") 
                    .append(code, region.start, region.end)
                    .append("\033[0m"); 
            lastIndex = region.end;
        }
        highlightedCode.append(code.substring(lastIndex));
        return highlightedCode.toString();
    }

    // Helper Classes
    static class KGram {
        String text;
        int hash, start, end;

        KGram(String text, int hash, int start, int end) {
            this.text = text;
            this.hash = hash;
            this.start = start;
            this.end = end;
        }
    }

    static class Region {
        int start, end;

        Region(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
}
