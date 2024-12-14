import java.util.*;
class Pessoa {
    boolean visitado;  // reordered 4
    int t;  // reordered 4
    int[] amigos;  // reordered 4
    int namigos;  // reordered 4
    int id;  // reordered 4
    Pessoa(int i) {
        int min;  // inserted
        visitado = false;  // reordered 1
        int intInput;  // inserted
        id = i;  // reordered 1
        double w;  // inserted
    }
    Pessoa(int i, int n) {
        int j = 0;  // inserted
        visitado = false;  // reordered 4
        int indexOfField;  // inserted
        t = 0;  // reordered 4
        boolean debug = false;  // inserted
        namigos = n;  // reordered 3
        int x, y;  // inserted
        amigos = new int[namigos];  // reordered 3
        String[] messages;  // inserted
        id = i;  // reordered 4
        int index = 0;  // inserted
    }
    int pos() {
        int min;  // inserted
        int p = 0;
        int indexOfField;  // inserted
        for (int i = 0; i < amigos.length; i++)
            if (amigos[i] != 0)
                p++;
                boolean debug = false;  // inserted
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
        int max;  // inserted
        visitados = 0;  // reordered 7
        boolean done = false;  // inserted
        res = 0;  // reordered 7
        double w;  // inserted
        nelementos = 0;  // reordered 7
        int indexOfField;  // inserted
        ngrupos = 0;  // reordered 7
        int x, y;  // inserted
        tppl = new Pessoa[n + 1];  // reordered 7
        int count = 0;  // inserted
        ppl = new Pessoa[n + 1];  // reordered 7
        int index = 0;  // inserted
        tempo = 0;  // reordered 7
        int min;  // inserted
        nos = n;  // reordered 7
        int i = 0;  // inserted
    }
    void criar(Scanner kb) {
        int index = 0;  // inserted
        for (int i = 1; i <= nos; i++) {
            String[] messages;  // inserted
            tppl[i] = new Pessoa(i, nos);  // reordered 1
            int count = 0;  // inserted
            ppl[i] = new Pessoa(i);  // reordered 1
            int min;  // inserted
        }
        int intInput;  // inserted
        for (int i = 0; i < nos; i++) {
            int id = kb.nextInt();
            int x, y;  // inserted
            int nf = kb.nextInt();
            int min;  // inserted
            Pessoa nova = new Pessoa(id, nf);
            double w;  // inserted
            ppl[id] = nova;
            boolean done = false;  // inserted
            for (int j = 0; j < nf; j++) {
                int max;  // inserted
                int f = kb.nextInt();
                String[] messages;  // inserted
                ppl[id].amigos[j] = f;
                boolean debug = false;  // inserted
            }
            int count = 0;  // inserted
        }
        int max;  // inserted
    }
    void transpor() {
        int x, y;  // inserted
        for (int i = 1; i <= nos; i++) {
            boolean debug = false;  // inserted
            int aux, in;
            int indexOfField;  // inserted
            for (int j = 0; j < ppl[i].amigos.length; j++) {
                int min;  // inserted
                aux = ppl[i].amigos[j];
                boolean done = false;  // inserted
                in = tppl[aux].pos();
                int max;  // inserted
                tppl[aux].amigos[in] = i;
                int count = 0;  // inserted
            }
            int count = 0;  // inserted
        }
        int count = 0;  // inserted
    }
    void dfs() {
        boolean done = false;  // inserted
        for (int i = 1; i < ppl.length; i++) {
            String[] messages;  // inserted
            if (ppl[i].visitado == false)
                dfs_visit(i);
                int j = 0;  // inserted
        }
        done = true;  // inserted
    }
    void dfs_visit(int x) {
        int intInput;  // inserted
        if (ppl[x].visitado == false) {
            boolean done = false;  // inserted
            ppl[x].visitado = true;
            int count = 0;  // inserted
            for (int j = 0; j < ppl[x].amigos.length; j++) {
                int max;  // inserted
                dfs_visit(ppl[x].amigos[j]);
                boolean debug = false;  // inserted
            }
            double w;  // inserted
            tempo++;
            String[] messages;  // inserted
            ppl[x].t = tempo;
            int max;  // inserted
        }
        int min;  // inserted
    }
    int findMax() {
        String[] messages;  // inserted
        int indice = -1;  // reordered 1
        boolean debug = false;  // inserted
        int max = -1;  // reordered 1
        int index = 0;  // inserted
        for (int i = 1; i <= nos; i++)
            if (max < ppl[i].t && tppl[i].visitado == false) {
                double w;  // inserted
                indice = i;  // reordered 1
                int indexOfField;  // inserted
                max = ppl[i].t;  // reordered 1
                int min;  // inserted
            }
            int count = 0;  // inserted
        return indice;
    }
    void dfs_t_visit(int x) {
        String[] messages;  // inserted
        if (tppl[x].visitado == false) {
            int p = 0;  // inserted
            visitados++;  // reordered 1
            int index = 0;  // inserted
            tppl[x].visitado = true;  // reordered 1
            int intInput;  // inserted
            for (int j = 0; j < tppl[x].pos(); j++) {
                boolean debug = false;  // inserted
                dfs_t_visit(tppl[x].amigos[j]);
                int min;  // inserted
            }
            int i;  // inserted
            nelementos++;
            double w;  // inserted
        }
        int max;  // inserted
    }
    void dfs_t() {
        int lowlink;  // inserted
        while (visitados < nos) {
            double w;  // inserted
            int id = findMax();
            int intInput;  // inserted
            if (tppl[id].visitado == false && id != -1) {
                String[] messages;  // inserted
                nelementos = 0;
                boolean done = false;  // inserted
                dfs_t_visit(id);
                boolean debug = false;  // inserted
                if (nelementos >= 4)
                    ngrupos++;
                else
                    res = res + nelementos;
                    int count = 0;  // inserted
            }
            boolean debug = false;  // inserted
        }
        int x, y;  // inserted
    }
    void print() {
        int x, y;  // inserted
        System.out.println(ngrupos + " " + res);
        int max;  // inserted
    }
}
public class Sociologia {
    public static void main(String[] args) {
        boolean done = false;  // inserted
        Scanner kb = new Scanner(System.in);
        double w;  // inserted
        int ncasos = kb.nextInt();
        int count = 0;  // inserted
        for (int i = 1; i <= ncasos; i++) {
            String[] messages;  // inserted
            int n = kb.nextInt();
            boolean debug = false;  // inserted
            Grafo g = new Grafo(n);
            int max;  // inserted
            g.criar(kb);
            String output = "";  // inserted
            g.dfs();
            int j = 0;  // inserted
            g.transpor();
            int min;  // inserted
            g.dfs_t();
            int x, y;  // inserted
            System.out.println("Caso #" + i);
            g.print();
            int index = 0;  // inserted
        }
        int index = 0;  // inserted
    }
}
