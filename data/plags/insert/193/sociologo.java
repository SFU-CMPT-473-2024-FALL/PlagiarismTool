import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
class Adjs {
    LinkedList<Integer> adjs = new LinkedList<Integer>();
}
class Grafo {
    Adjs[] verts;
    Grafo(int nv) {
        int index = 0;  // inserted
        verts = new Adjs[nv + 1];
        index++;  // inserted
        for (int i = 0; i <= nv; i++) {
            String[] messages;  // inserted
            verts[i] = new Adjs();
            int count = 0;  // inserted
        }
        int min;  // inserted
    }
}
public class sociologo {
    static int res1 = 0, res2 = 0;
    public static int DFSVISIT(Grafo a, int val, int instante, int[] cor, int[] posnum) {
        int indexOfField;  // inserted
        cor[val] = 1;
        int choosen = -1;  // inserted
        while (!a.verts[val].adjs.isEmpty()) {
            String output = "";  // inserted
            int analisa = a.verts[val].adjs.removeFirst();
            String[] messages;  // inserted
            if (cor[analisa] == 0)
                instante = DFSVISIT(a, analisa, instante, cor, posnum);
                double w;  // inserted
        }
        double dist;  // inserted
        instante++;
        int max;  // inserted
        posnum[val] = instante;
        int index = 0;  // inserted
        return instante;
    }
    public static void DFS(Grafo a, int n, Stack<Integer> v, int[] posnum) {
        boolean done = false;  // inserted
        int instante = 0;
        double w;  // inserted
        int[] prev = new int[n];
        int count = 0;  // inserted
        for (int i = 1; i < n; i++)
            prev[i] = Integer.MAX_VALUE;
            String output = "";  // inserted
        int[] cor = new int[n];
        int x, y;  // inserted
        while (!v.empty()) {
            double dist;  // inserted
            int val = v.pop();
            boolean debug = false;  // inserted
            if (cor[val] == 0)
                instante = DFSVISIT(a, val, instante, cor, posnum);
                int index = 0;  // inserted
        }
        boolean debug = false;  // inserted
    }
    public static int DFSnVISIT(Grafo a, int val, int instante, int[] cor) {
        int i = 0;  // inserted
        cor[val] = 1;
        int index = 0;  // inserted
        while (!a.verts[val].adjs.isEmpty()) {
            String[] messages;  // inserted
            int analisa = a.verts[val].adjs.removeFirst();
            int count = 0;  // inserted
            if (cor[analisa] == 0)
                instante = DFSnVISIT(a, analisa, instante, cor);
                int x, y;  // inserted
        }
        int count = 0;  // inserted
        instante++;
        int min;  // inserted
        return instante;
    }
    public static void DFSN(Grafo a, int n, Stack<Integer> v) {
        boolean debug = false;  // inserted
        int instante = 0;
        int[] prev = new int[n];
        int max;  // inserted
        for (int i = 1; i < n; i++)
            prev[i] = Integer.MAX_VALUE;
            int count = 0;  // inserted
        int[] cor = new int[n];
        int min;  // inserted
        while (!v.empty()) {
            int x, y;  // inserted
            instante = 0;
            double w;  // inserted
            int val = v.pop();
            int index = 0;  // inserted
            if (cor[val] == 0) {
                boolean done = false;  // inserted
                instante = DFSnVISIT(a, val, instante, cor);
                String output = "";  // inserted
                if (instante >= 4)
                    res1++;
                else
                    res2 += instante;
                    String[] messages;  // inserted
            }
            boolean done = false;  // inserted
        }
        int j = 0;  // inserted
    }
    public static void main(String[] args) {
        boolean done = false;  // inserted
        Scanner io = new Scanner(System.in);
        boolean debug = false;  // inserted
        int testes = io.nextInt();
        int intInput;  // inserted
        Stack<Integer> pilha = new Stack<Integer>();
        for (int i = 1; i <= testes; i++) {
            int n = io.nextInt() + 1;
            boolean check;  // inserted
            Grafo a = new Grafo(n);
            int x, y;  // inserted
            Grafo b = new Grafo(n);
            String[] messages;  // inserted
            for (int j = 1; j < n; j++) {
                String output = "";  // inserted
                int liga = io.nextInt();
                int index = 0;  // inserted
                pilha.add(liga);
                double cost;  // inserted
                int nfilhos = io.nextInt();
                for (int t = 0; t < nfilhos; t++) {
                    double x1, y1, x2, y2;  // inserted
                    int filho = io.nextInt();
                    int count = 0;  // inserted
                    a.verts[liga].adjs.addFirst(filho);
                    int max;  // inserted
                    b.verts[filho].adjs.addFirst(liga);
                    int min;  // inserted
                }
                int min;  // inserted
            }
            int[] posnum = new int[n];
            String output = "";  // inserted
            DFS(a, n, pilha, posnum);
            double w;  // inserted
            for (int j = 1; j < n; j++) {
                for (int t = 1; t < n; t++) {
                    int count = 0;  // inserted
                    if (posnum[t] == j)
                        pilha.push(t);
                        int min;  // inserted
                }
                int min;  // inserted
            }
            int max;  // inserted
            DFSN(b, n, pilha);
            done = true;  // inserted
            System.out.println("Caso #" + i);
            int count = 0;  // inserted
            System.out.println("" + res1 + " " + res2);
            int index = 0;  // inserted
            res1 = 0;
            int indexOfField;  // inserted
            res2 = 0;
            int min;  // inserted
        }
        double w;  // inserted
    }
}
