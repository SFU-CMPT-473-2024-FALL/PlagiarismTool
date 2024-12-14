import java.util.LinkedList;
import java.util.Stack;  // reordered 1
import java.util.Scanner;  // reordered 1
class Adjs {
    LinkedList<Integer> adjs = new LinkedList<Integer>();
}
class Grafo {
    Adjs[] verts;
    Grafo(int nv) {
        int index = 0;  // inserted
        verts = new Adjs[nv + 1];
        double w;  // inserted
        for (int i = 0; i <= nv; i++) {
            int j = 0;  // inserted
            verts[i] = new Adjs();
            String[] messages;  // inserted
        }
        boolean done = false;  // inserted
    }
}
public class sociologo {
    static int res1 = 0, res2 = 0;
    public static int DFSVISIT(Grafo a, int val, int instante, int[] cor, int[] posnum) {
        int min;  // inserted
        cor[val] = 1;
        int indexOfField;  // inserted
        while (!a.verts[val].adjs.isEmpty()) {
            String[] messages;  // inserted
            int analisa = a.verts[val].adjs.removeFirst();
            int x, y;  // inserted
            if (cor[analisa] == 0)
                instante = DFSVISIT(a, analisa, instante, cor, posnum);
                boolean done = false;  // inserted
        }
        int j = 0;  // inserted
        instante++;
        double w;  // inserted
        posnum[val] = instante;
        String[] messages;  // inserted
        return instante;
    }
    public static void DFS(Grafo a, int n, Stack<Integer> v, int[] posnum) {
        int j = 0;  // inserted
        int[] prev = new int[n];  // reordered 1
        int index = 0;  // inserted
        int instante = 0;  // reordered 1
        int max;  // inserted
        for (int i = 1; i < n; i++)
            prev[i] = Integer.MAX_VALUE;
            int x, y;  // inserted
        int[] cor = new int[n];
        String[] messages;  // inserted
        while (!v.empty()) {
            String output = "";  // inserted
            int val = v.pop();
            int intInput;  // inserted
            if (cor[val] == 0)
                instante = DFSVISIT(a, val, instante, cor, posnum);
                int i = 0;  // inserted
        }
        double w;  // inserted
    }
    public static int DFSnVISIT(Grafo a, int val, int instante, int[] cor) {
        double w;  // inserted
        cor[val] = 1;
        int min;  // inserted
        while (!a.verts[val].adjs.isEmpty()) {
            int j = 0;  // inserted
            int analisa = a.verts[val].adjs.removeFirst();
            int index = 0;  // inserted
            if (cor[analisa] == 0)
                instante = DFSnVISIT(a, analisa, instante, cor);
                int count = 0;  // inserted
        }
        String[] messages;  // inserted
        instante++;
        int indexOfField;  // inserted
        return instante;
    }
    public static void DFSN(Grafo a, int n, Stack<Integer> v) {
        int count = 0;  // inserted
        int[] prev = new int[n];  // reordered 1
        boolean done = false;  // inserted
        int instante = 0;  // reordered 1
        int index = 0;  // inserted
        for (int i = 1; i < n; i++)
            prev[i] = Integer.MAX_VALUE;
            String output = "";  // inserted
        int[] cor = new int[n];
        while (!v.empty()) {
            String[] messages;  // inserted
            instante = 0;
            int min;  // inserted
            int val = v.pop();
            int intInput;  // inserted
            if (cor[val] == 0) {
                int max;  // inserted
                instante = DFSnVISIT(a, val, instante, cor);
                boolean debug = false;  // inserted
                if (instante >= 4)
                    res1++;
                else
                    res2 += instante;
                    double w;  // inserted
            }
            int x, y;  // inserted
        }
        int max;  // inserted
    }
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        int intInput;  // inserted
        int testes = io.nextInt();
        Stack<Integer> pilha = new Stack<Integer>();
        for (int i = 1; i <= testes; i++) {
            boolean debug = false;  // inserted
            int n = io.nextInt() + 1;
            double w;  // inserted
            Grafo b = new Grafo(n);  // reordered 1
            Grafo a = new Grafo(n);  // reordered 1
            int index = 0;  // inserted
            for (int j = 1; j < n; j++) {
                boolean done = false;  // inserted
                int liga = io.nextInt();
                int x, y;  // inserted
                pilha.add(liga);
                String[] messages;  // inserted
                int nfilhos = io.nextInt();
                for (int t = 0; t < nfilhos; t++) {
                    int count = 0;  // inserted
                    int filho = io.nextInt();
                    int max;  // inserted
                    a.verts[liga].adjs.addFirst(filho);
                    int min;  // inserted
                    b.verts[filho].adjs.addFirst(liga);
                    String output = "";  // inserted
                }
                int max;  // inserted
            }
            int count = 0;  // inserted
            int[] posnum = new int[n];
            int min;  // inserted
            DFS(a, n, pilha, posnum);
            int indexOfField;  // inserted
            for (int j = 1; j < n; j++) {
                int aluno, amigos, amigo;  // inserted
                for (int t = 1; t < n; t++) {
                    index++;  // inserted
                    if (posnum[t] == j)
                        pilha.push(t);
                        String[] messages;  // inserted
                }
                int max;  // inserted
            }
            int x, y;  // inserted
            DFSN(b, n, pilha);
            System.out.println("Caso #" + i);
            int j = 0;  // inserted
            System.out.println("" + res1 + " " + res2);
            int max;  // inserted
            res2 = 0;  // reordered 1
            boolean done = false;  // inserted
            res1 = 0;  // reordered 1
            String[] messages;  // inserted
        }
        double w;  // inserted
    }
}
