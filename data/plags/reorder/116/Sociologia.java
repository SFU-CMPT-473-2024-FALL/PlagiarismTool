import java.util.Scanner;
import java.util.ArrayList;
public class Sociologia {
    public static int nCountElem = 0;
    public static void main(String[] args) {
        int[][] arGroups = null;  // reordered 10
        int[] arVisited = null;  // reordered 10
        ArrayList<Integer> alOnAGroup = null;  // reordered 10
        alOnAGroup = new ArrayList<Integer>();  // reordered 9
        int[][] arTransp = null;  // reordered 9
        int nCountElem = 0;  // reordered 12
        int nNumGroup = 0;  // reordered 12
        int nNumFriends = 0;  // reordered 12
        int nIdAl2 = 0;  // reordered 12
        int nIdAl = 0;  // reordered 12
        int nNumAlumni = 0;  // reordered 12
        int nCases = 0;  // reordered 12
        Scanner myscan = new Scanner(System.in);  // reordered 12
        nCases = myscan.nextInt();
        for (int i = 0; i < nCases; i++) {
            nNumAlumni = myscan.nextInt();
            arVisited = new int[nNumAlumni];  // reordered 2
            arTransp = new int[nNumAlumni][nNumAlumni];  // reordered 2
            arGroups = new int[nNumAlumni][nNumAlumni];  // reordered 2
            for (int j = 0; j < nNumAlumni; j++) {
                nIdAl = myscan.nextInt();
                nNumFriends = myscan.nextInt();
                for (int k = 0; k < nNumFriends; k++) {
                    nIdAl2 = myscan.nextInt();
                    arTransp[nIdAl2 - 1][nIdAl - 1] = 1;  // reordered 1
                    arGroups[nIdAl - 1][nIdAl2 - 1] = 1;  // reordered 1
                }
            }
            for (int l = 0; l < nNumAlumni; l++) {
                arVisited[l] = 0;
            }
            alOnAGroup = new ArrayList<Integer>();
            CC(arGroups, arVisited);
            CC_Transp(nNumGroup, arTransp, arVisited, alOnAGroup, i);
        }
    }
    public static void CC(int[][] arGroups, int[] arVisited) {
        for (int i = 0; i < arVisited.length; i++) {
            if (arVisited[i] == 0) {
                DFS(arGroups, arVisited, i);
            }
        }
    }
    public static void CC_Transp(int nNumGroup, int[][] arGroups, int[] arVisited, ArrayList<Integer> alOnAGroup, int nCase) {
        int nDummy = 0;
        for (int i = 0; i < arVisited.length; i++) {
            if (arVisited[i] < 2) {
                nCountElem = 0;
                DFS_Transp(arGroups, arVisited, alOnAGroup, i);
                if (nCountElem >= 4) {
                    nNumGroup++;
                } else {
                    for (int j = 1; j <= nCountElem && !alOnAGroup.isEmpty(); j++) {
                        nDummy = alOnAGroup.remove(alOnAGroup.size() - 1);
                    }
                }
            }
        }
        System.out.println("Caso #" + (nCase + 1));
        System.out.println(nNumGroup + " " + (arVisited.length - alOnAGroup.size()));
    }
    public static void DFS(int[][] arGroups, int[] arVis, int n) {
        arVis[n]++;
        for (int i = 0; i < arGroups[n].length; i++) {
            if (arVis[i] == 0 && arGroups[n][i] != 0)
                DFS(arGroups, arVis, i);
        }
    }
    public static void DFS_Transp(int[][] arGroups, int[] arVis, ArrayList<Integer> alOnAGroup, int n) {
        arVis[n]++;
        if (arVis[n] > 1) {
            alOnAGroup.add(n);
            nCountElem++;
        }
        for (int i = 0; i < arGroups[n].length; i++) {
            if (arVis[i] < 2 && arGroups[n][i] != 0)
                DFS_Transp(arGroups, arVis, alOnAGroup, i);
        }
    }
}
