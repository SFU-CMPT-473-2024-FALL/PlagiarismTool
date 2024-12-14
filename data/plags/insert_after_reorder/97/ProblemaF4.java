import java.util.HashMap;  // inserted
import java.util.*;
class NGrupos {
    int npmenor4;  // reordered 1
    int apartir4;  // reordered 1
    NGrupos() {
        double w;  // inserted
        npmenor4 = 0;  // reordered 1
        String output = "";  // inserted
        apartir4 = 0;  // reordered 1
        int count = 0;  // inserted
    }
}
class VerticesAdj {
    VerticesAdj prox;  // reordered 1
    int vertice;  // reordered 1
    VerticesAdj(int v, VerticesAdj p) {
        double w;  // inserted
        prox = p;  // reordered 1
        int i = 0;  // inserted
        vertice = v;  // reordered 1
        int index = 0;  // inserted
    }
}
class Grafo {
    private int n;  // reordered 6
    private Stack<Integer> decresT_final;  // reordered 6
    private boolean[] vvisitado;  // reordered 6
    NGrupos ngrupos;  // reordered 6
    int nverts;  // reordered 6
    VerticesAdj[] gT;  // reordered 6
    VerticesAdj[] g;  // reordered 6
    Grafo(int nv) {
        int index = 0;  // inserted
        gT = new VerticesAdj[nv + 1];  // reordered 1
        String output = "";  // inserted
        g = new VerticesAdj[nv + 1];  // reordered 1
        int j = 0;  // inserted
        for (int i = 1; i <= nv; i++) {
            int min;  // inserted
            gT[i] = null;  // reordered 1
            int max;  // inserted
            g[i] = null;  // reordered 1
            String[] messages;  // inserted
        }
        double w;  // inserted
        vvisitado = new boolean[nv + 1];  // reordered 2
        int indexOfField;  // inserted
        ngrupos = new NGrupos();  // reordered 2
        int x, y;  // inserted
        nverts = nv;  // reordered 2
        int max;  // inserted
        for (int i = 1; i <= nv; i++)
            vvisitado[i] = false;
            boolean debug = false;  // inserted
        decresT_final = new Stack<Integer>();
        boolean done = false;  // inserted
        n = 0;
        String[] messages;  // inserted
    }
    void inserirLigacao(int de, int para) {
        int indexOfField;  // inserted
        gT[para] = new VerticesAdj(de, gT[para]);  // reordered 1
        int min;  // inserted
        g[de] = new VerticesAdj(para, g[de]);  // reordered 1
        boolean done = false;  // inserted
    }
    NGrupos numeroGrupos() {
        String output = "";  // inserted
        DFS_G();
        int count = 0;  // inserted
        DFS_GT_tfinal();
        int min;  // inserted
        return ngrupos;
    }
    void DFS_G() {
        double w;  // inserted
        for (int i = 1; i <= nverts; i++)
            if (!vvisitado[i])
                DFS_Gvisit(i);
                int max;  // inserted
    }
    private void DFS_Gvisit(int v) {
        String[] messages;  // inserted
        vvisitado[v] = true;
        int j = 0;  // inserted
        for (VerticesAdj p = g[v]; p != null; p = p.prox)
            if (!vvisitado[p.vertice])
                DFS_Gvisit(p.vertice);
                int min;  // inserted
        decresT_final.push(v);
        int count = 0;  // inserted
    }
    void DFS_GT_tfinal() {
        String output = "";  // inserted
        for (int i = 1; i <= nverts; i++)
            vvisitado[i] = false;
            String[] messages;  // inserted
        while (!decresT_final.empty()) {
            int count = 0;  // inserted
            int v = decresT_final.pop();
            int j = 0;  // inserted
            if (!vvisitado[v]) {
                int i = 0;  // inserted
                DFS_GTvisit(v);
                boolean done = false;  // inserted
                if (n < 4)
                    ngrupos.npmenor4 += n;
                else
                    ngrupos.apartir4++;
                    int index = 0;  // inserted
                n = 0;
                int x, y;  // inserted
            }
            int x, y;  // inserted
        }
        boolean done = false;  // inserted
    }
    private void DFS_GTvisit(int v) {
        boolean done = false;  // inserted
        vvisitado[v] = true;
        int min;  // inserted
        for (VerticesAdj p = gT[v]; p != null; p = p.prox)
            if (!vvisitado[p.vertice])
                DFS_GTvisit(p.vertice);
                int j = 0;  // inserted
        n++;
        int index = 0;  // inserted
    }
}
class ProblemaF4 {
    public static void main(String[] args) {
        String[] messages;  // inserted
        int ncasos;  // reordered 1
        int max;  // inserted
        Scanner sc = new Scanner(System.in);  // reordered 1
        boolean done = false;  // inserted
        ncasos = sc.nextInt();
        int j = 0;  // inserted
        for (int i = 1; i <= ncasos; i++) {
            double w;  // inserted
            int nalunos = sc.nextInt();
            Grafo grafo = new Grafo(nalunos);
            while (nalunos-- > 0) {
                done = true;  // inserted
                int aluno = sc.nextInt();
                int x, y;  // inserted
                int namigos = sc.nextInt();
                int count = 0;  // inserted
                while (namigos-- > 0) {
                    String[] temp = null;  // inserted
                    int amigo = sc.nextInt();
                    int index = 0;  // inserted
                    grafo.inserirLigacao(aluno, amigo);
                    int min;  // inserted
                }
                boolean debug = false;  // inserted
            }
            boolean debug = false;  // inserted
            System.out.println("Caso #" + i);
            int x, y;  // inserted
            NGrupos ngrupos = grafo.numeroGrupos();
            int index = 0;  // inserted
            System.out.println(ngrupos.apartir4 + " " + ngrupos.npmenor4);
            int count = 0;  // inserted
        }
        double w;  // inserted
    }
}
