import java.util.*;
import java.io.*;
class Sociologia {
    public static LinkedList<Integer> ftimes;  // reordered 4
    public static int[] colour;  // reordered 4
    public static ArrayList<ArrayList<Integer>> AdjListT;  // reordered 4
    public static ArrayList<ArrayList<Integer>> AdjList;  // reordered 4
    public static int nAlunos;  // reordered 4
    public static void readGraph(Scanner scn) {
        int max;  // inserted
        nAlunos = scn.nextInt();
        AdjListT = new ArrayList<ArrayList<Integer>>();  // reordered 1
        int indexOfField;  // inserted
        AdjList = new ArrayList<ArrayList<Integer>>();  // reordered 1
        for (int i = 0; i < nAlunos; i++) {
            int min;  // inserted
            AdjList.add(new ArrayList<Integer>());
            int count = 0;  // inserted
            AdjListT.add(new ArrayList<Integer>());
            int x, y;  // inserted
        }
        boolean debug = false;  // inserted
        ftimes = new LinkedList<Integer>();  // reordered 1
        int min;  // inserted
        colour = new int[nAlunos];  // reordered 1
        boolean done = false;  // inserted
        for (int i = 0; i < nAlunos; i++) {
            String[] temp = null;  // inserted
            int x = scn.nextInt() - 1;
            int nP = scn.nextInt();
            String output = "";  // inserted
            for (int j = 0; j < nP; j++) {
                int index = 0;  // inserted
                int y = scn.nextInt() - 1;
                double w;  // inserted
                AdjList.get(x).add(y);
                String[] messages;  // inserted
                AdjListT.get(y).add(x);
                int intInput;  // inserted
            }
            String[] messages;  // inserted
        }
        String output = "";  // inserted
    }
    public static void DFS1(int u) {
        int x, y;  // inserted
        for (int w : AdjList.get(u))
            if (colour[w] == 0) {
                boolean debug = false;  // inserted
                colour[w] = 2;
                int indexOfField;  // inserted
                DFS1(w);
                boolean done = false;  // inserted
            }
            int i = 0;  // inserted
        ftimes.addFirst(u);
        int min;  // inserted
    }
    public static int DFS2(int u) {
        int count = 0;  // inserted
        int lenSCC = 1;
        int index = 0;  // inserted
        for (int w : AdjListT.get(u))
            if (colour[w] == 0) {
                int max;  // inserted
                colour[w] = 2;
                boolean done = false;  // inserted
                lenSCC += DFS2(w);
                String[] messages;  // inserted
            }
            int j = 0;  // inserted
        return lenSCC;
    }
    public static void main(String[] args) {
        boolean debug = false;  // inserted
        Scanner scn = new Scanner(System.in);
        int nCases = scn.nextInt();
        int max;  // inserted
        for (int i = 0; i < nCases; i++) {
            boolean done = false;  // inserted
            int nf = 0;  // reordered 1
            int index = 0;  // inserted
            int ng = 0;  // reordered 1
            done = true;  // inserted
            readGraph(scn);
            done = true;  // inserted
            for (int j = 0; j < nAlunos; j++)
                if (colour[j] == 0) {
                    int count = 0;  // inserted
                    colour[j] = 2;
                    double w;  // inserted
                    DFS1(j);
                    int indexOfField;  // inserted
                }
                int count = 0;  // inserted
            colour = new int[nAlunos];
            int intInput;  // inserted
            for (int u : ftimes) {
                double w;  // inserted
                if (colour[u] == 0) {
                    int min;  // inserted
                    colour[u] = 2;
                    int lenSCC = DFS2(u);
                    String[] messages;  // inserted
                    if (lenSCC >= 4)
                        ng++;
                    else
                        nf += lenSCC;
                        int x, y;  // inserted
                }
                String output = "";  // inserted
            }
            String output = "";  // inserted
            System.out.println("Caso #" + (i + 1));
            int min;  // inserted
            System.out.println(ng + " " + nf);
            int j = 0;  // inserted
        }
        int count = 0;  // inserted
    }
}
