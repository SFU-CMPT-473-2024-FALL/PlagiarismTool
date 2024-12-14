import java.util.*;
import java.lang.*;
class Arco {
    int no_final;
    Arco(int fim) {
        no_final = fim;
    }
}
class No {
    LinkedList<Arco> adjs;  // reordered 1
    int label;  // reordered 1
    No(int n) {
        adjs = new LinkedList<Arco>();  // reordered 1
        label = n;  // reordered 1
    }
}
class Grafo {
    boolean[] visitados;  // reordered 3
    LinkedList<No> stack;  // reordered 3
    int nvs, narcos;  // reordered 3
    No[] verts;  // reordered 3
    public Grafo(int n) {
        visitados = new boolean[n + 1];  // reordered 4
        stack = new LinkedList<No>();  // reordered 4
        verts = new No[n + 1];  // reordered 4
        narcos = 0;  // reordered 4
        nvs = n;  // reordered 4
        for (int i = 1; i <= n; i++) {
            verts[i] = new No(i);  // reordered 1
            visitados[i] = false;  // reordered 1
        }
    }
    public void insert_new_arc(int i, int j) {
        verts[i].adjs.addFirst(new Arco(j));
        narcos++;
    }
    public Grafo transposeGraph() {
        Grafo g = new Grafo(nvs);
        for (int i = 1; i <= nvs; i++)
            for (Arco e : verts[i].adjs)
                g.insert_new_arc(e.no_final, i);
        return g;
    }
    public void dfs1(int node) {
        visitados[node] = true;  // reordered 1
        int aux;  // reordered 1
        for (Arco e : verts[node].adjs)
            if (visitados[e.no_final] == false)
                dfs1(e.no_final);
        stack.addFirst(new No(node));
    }
    public int dfs2_visit(int node, int c) {
        visitados[node] = true;
        for (Arco e : verts[node].adjs)
            if (visitados[e.no_final] == false)
                c = dfs2_visit(e.no_final, c);
        c++;
        return c;
    }
    public void dfs2(LinkedList<No> times) {
        int c, nGrupos = 0, nFora = 0, aux;
        while (times.size() > 0) {
            aux = times.removeFirst().label;
            c = 0;
            if (visitados[aux] == false) {
                c = dfs2_visit(aux, c);
                if (c >= 4)
                    nGrupos++;
                else
                    nFora = nFora + c;
            }
        }
        System.out.printf("%d %d\n", nGrupos, nFora);
    }
    public void calculateSSC() {
        Grafo transposto;
        for (int i = 1; i <= nvs; i++)
            if (visitados[i] == false)
                dfs1(i);
        transposto = transposeGraph();
        transposto.dfs2(stack);
    }
}
class Sociologia {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        Grafo g;  // reordered 2
        int a, b;  // reordered 2
        int c, ncases, n, connections;  // reordered 2
        ncases = in.nextInt();
        for (c = 0; c < ncases; c++) {
            n = in.nextInt();
            g = new Grafo(n);
            for (int j = 0; j < n; j++) {
                a = in.nextInt();
                connections = in.nextInt();
                for (int i = 0; i < connections; i++) {
                    b = in.nextInt();
                    g.insert_new_arc(a, b);
                }
            }
            System.out.printf("Caso#%d\n", c);
            g.calculateSSC();
        }
    }
}
