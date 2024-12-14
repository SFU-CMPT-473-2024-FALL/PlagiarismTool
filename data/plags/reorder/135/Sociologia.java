import java.util.*;
class Pessoa {
    boolean visitado;  // reordered 4
    int t;  // reordered 4
    int[] amigos;  // reordered 4
    int namigos;  // reordered 4
    int id;  // reordered 4
    Pessoa(int i) {
        visitado = false;  // reordered 1
        id = i;  // reordered 1
    }
    Pessoa(int i, int n) {
        visitado = false;  // reordered 4
        t = 0;  // reordered 4
        namigos = n;  // reordered 3
        amigos = new int[namigos];  // reordered 3
        id = i;  // reordered 4
    }
    int pos() {
        int p = 0;
        for (int i = 0; i < amigos.length; i++)
            if (amigos[i] != 0)
                p++;
        return p;
    }
}
class Grafo {
    int visitados;  // reordered 7
    int res;  // reordered 7
    int nelementos;  // reordered 7
    int ngrupos;  // reordered 7
    Pessoa[] tppl;  // reordered 7
    Pessoa[] ppl;  // reordered 7
    int tempo;  // reordered 7
    int nos;  // reordered 7
    Grafo(int n) {
        visitados = 0;  // reordered 7
        res = 0;  // reordered 7
        nelementos = 0;  // reordered 7
        ngrupos = 0;  // reordered 7
        tppl = new Pessoa[n + 1];  // reordered 7
        ppl = new Pessoa[n + 1];  // reordered 7
        tempo = 0;  // reordered 7
        nos = n;  // reordered 7
    }
    void criar(Scanner kb) {
        for (int i = 1; i <= nos; i++) {
            tppl[i] = new Pessoa(i, nos);  // reordered 1
            ppl[i] = new Pessoa(i);  // reordered 1
        }
        for (int i = 0; i < nos; i++) {
            int id = kb.nextInt();
            int nf = kb.nextInt();
            Pessoa nova = new Pessoa(id, nf);
            ppl[id] = nova;
            for (int j = 0; j < nf; j++) {
                int f = kb.nextInt();
                ppl[id].amigos[j] = f;
            }
        }
    }
    void transpor() {
        for (int i = 1; i <= nos; i++) {
            int aux, in;
            for (int j = 0; j < ppl[i].amigos.length; j++) {
                aux = ppl[i].amigos[j];
                in = tppl[aux].pos();
                tppl[aux].amigos[in] = i;
            }
        }
    }
    void dfs() {
        for (int i = 1; i < ppl.length; i++) {
            if (ppl[i].visitado == false)
                dfs_visit(i);
        }
    }
    void dfs_visit(int x) {
        if (ppl[x].visitado == false) {
            ppl[x].visitado = true;
            for (int j = 0; j < ppl[x].amigos.length; j++) {
                dfs_visit(ppl[x].amigos[j]);
            }
            tempo++;
            ppl[x].t = tempo;
        }
    }
    int findMax() {
        int indice = -1;  // reordered 1
        int max = -1;  // reordered 1
        for (int i = 1; i <= nos; i++)
            if (max < ppl[i].t && tppl[i].visitado == false) {
                indice = i;  // reordered 1
                max = ppl[i].t;  // reordered 1
            }
        return indice;
    }
    void dfs_t_visit(int x) {
        if (tppl[x].visitado == false) {
            visitados++;  // reordered 1
            tppl[x].visitado = true;  // reordered 1
            for (int j = 0; j < tppl[x].pos(); j++) {
                dfs_t_visit(tppl[x].amigos[j]);
            }
            nelementos++;
        }
    }
    void dfs_t() {
        while (visitados < nos) {
            int id = findMax();
            if (tppl[id].visitado == false && id != -1) {
                nelementos = 0;
                dfs_t_visit(id);
                if (nelementos >= 4)
                    ngrupos++;
                else
                    res = res + nelementos;
            }
        }
    }
    void print() {
        System.out.println(ngrupos + " " + res);
    }
}
public class Sociologia {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int ncasos = kb.nextInt();
        for (int i = 1; i <= ncasos; i++) {
            int n = kb.nextInt();
            Grafo g = new Grafo(n);
            g.criar(kb);
            g.dfs();
            g.transpor();
            g.dfs_t();
            System.out.println("Caso #" + i);
            g.print();
        }
    }
}
