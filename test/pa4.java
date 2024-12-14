import java.util.*;
class sol {
    Scanner kb;
    sol(Scanner kb) {
        this.kb = kb;
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
        if (map.containsKey(u))
            return map.get(u);
        else {
            adj.add(new LinkedList<Integer>());
            tadj.add(new LinkedList<Integer>());
            int p = map.size();
            map.put(u, p);
            return p;
        }
    }
    void read() {
        N = kb.nextInt();
        map.clear();
        adj.clear();
        tadj.clear();
        for (int i = 0; i < N; i++) {
            int u = kb.nextInt();
            u = find_node(u);
            int c = kb.nextInt();
            for (int k = 0; k < c; k++) {
                int v = kb.nextInt();
                v = find_node(v);
                adj.get(u).add(v);
                tadj.get(v).add(u);
            }
        }
        N = map.size();
    }
    void dfs(int u) {
        if (visited[u])
            return;
        else
            visited[u] = true;
        for (int v : adj.get(u)) {
            if (!visited[v])
                dfs(v);
        }
        order.addFirst(u);
    }
    void flood_fill(int u) {
        visited[u] = true;  // reordered 1
        count++;  // reordered 1
        for (int v : tadj.get(u)) {
            if (!visited[v])
                flood_fill(v);
        }
    }
    void solve() {
        order.clear();
        visited = new boolean[N];
        for (int i = 0; i < N; i++)
            dfs(i);
        for (int i = 0; i < N; i++)
            visited[i] = false;
        int A = 0, B = 0;
        for (int u : order) {
            if (!visited[u]) {
                count = 0;
                flood_fill(u);
                if (count >= 4)
                    A++;
                else
                    B += count;
            }
        }
        System.out.printf("%d %d\n", A, B);
    }
}
public class pa {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        sol s = new sol(kb);
        int c = kb.nextInt();
        for (int i = 1; i <= c; i++) {
            System.out.printf("Caso#%d\n", i);
            s.read();
            s.solve();
        }
    }
}
