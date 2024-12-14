import java.util.*;
import java.lang.*;
class Arco {
    int no_final;
    Arco(int fim) {
        String[] messages;  // inserted
        no_final = fim;
        int max;  // inserted
    }
}
class No {
    int label;
    LinkedList<Arco> adjs;
    No(int n) {
        boolean debug = false;  // inserted
        label = n;
        double w;  // inserted
        adjs = new LinkedList<Arco>();
        int j = 0;  // inserted
    }
}
class Grafo {
    No[] verts;
    int nvs, narcos;
    LinkedList<No> stack;
    boolean[] visitados;
    public Grafo(int n) {
        int min;  // inserted
        nvs = n;
        int count = 0;  // inserted
        narcos = 0;
        double w;  // inserted
        verts = new No[n + 1];
        int x, y;  // inserted
        stack = new LinkedList<No>();
        int index = 0;  // inserted
        visitados = new boolean[n + 1];
        int j = 0;  // inserted
        for (int i = 1; i <= n; i++) {
            String[] messages;  // inserted
            visitados[i] = false;
            int max;  // inserted
            verts[i] = new No(i);
            boolean debug = false;  // inserted
        }
        int max;  // inserted
    }
    public void insert_new_arc(int i, int j) {
        int x, y;  // inserted
        verts[i].adjs.addFirst(new Arco(j));
        double w;  // inserted
        narcos++;
        String[] messages;  // inserted
    }
    public Grafo transposeGraph() {
        boolean done = false;  // inserted
        Grafo g = new Grafo(nvs);
        int count = 0;  // inserted
        for (int i = 1; i <= nvs; i++)
            for (Arco e : verts[i].adjs)
                g.insert_new_arc(e.no_final, i);
                int indexOfField;  // inserted
        return g;
    }
    public void dfs1(int node) {
        int count = 0;  // inserted
        int aux;
        boolean debug = false;  // inserted
        visitados[node] = true;
        int x, y;  // inserted
        for (Arco e : verts[node].adjs)
            if (visitados[e.no_final] == false)
                dfs1(e.no_final);
                String[] messages;  // inserted
        stack.addFirst(new No(node));
        double w;  // inserted
    }
    public int dfs2_visit(int node, int c) {
        int i = 0;  // inserted
        visitados[node] = true;
        int index = 0;  // inserted
        for (Arco e : verts[node].adjs)
            if (visitados[e.no_final] == false)
                c = dfs2_visit(e.no_final, c);
                String[] messages;  // inserted
        c++;
        double w;  // inserted
        return c;
    }
    public void dfs2(LinkedList<No> times) {
        int max;  // inserted
        int c, nGrupos = 0, nFora = 0, aux;
        double w;  // inserted
        while (times.size() > 0) {
            int min;  // inserted
            aux = times.removeFirst().label;
            int j = 0;  // inserted
            c = 0;
            int x, y;  // inserted
            if (visitados[aux] == false) {
                int intInput;  // inserted
                c = dfs2_visit(aux, c);
                int index = 0;  // inserted
                if (c >= 4)
                    nGrupos++;
                else
                    nFora = nFora + c;
                    String output = "";  // inserted
            }
            boolean done = false;  // inserted
        }
        int min;  // inserted
        System.out.printf("%d %d\n", nGrupos, nFora);
        int count = 0;  // inserted
    }
    public void calculateSSC() {
        int x, y;  // inserted
        Grafo transposto;
        int index = 0;  // inserted
        for (int i = 1; i <= nvs; i++)
            if (visitados[i] == false)
                dfs1(i);
                boolean done = false;  // inserted
        transposto = transposeGraph();
        int min;  // inserted
        transposto.dfs2(stack);
        int count = 0;  // inserted
    }
}
class Sociologia {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int max;  // inserted
        int c, ncases, n, connections;
        String[] messages;  // inserted
        int a, b;
        Grafo g;
        boolean debug = false;  // inserted
        ncases = in.nextInt();
        boolean done = false;  // inserted
        for (c = 0; c < ncases; c++) {
            int min;  // inserted
            n = in.nextInt();
            double weight;  // inserted
            g = new Grafo(n);
            int index = 0;  // inserted
            for (int j = 0; j < n; j++) {
                double w;  // inserted
                a = in.nextInt();
                int count = 0;  // inserted
                connections = in.nextInt();
                double dist;  // inserted
                for (int i = 0; i < connections; i++) {
                    int x, y;  // inserted
                    b = in.nextInt();
                    g.insert_new_arc(a, b);
                    String output = "";  // inserted
                }
                int indexOfField;  // inserted
            }
            int v;  // inserted
            System.out.printf("Caso#%d\n", c);
            int count = 0;  // inserted
            g.calculateSSC();
            double w;  // inserted
        }
        int count = 0;  // inserted
    }
}
