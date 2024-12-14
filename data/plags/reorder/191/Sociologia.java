import java.util.LinkedList;
import java.util.Stack;  // reordered 1
import java.util.Scanner;  // reordered 1
class Arco {
    int no_final;
    Arco(int fim) {
        no_final = fim;
    }
    int extremo_final() {
        return no_final;
    }
}
class No {
    int id;  // reordered 2
    int cor;  // reordered 2
    LinkedList<Arco> adjs;  // reordered 2
    No(int i) {
        id = i;  // reordered 2
        adjs = new LinkedList<Arco>();  // reordered 2
        cor = 0;  // reordered 2
    }
}
class Grafo {
    int nvs, narcos;  // reordered 1
    No[] verts;  // reordered 1
    public Grafo(int n) {
        verts = new No[n + 1];  // reordered 2
        narcos = 0;  // reordered 2
        nvs = n;  // reordered 2
        for (int i = 0; i <= n; i++)
            verts[i] = new No(i);
    }
    public int num_vertices() {
        return nvs;
    }
    public int num_arcos() {
        return narcos;
    }
    public LinkedList<Arco> adjs_no(int i) {
        return verts[i].adjs;
    }
    public Arco find_arc(int i, int j) {
        for (Arco adj : adjs_no(i))
            if (adj.extremo_final() == j)
                return adj;
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
        int ncasos = ler.nextInt();
        for (int i = 0; i < ncasos; i++) {
            System.out.println("Caso #" + (i + 1));
            g = lergrafo();
            resolveprob(g);
            escreveresp();
            System.out.println();
        }
    }
    public static Grafo lergrafo() {
        int aluno, amigos, amigo;
        int nalunos = ler.nextInt();
        Grafo temp = new Grafo(nalunos);
        for (int i = 0; i < nalunos; i++) {
            aluno = ler.nextInt();
            amigos = ler.nextInt();
            for (int j = 0; j < amigos; j++) {
                amigo = ler.nextInt();
                temp.verts[aluno].adjs.add(new Arco(amigo));
            }
        }
        return temp;
    }
    public static void resolveprob(Grafo g) {
        gInv = new Grafo(g.verts.length);
        for (int i = 1; i <= g.nvs; i++) {
            if (!pilhaDFS.contains(g.verts[i].id))
                DFS(g, g.verts[i]);
        }
        gInv = inverso();
    }
    public static Grafo inverso() {
        Grafo temp = new Grafo(g.verts.length);
        for (int i = 0; i < g.verts.length; i++) {
            for (int j = 0; j < g.verts[i].adjs.size(); j++) {
                int temp2 = g.verts[i].adjs.get(j).no_final;
                temp.verts[temp2].adjs.add(new Arco(i));
            }
        }
        while (pilhaDFS.size() > 0)
            inversa.push(pilhaDFS.pop());
        return temp;
    }
    public static void escreveresp() {
        int v;  // reordered 1
        int ngrupos = 0, npessoas, sozinhas = 0;  // reordered 1
        while (!inversa.isEmpty()) {
            v = inversa.pop();
            nverts = 1;
            DFS_INV(gInv, v);
            npessoas = nverts;
            if (npessoas >= 4)
                ngrupos++;
            else
                sozinhas = sozinhas + npessoas;
        }
        System.out.print(ngrupos + " " + sozinhas);
    }
    public static void DFS(Grafo g, No v) {
        v.cor = 1;
        for (int i = 0; i < v.adjs.size(); i++) {
            if (g.verts[v.adjs.get(i).no_final].cor == 0) {
                g.verts[v.adjs.get(i).no_final].cor = 1;
                DFS(g, g.verts[v.adjs.get(i).no_final]);
            }
        }
        v.cor = 2;
        pilhaDFS.push(v.id);
    }
    public static void DFS_INV(Grafo g2, int v) {
        g2.verts[v].cor = 1;
        if (procura(v) != -1) {
            inversa.remove(procura(v));
        }
        for (int i = 0; i < g2.verts[v].adjs.size(); i++) {
            if (g2.verts[g2.verts[v].adjs.get(i).no_final].cor == 0) {
                nverts++;
                DFS_INV(g2, g2.verts[g2.verts[v].adjs.get(i).no_final].id);
            }
        }
        g2.verts[v].cor = 2;
    }
    public static int procura(int n) {
        for (int i = 0; i < inversa.size(); i++) {
            if (inversa.get(i) == n)
                return i;
        }
        return -1;
    }
}
