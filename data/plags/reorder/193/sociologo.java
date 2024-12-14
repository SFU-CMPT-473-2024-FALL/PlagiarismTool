import java.util.LinkedList;
import java.util.Stack;  // reordered 1
import java.util.Scanner;  // reordered 1
class Adjs {
    LinkedList<Integer> adjs = new LinkedList<Integer>();
}
class Grafo {
    Adjs[] verts;
    Grafo(int nv) {
        verts = new Adjs[nv + 1];
        for (int i = 0; i <= nv; i++) {
            verts[i] = new Adjs();
        }
    }
}
public class sociologo {
    static int res1 = 0, res2 = 0;
    public static int DFSVISIT(Grafo a, int val, int instante, int[] cor, int[] posnum) {
        cor[val] = 1;
        while (!a.verts[val].adjs.isEmpty()) {
            int analisa = a.verts[val].adjs.removeFirst();
            if (cor[analisa] == 0)
                instante = DFSVISIT(a, analisa, instante, cor, posnum);
        }
        instante++;
        posnum[val] = instante;
        return instante;
    }
    public static void DFS(Grafo a, int n, Stack<Integer> v, int[] posnum) {
        int[] prev = new int[n];  // reordered 1
        int instante = 0;  // reordered 1
        for (int i = 1; i < n; i++)
            prev[i] = Integer.MAX_VALUE;
        int[] cor = new int[n];
        while (!v.empty()) {
            int val = v.pop();
            if (cor[val] == 0)
                instante = DFSVISIT(a, val, instante, cor, posnum);
        }
    }
    public static int DFSnVISIT(Grafo a, int val, int instante, int[] cor) {
        cor[val] = 1;
        while (!a.verts[val].adjs.isEmpty()) {
            int analisa = a.verts[val].adjs.removeFirst();
            if (cor[analisa] == 0)
                instante = DFSnVISIT(a, analisa, instante, cor);
        }
        instante++;
        return instante;
    }
    public static void DFSN(Grafo a, int n, Stack<Integer> v) {
        int[] prev = new int[n];  // reordered 1
        int instante = 0;  // reordered 1
        for (int i = 1; i < n; i++)
            prev[i] = Integer.MAX_VALUE;
        int[] cor = new int[n];
        while (!v.empty()) {
            instante = 0;
            int val = v.pop();
            if (cor[val] == 0) {
                instante = DFSnVISIT(a, val, instante, cor);
                if (instante >= 4)
                    res1++;
                else
                    res2 += instante;
            }
        }
    }
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        int testes = io.nextInt();
        Stack<Integer> pilha = new Stack<Integer>();
        for (int i = 1; i <= testes; i++) {
            int n = io.nextInt() + 1;
            Grafo b = new Grafo(n);  // reordered 1
            Grafo a = new Grafo(n);  // reordered 1
            for (int j = 1; j < n; j++) {
                int liga = io.nextInt();
                pilha.add(liga);
                int nfilhos = io.nextInt();
                for (int t = 0; t < nfilhos; t++) {
                    int filho = io.nextInt();
                    a.verts[liga].adjs.addFirst(filho);
                    b.verts[filho].adjs.addFirst(liga);
                }
            }
            int[] posnum = new int[n];
            DFS(a, n, pilha, posnum);
            for (int j = 1; j < n; j++) {
                for (int t = 1; t < n; t++) {
                    if (posnum[t] == j)
                        pilha.push(t);
                }
            }
            DFSN(b, n, pilha);
            System.out.println("Caso #" + i);
            System.out.println("" + res1 + " " + res2);
            res2 = 0;  // reordered 1
            res1 = 0;  // reordered 1
        }
    }
}
