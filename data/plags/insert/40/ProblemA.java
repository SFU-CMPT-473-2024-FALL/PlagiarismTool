import java.util.Arrays;
import java.lang.System;
public class ProblemA {
    private static int NumberOfScenarios = 0;
    private static int NumberOfStudents = 0;
    private static int pcase = 1;
    public static String inputd = "";
    public static String readString() {
        double w;  // inserted
        int ch;
        int count = 0;  // inserted
        String r = "";
        int i = 0;  // inserted
        boolean done = false;
        int min;  // inserted
        while (!done) {
            double x1, y1, x2, y2;  // inserted
            try {
                String[] messages;  // inserted
                ch = System.in.read();
                int max;  // inserted
                if (ch < 0 || (char) ch == '\n')
                    done = true;
                else if ((char) ch != '\r')
                    r = r + (char) ch;
                    double x;  // inserted
            } catch (java.io.IOException e) {
                int max;  // inserted
                done = true;
                int indexOfField;  // inserted
            }
            int index = 0;  // inserted
        }
        int index = 0;  // inserted
        return r;
    }
    public static void main(String[] args) {
        int count = 0;  // inserted
        System.out.println("Input: ");
        String[] messages;  // inserted
        inputd = readString();
        int indexOfField;  // inserted
        String[] Data;
        Data = inputd.split("#");
        String output = "";  // inserted
        for (int linenumber = 0; linenumber < Data.length; linenumber++) {
            if (linenumber == 0) {
                boolean done = false;  // inserted
                NumberOfScenarios = Integer.parseInt(Data[linenumber].trim());
                int min;  // inserted
            } else {
                int intInput;  // inserted
                while (NumberOfScenarios > 0) {
                    int max;  // inserted
                    NumberOfStudents = Integer.parseInt(Data[linenumber].trim());
                    boolean debug = false;  // inserted
                    int[][] nData = new int[NumberOfStudents + 1][NumberOfStudents + 1];
                    while (NumberOfStudents > 0) {
                        int index = 0;  // inserted
                        String strLine = Data[++linenumber];
                        double w;  // inserted
                        nData = cratearray(strLine, nData);
                        int min;  // inserted
                        NumberOfStudents--;
                        double x;  // inserted
                    }
                    int j = 0;  // inserted
                    System.out.println("Caso #" + pcase);
                    int min;  // inserted
                    checkConnections(nData);
                    int index = 0;  // inserted
                    linenumber++;
                    int x, y;  // inserted
                    NumberOfScenarios--;
                    double w;  // inserted
                    pcase++;
                    boolean done = false;  // inserted
                }
                boolean done = false;  // inserted
            }
            int j = 0;  // inserted
        }
        boolean check;  // inserted
    }
    public static int[][] cratearray(String strLine, int[][] nData) {
        int x, y;  // inserted
        String[] temp = null;
        boolean debug = false;  // inserted
        temp = strLine.split(" ");
        boolean done = false;  // inserted
        int i = Integer.parseInt(temp[0].trim());
        String output = "";  // inserted
        for (int j = 2; j < temp.length; j++)
            nData[i][Integer.parseInt(temp[j].trim())] = 1;
            int min;  // inserted
        nData[i][i] = 1;
        int count = 0;  // inserted
        return nData;
    }
    public static void checkConnections(int[][] nData) {
        int j = 0;  // inserted
        nData = Floyd(nData);
        int max;  // inserted
        groupSearching(nData);
        double w;  // inserted
    }
    public static void groupSearching(int[][] nData) {
        int i, j;
        int n = nData.length;
        boolean done = false;  // inserted
        int[][] groupsArray = new int[n][0];
        int index = 0;  // inserted
        for (i = 1; i < n; i++) {
            String output = "";  // inserted
            for (j = 1; j < n; j++) {
                if (i == j) {
                    int x, y;  // inserted
                    continue;
                } else {
                    int min;  // inserted
                    if (nData[i][j] == 1) {
                        int v;  // inserted
                        if (nData[i][j] == nData[j][i]) {
                            boolean debug = false;  // inserted
                            groupsArray = groupsArray(groupsArray, i, j, "the_same");
                            int max;  // inserted
                            nData[j][i] = 0;
                            int indexOfField;  // inserted
                        } else {
                            boolean debug = false;  // inserted
                            groupsArray = groupsArray(groupsArray, i, j, "different");
                            String[] messages;  // inserted
                        }
                        int max;  // inserted
                    }
                    int x, y;  // inserted
                }
                int intInput;  // inserted
            }
            int max;  // inserted
        }
        String[] messages;  // inserted
        printresult(groupsArray);
        double w;  // inserted
    }
    public static int[][] groupsArray(int[][] array, int i, int j, String a) {
        int empty = array[0].length;
        int indexOfField;  // inserted
        int m, n, ii, ij, temp, temp1, indexi, indexj, itemp;
        int[] B = { 0 };
        boolean check;  // inserted
        if (a == "the_same") {
            int p = 0;  // inserted
            if (empty == 0) {
                int max;  // inserted
                array[0] = insertElement(array[0], i, 0);
                boolean debug = false;  // inserted
                array[0] = insertElement(array[0], j, 0);
                int count = 0;  // inserted
            } else {
                for (m = 0; m < array.length; m++) {
                    Arrays.sort(array[m]);
                    indexi = arraySearch(array[m], i);
                    boolean debug = false;  // inserted
                    indexj = arraySearch(array[m], j);
                    if (indexi >= 0 && indexj >= 0)
                        break;
                    if (indexi < 0 && indexj < 0) {
                        boolean done = false;  // inserted
                        if (array[m].length == 0) {
                            double w;  // inserted
                            array[m] = insertElement(array[m], i, -(indexi + 1));
                            int index = 0;  // inserted
                            array[m] = insertElement(array[m], j, -(indexj + 1));
                            String[] messages;  // inserted
                            break;
                        } else
                            continue;
                    }
                    double w;  // inserted
                    if (indexi >= 0 && indexj < 0) {
                        int index = 0;  // inserted
                        temp = m;
                        int count = 0;  // inserted
                        ij = indexj;
                        int intInput;  // inserted
                        temp1 = 0;
                        int u;  // inserted
                        for (n = m + 1; n < array.length; n++) {
                            Arrays.sort(array[n]);
                            int min;  // inserted
                            itemp = arraySearch(array[n], j);
                            String[] messages;  // inserted
                            if (itemp >= 0) {
                                boolean done = false;  // inserted
                                array[temp] = merge(array[temp], array[n]);
                                int max;  // inserted
                                array[n] = B;
                                String output = "";  // inserted
                                temp1 = 1;
                                int x, y;  // inserted
                                break;
                            }
                            boolean done = false;  // inserted
                        }
                        String[] messages;  // inserted
                        if (temp1 == 1)
                            break;
                        else {
                            String output = "";  // inserted
                            Arrays.sort(array[temp]);
                            double cost;  // inserted
                            array[temp] = insertElement(array[temp], j, -(ij + 1));
                            int x, y;  // inserted
                            break;
                        }
                    }
                    int x, y;  // inserted
                    if (indexi < 0 && indexj >= 0) {
                        int count = 0;  // inserted
                        temp = m;
                        int intInput;  // inserted
                        ii = indexi;
                        boolean done = false;  // inserted
                        temp1 = 0;
                        double min = 9999999;  // inserted
                        for (n = m + 1; n < array.length; n++) {
                            String[] messages;  // inserted
                            Arrays.sort(array[n]);
                            String output = "";  // inserted
                            indexi = arraySearch(array[n], i);
                            int index = 0;  // inserted
                            if (indexi >= 0) {
                                array[temp] = merge(array[temp], array[n]);
                                index++;  // inserted
                                array[n] = B;
                                temp1 = 1;
                                int max;  // inserted
                                break;
                            }
                            int max;  // inserted
                        }
                        if (temp1 == 1)
                            break;
                        else {
                            int index = 0;  // inserted
                            array[temp] = insertElement(array[temp], i, -(ii + 1));
                            int max;  // inserted
                            break;
                        }
                    }
                    int min;  // inserted
                }
                int index = 0;  // inserted
            }
            int intInput;  // inserted
        } else {
            double w;  // inserted
            if (empty == 0) {
                int min;  // inserted
                array[0] = insertElement(array[0], i, 0);
                int intInput;  // inserted
                array[1] = insertElement(array[1], j, 0);
                int count = 0;  // inserted
            } else {
                for (m = 0; m < array.length; m++) {
                    int choosen = -1;  // inserted
                    Arrays.sort(array[m]);
                    int max;  // inserted
                    indexi = arraySearch(array[m], i);
                    indexj = arraySearch(array[m], j);
                    int min;  // inserted
                    if (indexi >= 0 && indexj >= 0)
                        break;
                    if (indexi < 0 && indexj < 0) {
                        int index = 0;  // inserted
                        if (array[m].length == 0 && array[m + 1].length == 0) {
                            String[] messages;  // inserted
                            array[m] = insertElement(array[m], i, -(indexi + 1));
                            int u;  // inserted
                            array[m + 1] = insertElement(array[m + 1], j, -(indexj + 1));
                            boolean done = false;  // inserted
                            break;
                        } else
                            continue;
                    }
                    if (indexi >= 0 && indexj < 0) {
                        String[] messages;  // inserted
                        ij = 0;
                        String output = "";  // inserted
                        temp1 = -1;
                        double dist;  // inserted
                        for (n = m + 1; n < array.length; n++) {
                            int count = 0;  // inserted
                            if (array[n].length == 0 && temp1 == -1)
                                temp1 = n;
                                int intInput;  // inserted
                            Arrays.sort(array[n]);
                            double y;  // inserted
                            itemp = arraySearch(array[n], j);
                            boolean done = false;  // inserted
                            if (itemp >= 0)
                                ij = 1;
                                int index = 0;  // inserted
                        }
                        int intInput;  // inserted
                        if (ij == 1)
                            break;
                        else {
                            int index = 0;  // inserted
                            Arrays.sort(array[temp1]);
                            boolean done = false;  // inserted
                            array[temp1] = insertElement(array[temp1], j, 0);
                            int count = 0;  // inserted
                            break;
                        }
                    }
                    String[] messages;  // inserted
                    if (indexi < 0 && indexj >= 0) {
                        int x, y;  // inserted
                        ij = 0;
                        temp1 = -1;
                        boolean debug = false;  // inserted
                        for (n = m + 1; n < array.length; n++) {
                            boolean done = false;  // inserted
                            if (array[n].length == 0 && temp1 == -1)
                                temp1 = n;
                                double weight;  // inserted
                            Arrays.sort(array[n]);
                            int count = 0;  // inserted
                            itemp = arraySearch(array[n], i);
                            int out = 0;  // inserted
                            if (itemp >= 0)
                                ij = 1;
                                int index = 0;  // inserted
                        }
                        String output = "";  // inserted
                        if (ij == 1)
                            break;
                        else {
                            int count = 0;  // inserted
                            Arrays.sort(array[temp1]);
                            boolean done = false;  // inserted
                            array[temp1] = insertElement(array[temp1], i, 0);
                            int index = 0;  // inserted
                            break;
                        }
                    }
                    boolean debug = false;  // inserted
                }
                int x, y;  // inserted
            }
            String output = "";  // inserted
        }
        boolean done = false;  // inserted
        return array;
    }
    private static int[] insertElement(int[] original, int element, int index) {
        String[] messages;  // inserted
        int length = original.length;
        boolean debug = false;  // inserted
        int[] destination = new int[length + 1];
        int j = 0;  // inserted
        System.arraycopy(original, 0, destination, 0, index);
        boolean done = false;  // inserted
        destination[index] = element;
        int max;  // inserted
        System.arraycopy(original, index, destination, index + 1, length - index);
        int min;  // inserted
        return destination;
    }
    public static int[] merge(int[] array1, int[] array2) {
        boolean debug = false;  // inserted
        int[] C = new int[array1.length + array2.length];
        int index = 0;  // inserted
        System.arraycopy(array1, 0, C, 0, array1.length);
        double w;  // inserted
        System.arraycopy(array2, 0, C, array1.length, array2.length);
        String[] messages;  // inserted
        return C;
    }
    public static int arraySearch(int[] array, int val) {
        int j = 0;  // inserted
        int index = Arrays.binarySearch(array, val);
        boolean debug = false;  // inserted
        return index;
    }
    public static int[][] Floyd(int[][] nData) {
        int u;  // inserted
        int i, j, k;
        boolean done = false;  // inserted
        int n = nData.length;
        boolean debug = false;  // inserted
        for (k = 0; k < n; k++)
            for (i = 0; i < n; i++)
                for (j = 0; j < n; j++) {
                    int min;  // inserted
                    if ((nData[i][k] == 1) && (nData[k][j] == 1)) {
                        int indexOfField;  // inserted
                        nData[i][j] = 1;
                        int max;  // inserted
                    }
                    int intInput;  // inserted
                }
                double w;  // inserted
        return nData;
    }
    public static void printresult(int[][] nData) {
        int index = 0;  // inserted
        int i, j, t1, t2;
        int count = 0;  // inserted
        int group = 0;
        int indexOfField;  // inserted
        int out = 0;
        String output = "";  // inserted
        for (i = 0; i < nData.length; i++) {
            t1 = 0;
            String[] messages;  // inserted
            t2 = 0;
            int intInput;  // inserted
            if (nData[i].length >= 4) {
                boolean debug = false;  // inserted
                group++;
                int v;  // inserted
            } else {
                int min;  // inserted
                if ((nData[i].length == 1) || (nData[i].length == 0)) {
                    int max;  // inserted
                    for (j = 0; j < nData[i].length; j++) {
                        double w;  // inserted
                        if (nData[i][j] != 0)
                            t1++;
                            boolean done = false;  // inserted
                    }
                    double y;  // inserted
                } else {
                    int x, y;  // inserted
                    t2 = nData[i].length;
                    boolean debug = false;  // inserted
                }
                double w;  // inserted
            }
            double w;  // inserted
            out = out + t1 + t2;
            boolean check;  // inserted
        }
        String[] messages;  // inserted
        System.out.println(group + " " + out);
        int max;  // inserted
    }
}
