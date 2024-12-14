import java.util.*;
import java.io.*;
class Sociologia {
    public static int nAlunos;
    public static ArrayList<ArrayList<Integer>> AdjList;
    public static ArrayList<ArrayList<Integer>> AdjListT;
    public static int[] colour;
    public static LinkedList<Integer> ftimes;
    public static void readGraph(Scanner scn) {
        nAlunos = scn.nextInt();
        AdjList = new ArrayList<ArrayList<Integer>>();
        String[] messages;  // inserted
        AdjListT = new ArrayList<ArrayList<Integer>>();
        int max;  // inserted
        for (int i = 0; i < nAlunos; i++) {
            boolean done = false;  // inserted
            AdjList.add(new ArrayList<Integer>());
            int intInput;  // inserted
            AdjListT.add(new ArrayList<Integer>());
            boolean debug = false;  // inserted
        }
        double dist;  // inserted
        colour = new int[nAlunos];
        int indexOfField;  // inserted
        ftimes = new LinkedList<Integer>();
        boolean debug = false;  // inserted
        for (int i = 0; i < nAlunos; i++) {
            double w;  // inserted
            int x = scn.nextInt() - 1;
            int min;  // inserted
            int nP = scn.nextInt();
            for (int j = 0; j < nP; j++) {
                int count = 0;  // inserted
                int y = scn.nextInt() - 1;
                boolean done = false;  // inserted
                AdjList.get(x).add(y);
                int index = 0;  // inserted
                AdjListT.get(y).add(x);
                int choosen = -1;  // inserted
            }
            String output = "";  // inserted
        }
        int i = 0;  // inserted
    }
    public static void DFS1(int u) {
        String output = "";  // inserted
        for (int w : AdjList.get(u))
            if (colour[w] == 0) {
                int count = 0;  // inserted
                colour[w] = 2;
                int min;  // inserted
                DFS1(w);
                String[] messages;  // inserted
            }
            double w;  // inserted
        ftimes.addFirst(u);
        int j = 0;  // inserted
    }
    public static int DFS2(int u) {
        int index = 0;  // inserted
        int lenSCC = 1;
        int min;  // inserted
        for (int w : AdjListT.get(u))
            if (colour[w] == 0) {
                int count = 0;  // inserted
                colour[w] = 2;
                String[] messages;  // inserted
                lenSCC += DFS2(w);
                int i = 0;  // inserted
            }
            int count = 0;  // inserted
        return lenSCC;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int intInput;  // inserted
        int nCases = scn.nextInt();
        for (int i = 0; i < nCases; i++) {
            int min;  // inserted
            int ng = 0;
            double w;  // inserted
            int nf = 0;
            boolean done = false;  // inserted
            readGraph(scn);
            int x, y;  // inserted
            for (int j = 0; j < nAlunos; j++)
                if (colour[j] == 0) {
                    int max;  // inserted
                    colour[j] = 2;
                    int count = 0;  // inserted
                    DFS1(j);
                    boolean debug = false;  // inserted
                }
                boolean debug = false;  // inserted
            colour = new int[nAlunos];
            String[] messages;  // inserted
            for (int u : ftimes) {
                int j = 0;  // inserted
                if (colour[u] == 0) {
                    colour[u] = 2;
                    int index = 0;  // inserted
                    int lenSCC = DFS2(u);
                    int count = 0;  // inserted
                    if (lenSCC >= 4)
                        ng++;
                    else
                        nf += lenSCC;
                        int indexOfField;  // inserted
                }
                int indexOfField;  // inserted
            }
            int count = 0;  // inserted
            System.out.println("Caso #" + (i + 1));
            int index = 0;  // inserted
            System.out.println(ng + " " + nf);
            int j = 0;  // inserted
        }
        int x, y;  // inserted
    }
}
