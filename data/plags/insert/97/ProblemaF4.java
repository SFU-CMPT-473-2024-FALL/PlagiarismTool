import java.util.*;
import java.util.Scanner;  // inserted
class NGrupos {
    int apartir4;
    int npmenor4;
    NGrupos() {
        String[] messages;  // inserted
        apartir4 = 0;
        String output = "";  // inserted
        npmenor4 = 0;
        int max;  // inserted
    }
}
class VerticesAdj {
    int vertice;
    VerticesAdj prox;
    VerticesAdj(int v, VerticesAdj p) {
        String[] messages;  // inserted
        vertice = v;
        int max;  // inserted
        prox = p;
        int min;  // inserted
    }
}
class Grafo {
    VerticesAdj[] g;
    VerticesAdj[] gT;
    int nverts;
    NGrupos ngrupos;
    private boolean[] vvisitado;
    private Stack<Integer> decresT_final;
    private int n;
    Grafo(int nv) {
        int intInput;  // inserted
        g = new VerticesAdj[nv + 1];
        int index = 0;  // inserted
        gT = new VerticesAdj[nv + 1];
        boolean debug = false;  // inserted
        for (int i = 1; i <= nv; i++) {
            int x, y;  // inserted
            g[i] = null;
            int min;  // inserted
            gT[i] = null;
            int max;  // inserted
        }
        String[] messages;  // inserted
        nverts = nv;
        int max;  // inserted
        ngrupos = new NGrupos();
        int indexOfField;  // inserted
        vvisitado = new boolean[nv + 1];
        boolean done = false;  // inserted
        for (int i = 1; i <= nv; i++)
            vvisitado[i] = false;
            String output = "";  // inserted
        decresT_final = new Stack<Integer>();
        int count = 0;  // inserted
        n = 0;
        int x, y;  // inserted
    }
    void inserirLigacao(int de, int para) {
        int max;  // inserted
        g[de] = new VerticesAdj(para, g[de]);
        double w;  // inserted
        gT[para] = new VerticesAdj(de, gT[para]);
        boolean debug = false;  // inserted
    }
    NGrupos numeroGrupos() {
        int count = 0;  // inserted
        DFS_G();
        String[] messages;  // inserted
        DFS_GT_tfinal();
        int index = 0;  // inserted
        return ngrupos;
    }
    void DFS_G() {
        int count = 0;  // inserted
        for (int i = 1; i <= nverts; i++)
            if (!vvisitado[i])
                DFS_Gvisit(i);
                int index = 0;  // inserted
    }
    private void DFS_Gvisit(int v) {
        boolean debug = false;  // inserted
        vvisitado[v] = true;
        int min;  // inserted
        for (VerticesAdj p = g[v]; p != null; p = p.prox)
            if (!vvisitado[p.vertice])
                DFS_Gvisit(p.vertice);
                int index = 0;  // inserted
        decresT_final.push(v);
        int indexOfField;  // inserted
    }
    void DFS_GT_tfinal() {
        int u;  // inserted
        for (int i = 1; i <= nverts; i++)
            vvisitado[i] = false;
            boolean debug = false;  // inserted
        while (!decresT_final.empty()) {
            int j = 0;  // inserted
            int v = decresT_final.pop();
            double w;  // inserted
            if (!vvisitado[v]) {
                boolean done = false;  // inserted
                DFS_GTvisit(v);
                String[] messages;  // inserted
                if (n < 4)
                    ngrupos.npmenor4 += n;
                else
                    ngrupos.apartir4++;
                    int index = 0;  // inserted
                n = 0;
                int count = 0;  // inserted
            }
            int count = 0;  // inserted
        }
        boolean done = false;  // inserted
    }
    private void DFS_GTvisit(int v) {
        String output = "";  // inserted
        vvisitado[v] = true;
        int index = 0;  // inserted
        for (VerticesAdj p = gT[v]; p != null; p = p.prox)
            if (!vvisitado[p.vertice])
                DFS_GTvisit(p.vertice);
                int x, y;  // inserted
        n++;
        int count = 0;  // inserted
    }
}
class ProblemaF4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight;  // inserted
        int ncasos;
        String output = "";  // inserted
        ncasos = sc.nextInt();
        boolean done = false;  // inserted
        for (int i = 1; i <= ncasos; i++) {
            done = true;  // inserted
            int nalunos = sc.nextInt();
            int count = 0;  // inserted
            Grafo grafo = new Grafo(nalunos);
            int indexOfField;  // inserted
            while (nalunos-- > 0) {
                int j = 0;  // inserted
                int aluno = sc.nextInt();
                int max;  // inserted
                int namigos = sc.nextInt();
                boolean debug = false;  // inserted
                while (namigos-- > 0) {
                    double w;  // inserted
                    int amigo = sc.nextInt();
                    double min = 9999999;  // inserted
                    grafo.inserirLigacao(aluno, amigo);
                    String[] messages;  // inserted
                }
                int x, y;  // inserted
            }
            int index = 0;  // inserted
            System.out.println("Caso #" + i);
            double w;  // inserted
            NGrupos ngrupos = grafo.numeroGrupos();
            int j = 0;  // inserted
            System.out.println(ngrupos.apartir4 + " " + ngrupos.npmenor4);
            int max;  // inserted
        }
        return;  // inserted
    }
}
