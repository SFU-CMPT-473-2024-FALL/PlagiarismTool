import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;
import java.nio.file.*;
import java.security.MessageDigest;
import java.util.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PlagiarismToolANTLR {

    private static final int K_GRAM_SIZE = 20; // k-gram size
    private static final int WINDOW_SIZE = 3; // window size

    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.out.println("Usage: java PlagiarismTool <path_to_test_folder>");
            return;
        }

        if ("data".equals(args[0])) {
            scanData("data/dataset", "data/plags/insert");
            System.out.println("\n\n");
            scanData("data/dataset", "data/plags/insert_after_reorder");
            System.out.println("\n\n");
            scanData("data/dataset", "data/plags/reorder");
            return;
        }

        Path testFolder = Paths.get(args[0]);
        if (!Files.exists(testFolder) || !Files.isDirectory(testFolder)) {
            System.out.println("Invalid folder path: " + testFolder);
            return;
        }

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

        Path baseFile = files.get(0);
        String baseContent = Files.readString(baseFile);
        String normalizedBaseContent = parseWithANTLR(baseContent);
        List<KGram> baseKGrams = generateKGrams(normalizedBaseContent);
        List<Integer> baseHashList = getHashes(baseKGrams);
        List<Integer> baseFingerprints = generateFingerprints(baseHashList);

        for (int i = 1; i < files.size(); i++) {
            Path otherFile = files.get(i);
            System.out.println("\nComparing: " + baseFile.getFileName() + " and " + otherFile.getFileName());
            String otherContent = Files.readString(otherFile);
            String normalizedOtherContent = parseWithANTLR(otherContent);
            List<KGram> otherKGrams = generateKGrams(normalizedOtherContent);
            List<Integer> otherHashList = getHashes(otherKGrams);
            List<Integer> otherFingerprints = generateFingerprints(otherHashList);
            double jaccardCalc = generatejaccardCalc(baseFingerprints, otherFingerprints);
            System.out.printf("Plagiarism percentage (Jaccard Similarity): %.2f%%\n", jaccardCalc * 100);
        }
    }

    private static void scanData(String datasetPath, String plagPath) {
        // Path dataDir = Paths.get("data/dataset");
        // Path plagInsertDir = Paths.get("data/plags/insert");
        // Path plagInsertAfterReorderDir = Paths.get("data/plags/insert_after_reorder");
        // Path plagDir = Paths.get("data/plags/reorder");

        Path dataDir = Paths.get(datasetPath);
        Path plagDir = Paths.get(plagPath);

        List<Path> datasetSubdirs = getSubdirectories(dataDir);
        List<Path> plagiarizedSubdirs = getSubdirectories(plagDir);

        if (datasetSubdirs.size() != plagiarizedSubdirs.size()) {
            System.out.println("NUM DIRS NOT MATCHING!");
            return;
        }

        int fileCount = 0;

        for (int i = 0; i < datasetSubdirs.size(); i++) {
            Path datasetSubdir = datasetSubdirs.get(i);
            Path plagiarizedSubdir = plagiarizedSubdirs.get(i);

            Path datasetFile = getJavaFile(datasetSubdir);
            Path plagiarizedFile = getJavaFile(plagiarizedSubdir);

            if (datasetFile != null && plagiarizedFile != null) {
                try {
                    // original
                    String baseContent = Files.readString(datasetFile);
                    String normalizedBaseContent = parseWithANTLR(baseContent);
                    List<KGram> baseKGrams = generateKGrams(normalizedBaseContent);
                    List<Integer> baseHashList = getHashes(baseKGrams);
                    List<Integer> baseFingerprints = generateFingerprints(baseHashList);

                    // plagiarised
                    String otherContent = Files.readString(plagiarizedFile);
                    String normalizedOtherContent = parseWithANTLR(otherContent);
                    List<KGram> otherKGrams = generateKGrams(normalizedOtherContent);
                    List<Integer> otherHashList = getHashes(otherKGrams);
                    List<Integer> otherFingerprints = generateFingerprints(otherHashList);

                    double jaccardCalc = generatejaccardCalc(baseFingerprints, otherFingerprints);
                    System.out.printf("Plagiarism percentage (Jaccard Similarity): %.2f%%\n", jaccardCalc * 100);

                    fileCount++;
                } catch (Exception e) {
                    System.out.println("ERROR: Unable to execute winnow algorithm");
                }
            } else {
                System.out.println("ERROR: Unable to read data file");
            }
        }

        System.out.printf("*** %d FILES READ!%n", fileCount);

    }

    private static List<Path> getSubdirectories(Path dir) {
        List<Path> subdirs = new ArrayList<>();

        if (!Files.exists(dir) || !Files.isDirectory(dir)) {
            System.out.println("ERROR: Invalid directory path - " + dir);
            return subdirs;
        }

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
            for (Path entry : stream) {
                if (Files.isDirectory(entry)) {
                    subdirs.add(entry);
                }
            }
        } catch (IOException e) {
            System.out.println("ERROR: Unable to retrieve subdirectories");
        }
        return subdirs;
    }

    private static Path getJavaFile(Path dir) {
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir, "*.java")) {
            for (Path entry : stream) {
                if (Files.isRegularFile(entry)) {
                    return entry;
                }
            }
        } catch (IOException e) {
            System.out.println("ERROR: Unable to locate any .java file");
        }
        return null;
    }



    private static String parseWithANTLR(String code) {
        CharStream input = CharStreams.fromString(code);
        PlagiarismToolLexer lexer = new PlagiarismToolLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PlagiarismToolParser parser = new PlagiarismToolParser(tokens);
        ParseTree tree = parser.diagrams();
        return tree.toStringTree(parser);
    }

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

    public static double generatejaccardCalc(List<Integer> fingerprints1, List<Integer> fingerprints2) {
        Set<Integer> set1 = new HashSet<>(fingerprints1);
        Set<Integer> set2 = new HashSet<>(fingerprints2);
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2); 
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2); 
        int intersectionSize = intersection.size();
        int unionSize = union.size();
        if (unionSize == 0) {
            return 0.0;
        }
        return (double) intersectionSize / unionSize;
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
}
