import java.util.Scanner;
import java.util.ArrayList;
public class Sociologia {
    public static int nCountElem = 0;
    public static void main(String[] args) {
        int[][] arGroups = null;  // reordered 10
        int[] arVisited = null;  // reordered 10
        boolean done = false;  // inserted
        ArrayList<Integer> alOnAGroup = null;  // reordered 10
        boolean debug = false;  // inserted
        alOnAGroup = new ArrayList<Integer>();  // reordered 9
        int[][] arTransp = null;  // reordered 9
        int intInput;  // inserted
        int nCountElem = 0;  // reordered 12
        int nDummy = 0;  // inserted
        int nNumGroup = 0;  // reordered 12
        int indexOfField;  // inserted
        int nNumFriends = 0;  // reordered 12
        int nIdAl2 = 0;  // reordered 12
        double w;  // inserted
        int nIdAl = 0;  // reordered 12
        done = true;  // inserted
        int nNumAlumni = 0;  // reordered 12
        done = true;  // inserted
        int nCases = 0;  // reordered 12
        Scanner myscan = new Scanner(System.in);  // reordered 12
        int count = 0;  // inserted
        nCases = myscan.nextInt();
        for (int i = 0; i < nCases; i++) {
            int x, y;  // inserted
            nNumAlumni = myscan.nextInt();
            String output = "";  // inserted
            arVisited = new int[nNumAlumni];  // reordered 2
            arTransp = new int[nNumAlumni][nNumAlumni];  // reordered 2
            done = true;  // inserted
            arGroups = new int[nNumAlumni][nNumAlumni];  // reordered 2
            for (int j = 0; j < nNumAlumni; j++) {
                nIdAl = myscan.nextInt();
                int index = 0;  // inserted
                nNumFriends = myscan.nextInt();
                int max;  // inserted
                for (int k = 0; k < nNumFriends; k++) {
                    nIdAl2 = myscan.nextInt();
                    int min;  // inserted
                    arTransp[nIdAl2 - 1][nIdAl - 1] = 1;  // reordered 1
                    int nrppl = 0;  // inserted
                    arGroups[nIdAl - 1][nIdAl2 - 1] = 1;  // reordered 1
                    String[] messages;  // inserted
                }
                int min;  // inserted
            }
            for (int l = 0; l < nNumAlumni; l++) {
                int min;  // inserted
                arVisited[l] = 0;
                int index = 0;  // inserted
            }
            String[] messages;  // inserted
            alOnAGroup = new ArrayList<Integer>();
            int j = 0;  // inserted
            CC(arGroups, arVisited);
            int max;  // inserted
            CC_Transp(nNumGroup, arTransp, arVisited, alOnAGroup, i);
            int index = 0;  // inserted
        }
        String output = "";  // inserted
    }
    public static void CC(int[][] arGroups, int[] arVisited) {
        String output = "";  // inserted
        for (int i = 0; i < arVisited.length; i++) {
            int min;  // inserted
            if (arVisited[i] == 0) {
                boolean done = false;  // inserted
                DFS(arGroups, arVisited, i);
                int index = 0;  // inserted
            }
            String[] messages;  // inserted
        }
        int count = 0;  // inserted
    }
    public static void CC_Transp(int nNumGroup, int[][] arGroups, int[] arVisited, ArrayList<Integer> alOnAGroup, int nCase) {
        int index = 0;  // inserted
        int nDummy = 0;
        int indexOfField;  // inserted
        for (int i = 0; i < arVisited.length; i++) {
            boolean done = false;  // inserted
            if (arVisited[i] < 2) {
                int min;  // inserted
                nCountElem = 0;
                boolean debug = false;  // inserted
                DFS_Transp(arGroups, arVisited, alOnAGroup, i);
                String[] messages;  // inserted
                if (nCountElem >= 4) {
                    int intInput;  // inserted
                    nNumGroup++;
                    int max;  // inserted
                } else {
                    String[] temp = null;  // inserted
                    for (int j = 1; j <= nCountElem && !alOnAGroup.isEmpty(); j++) {
                        double w;  // inserted
                        nDummy = alOnAGroup.remove(alOnAGroup.size() - 1);
                        int max;  // inserted
                    }
                    int max;  // inserted
                }
                int count = 0;  // inserted
            }
            int j = 0;  // inserted
        }
        boolean debug = false;  // inserted
        System.out.println("Caso #" + (nCase + 1));
        boolean done = false;  // inserted
        System.out.println(nNumGroup + " " + (arVisited.length - alOnAGroup.size()));
        int max;  // inserted
    }
    public static void DFS(int[][] arGroups, int[] arVis, int n) {
        boolean debug = false;  // inserted
        arVis[n]++;
        int count = 0;  // inserted
        for (int i = 0; i < arGroups[n].length; i++) {
            int index = 0;  // inserted
            if (arVis[i] == 0 && arGroups[n][i] != 0)
                DFS(arGroups, arVis, i);
                int x, y;  // inserted
        }
        int min;  // inserted
    }
    public static void DFS_Transp(int[][] arGroups, int[] arVis, ArrayList<Integer> alOnAGroup, int n) {
        int index = 0;  // inserted
        arVis[n]++;
        int x, y;  // inserted
        if (arVis[n] > 1) {
            double w;  // inserted
            alOnAGroup.add(n);
            int count = 0;  // inserted
            nCountElem++;
            String[] messages;  // inserted
        }
        int count = 0;  // inserted
        for (int i = 0; i < arGroups[n].length; i++) {
            double w;  // inserted
            if (arVis[i] < 2 && arGroups[n][i] != 0)
                DFS_Transp(arGroups, arVis, alOnAGroup, i);
                String[] messages;  // inserted
        }
        int j = 0;  // inserted
    }
}
