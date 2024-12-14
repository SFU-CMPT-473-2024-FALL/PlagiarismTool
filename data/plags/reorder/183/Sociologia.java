import java.util.Iterator;
import java.util.Scanner;  // reordered 1
import java.util.LinkedList;  // reordered 1
class Arco {
    int valor;  // reordered 1
    int no_final;  // reordered 1
    Arco(int fim, int v) {
        valor = v;  // reordered 1
        no_final = fim;  // reordered 1
    }
    int extremo_final() {
        return no_final;
    }
    int valor_arco() {
        return valor;
    }
}
class No {
    boolean visited;  // reordered 1
    LinkedList<Arco> adjs;  // reordered 1
    No() {
        visited = false;  // reordered 1
        adjs = new LinkedList<Arco>();  // reordered 1
    }
}
class Grafo {
    LinkedList<Integer> stack;  // reordered 2
    int nvs, narcos, sol, fora;  // reordered 2
    No[] verts;  // reordered 2
    public Grafo(int n) {
        verts = new No[n + 1];  // reordered 4
        fora = n;  // reordered 4
        sol = 0;  // reordered 4
        narcos = 0;  // reordered 4
        nvs = n;  // reordered 4
        for (int i = 0; i <= n; i++)
            verts[i] = new No();
    }
    public int num_vertices() {
        return nvs;
    }
    public int num_arcos() {
        return narcos;
    }
    public void cleanVisited() {
        for (int i = 1; i <= nvs; i++)
            verts[i].visited = false;
    }
    public void dfs() {
        cleanVisited();
        stack = new LinkedList<Integer>();
        for (int i = 1; i <= nvs; i++)
            if (!verts[i].visited) {
                verts[i].visited = true;
                dfs_pushstack(i);
            }
    }
    public void dfs_pushstack(int c) {
        LinkedList<Arco> li = verts[c].adjs;
        while (!li.isEmpty()) {
            int next = li.removeFirst().extremo_final();
            if (!verts[next].visited) {
                verts[next].visited = true;
                dfs_pushstack(next);
            }
        }
        stack.addFirst(c);
    }
    public void dfs_popstack(LinkedList<Integer> stack_) {
        LinkedList<Integer> temp;  // reordered 2
        stack = stack_;  // reordered 2
        int c;  // reordered 2
        while (!stack.isEmpty()) {
            c = stack.removeFirst();
            if (!verts[c].visited) {
                temp = new LinkedList<Integer>();  // reordered 1
                verts[c].visited = true;  // reordered 1
                temp.add(c);
                temp = dfs_scc(c, temp);
                if (temp.size() > 3) {
                    sol++;
                    fora -= temp.size();
                }
            }
        }
    }
    public LinkedList<Integer> dfs_scc(int c, LinkedList<Integer> temp) {
        Iterator<Arco> li = verts[c].adjs.iterator();
        while (li.hasNext()) {
            int next = li.next().extremo_final();
            if (!verts[next].visited) {
                verts[next].visited = true;
                temp.add(next);
                dfs_scc(next, temp);
            }
        }
        return temp;
    }
    public LinkedList<Arco> adjs_no(int i) {
        return verts[i].adjs;
    }
    public void insert_new_arc(int i, int j, int valor_ij) {
        verts[i].adjs.add(new Arco(j, valor_ij));
        narcos++;
    }
    public Arco find_arc(int i, int j) {
        for (Arco adj : adjs_no(i))
            if (adj.extremo_final() == j)
                return adj;
        return null;
    }
}
public class Sociologia {
    static Grafo[] LerGrafo(Scanner in) {
        int Nalunos, aluno, Namigos, amigo;  // reordered 1
        Grafo[] rede = new Grafo[2];  // reordered 1
        Nalunos = in.nextInt();
        rede[0] = new Grafo(Nalunos);
        rede[1] = new Grafo(Nalunos);
        for (int j = 0; j < Nalunos; j++) {
            aluno = in.nextInt();
            Namigos = in.nextInt();
            for (int k = 0; k < Namigos; k++) {
                amigo = in.nextInt();
                rede[0].insert_new_arc(aluno, amigo, 0);
                rede[1].insert_new_arc(amigo, aluno, 0);
            }
        }
        return rede;
    }
    public static void main(String[] args) {
        Grafo[] rede;  // reordered 2
        int Ncenarios;  // reordered 2
        Scanner in = new Scanner(System.in);  // reordered 2
        Ncenarios = in.nextInt();
        for (int i = 0; i < Ncenarios; i++) {
            rede = LerGrafo(in);
            rede[0].dfs();
            rede[1].dfs_popstack(rede[0].stack);
            System.out.println("Caso #" + (i + 1) + "\n" + rede[1].sol + " " + rede[1].fora);
        }
    }
}
