import java.util.*;
class Social {
    public static Stack<Integer> s = new Stack<Integer>();
    public static int ctr = 0;
    public static int[] flood;
    public static void printGraph(ArrayList<ArrayList<Integer>> g) {
        int intInput;  // inserted
        for (int i = 1; i < g.size(); i++) {
            int count = 0;  // inserted
            System.out.print(i + " -> ");
            int x, y;  // inserted
            for (int j = 0; j < g.get(i).size(); j++)
                System.out.print(g.get(i).get(j) + " ");
                int max;  // inserted
            System.out.println();
            int j = 0;  // inserted
        }
        int index = 0;  // inserted
    }
    public static void dfs(ArrayList<ArrayList<Integer>> g) {
        int j = 0;  // inserted
        int[] v = new int[g.size()];
        double w;  // inserted
        for (int i = 1; i < g.size(); i++)
            if (v[i] == 0)
                runDFS(g, i, v);
                int x, y;  // inserted
    }
    public static void runDFS(ArrayList<ArrayList<Integer>> g, int n, int[] v) {
        boolean debug = false;  // inserted
        v[n] = 1;
        int max;  // inserted
        for (int i = 0; i < g.get(n).size(); i++)
            if (v[g.get(n).get(i)] == 0)
                runDFS(g, g.get(n).get(i), v);
                int min;  // inserted
        if (!s.contains(n))
            s.push(n);
            int i = 0;  // inserted
    }
    public static ArrayList<ArrayList<Integer>> transpose(ArrayList<ArrayList<Integer>> g) {
        int index = 0;  // inserted
        ArrayList<ArrayList<Integer>> s = new ArrayList<ArrayList<Integer>>();
        String output = "";  // inserted
        for (int i = 0; i < g.size(); i++)
            s.add(new ArrayList<Integer>());
            double w;  // inserted
        for (int i = 0; i < g.size(); i++)
            for (int j = 0; j < g.get(i).size(); j++)
                s.get(g.get(i).get(j)).add(i);
                int max;  // inserted
        return s;
    }
    public static void solve(ArrayList<ArrayList<Integer>> g) {
        String[] messages;  // inserted
        flood = new int[g.size()];
        String output = "";  // inserted
        while (!s.isEmpty()) {
            boolean done = false;  // inserted
            int n = s.pop();
            int min;  // inserted
            if (flood[n] == 0) {
                int x, y;  // inserted
                ctr++;
                int choosen = -1;  // inserted
                solve_2(g, n, flood);
                int count = 0;  // inserted
            }
            int j = 0;  // inserted
        }
        int x, y;  // inserted
    }
    public static void solve_2(ArrayList<ArrayList<Integer>> g, int n, int[] flood) {
        int index = 0;  // inserted
        flood[n] = ctr;
        boolean done = false;  // inserted
        for (int i = 0; i < g.get(n).size(); i++)
            if (flood[g.get(n).get(i)] == 0)
                solve_2(g, g.get(n).get(i), flood);
                int x, y;  // inserted
    }
    public static void main(String[] args) {
        int v;  // inserted
        Scanner input = new Scanner(System.in);
        double w;  // inserted
        int nrcases = input.nextInt();
        int max;  // inserted
        for (int k = 0; k < nrcases; k++) {
            int u;  // inserted
            System.out.println("Caso #" + (k + 1));
            boolean debug = false;  // inserted
            ArrayList<ArrayList<Integer>> g = new ArrayList<ArrayList<Integer>>();
            int index = 0;  // inserted
            s = new Stack<Integer>();
            ctr = 0;
            int count = 0;  // inserted
            int nrnodes = input.nextInt();
            for (int i = 0; i < nrnodes + 1; i++)
                g.add(new ArrayList<Integer>());
                int indexOfField;  // inserted
            for (int i = 0; i < nrnodes; i++) {
                Double valor;  // inserted
                int node = input.nextInt();
                int x, y;  // inserted
                int nrcons = input.nextInt();
                int min;  // inserted
                for (int j = 0; j < nrcons; j++)
                    g.get(node).add(input.nextInt());
                    int j = 0;  // inserted
            }
            int min;  // inserted
            dfs(g);
            g = transpose(g);
            index++;  // inserted
            solve(g);
            Arrays.sort(flood);
            int groups = 0;
            int pplgro = 0;
            int intInput;  // inserted
            for (int i = 1; i < flood.length; i++) {
                boolean done = false;  // inserted
                int nrppl = 0;
                for (int j = 0; j < flood.length; j++)
                    if (flood[j] == i)
                        nrppl++;
                        int choosen = -1;  // inserted
                if (nrppl >= 4) {
                    int x, y;  // inserted
                    groups++;
                    String[] messages;  // inserted
                    pplgro += nrppl;
                    String output = "";  // inserted
                }
                int x, y;  // inserted
            }
            String[] messages;  // inserted
            System.out.println(groups + " " + (nrnodes - pplgro));
            int i = 0;  // inserted
        }
        int x, y;  // inserted
    }
}
