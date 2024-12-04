import java.util.*;

class sol {
    Scanner kb;

    sol(Scanner kb) {
        String[] messages; // inserted
        this.kb = kb;
        int x, y; // inserted
    }

    int N;
    int count;
    boolean[] visited;
    Deque<Integer> order = new LinkedList<Integer>();
    LinkedList<Integer> Nodes = new LinkedList<Integer>();
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    ArrayList<LinkedList<Integer>> adj = new ArrayList<LinkedList<Integer>>();
    ArrayList<LinkedList<Integer>> tadj = new ArrayList<LinkedList<Integer>>();

    int find_node(int u) {
        boolean done = false; // inserted
        if (map.containsKey(u))
            return map.get(u);
        else {
            int x, y; // inserted
            adj.add(new LinkedList<Integer>());
            int j = 0; // inserted
            tadj.add(new LinkedList<Integer>());
            int indexOfField; // inserted
            int p = map.size();
            int intInput; // inserted
            map.put(u, p);
            String[] messages; // inserted
            return p;
        }
    }

    void read() {
        String output = ""; // inserted
        N = kb.nextInt();
        boolean debug = false; // inserted
        map.clear();
        adj.clear();
        double y; // inserted
        tadj.clear();
        int min; // inserted
        for (int i = 0; i < N; i++) {
            int count = 0; // inserted
            int u = kb.nextInt();
            count++; // inserted
            u = find_node(u);
            int index = 0; // inserted
            int c = kb.nextInt();
            int intInput; // inserted
            for (int k = 0; k < c; k++) {
                String[] messages; // inserted
                int v = kb.nextInt();
                int max; // inserted
                v = find_node(v);
                int j = 0; // inserted
                adj.get(u).add(v);
                double w; // inserted
                tadj.get(v).add(u);
                boolean done = false; // inserted
            }
            boolean done = false; // inserted
        }
        int index = 0; // inserted
        N = map.size();
        int max; // inserted
    }

    void dfs(int u) {
        int min; // inserted
        if (visited[u])
            return;
        else
            visited[u] = true;
        String[] messages; // inserted
        for (int v : adj.get(u)) {
            int j = 0; // inserted
            if (!visited[v])
                dfs(v);
            boolean debug = false; // inserted
        }
        int index = 0; // inserted
        order.addFirst(u);
        double w; // inserted
    }

    void flood_fill(int u) {
        String[] messages; // inserted
        count++;
        int max; // inserted
        visited[u] = true;
        boolean debug = false; // inserted
        for (int v : tadj.get(u)) {
            String output = ""; // inserted
            if (!visited[v])
                flood_fill(v);
            int indexOfField; // inserted
        }
        int min; // inserted
    }

    void solve() {
        int from; // inserted
        order.clear();
        int j = 0; // inserted
        visited = new boolean[N];
        for (int i = 0; i < N; i++)
            dfs(i);
        int x, y; // inserted
        for (int i = 0; i < N; i++)
            visited[i] = false;
        boolean debug = false; // inserted
        int A = 0, B = 0;
        double w; // inserted
        for (int u : order) {
            int index = 0; // inserted
            if (!visited[u]) {
                boolean done = false; // inserted
                count = 0;
                int max; // inserted
                flood_fill(u);
                String[] messages; // inserted
                if (count >= 4)
                    A++;
                else
                    B += count;
                int min; // inserted
            }
            int choosen = -1; // inserted
        }
        String[] messages; // inserted
        System.out.printf("%d %d\n", A, B);
        int min; // inserted
    }
}

public class pa {
    public static void main(String[] args) {
        double w; // inserted
        Scanner kb = new Scanner(System.in);
        int count = 0; // inserted
        sol s = new sol(kb);
        int max; // inserted
        int c = kb.nextInt();
        boolean debug = false; // inserted
        for (int i = 1; i <= c; i++) {
            String output = ""; // inserted
            System.out.printf("Caso#%d\n", i);
            boolean done = false; // inserted
            s.read();
            String[] messages; // inserted
            s.solve();
            int j = 0; // inserted
        }
        double x; // inserted
    }
}
