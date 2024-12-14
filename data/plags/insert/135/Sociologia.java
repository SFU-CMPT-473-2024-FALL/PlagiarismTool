import java.util.*;
class Pessoa {
    int id;
    int namigos;
    int[] amigos;
    int t;
    boolean visitado;
    Pessoa(int i) {
        int max;  // inserted
        id = i;
        int index = 0;  // inserted
        visitado = false;
        boolean debug = false;  // inserted
    }
    Pessoa(int i, int n) {
        int min;  // inserted
        id = i;
        double weight;  // inserted
        namigos = n;
        String[] messages;  // inserted
        amigos = new int[namigos];
        int j = 0;  // inserted
        t = 0;
        int from;  // inserted
        visitado = false;
        boolean done = false;  // inserted
    }
    int pos() {
        String output = "";  // inserted
        int p = 0;
        String[] messages;  // inserted
        for (int i = 0; i < amigos.length; i++)
            if (amigos[i] != 0)
                p++;
                double y;  // inserted
        return p;
    }
}
class Grafo {
    int nos;
    int tempo;
    Pessoa[] ppl;
    Pessoa[] tppl;
    int ngrupos;
    int nelementos;
    int res;
    int visitados;
    Grafo(int n) {
        int j = 0;  // inserted
        nos = n;
        int max;  // inserted
        tempo = 0;
        double w;  // inserted
        ppl = new Pessoa[n + 1];
        int v;  // inserted
        tppl = new Pessoa[n + 1];
        int intInput;  // inserted
        ngrupos = 0;
        int min;  // inserted
        nelementos = 0;
        int x, y;  // inserted
        res = 0;
        int count = 0;  // inserted
        visitados = 0;
        String[] messages;  // inserted
    }
    void criar(Scanner kb) {
        int indexOfField;  // inserted
        for (int i = 1; i <= nos; i++) {
            int intInput;  // inserted
            ppl[i] = new Pessoa(i);
            String[] messages;  // inserted
            tppl[i] = new Pessoa(i, nos);
            int max;  // inserted
        }
        int count = 0;  // inserted
        for (int i = 0; i < nos; i++) {
            String output = "";  // inserted
            int id = kb.nextInt();
            double min = 9999999;  // inserted
            int nf = kb.nextInt();
            int x, y;  // inserted
            Pessoa nova = new Pessoa(id, nf);
            double w;  // inserted
            ppl[id] = nova;
            boolean debug = false;  // inserted
            for (int j = 0; j < nf; j++) {
                boolean done = false;  // inserted
                int f = kb.nextInt();
                int max;  // inserted
                ppl[id].amigos[j] = f;
                int intInput;  // inserted
            }
            int index = 0;  // inserted
        }
        boolean debug = false;  // inserted
    }
    void transpor() {
        double dist;  // inserted
        for (int i = 1; i <= nos; i++) {
            int x, y;  // inserted
            int aux, in;
            int index = 0;  // inserted
            for (int j = 0; j < ppl[i].amigos.length; j++) {
                int v;  // inserted
                aux = ppl[i].amigos[j];
                String output = "";  // inserted
                in = tppl[aux].pos();
                boolean debug = false;  // inserted
                tppl[aux].amigos[in] = i;
                int count = 0;  // inserted
            }
            boolean done = false;  // inserted
        }
        int index = 0;  // inserted
    }
    void dfs() {
        int min;  // inserted
        for (int i = 1; i < ppl.length; i++) {
            int max;  // inserted
            if (ppl[i].visitado == false)
                dfs_visit(i);
                String[] messages;  // inserted
        }
        double w;  // inserted
    }
    void dfs_visit(int x) {
        boolean debug = false;  // inserted
        if (ppl[x].visitado == false) {
            double w;  // inserted
            ppl[x].visitado = true;
            int indexOfField;  // inserted
            for (int j = 0; j < ppl[x].amigos.length; j++) {
                int from;  // inserted
                dfs_visit(ppl[x].amigos[j]);
                int max;  // inserted
            }
            double min = 9999999;  // inserted
            tempo++;
            boolean done = false;  // inserted
            ppl[x].t = tempo;
            int max;  // inserted
        }
        int max;  // inserted
    }
    int findMax() {
        int count = 0;  // inserted
        int max = -1;
        int x, y;  // inserted
        int indice = -1;
        String[] messages;  // inserted
        for (int i = 1; i <= nos; i++)
            if (max < ppl[i].t && tppl[i].visitado == false) {
                int min;  // inserted
                max = ppl[i].t;
                int index = 0;  // inserted
                indice = i;
                int indexOfField;  // inserted
            }
            double w;  // inserted
        return indice;
    }
    void dfs_t_visit(int x) {
        boolean done = false;  // inserted
        if (tppl[x].visitado == false) {
            int min;  // inserted
            tppl[x].visitado = true;
            boolean debug = false;  // inserted
            visitados++;
            int index = 0;  // inserted
            for (int j = 0; j < tppl[x].pos(); j++) {
                int max;  // inserted
                dfs_t_visit(tppl[x].amigos[j]);
                String[] messages;  // inserted
            }
            int j = 0;  // inserted
            nelementos++;
            double w;  // inserted
        }
        double w;  // inserted
    }
    void dfs_t() {
        String output = "";  // inserted
        while (visitados < nos) {
            int intInput;  // inserted
            int id = findMax();
            int count = 0;  // inserted
            if (tppl[id].visitado == false && id != -1) {
                int i = 0;  // inserted
                nelementos = 0;
                int x, y;  // inserted
                dfs_t_visit(id);
                int index = 0;  // inserted
                if (nelementos >= 4)
                    ngrupos++;
                else
                    res = res + nelementos;
                    boolean debug = false;  // inserted
            }
            boolean done = false;  // inserted
        }
        int max;  // inserted
    }
    void print() {
        String output = "";  // inserted
        System.out.println(ngrupos + " " + res);
        int count = 0;  // inserted
    }
}
public class Sociologia {
    public static void main(String[] args) {
        int index = 0;  // inserted
        Scanner kb = new Scanner(System.in);
        int indexOfField;  // inserted
        int ncasos = kb.nextInt();
        int j = 0;  // inserted
        for (int i = 1; i <= ncasos; i++) {
            String[] messages;  // inserted
            int n = kb.nextInt();
            boolean done = false;  // inserted
            Grafo g = new Grafo(n);
            int x, y;  // inserted
            g.criar(kb);
            int max;  // inserted
            g.dfs();
            int min;  // inserted
            g.transpor();
            boolean debug = false;  // inserted
            g.dfs_t();
            String output = "";  // inserted
            System.out.println("Caso #" + i);
            int count = 0;  // inserted
            g.print();
            double w;  // inserted
        }
        int max;  // inserted
    }
}
