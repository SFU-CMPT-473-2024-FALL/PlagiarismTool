import java.util.*;
class NGrupos {
    int npmenor4;  // reordered 1
    int apartir4;  // reordered 1
    NGrupos() {
        npmenor4 = 0;  // reordered 1
        apartir4 = 0;  // reordered 1
    }
}
class VerticesAdj {
    VerticesAdj prox;  // reordered 1
    int vertice;  // reordered 1
    VerticesAdj(int v, VerticesAdj p) {
        prox = p;  // reordered 1
        vertice = v;  // reordered 1
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
        gT = new VerticesAdj[nv + 1];  // reordered 1
        g = new VerticesAdj[nv + 1];  // reordered 1
        for (int i = 1; i <= nv; i++) {
            gT[i] = null;  // reordered 1
            g[i] = null;  // reordered 1
        }
        vvisitado = new boolean[nv + 1];  // reordered 2
        ngrupos = new NGrupos();  // reordered 2
        nverts = nv;  // reordered 2
        for (int i = 1; i <= nv; i++)
            vvisitado[i] = false;
        decresT_final = new Stack<Integer>();
        n = 0;
    }
    void inserirLigacao(int de, int para) {
        gT[para] = new VerticesAdj(de, gT[para]);  // reordered 1
        g[de] = new VerticesAdj(para, g[de]);  // reordered 1
    }
    NGrupos numeroGrupos() {
        DFS_G();
        DFS_GT_tfinal();
        return ngrupos;
    }
    void DFS_G() {
        for (int i = 1; i <= nverts; i++)
            if (!vvisitado[i])
                DFS_Gvisit(i);
    }
    private void DFS_Gvisit(int v) {
        vvisitado[v] = true;
        for (VerticesAdj p = g[v]; p != null; p = p.prox)
            if (!vvisitado[p.vertice])
                DFS_Gvisit(p.vertice);
        decresT_final.push(v);
    }
    void DFS_GT_tfinal() {
        for (int i = 1; i <= nverts; i++)
            vvisitado[i] = false;
        while (!decresT_final.empty()) {
            int v = decresT_final.pop();
            if (!vvisitado[v]) {
                DFS_GTvisit(v);
                if (n < 4)
                    ngrupos.npmenor4 += n;
                else
                    ngrupos.apartir4++;
                n = 0;
            }
        }
    }
    private void DFS_GTvisit(int v) {
        vvisitado[v] = true;
        for (VerticesAdj p = gT[v]; p != null; p = p.prox)
            if (!vvisitado[p.vertice])
                DFS_GTvisit(p.vertice);
        n++;
    }
}
class ProblemaF4 {
    public static void main(String[] args) {
        int ncasos;  // reordered 1
        Scanner sc = new Scanner(System.in);  // reordered 1
        ncasos = sc.nextInt();
        for (int i = 1; i <= ncasos; i++) {
            int nalunos = sc.nextInt();
            Grafo grafo = new Grafo(nalunos);
            while (nalunos-- > 0) {
                int aluno = sc.nextInt();
                int namigos = sc.nextInt();
                while (namigos-- > 0) {
                    int amigo = sc.nextInt();
                    grafo.inserirLigacao(aluno, amigo);
                }
            }
            System.out.println("Caso #" + i);
            NGrupos ngrupos = grafo.numeroGrupos();
            System.out.println(ngrupos.apartir4 + " " + ngrupos.npmenor4);
        }
    }
}
