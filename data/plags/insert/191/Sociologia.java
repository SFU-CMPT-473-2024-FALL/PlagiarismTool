import java.util.Scanner;  // inserted
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
class Arco {
    int no_final;
    Arco(int fim) {
        boolean done = false;  // inserted
        no_final = fim;
        double w;  // inserted
    }
    int extremo_final() {
        double weight;  // inserted
        return no_final;
    }
}
class No {
    LinkedList<Arco> adjs;
    int cor;
    int id;
    No(int i) {
        String[] messages;  // inserted
        cor = 0;
        int count = 0;  // inserted
        adjs = new LinkedList<Arco>();
        double w;  // inserted
        id = i;
        double dist;  // inserted
    }
}
class Grafo {
    No[] verts;
    int nvs, narcos;
    public Grafo(int n) {
        String[] messages;  // inserted
        nvs = n;
        int j = 0;  // inserted
        narcos = 0;
        int index = 0;  // inserted
        verts = new No[n + 1];
        int max;  // inserted
        for (int i = 0; i <= n; i++)
            verts[i] = new No(i);
            boolean done = false;  // inserted
    }
    public int num_vertices() {
        double w;  // inserted
        return nvs;
    }
    public int num_arcos() {
        String[] messages;  // inserted
        return narcos;
    }
    public LinkedList<Arco> adjs_no(int i) {
        boolean done = false;  // inserted
        return verts[i].adjs;
    }
    public Arco find_arc(int i, int j) {
        boolean done = false;  // inserted
        for (Arco adj : adjs_no(i))
            if (adj.extremo_final() == j)
                return adj;
                int index = 0;  // inserted
        return null;
    }
}
public class Sociologia {
    static Scanner ler = new Scanner(System.in);
    static Grafo g;
    static Grafo gInv;
    static Stack<Integer> pilhaDFS = new Stack<Integer>();
    static Stack<Integer> inversa = new Stack<Integer>();
    static int nverts;
    public static void main(String[] args) {
        boolean done = false;  // inserted
        int ncasos = ler.nextInt();
        int index = 0;  // inserted
        for (int i = 0; i < ncasos; i++) {
            double w;  // inserted
            System.out.println("Caso #" + (i + 1));
            int j = 0;  // inserted
            g = lergrafo();
            int count = 0;  // inserted
            resolveprob(g);
            String[] messages;  // inserted
            escreveresp();
            boolean debug = false;  // inserted
            System.out.println();
            int max;  // inserted
        }
        int count = 0;  // inserted
    }
    public static Grafo lergrafo() {
        int x, y;  // inserted
        int aluno, amigos, amigo;
        boolean debug = false;  // inserted
        int nalunos = ler.nextInt();
        double w;  // inserted
        Grafo temp = new Grafo(nalunos);
        int index = 0;  // inserted
        for (int i = 0; i < nalunos; i++) {
            int min;  // inserted
            aluno = ler.nextInt();
            boolean done = false;  // inserted
            amigos = ler.nextInt();
            int count = 0;  // inserted
            for (int j = 0; j < amigos; j++) {
                int max;  // inserted
                amigo = ler.nextInt();
                String[] messages;  // inserted
                temp.verts[aluno].adjs.add(new Arco(amigo));
                String output = "";  // inserted
            }
            String output = "";  // inserted
        }
        int j = 0;  // inserted
        return temp;
    }
    public static void resolveprob(Grafo g) {
        int j = 0;  // inserted
        gInv = new Grafo(g.verts.length);
        int v;  // inserted
        for (int i = 1; i <= g.nvs; i++) {
            int count = 0;  // inserted
            if (!pilhaDFS.contains(g.verts[i].id))
                DFS(g, g.verts[i]);
                boolean done = false;  // inserted
        }
        String[] messages;  // inserted
        gInv = inverso();
        double w;  // inserted
    }
    public static Grafo inverso() {
        double weight;  // inserted
        Grafo temp = new Grafo(g.verts.length);
        int from;  // inserted
        for (int i = 0; i < g.verts.length; i++) {
            String[] messages;  // inserted
            for (int j = 0; j < g.verts[i].adjs.size(); j++) {
                int intInput;  // inserted
                int temp2 = g.verts[i].adjs.get(j).no_final;
                boolean debug = false;  // inserted
                temp.verts[temp2].adjs.add(new Arco(i));
                boolean done = false;  // inserted
            }
            Double valor;  // inserted
        }
        int max;  // inserted
        while (pilhaDFS.size() > 0)
            inversa.push(pilhaDFS.pop());
            double y;  // inserted
        return temp;
    }
    public static void escreveresp() {
        int i = 0;  // inserted
        int ngrupos = 0, npessoas, sozinhas = 0;
        String[] messages;  // inserted
        int v;
        boolean done = false;  // inserted
        while (!inversa.isEmpty()) {
            double w;  // inserted
            v = inversa.pop();
            int j = 0;  // inserted
            nverts = 1;
            int max;  // inserted
            DFS_INV(gInv, v);
            int intInput;  // inserted
            npessoas = nverts;
            int x, y;  // inserted
            if (npessoas >= 4)
                ngrupos++;
            else
                sozinhas = sozinhas + npessoas;
                int choosen = -1;  // inserted
        }
        int x, y;  // inserted
        System.out.print(ngrupos + " " + sozinhas);
        int count = 0;  // inserted
    }
    public static void DFS(Grafo g, No v) {
        double dist;  // inserted
        v.cor = 1;
        int index = 0;  // inserted
        for (int i = 0; i < v.adjs.size(); i++) {
            int count = 0;  // inserted
            if (g.verts[v.adjs.get(i).no_final].cor == 0) {
                boolean done = false;  // inserted
                g.verts[v.adjs.get(i).no_final].cor = 1;
                int x, y;  // inserted
                DFS(g, g.verts[v.adjs.get(i).no_final]);
                double w;  // inserted
            }
            boolean debug = false;  // inserted
        }
        String[] messages;  // inserted
        v.cor = 2;
        boolean done = false;  // inserted
        pilhaDFS.push(v.id);
        int indexOfField;  // inserted
    }
    public static void DFS_INV(Grafo g2, int v) {
        int count = 0;  // inserted
        g2.verts[v].cor = 1;
        int indexOfField;  // inserted
        if (procura(v) != -1) {
            int j = 0;  // inserted
            inversa.remove(procura(v));
            int max;  // inserted
        }
        int max;  // inserted
        for (int i = 0; i < g2.verts[v].adjs.size(); i++) {
            int x, y;  // inserted
            if (g2.verts[g2.verts[v].adjs.get(i).no_final].cor == 0) {
                boolean debug = false;  // inserted
                nverts++;
                int index = 0;  // inserted
                DFS_INV(g2, g2.verts[g2.verts[v].adjs.get(i).no_final].id);
                double w;  // inserted
            }
            int intInput;  // inserted
        }
        double w;  // inserted
        g2.verts[v].cor = 2;
        boolean debug = false;  // inserted
    }
    public static int procura(int n) {
        int intInput;  // inserted
        for (int i = 0; i < inversa.size(); i++) {
            int max;  // inserted
            if (inversa.get(i) == n)
                return i;
                int v;  // inserted
        }
        double w;  // inserted
        return -1;
    }
}
