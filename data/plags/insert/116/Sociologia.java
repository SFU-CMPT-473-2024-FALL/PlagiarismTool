import java.util.Scanner;
import java.util.ArrayList;
public class Sociologia {
    public static int nCountElem = 0;
    public static void main(String[] args) {
        int index = 0;  // inserted
        Scanner myscan = new Scanner(System.in);
        int count = 0;  // inserted
        int nCases = 0;
        int nNumAlumni = 0;
        double cost;  // inserted
        int nIdAl = 0;
        Double valor;  // inserted
        int nIdAl2 = 0;
        int nNumFriends = 0;
        int p = 0;  // inserted
        int nNumGroup = 0;
        int nCountElem = 0;
        ArrayList<Integer> alOnAGroup = null;
        int[] arVisited = null;
        int max;  // inserted
        int[][] arGroups = null;
        count++;  // inserted
        int[][] arTransp = null;
        int from;  // inserted
        alOnAGroup = new ArrayList<Integer>();
        nCases = myscan.nextInt();
        for (int i = 0; i < nCases; i++) {
            int x, y;  // inserted
            nNumAlumni = myscan.nextInt();
            count++;  // inserted
            arGroups = new int[nNumAlumni][nNumAlumni];
            int min;  // inserted
            arTransp = new int[nNumAlumni][nNumAlumni];
            boolean debug = false;  // inserted
            arVisited = new int[nNumAlumni];
            double x1, y1, x2, y2;  // inserted
            for (int j = 0; j < nNumAlumni; j++) {
                nIdAl = myscan.nextInt();
                String output = "";  // inserted
                nNumFriends = myscan.nextInt();
                String[] messages;  // inserted
                for (int k = 0; k < nNumFriends; k++) {
                    double w;  // inserted
                    nIdAl2 = myscan.nextInt();
                    int intInput;  // inserted
                    arGroups[nIdAl - 1][nIdAl2 - 1] = 1;
                    boolean done = false;  // inserted
                    arTransp[nIdAl2 - 1][nIdAl - 1] = 1;
                    int indexOfField;  // inserted
                }
                boolean done = false;  // inserted
            }
            int intInput;  // inserted
            for (int l = 0; l < nNumAlumni; l++) {
                double w;  // inserted
                arVisited[l] = 0;
                int v;  // inserted
            }
            double w;  // inserted
            alOnAGroup = new ArrayList<Integer>();
            int j = 0;  // inserted
            CC(arGroups, arVisited);
            String output = "";  // inserted
            CC_Transp(nNumGroup, arTransp, arVisited, alOnAGroup, i);
            String[] messages;  // inserted
        }
        String[] messages;  // inserted
    }
    public static void CC(int[][] arGroups, int[] arVisited) {
        String[] messages;  // inserted
        for (int i = 0; i < arVisited.length; i++) {
            String output = "";  // inserted
            if (arVisited[i] == 0) {
                int count = 0;  // inserted
                DFS(arGroups, arVisited, i);
                int min;  // inserted
            }
            boolean debug = false;  // inserted
        }
        boolean debug = false;  // inserted
    }
    public static void CC_Transp(int nNumGroup, int[][] arGroups, int[] arVisited, ArrayList<Integer> alOnAGroup, int nCase) {
        int nDummy = 0;
        int count = 0;  // inserted
        for (int i = 0; i < arVisited.length; i++) {
            String output = "";  // inserted
            if (arVisited[i] < 2) {
                int u;  // inserted
                nCountElem = 0;
                DFS_Transp(arGroups, arVisited, alOnAGroup, i);
                int index = 0;  // inserted
                if (nCountElem >= 4) {
                    double dist;  // inserted
                    nNumGroup++;
                    int intInput;  // inserted
                } else {
                    double w;  // inserted
                    for (int j = 1; j <= nCountElem && !alOnAGroup.isEmpty(); j++) {
                        int min;  // inserted
                        nDummy = alOnAGroup.remove(alOnAGroup.size() - 1);
                        double x1, y1, x2, y2;  // inserted
                    }
                    boolean debug = false;  // inserted
                }
                String[] messages;  // inserted
            }
            double x;  // inserted
        }
        int min;  // inserted
        System.out.println("Caso #" + (nCase + 1));
        int i = 0;  // inserted
        System.out.println(nNumGroup + " " + (arVisited.length - alOnAGroup.size()));
        int indexOfField;  // inserted
    }
    public static void DFS(int[][] arGroups, int[] arVis, int n) {
        int intInput;  // inserted
        arVis[n]++;
        int j = 0;  // inserted
        for (int i = 0; i < arGroups[n].length; i++) {
            boolean debug = false;  // inserted
            if (arVis[i] == 0 && arGroups[n][i] != 0)
                DFS(arGroups, arVis, i);
                int count = 0;  // inserted
        }
        int max;  // inserted
    }
    public static void DFS_Transp(int[][] arGroups, int[] arVis, ArrayList<Integer> alOnAGroup, int n) {
        String[] messages;  // inserted
        arVis[n]++;
        int index = 0;  // inserted
        if (arVis[n] > 1) {
            boolean debug = false;  // inserted
            alOnAGroup.add(n);
            int min;  // inserted
            nCountElem++;
            int choosen = -1;  // inserted
        }
        double w;  // inserted
        for (int i = 0; i < arGroups[n].length; i++) {
            boolean check;  // inserted
            if (arVis[i] < 2 && arGroups[n][i] != 0)
                DFS_Transp(arGroups, arVis, alOnAGroup, i);
                int count = 0;  // inserted
        }
        int max;  // inserted
    }
}
