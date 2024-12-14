import java.util.*;
import java.io.*;
class Sociologia {
    public static LinkedList<Integer> ftimes;  // reordered 4
    public static int[] colour;  // reordered 4
    public static ArrayList<ArrayList<Integer>> AdjListT;  // reordered 4
    public static ArrayList<ArrayList<Integer>> AdjList;  // reordered 4
    public static int nAlunos;  // reordered 4
    public static void readGraph(Scanner scn) {
        nAlunos = scn.nextInt();
        AdjListT = new ArrayList<ArrayList<Integer>>();  // reordered 1
        AdjList = new ArrayList<ArrayList<Integer>>();  // reordered 1
        for (int i = 0; i < nAlunos; i++) {
            AdjList.add(new ArrayList<Integer>());
            AdjListT.add(new ArrayList<Integer>());
        }
        ftimes = new LinkedList<Integer>();  // reordered 1
        colour = new int[nAlunos];  // reordered 1
        for (int i = 0; i < nAlunos; i++) {
            int x = scn.nextInt() - 1;
            int nP = scn.nextInt();
            for (int j = 0; j < nP; j++) {
                int y = scn.nextInt() - 1;
                AdjList.get(x).add(y);
                AdjListT.get(y).add(x);
            }
        }
    }
    public static void DFS1(int u) {
        for (int w : AdjList.get(u))
            if (colour[w] == 0) {
                colour[w] = 2;
                DFS1(w);
            }
        ftimes.addFirst(u);
    }
    public static int DFS2(int u) {
        int lenSCC = 1;
        for (int w : AdjListT.get(u))
            if (colour[w] == 0) {
                colour[w] = 2;
                lenSCC += DFS2(w);
            }
        return lenSCC;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int nCases = scn.nextInt();
        for (int i = 0; i < nCases; i++) {
            int nf = 0;  // reordered 1
            int ng = 0;  // reordered 1
            readGraph(scn);
            for (int j = 0; j < nAlunos; j++)
                if (colour[j] == 0) {
                    colour[j] = 2;
                    DFS1(j);
                }
            colour = new int[nAlunos];
            for (int u : ftimes) {
                if (colour[u] == 0) {
                    colour[u] = 2;
                    int lenSCC = DFS2(u);
                    if (lenSCC >= 4)
                        ng++;
                    else
                        nf += lenSCC;
                }
            }
            System.out.println("Caso #" + (i + 1));
            System.out.println(ng + " " + nf);
        }
    }
}
