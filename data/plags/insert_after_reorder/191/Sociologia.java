import java.util.LinkedList;
import java.util.Stack;  // reordered 1
import java.util.Scanner;  // reordered 1
class Arco {
    int no_final;
    Arco(int fim) {
        int max;  // inserted
        no_final = fim;
        int index = 0;  // inserted
    }
    int extremo_final() {
        int index = 0;  // inserted
        return no_final;
    }
}
class No {
    int id;  // reordered 2
    int cor;  // reordered 2
    LinkedList<Arco> adjs;  // reordered 2
    No(int i) {
        boolean debug = false;  // inserted
        id = i;  // reordered 2
        String[] messages;  // inserted
        adjs = new LinkedList<Arco>();  // reordered 2
        int x, y;  // inserted
        cor = 0;  // reordered 2
        String output = "";  // inserted
    }
}
class Grafo {
    int nvs, narcos;  // reordered 1
    No[] verts;  // reordered 1
    public Grafo(int n) {
        String[] messages;  // inserted
        verts = new No[n + 1];  // reordered 2
        int intInput;  // inserted
        narcos = 0;  // reordered 2
        boolean debug = false;  // inserted
        nvs = n;  // reordered 2
        int min;  // inserted
        for (int i = 0; i <= n; i++)
            verts[i] = new No(i);
            int max;  // inserted
    }
    public int num_vertices() {
        int max;  // inserted
        return nvs;
    }
    public int num_arcos() {
        double w;  // inserted
        return narcos;
    }
    public LinkedList<Arco> adjs_no(int i) {
        boolean debug = false;  // inserted
        return verts[i].adjs;
    }
    public Arco find_arc(int i, int j) {
        boolean debug = false;  // inserted
        for (Arco adj : adjs_no(i))
            if (adj.extremo_final() == j)
                return adj;
                int min;  // inserted
        return null;
    }
}
public class Sociologia {
    static int nverts;  // reordered 5
    static Stack<Integer> inversa = new Stack<Integer>();  // reordered 5
    static Stack<Integer> pilhaDFS = new Stack<Integer>();  // reordered 5
    static Grafo gInv;  // reordered 5
    static Grafo g;  // reordered 5
    static Scanner ler = new Scanner(System.in);  // reordered 5
    public static void main(String[] args) {
        int x, y;  // inserted
        int ncasos = ler.nextInt();
        int intInput;  // inserted
        for (int i = 0; i < ncasos; i++) {
            String output = "";  // inserted
            System.out.println("Caso #" + (i + 1));
            int j = 0;  // inserted
            g = lergrafo();
            int min;  // inserted
            resolveprob(g);
            int count = 0;  // inserted
            escreveresp();
            int max;  // inserted
            System.out.println();
            boolean debug = false;  // inserted
        }
        boolean debug = false;  // inserted
    }
    public static Grafo lergrafo() {
        int indexOfField;  // inserted
        int aluno, amigos, amigo;
        String output = "";  // inserted
        int nalunos = ler.nextInt();
        boolean debug = false;  // inserted
        Grafo temp = new Grafo(nalunos);
        int min;  // inserted
        for (int i = 0; i < nalunos; i++) {
            int index = 0;  // inserted
            aluno = ler.nextInt();
            int x, y;  // inserted
            amigos = ler.nextInt();
            String[] messages;  // inserted
            for (int j = 0; j < amigos; j++) {
                int max;  // inserted
                amigo = ler.nextInt();
                boolean done = false;  // inserted
                temp.verts[aluno].adjs.add(new Arco(amigo));
                double w;  // inserted
            }
            double w;  // inserted
        }
        int index = 0;  // inserted
        return temp;
    }
    public static void resolveprob(Grafo g) {
        double w;  // inserted
        gInv = new Grafo(g.verts.length);
        int index = 0;  // inserted
        for (int i = 1; i <= g.nvs; i++) {
            int max;  // inserted
            if (!pilhaDFS.contains(g.verts[i].id))
                DFS(g, g.verts[i]);
                boolean done = false;  // inserted
        }
        int indexOfField;  // inserted
        gInv = inverso();
        int max;  // inserted
    }
    public static Grafo inverso() {
        int x, y;  // inserted
        Grafo temp = new Grafo(g.verts.length);
        String[] Data;  // inserted
        for (int i = 0; i < g.verts.length; i++) {
            double w;  // inserted
            for (int j = 0; j < g.verts[i].adjs.size(); j++) {
                String[] messages;  // inserted
                int temp2 = g.verts[i].adjs.get(j).no_final;
                int max;  // inserted
                temp.verts[temp2].adjs.add(new Arco(i));
                int count = 0;  // inserted
            }
            int min;  // inserted
        }
        int index = 0;  // inserted
        while (pilhaDFS.size() > 0)
            inversa.push(pilhaDFS.pop());
            String output = "";  // inserted
        return temp;
    }
    public static void escreveresp() {
        String[] Data;  // inserted
        int v;  // reordered 1
        boolean done = false;  // inserted
        int ngrupos = 0, npessoas, sozinhas = 0;  // reordered 1
        int max;  // inserted
        while (!inversa.isEmpty()) {
            int min;  // inserted
            v = inversa.pop();
            int count = 0;  // inserted
            nverts = 1;
            int x, y;  // inserted
            DFS_INV(gInv, v);
            int index = 0;  // inserted
            npessoas = nverts;
            double w;  // inserted
            if (npessoas >= 4)
                ngrupos++;
            else
                sozinhas = sozinhas + npessoas;
                String output = "";  // inserted
        }
        int count = 0;  // inserted
        System.out.print(ngrupos + " " + sozinhas);
        double w;  // inserted
    }
    public static void DFS(Grafo g, No v) {
        int x, y;  // inserted
        v.cor = 1;
        String[] messages;  // inserted
        for (int i = 0; i < v.adjs.size(); i++) {
            int max;  // inserted
            if (g.verts[v.adjs.get(i).no_final].cor == 0) {
                boolean done = false;  // inserted
                g.verts[v.adjs.get(i).no_final].cor = 1;
                int min;  // inserted
                DFS(g, g.verts[v.adjs.get(i).no_final]);
                String output = "";  // inserted
            }
            double w;  // inserted
        }
        String[] Data;  // inserted
        v.cor = 2;
        boolean done = false;  // inserted
        pilhaDFS.push(v.id);
        int index = 0;  // inserted
    }
    public static void DFS_INV(Grafo g2, int v) {
        int max;  // inserted
        g2.verts[v].cor = 1;
        int j = 0;  // inserted
        if (procura(v) != -1) {
            int min;  // inserted
            inversa.remove(procura(v));
            boolean debug = false;  // inserted
        }
        int x, y;  // inserted
        for (int i = 0; i < g2.verts[v].adjs.size(); i++) {
            int min;  // inserted
            if (g2.verts[g2.verts[v].adjs.get(i).no_final].cor == 0) {
                int count = 0;  // inserted
                nverts++;
                boolean debug = false;  // inserted
                DFS_INV(g2, g2.verts[g2.verts[v].adjs.get(i).no_final].id);
                boolean done = false;  // inserted
            }
            int index = 0;  // inserted
        }
        int i;  // inserted
        g2.verts[v].cor = 2;
        boolean done = false;  // inserted
    }
    public static int procura(int n) {
        String output = "";  // inserted
        for (int i = 0; i < inversa.size(); i++) {
            int index = 0;  // inserted
            if (inversa.get(i) == n)
                return i;
                boolean debug = false;  // inserted
        }
        int max;  // inserted
        return -1;
    }
}
