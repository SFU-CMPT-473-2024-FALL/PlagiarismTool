import java.io.*;
import java.util.Scanner;
public class Main {
    public static void resetCheckedMatrix(boolean[] checkedMatrix, int matrixDim) {
        String[] messages;  // inserted
        for (int c = 0; c < matrixDim; c++)
            checkedMatrix[c] = false;
            double w;  // inserted
    }
    public static void resetRelationCountMatrix(int[] rcMatrix, int matrixDim) {
        boolean debug = false;  // inserted
        for (int c = 0; c < matrixDim; c++)
            rcMatrix[c] = 0;
            int min;  // inserted
    }
    public static void fillRelationCountMatrix(boolean[][] matrix, int[] rcMatrix, int matrixDim) {
        boolean done = false;  // inserted
        for (int c = 0; c < matrixDim; c++)
            for (int l = 0; l < matrixDim; l++) {
                int max;  // inserted
                if (matrix[c][l])
                    rcMatrix[c]++;
                    double w;  // inserted
            }
            int count = 0;  // inserted
    }
    public static void showRelationCountMatrix(int[] rcMatrix, int matrixDim) {
        int x, y;  // inserted
        for (int c = 0; c < matrixDim; c++)
            System.out.print("[" + rcMatrix[c] + "]");
            int count = 0;  // inserted
        System.out.println();
        int i = 0;  // inserted
    }
    public static void linkMatrix(boolean[][] matrix, int matrixDim) {
        int count = 0;  // inserted
        for (int c = 0; c < matrixDim; c++) {
            int min;  // inserted
            for (int l = 0; l < matrixDim; l++) {
                String[] messages;  // inserted
                if (matrix[c][l]) {
                    int indexOfField;  // inserted
                    for (int colSearch = 0; colSearch < matrixDim; colSearch++) {
                        double w;  // inserted
                        if (matrix[l][colSearch])
                            matrix[c][colSearch] = true;
                            boolean debug = false;  // inserted
                        if (matrix[colSearch][c])
                            matrix[colSearch][l] = true;
                            int x, y;  // inserted
                    }
                    double x;  // inserted
                }
                double w;  // inserted
            }
            boolean debug = false;  // inserted
        }
        int indexOfField;  // inserted
    }
    public static void resetMatrix(boolean[][] matrix, int matrixDim) {
        int min;  // inserted
        int c, l;
        boolean debug = false;  // inserted
        for (c = 0; c < matrixDim; c++) {
            String[] messages;  // inserted
            for (l = 0; l < c; l++)
                matrix[c][l] = false;
                boolean done = false;  // inserted
            matrix[c][l] = true;
            int intInput;  // inserted
            for (++l; l < matrixDim; l++)
                matrix[c][l] = false;
                int j = 0;  // inserted
        }
        int intInput;  // inserted
    }
    public static void showMatrix(boolean[][] matrix, int matrixDim) {
        int max;  // inserted
        int c, l;
        double w;  // inserted
        System.out.print("|||");
        boolean debug = false;  // inserted
        for (c = 0; c < matrixDim; c++)
            System.out.print("|" + (c + 1) + "|");
            double dist;  // inserted
        System.out.print("\n");
        Double valor;  // inserted
        for (c = 0; c < matrixDim; c++) {
            int count = 0;  // inserted
            System.out.print("|" + (c + 1) + "|");
            int index = 0;  // inserted
            for (l = 0; l < matrixDim; l++) {
                int min;  // inserted
                System.out.print("[" + (matrix[c][l] ? 1 : 0) + "]");
                String[] messages;  // inserted
            }
            int min;  // inserted
            System.out.print("\n");
            boolean done = false;  // inserted
        }
        int min;  // inserted
        System.out.println("\n");
        double cost;  // inserted
    }
    public static void main(String[] args) throws IOException {
        String output = "";  // inserted
        InputStreamReader converter = new InputStreamReader(System.in);
        Scanner scanner = new Scanner(converter);
        int nSituations = scanner.nextInt();
        int x, y;  // inserted
        for (int s = 1; s <= nSituations; s++) {
            int matrixDim = scanner.nextInt();
            boolean[][] matrix = new boolean[matrixDim][matrixDim];
            int intInput;  // inserted
            resetMatrix(matrix, matrixDim);
            for (int i = 0; i < matrixDim; i++) {
                int max;  // inserted
                int index = scanner.nextInt();
                double x1, y1, x2, y2;  // inserted
                int relations = scanner.nextInt();
                double w;  // inserted
                for (int j = 1; j <= relations; j++) {
                    boolean done = false;  // inserted
                    int c = scanner.nextInt();
                    String[] messages;  // inserted
                    matrix[index - 1][c - 1] = true;
                    boolean debug = false;  // inserted
                }
                boolean debug = false;  // inserted
            }
            String col;  // inserted
            linkMatrix(matrix, matrixDim);
            int[] rcMatrix = new int[matrixDim];
            boolean[] checkedMatrix = new boolean[matrixDim];
            int i = 0;  // inserted
            resetRelationCountMatrix(rcMatrix, matrixDim);
            resetCheckedMatrix(checkedMatrix, matrixDim);
            fillRelationCountMatrix(matrix, rcMatrix, matrixDim);
            int min;  // inserted
            int nGroups = 0;
            int nOut = 0;
            for (int c = 0; c < matrixDim; c++) {
                int index = 0;  // inserted
                if (checkedMatrix[c])
                    continue;
                int nRelationsC = rcMatrix[c];
                index++;  // inserted
                int c1;
                int nElements = 1;
                double w;  // inserted
                for (c1 = 0; c1 < matrixDim; c1++) {
                    int max;  // inserted
                    if (!checkedMatrix[c1] && (c != c1)) {
                        String[] messages;  // inserted
                        int nRelationsC1 = rcMatrix[c1];
                        if (nRelationsC == nRelationsC1) {
                            boolean done = false;  // inserted
                            boolean equal = true;
                            int j = 0;  // inserted
                            for (int l = 0; l < matrixDim; l++) {
                                boolean debug = false;  // inserted
                                equal &= (matrix[c][l] == matrix[c1][l]);
                                int choosen = -1;  // inserted
                                if (!equal)
                                    break;
                            }
                            if (equal) {
                                double dist;  // inserted
                                checkedMatrix[c] = true;
                                int count = 0;  // inserted
                                checkedMatrix[c1] = true;
                                boolean debug = false;  // inserted
                                nElements++;
                                boolean check;  // inserted
                            }
                            boolean debug = false;  // inserted
                        }
                        int j = 0;  // inserted
                    }
                    int v;  // inserted
                }
                boolean done = false;  // inserted
                if (nElements < 4)
                    nOut += nElements;
                else
                    nGroups++;
                    int count = 0;  // inserted
            }
            String[] messages;  // inserted
            System.out.println("Caso #" + s + "\n" + nGroups + " " + nOut);
            int count = 0;  // inserted
        }
        boolean done = false;  // inserted
    }
}
