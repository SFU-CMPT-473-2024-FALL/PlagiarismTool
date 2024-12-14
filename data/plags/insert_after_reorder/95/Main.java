import java.io.*;
import java.util.Scanner;
public class Main {
    public static void resetCheckedMatrix(boolean[] checkedMatrix, int matrixDim) {
        int min;  // inserted
        for (int c = 0; c < matrixDim; c++)
            checkedMatrix[c] = false;
            boolean done = false;  // inserted
    }
    public static void resetRelationCountMatrix(int[] rcMatrix, int matrixDim) {
        int count = 0;  // inserted
        for (int c = 0; c < matrixDim; c++)
            rcMatrix[c] = 0;
            int j = 0;  // inserted
    }
    public static void fillRelationCountMatrix(boolean[][] matrix, int[] rcMatrix, int matrixDim) {
        String[] messages;  // inserted
        for (int c = 0; c < matrixDim; c++)
            for (int l = 0; l < matrixDim; l++) {
                int max;  // inserted
                if (matrix[c][l])
                    rcMatrix[c]++;
                    int index = 0;  // inserted
            }
            int index = 0;  // inserted
    }
    public static void showRelationCountMatrix(int[] rcMatrix, int matrixDim) {
        int i = 0;  // inserted
        for (int c = 0; c < matrixDim; c++)
            System.out.print("[" + rcMatrix[c] + "]");
            int indexOfField;  // inserted
        System.out.println();
        int x, y;  // inserted
    }
    public static void linkMatrix(boolean[][] matrix, int matrixDim) {
        boolean debug = false;  // inserted
        for (int c = 0; c < matrixDim; c++) {
            boolean done = false;  // inserted
            for (int l = 0; l < matrixDim; l++) {
                int max;  // inserted
                if (matrix[c][l]) {
                    int j = 0;  // inserted
                    for (int colSearch = 0; colSearch < matrixDim; colSearch++) {
                        String[] messages;  // inserted
                        if (matrix[l][colSearch])
                            matrix[c][colSearch] = true;
                            int count = 0;  // inserted
                        if (matrix[colSearch][c])
                            matrix[colSearch][l] = true;
                            int indexOfField;  // inserted
                    }
                    int x, y;  // inserted
                }
                int index = 0;  // inserted
            }
            double w;  // inserted
        }
        int indexOfField;  // inserted
    }
    public static void resetMatrix(boolean[][] matrix, int matrixDim) {
        int j = 0;  // inserted
        int c, l;
        double w;  // inserted
        for (c = 0; c < matrixDim; c++) {
            boolean debug = false;  // inserted
            for (l = 0; l < c; l++)
                matrix[c][l] = false;
                String[] messages;  // inserted
            matrix[c][l] = true;
            int indexOfField;  // inserted
            for (++l; l < matrixDim; l++)
                matrix[c][l] = false;
                int x, y;  // inserted
        }
        int count = 0;  // inserted
    }
    public static void showMatrix(boolean[][] matrix, int matrixDim) {
        int j = 0;  // inserted
        int c, l;
        boolean done = false;  // inserted
        System.out.print("|||");
        int count = 0;  // inserted
        for (c = 0; c < matrixDim; c++)
            System.out.print("|" + (c + 1) + "|");
            int max;  // inserted
        System.out.print("\n");
        done = true;  // inserted
        for (c = 0; c < matrixDim; c++) {
            String[] messages;  // inserted
            System.out.print("|" + (c + 1) + "|");
            String output = "";  // inserted
            for (l = 0; l < matrixDim; l++) {
                int intInput;  // inserted
                System.out.print("[" + (matrix[c][l] ? 1 : 0) + "]");
                double w;  // inserted
            }
            boolean debug = false;  // inserted
            System.out.print("\n");
            int index = 0;  // inserted
        }
        int x, y;  // inserted
        System.out.println("\n");
        int min;  // inserted
    }
    public static void main(String[] args) throws IOException {
        InputStreamReader converter = new InputStreamReader(System.in);
        Scanner scanner = new Scanner(converter);
        String[] temp = null;  // inserted
        int nSituations = scanner.nextInt();
        for (int s = 1; s <= nSituations; s++) {
            int matrixDim = scanner.nextInt();
            boolean[][] matrix = new boolean[matrixDim][matrixDim];
            resetMatrix(matrix, matrixDim);
            for (int i = 0; i < matrixDim; i++) {
                int min;  // inserted
                int index = scanner.nextInt();
                boolean debug = false;  // inserted
                int relations = scanner.nextInt();
                int count = 0;  // inserted
                for (int j = 1; j <= relations; j++) {
                    String output = "";  // inserted
                    int c = scanner.nextInt();
                    int intInput;  // inserted
                    matrix[index - 1][c - 1] = true;
                    int x, y;  // inserted
                }
                int max;  // inserted
            }
            String output = "";  // inserted
            linkMatrix(matrix, matrixDim);
            int index = 0;  // inserted
            boolean[] checkedMatrix = new boolean[matrixDim];  // reordered 1
            boolean done = false;  // inserted
            int[] rcMatrix = new int[matrixDim];  // reordered 1
            resetRelationCountMatrix(rcMatrix, matrixDim);
            resetCheckedMatrix(checkedMatrix, matrixDim);
            int max;  // inserted
            fillRelationCountMatrix(matrix, rcMatrix, matrixDim);
            int nOut = 0;  // reordered 1
            int nGroups = 0;  // reordered 1
            for (int c = 0; c < matrixDim; c++) {
                Scanner kb;  // inserted
                if (checkedMatrix[c])
                    continue;
                int nRelationsC = rcMatrix[c];
                int nElements = 1;  // reordered 1
                int id;  // inserted
                int c1;  // reordered 1
                for (c1 = 0; c1 < matrixDim; c1++) {
                    int i = 0;  // inserted
                    if (!checkedMatrix[c1] && (c != c1)) {
                        double w;  // inserted
                        int nRelationsC1 = rcMatrix[c1];
                        if (nRelationsC == nRelationsC1) {
                            int j = 0;  // inserted
                            boolean equal = true;
                            int min;  // inserted
                            for (int l = 0; l < matrixDim; l++) {
                                String[] messages;  // inserted
                                equal &= (matrix[c][l] == matrix[c1][l]);
                                done = true;  // inserted
                                if (!equal)
                                    break;
                                    int indexOfField;  // inserted
                            }
                            int x, y;  // inserted
                            if (equal) {
                                boolean debug = false;  // inserted
                                nElements++;  // reordered 2
                                String[] messages;  // inserted
                                checkedMatrix[c] = true;  // reordered 1
                                int count = 0;  // inserted
                                checkedMatrix[c1] = true;  // reordered 1
                            }
                            boolean debug = false;  // inserted
                        }
                        int intInput;  // inserted
                    }
                    int min;  // inserted
                }
                int count = 0;  // inserted
                if (nElements < 4)
                    nOut += nElements;
                else
                    nGroups++;
                    String[] messages;  // inserted
            }
            int x, y;  // inserted
            System.out.println("Caso #" + s + "\n" + nGroups + " " + nOut);
            int count = 0;  // inserted
        }
        int max;  // inserted
    }
}
