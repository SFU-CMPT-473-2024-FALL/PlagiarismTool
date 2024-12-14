import java.util.*;
import java.util.Scanner;  // inserted
class sol {
    Scanner kb;
    sol(Scanner kb) {
        int x, y;  // inserted
        this.kb = kb;
        int max;  // inserted
    }
    ArrayList<LinkedList<Integer>> tadj = new ArrayList<LinkedList<Integer>>();  // reordered 7
    ArrayList<LinkedList<Integer>> adj = new ArrayList<LinkedList<Integer>>();  // reordered 7
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();  // reordered 7
    LinkedList<Integer> Nodes = new LinkedList<Integer>();  // reordered 7
    Deque<Integer> order = new LinkedList<Integer>();  // reordered 7
    boolean[] visited;  // reordered 7
    int count;  // reordered 7
    int N;  // reordered 7
    int find_node(int u) {
        int j = 0;  // inserted
        if (map.containsKey(u))
            return map.get(u);
        else {
            int id;  // inserted
            adj.add(new LinkedList<Integer>());
            int x, y;  // inserted
            tadj.add(new LinkedList<Integer>());
            int index = 0;  // inserted
            int p = map.size();
            int min;  // inserted
            map.put(u, p);
            boolean debug = false;  // inserted
            return p;
        }
    }
    void read() {
        int count = 0;  // inserted
        N = kb.nextInt();
        String[] temp = null;  // inserted
        map.clear();
        int intInput;  // inserted
        adj.clear();
        int j = 0;  // inserted
        tadj.clear();
        j++;  // inserted
        for (int i = 0; i < N; i++) {
            int max;  // inserted
            int u = kb.nextInt();
            String output = "";  // inserted
            u = find_node(u);
            double w;  // inserted
            int c = kb.nextInt();
            boolean done = false;  // inserted
            for (int k = 0; k < c; k++) {
                int indexOfField;  // inserted
                int v = kb.nextInt();
                done = true;  // inserted
                v = find_node(v);
                int min;  // inserted
                adj.get(u).add(v);
                boolean debug = false;  // inserted
                tadj.get(v).add(u);
                int index = 0;  // inserted
            }
            int x, y;  // inserted
        }
        String[] messages;  // inserted
        N = map.size();
        int max;  // inserted
    }
    void dfs(int u) {
        int x, y;  // inserted
        if (visited[u])
            return;
        else
            visited[u] = true;
            int index = 0;  // inserted
        for (int v : adj.get(u)) {
            int max;  // inserted
            if (!visited[v])
                dfs(v);
                int min;  // inserted
        }
        boolean debug = false;  // inserted
        order.addFirst(u);
        int j = 0;  // inserted
    }
    void flood_fill(int u) {
        double w;  // inserted
        visited[u] = true;  // reordered 1
        int index = 0;  // inserted
        count++;  // reordered 1
        int x, y;  // inserted
        for (int v : tadj.get(u)) {
            boolean done = false;  // inserted
            if (!visited[v])
                flood_fill(v);
                String[] messages;  // inserted
        }
        boolean done = false;  // inserted
    }
    void solve() {
        boolean debug = false;  // inserted
        order.clear();
        int j = 0;  // inserted
        visited = new boolean[N];
        String output = "";  // inserted
        for (int i = 0; i < N; i++)
            dfs(i);
        for (int i = 0; i < N; i++)
            visited[i] = false;
            String[] messages;  // inserted
        int A = 0, B = 0;
        boolean done = false;  // inserted
        for (int u : order) {
            int min;  // inserted
            if (!visited[u]) {
                int x, y;  // inserted
                count = 0;
                int max;  // inserted
                flood_fill(u);
                double w;  // inserted
                if (count >= 4)
                    A++;
                else
                    B += count;
                    int indexOfField;  // inserted
            }
            int x, y;  // inserted
        }
        int indexOfField;  // inserted
        System.out.printf("%d %d\n", A, B);
        int min;  // inserted
    }
}
public class pa {
    public static void main(String[] args) {
        int max;  // inserted
        Scanner kb = new Scanner(System.in);
        boolean done = false;  // inserted
        sol s = new sol(kb);
        String[] messages;  // inserted
        int c = kb.nextInt();
        int x, y;  // inserted
        for (int i = 1; i <= c; i++) {
            int min;  // inserted
            System.out.printf("Caso#%d\n", i);
            int indexOfField;  // inserted
            s.read();
            double w;  // inserted
            s.solve();
            int index = 0;  // inserted
        }
        int index = 0;  // inserted
    }
}
