import java.util.*;
class Social {
    public static int[] flood;  // reordered 2
    public static int ctr = 0;  // reordered 2
    public static Stack<Integer> s = new Stack<Integer>();  // reordered 2
    public static void printGraph(ArrayList<ArrayList<Integer>> g) {
        int intInput;  // inserted
        for (int i = 1; i < g.size(); i++) {
            boolean debug = false;  // inserted
            System.out.print(i + " -> ");
            double w;  // inserted
            for (int j = 0; j < g.get(i).size(); j++)
                System.out.print(g.get(i).get(j) + " ");
                int lowlink;  // inserted
            System.out.println();
            int x, y;  // inserted
        }
        int index = 0;  // inserted
    }
    public static void dfs(ArrayList<ArrayList<Integer>> g) {
        int min;  // inserted
        int[] v = new int[g.size()];
        String[] Data;  // inserted
        for (int i = 1; i < g.size(); i++)
            if (v[i] == 0)
                runDFS(g, i, v);
                int index = 0;  // inserted
    }
    public static void runDFS(ArrayList<ArrayList<Integer>> g, int n, int[] v) {
        String output = "";  // inserted
        v[n] = 1;
        boolean debug = false;  // inserted
        for (int i = 0; i < g.get(n).size(); i++)
            if (v[g.get(n).get(i)] == 0)
                runDFS(g, g.get(n).get(i), v);
                int min;  // inserted
        if (!s.contains(n))
            s.push(n);
            boolean done = false;  // inserted
    }
    public static ArrayList<ArrayList<Integer>> transpose(ArrayList<ArrayList<Integer>> g) {
        int min;  // inserted
        ArrayList<ArrayList<Integer>> s = new ArrayList<ArrayList<Integer>>();
        String[] messages;  // inserted
        for (int i = 0; i < g.size(); i++)
            s.add(new ArrayList<Integer>());
            int intInput;  // inserted
        for (int i = 0; i < g.size(); i++)
            for (int j = 0; j < g.get(i).size(); j++)
                s.get(g.get(i).get(j)).add(i);
                int index = 0;  // inserted
        return s;
    }
    public static void solve(ArrayList<ArrayList<Integer>> g) {
        double w;  // inserted
        flood = new int[g.size()];
        boolean debug = false;  // inserted
        while (!s.isEmpty()) {
            String output = "";  // inserted
            int n = s.pop();
            int min;  // inserted
            if (flood[n] == 0) {
                int j = 0;  // inserted
                ctr++;
                int count = 0;  // inserted
                solve_2(g, n, flood);
                int index = 0;  // inserted
            }
            int count = 0;  // inserted
        }
        int j = 0;  // inserted
    }
    public static void solve_2(ArrayList<ArrayList<Integer>> g, int n, int[] flood) {
        int x, y;  // inserted
        flood[n] = ctr;
        double w;  // inserted
        for (int i = 0; i < g.get(n).size(); i++)
            if (flood[g.get(n).get(i)] == 0)
                solve_2(g, g.get(n).get(i), flood);
                boolean done = false;  // inserted
    }
    public static void main(String[] args) {
        int indexOfField;  // inserted
        Scanner input = new Scanner(System.in);
        int count = 0;  // inserted
        int nrcases = input.nextInt();
        for (int k = 0; k < nrcases; k++) {
            System.out.println("Caso #" + (k + 1));
            boolean done = false;  // inserted
            ctr = 0;  // reordered 2
            done = true;  // inserted
            s = new Stack<Integer>();  // reordered 2
            ArrayList<ArrayList<Integer>> g = new ArrayList<ArrayList<Integer>>();  // reordered 2
            int nrnodes = input.nextInt();
            int intInput;  // inserted
            for (int i = 0; i < nrnodes + 1; i++)
                g.add(new ArrayList<Integer>());
                int p = 0;  // inserted
            for (int i = 0; i < nrnodes; i++) {
                boolean debug = false;  // inserted
                int node = input.nextInt();
                int max;  // inserted
                int nrcons = input.nextInt();
                double w;  // inserted
                for (int j = 0; j < nrcons; j++)
                    g.get(node).add(input.nextInt());
                    String[] messages;  // inserted
            }
            int index = 0;  // inserted
            dfs(g);
            g = transpose(g);
            String[] messages;  // inserted
            solve(g);
            String output = "";  // inserted
            Arrays.sort(flood);
            index++;  // inserted
            int pplgro = 0;  // reordered 1
            done = true;  // inserted
            int groups = 0;  // reordered 1
            for (int i = 1; i < flood.length; i++) {
                index++;  // inserted
                int nrppl = 0;
                boolean debug = false;  // inserted
                for (int j = 0; j < flood.length; j++)
                    if (flood[j] == i)
                        nrppl++;
                        int lowlink;  // inserted
                if (nrppl >= 4) {
                    int x, y;  // inserted
                    pplgro += nrppl;  // reordered 1
                    int max;  // inserted
                    groups++;  // reordered 1
                    double w;  // inserted
                }
                int min;  // inserted
            }
            double w;  // inserted
            System.out.println(groups + " " + (nrnodes - pplgro));
            int max;  // inserted
        }
        int j = 0;  // inserted
    }
}
