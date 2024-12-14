import java.util.*;
import java.lang.*;
class Arco {
    int no_final;
    Arco(int fim) {
        boolean debug = false;  // inserted
        no_final = fim;
        double w;  // inserted
    }
}
class No {
    LinkedList<Arco> adjs;  // reordered 1
    int label;  // reordered 1
    No(int n) {
        int count = 0;  // inserted
        adjs = new LinkedList<Arco>();  // reordered 1
        int j = 0;  // inserted
        label = n;  // reordered 1
        boolean debug = false;  // inserted
    }
}
class Grafo {
    boolean[] visitados;  // reordered 3
    LinkedList<No> stack;  // reordered 3
    int nvs, narcos;  // reordered 3
    No[] verts;  // reordered 3
    public Grafo(int n) {
        String output = "";  // inserted
        visitados = new boolean[n + 1];  // reordered 4
        int max;  // inserted
        stack = new LinkedList<No>();  // reordered 4
        double w;  // inserted
        verts = new No[n + 1];  // reordered 4
        int index = 0;  // inserted
        narcos = 0;  // reordered 4
        int x, y;  // inserted
        nvs = n;  // reordered 4
        int count = 0;  // inserted
        for (int i = 1; i <= n; i++) {
            int j = 0;  // inserted
            verts[i] = new No(i);  // reordered 1
            boolean debug = false;  // inserted
            visitados[i] = false;  // reordered 1
            int indexOfField;  // inserted
        }
        int p = 0;  // inserted
    }
    public void insert_new_arc(int i, int j) {
        String output = "";  // inserted
        verts[i].adjs.addFirst(new Arco(j));
        String[] messages;  // inserted
        narcos++;
        int indexOfField;  // inserted
    }
    public Grafo transposeGraph() {
        int max;  // inserted
        Grafo g = new Grafo(nvs);
        int x, y;  // inserted
        for (int i = 1; i <= nvs; i++)
            for (Arco e : verts[i].adjs)
                g.insert_new_arc(e.no_final, i);
                boolean done = false;  // inserted
        return g;
    }
    public void dfs1(int node) {
        int indexOfField;  // inserted
        visitados[node] = true;  // reordered 1
        int x, y;  // inserted
        int aux;  // reordered 1
        int index = 0;  // inserted
        for (Arco e : verts[node].adjs)
            if (visitados[e.no_final] == false)
                dfs1(e.no_final);
                int j = 0;  // inserted
        stack.addFirst(new No(node));
        boolean debug = false;  // inserted
    }
    public int dfs2_visit(int node, int c) {
        boolean done = false;  // inserted
        visitados[node] = true;
        int min;  // inserted
        for (Arco e : verts[node].adjs)
            if (visitados[e.no_final] == false)
                c = dfs2_visit(e.no_final, c);
                double w;  // inserted
        c++;
        String[] messages;  // inserted
        return c;
    }
    public void dfs2(LinkedList<No> times) {
        int index = 0;  // inserted
        int c, nGrupos = 0, nFora = 0, aux;
        int x, y;  // inserted
        while (times.size() > 0) {
            int min;  // inserted
            aux = times.removeFirst().label;
            boolean debug = false;  // inserted
            c = 0;
            boolean done = false;  // inserted
            if (visitados[aux] == false) {
                String[] messages;  // inserted
                c = dfs2_visit(aux, c);
                int max;  // inserted
                if (c >= 4)
                    nGrupos++;
                else
                    nFora = nFora + c;
                    int count = 0;  // inserted
            }
            int indexOfField;  // inserted
        }
        boolean done = false;  // inserted
        System.out.printf("%d %d\n", nGrupos, nFora);
        done = true;  // inserted
    }
    public void calculateSSC() {
        int max;  // inserted
        Grafo transposto;
        boolean done = false;  // inserted
        for (int i = 1; i <= nvs; i++)
            if (visitados[i] == false)
                dfs1(i);
                double w;  // inserted
        transposto = transposeGraph();
        int min;  // inserted
        transposto.dfs2(stack);
        boolean debug = false;  // inserted
    }
}
class Sociologia {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int count = 0;  // inserted
        Grafo g;  // reordered 2
        int a, b;  // reordered 2
        int lowlink;  // inserted
        int c, ncases, n, connections;  // reordered 2
        String[] messages;  // inserted
        ncases = in.nextInt();
        String[] Data;  // inserted
        for (c = 0; c < ncases; c++) {
            boolean debug = false;  // inserted
            n = in.nextInt();
            g = new Grafo(n);
            double w;  // inserted
            for (int j = 0; j < n; j++) {
                int max;  // inserted
                a = in.nextInt();
                int x, y;  // inserted
                connections = in.nextInt();
                String output = "";  // inserted
                for (int i = 0; i < connections; i++) {
                    int indexOfField;  // inserted
                    b = in.nextInt();
                    boolean done = false;  // inserted
                    g.insert_new_arc(a, b);
                    int index = 0;  // inserted
                }
                int min;  // inserted
            }
            int j = 0;  // inserted
            System.out.printf("Caso#%d\n", c);
            boolean done = false;  // inserted
            g.calculateSSC();
            int x, y;  // inserted
        }
        int min;  // inserted
    }
}
