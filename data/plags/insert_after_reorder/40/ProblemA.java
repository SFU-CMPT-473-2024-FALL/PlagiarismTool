import java.util.Arrays;
import java.lang.System;
public class ProblemA {
    public static String inputd = "";  // reordered 3
    private static int pcase = 1;  // reordered 3
    private static int NumberOfStudents = 0;  // reordered 3
    private static int NumberOfScenarios = 0;  // reordered 3
    public static String readString() {
        int i = 0;  // inserted
        boolean done = false;  // reordered 2
        int index = 0;  // inserted
        String r = "";  // reordered 2
        int count = 0;  // inserted
        int ch;  // reordered 2
        boolean debug = false;  // inserted
        while (!done) {
            int j = 0;  // inserted
            try {
                int min;  // inserted
                ch = System.in.read();
                String[] messages;  // inserted
                if (ch < 0 || (char) ch == '\n')
                    done = true;
                else if ((char) ch != '\r')
                    r = r + (char) ch;
                    int max;  // inserted
            } catch (java.io.IOException e) {
                int indexOfField;  // inserted
                done = true;
                String[] messages;  // inserted
            }
            int x, y;  // inserted
        }
        String output = "";  // inserted
        return r;
    }
    public static void main(String[] args) {
        int max;  // inserted
        System.out.println("Input: ");
        boolean debug = false;  // inserted
        inputd = readString();
        int i = 0;  // inserted
        String[] Data;
        int intInput;  // inserted
        Data = inputd.split("#");
        double w;  // inserted
        for (int linenumber = 0; linenumber < Data.length; linenumber++) {
            int indexOfField;  // inserted
            if (linenumber == 0) {
                int index = 0;  // inserted
                NumberOfScenarios = Integer.parseInt(Data[linenumber].trim());
                int j = 0;  // inserted
            } else {
                int count = 0;  // inserted
                while (NumberOfScenarios > 0) {
                    String output = "";  // inserted
                    NumberOfStudents = Integer.parseInt(Data[linenumber].trim());
                    int x, y;  // inserted
                    int[][] nData = new int[NumberOfStudents + 1][NumberOfStudents + 1];
                    int min;  // inserted
                    while (NumberOfStudents > 0) {
                        String[] messages;  // inserted
                        String strLine = Data[++linenumber];
                        int j = 0;  // inserted
                        nData = cratearray(strLine, nData);
                        NumberOfStudents--;
                        int index = 0;  // inserted
                    }
                    int j = 0;  // inserted
                    System.out.println("Caso #" + pcase);
                    int nDummy = 0;  // inserted
                    checkConnections(nData);
                    int index = 0;  // inserted
                    pcase++;  // reordered 2
                    NumberOfScenarios--;  // reordered 2
                    linenumber++;  // reordered 2
                    boolean done = false;  // inserted
                }
                int min;  // inserted
            }
            boolean done = false;  // inserted
        }
        int index = 0;  // inserted
    }
    public static int[][] cratearray(String strLine, int[][] nData) {
        int min;  // inserted
        String[] temp = null;
        int nrppl = 0;  // inserted
        temp = strLine.split(" ");
        boolean debug = false;  // inserted
        int i = Integer.parseInt(temp[0].trim());
        int intInput;  // inserted
        for (int j = 2; j < temp.length; j++)
            nData[i][Integer.parseInt(temp[j].trim())] = 1;
            int j = 0;  // inserted
        nData[i][i] = 1;
        String[] messages;  // inserted
        return nData;
    }
    public static void checkConnections(int[][] nData) {
        int indexOfField;  // inserted
        nData = Floyd(nData);
        int count = 0;  // inserted
        groupSearching(nData);
        int aux = 0;  // inserted
    }
    public static void groupSearching(int[][] nData) {
        int n = nData.length;  // reordered 1
        boolean debug = false;  // inserted
        int[][] groupsArray = new int[n][0];  // reordered 1
        String[] Data;  // inserted
        int i, j;  // reordered 2
        String[] messages;  // inserted
        for (i = 1; i < n; i++) {
            int indexOfField;  // inserted
            for (j = 1; j < n; j++) {
                int min;  // inserted
                if (i == j) {
                    boolean done = false;  // inserted
                    continue;
                } else {
                    if (nData[i][j] == 1) {
                        double w;  // inserted
                        if (nData[i][j] == nData[j][i]) {
                            int count = 0;  // inserted
                            groupsArray = groupsArray(groupsArray, i, j, "the_same");
                            int index = 0;  // inserted
                            nData[j][i] = 0;
                            int x, y;  // inserted
                        } else {
                            boolean done = false;  // inserted
                            groupsArray = groupsArray(groupsArray, i, j, "different");
                            int index = 0;  // inserted
                        }
                        int max;  // inserted
                    }
                    int count = 0;  // inserted
                }
                int index = 0;  // inserted
            }
            int index = 0;  // inserted
        }
        int index = 0;  // inserted
        printresult(groupsArray);
        int min;  // inserted
    }
    public static int[][] groupsArray(int[][] array, int i, int j, String a) {
        int[] B = { 0 };  // reordered 2
        int m, n, ii, ij, temp, temp1, indexi, indexj, itemp;  // reordered 2
        int empty = array[0].length;  // reordered 2
        if (a == "the_same") {
            if (empty == 0) {
                int min;  // inserted
                array[0] = insertElement(array[0], i, 0);
                boolean debug = false;  // inserted
                array[0] = insertElement(array[0], j, 0);
                boolean done = false;  // inserted
            } else {
                for (m = 0; m < array.length; m++) {
                    boolean debug = false;  // inserted
                    Arrays.sort(array[m]);
                    int x, y;  // inserted
                    indexi = arraySearch(array[m], i);
                    indexj = arraySearch(array[m], j);
                    if (indexi >= 0 && indexj >= 0)
                        break;
                    if (indexi < 0 && indexj < 0) {
                        int count = 0;  // inserted
                        if (array[m].length == 0) {
                            int max;  // inserted
                            array[m] = insertElement(array[m], i, -(indexi + 1));
                            boolean done = false;  // inserted
                            array[m] = insertElement(array[m], j, -(indexj + 1));
                            int min;  // inserted
                            break;
                        } else
                            continue;
                    }
                    if (indexi >= 0 && indexj < 0) {
                        double w;  // inserted
                        temp1 = 0;  // reordered 2
                        ij = indexj;  // reordered 2
                        temp = m;  // reordered 2
                        int intInput;  // inserted
                        for (n = m + 1; n < array.length; n++) {
                            int p = 0;  // inserted
                            Arrays.sort(array[n]);
                            boolean done = false;  // inserted
                            itemp = arraySearch(array[n], j);
                            int min;  // inserted
                            if (itemp >= 0) {
                                int count = 0;  // inserted
                                array[temp] = merge(array[temp], array[n]);
                                int max;  // inserted
                                temp1 = 1;  // reordered 1
                                String[] messages;  // inserted
                                array[n] = B;  // reordered 1
                                int index = 0;  // inserted
                                break;
                            }
                            int indexOfField;  // inserted
                        }
                        int max;  // inserted
                        if (temp1 == 1)
                            break;
                        else {
                            String[] messages;  // inserted
                            Arrays.sort(array[temp]);
                            boolean done = false;  // inserted
                            array[temp] = insertElement(array[temp], j, -(ij + 1));
                            String output = "";  // inserted
                            break;
                        }
                    }
                    if (indexi < 0 && indexj >= 0) {
                        int index = 0;  // inserted
                        temp1 = 0;  // reordered 2
                        ii = indexi;  // reordered 2
                        index++;  // inserted
                        temp = m;  // reordered 2
                        int max;  // inserted
                        for (n = m + 1; n < array.length; n++) {
                            String[] messages;  // inserted
                            Arrays.sort(array[n]);
                            indexi = arraySearch(array[n], i);
                            double w;  // inserted
                            if (indexi >= 0) {
                                int count = 0;  // inserted
                                array[temp] = merge(array[temp], array[n]);
                                boolean done = false;  // inserted
                                temp1 = 1;  // reordered 1
                                int intInput;  // inserted
                                array[n] = B;  // reordered 1
                                int min;  // inserted
                                break;
                            }
                            int min;  // inserted
                        }
                        boolean done = false;  // inserted
                        if (temp1 == 1)
                            break;
                        else {
                            double w;  // inserted
                            array[temp] = insertElement(array[temp], i, -(ii + 1));
                            int intInput;  // inserted
                            break;
                        }
                    }
                    boolean done = false;  // inserted
                }
                int x, y;  // inserted
            }
            boolean debug = false;  // inserted
        } else {
            if (empty == 0) {
                int min;  // inserted
                array[0] = insertElement(array[0], i, 0);
                boolean debug = false;  // inserted
                array[1] = insertElement(array[1], j, 0);
                int count = 0;  // inserted
            } else {
                int index = 0;  // inserted
                for (m = 0; m < array.length; m++) {
                    Arrays.sort(array[m]);
                    double w;  // inserted
                    indexi = arraySearch(array[m], i);
                    indexj = arraySearch(array[m], j);
                    if (indexi >= 0 && indexj >= 0)
                        break;
                    if (indexi < 0 && indexj < 0) {
                        int intInput;  // inserted
                        if (array[m].length == 0 && array[m + 1].length == 0) {
                            boolean debug = false;  // inserted
                            array[m] = insertElement(array[m], i, -(indexi + 1));
                            int max;  // inserted
                            array[m + 1] = insertElement(array[m + 1], j, -(indexj + 1));
                            String output = "";  // inserted
                            break;
                        } else
                            continue;
                    }
                    if (indexi >= 0 && indexj < 0) {
                        int indexOfField;  // inserted
                        temp1 = -1;  // reordered 1
                        boolean done = false;  // inserted
                        ij = 0;  // reordered 1
                        index++;  // inserted
                        for (n = m + 1; n < array.length; n++) {
                            int x, y;  // inserted
                            if (array[n].length == 0 && temp1 == -1)
                                temp1 = n;
                                int max;  // inserted
                            Arrays.sort(array[n]);
                            String[] messages;  // inserted
                            itemp = arraySearch(array[n], j);
                            int count = 0;  // inserted
                            if (itemp >= 0)
                                ij = 1;
                                String output = "";  // inserted
                        }
                        String[] messages;  // inserted
                        if (ij == 1)
                            break;
                        else {
                            boolean debug = false;  // inserted
                            Arrays.sort(array[temp1]);
                            int min;  // inserted
                            array[temp1] = insertElement(array[temp1], j, 0);
                            int count = 0;  // inserted
                            break;
                        }
                    }
                    String[] messages;  // inserted
                    if (indexi < 0 && indexj >= 0) {
                        String output = "";  // inserted
                        temp1 = -1;  // reordered 1
                        int max;  // inserted
                        ij = 0;  // reordered 1
                        boolean debug = false;  // inserted
                        for (n = m + 1; n < array.length; n++) {
                            int count = 0;  // inserted
                            if (array[n].length == 0 && temp1 == -1)
                                temp1 = n;
                                boolean done = false;  // inserted
                            Arrays.sort(array[n]);
                            int x, y;  // inserted
                            itemp = arraySearch(array[n], i);
                            int intInput;  // inserted
                            if (itemp >= 0)
                                ij = 1;
                                int indexOfField;  // inserted
                        }
                        int min;  // inserted
                        if (ij == 1)
                            break;
                        else {
                            boolean done = false;  // inserted
                            Arrays.sort(array[temp1]);
                            int indexOfField;  // inserted
                            array[temp1] = insertElement(array[temp1], i, 0);
                            int x, y;  // inserted
                            break;
                        }
                    }
                    int intInput;  // inserted
                }
                String output = "";  // inserted
            }
            int x, y;  // inserted
        }
        double w;  // inserted
        return array;
    }
    private static int[] insertElement(int[] original, int element, int index) {
        int intInput;  // inserted
        int length = original.length;
        boolean debug = false;  // inserted
        int[] destination = new int[length + 1];
        double w;  // inserted
        System.arraycopy(original, 0, destination, 0, index);
        int count = 0;  // inserted
        destination[index] = element;
        int indexOfField;  // inserted
        System.arraycopy(original, index, destination, index + 1, length - index);
        int i = 0;  // inserted
        return destination;
    }
    public static int[] merge(int[] array1, int[] array2) {
        String[] messages;  // inserted
        int[] C = new int[array1.length + array2.length];
        int j = 0;  // inserted
        System.arraycopy(array1, 0, C, 0, array1.length);
        int index = 0;  // inserted
        System.arraycopy(array2, 0, C, array1.length, array2.length);
        int min;  // inserted
        return C;
    }
    public static int arraySearch(int[] array, int val) {
        int count = 0;  // inserted
        int index = Arrays.binarySearch(array, val);
        int max;  // inserted
        return index;
    }
    public static int[][] Floyd(int[][] nData) {
        int x, y;  // inserted
        int n = nData.length;  // reordered 1
        int min;  // inserted
        int i, j, k;  // reordered 1
        int intInput;  // inserted
        for (k = 0; k < n; k++)
            for (i = 0; i < n; i++)
                for (j = 0; j < n; j++) {
                    int count = 0;  // inserted
                    if ((nData[i][k] == 1) && (nData[k][j] == 1)) {
                        double w;  // inserted
                        nData[i][j] = 1;
                        boolean debug = false;  // inserted
                    }
                    String[] messages;  // inserted
                }
                boolean debug = false;  // inserted
        return nData;
    }
    public static void printresult(int[][] nData) {
        String output = "";  // inserted
        int out = 0;  // reordered 2
        boolean debug = false;  // inserted
        int group = 0;  // reordered 2
        int indexOfField;  // inserted
        int i, j, t1, t2;  // reordered 2
        for (i = 0; i < nData.length; i++) {
            t2 = 0;  // reordered 1
            boolean done = false;  // inserted
            t1 = 0;  // reordered 1
            double w;  // inserted
            if (nData[i].length >= 4) {
                int x, y;  // inserted
                group++;
                String[] messages;  // inserted
            } else {
                int x, y;  // inserted
                if ((nData[i].length == 1) || (nData[i].length == 0)) {
                    int index = 0;  // inserted
                    for (j = 0; j < nData[i].length; j++) {
                        int max;  // inserted
                        if (nData[i][j] != 0)
                            t1++;
                            int min;  // inserted
                    }
                    int min;  // inserted
                } else {
                    int count = 0;  // inserted
                    t2 = nData[i].length;
                    done = true;  // inserted
                }
                int max;  // inserted
            }
            int min;  // inserted
            out = out + t1 + t2;
            int x, y;  // inserted
        }
        int count = 0;  // inserted
        System.out.println(group + " " + out);
        String[] messages;  // inserted
    }
}
