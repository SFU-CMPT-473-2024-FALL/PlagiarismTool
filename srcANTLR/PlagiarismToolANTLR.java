import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.*;
import java.nio.file.*;
import java.security.MessageDigest;
import java.util.*;

public class PlagiarismToolANTLR {

    private static final int K_GRAM_SIZE = 20; // k-gram size
    private static final int WINDOW_SIZE = 3; // window size

    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.out.println("Usage: java PlagiarismTool <path_to_test_folder>");
            return;
        }

        Path testFolder = Paths.get(args[0]);
        if (!Files.exists(testFolder) || !Files.isDirectory(testFolder)) {
            System.out.println("Invalid folder path: " + testFolder);
            return;
        }

        // Get all files in the folder
        List<Path> files = new ArrayList<>();
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(testFolder)) {
            for (Path entry : stream) {
                if (Files.isRegularFile(entry)) {
                    files.add(entry);
                }
            }
        }

        if (files.size() < 2) {
            System.out.println("Not enough files in the folder to compare.");
            return;
        }

        for (int i = 0; i < files.size(); i++) {
            for (int j = i + 1; j < files.size(); j++) {
                Path file1 = files.get(i);
                Path file2 = files.get(j);

                System.out.println("\nComparing: " + file1.getFileName() + " and " + file2.getFileName());

                String content1 = Files.readString(file1);
                String content2 = Files.readString(file2);

                String normalizedContent1 = parseWithANTLR(content1);
                String normalizedContent2 = parseWithANTLR(content2);

                List<KGram> kGrams1 = generateKGrams(normalizedContent1);
                List<KGram> kGrams2 = generateKGrams(normalizedContent2);

                List<Integer> hashList1 = getHashes(kGrams1);
                List<Integer> hashList2 = getHashes(kGrams2);

                List<Integer> fingerprints1 = generateFingerprints(hashList1);
                List<Integer> fingerprints2 = generateFingerprints(hashList2);

                List<Region> matchedRegions = compareFingerprints(kGrams1, kGrams2, fingerprints1, fingerprints2);
                double plagiarismRatio = calculatePlagiarismPercentage(matchedRegions, content1.length());

                System.out.printf("Approximate plagiarism percentage: %.2f%%\n", plagiarismRatio * 100);
                System.out.println("Plagiarized content:");
                System.out.println(highlightPlagiarism(content1, matchedRegions));
            }
        }
    }

    private static String parseWithANTLR(String code) {
        CharStream input = CharStreams.fromString(code);
        PlagiarismToolLexer lexer = new PlagiarismToolLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PlagiarismToolParser parser = new PlagiarismToolParser(tokens);
        ParseTree tree = parser.diagrams();
        return tree.toStringTree(parser);
    }

    // // Normalize input by removing comments, extra spaces, etc.
    // private static String normalize(String code) {
    //     return code.replaceAll("//.*|/\\*.*?\\*/", "")
    //             .replaceAll("\\s+", " ")
    //             .toLowerCase();
    // }

    private static List<KGram> generateKGrams(String text) {
        List<KGram> kGrams = new ArrayList<>();
        for (int i = 0; i <= text.length() - K_GRAM_SIZE; i++) {
            String kGramText = text.substring(i, i + K_GRAM_SIZE);
            int hash = hashSHA1(kGramText);
            kGrams.add(new KGram(kGramText, hash, i, i + K_GRAM_SIZE));
        }
        return kGrams;
    }

    private static int hashSHA1(String text) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-1");
            byte[] hashBytes = digest.digest(text.getBytes("UTF-8"));
            String hexHash = bytesToHex(hashBytes);
            return Integer.parseInt(hexHash.substring(hexHash.length() - 4), 16);
        } catch (Exception e) {
            throw new RuntimeException("Hashing Error", e);
        }
    }

    private static String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }

    private static List<Integer> getHashes(List<KGram> kGrams) {
        List<Integer> hashes = new ArrayList<>();
        for (KGram kGram : kGrams) {
            hashes.add(kGram.hash);
        }
        return hashes;
    }

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

    private static List<Region> compareFingerprints(List<KGram> kGrams1, List<KGram> kGrams2,
            List<Integer> fingerprints1, List<Integer> fingerprints2) {
        Map<Integer, KGram> kGramMap1 = new HashMap<>();
        for (KGram kGram : kGrams1) {
            kGramMap1.put(kGram.hash, kGram);
        }

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
        return merged;
    }

    private static double calculatePlagiarismPercentage(List<Region> regions, int codeLength) {
        int plagiarizedLength = 0;
        for (Region region : regions) {
            plagiarizedLength += (region.end - region.start);
        }
        return (double) plagiarizedLength / codeLength;
    }

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
