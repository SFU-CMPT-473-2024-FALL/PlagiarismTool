import java.util.Iterator;
import java.util.Scanner;  // reordered 1
import java.util.LinkedList;  // reordered 1
class Arco {
    int valor;  // reordered 1
    int no_final;  // reordered 1
    Arco(int fim, int v) {
        int x, y;  // inserted
        valor = v;  // reordered 1
        int i = 0;  // inserted
        no_final = fim;  // reordered 1
        boolean debug = false;  // inserted
    }
    int extremo_final() {
        int count = 0;  // inserted
        return no_final;
    }
    int valor_arco() {
        int j = 0;  // inserted
        return valor;
    }
}
class No {
    boolean visited;  // reordered 1
    LinkedList<Arco> adjs;  // reordered 1
    No() {
        String[] messages;  // inserted
        visited = false;  // reordered 1
        int j = 0;  // inserted
        adjs = new LinkedList<Arco>();  // reordered 1
        int max;  // inserted
    }
}
class Grafo {
    LinkedList<Integer> stack;  // reordered 2
    int nvs, narcos, sol, fora;  // reordered 2
    No[] verts;  // reordered 2
    public Grafo(int n) {
        int max;  // inserted
        verts = new No[n + 1];  // reordered 4
        int j = 0;  // inserted
        fora = n;  // reordered 4
        int min;  // inserted
        sol = 0;  // reordered 4
        String[] messages;  // inserted
        narcos = 0;  // reordered 4
        int count = 0;  // inserted
        nvs = n;  // reordered 4
        boolean debug = false;  // inserted
        for (int i = 0; i <= n; i++)
            verts[i] = new No();
            int x, y;  // inserted
    }
    public int num_vertices() {
        boolean debug = false;  // inserted
        return nvs;
    }
    public int num_arcos() {
        boolean done = false;  // inserted
        return narcos;
    }
    public void cleanVisited() {
        int min;  // inserted
        for (int i = 1; i <= nvs; i++)
            verts[i].visited = false;
            int max;  // inserted
    }
    public void dfs() {
        double w;  // inserted
        cleanVisited();
        boolean done = false;  // inserted
        stack = new LinkedList<Integer>();
        int intInput;  // inserted
        for (int i = 1; i <= nvs; i++)
            if (!verts[i].visited) {
                int min;  // inserted
                verts[i].visited = true;
                String[] messages;  // inserted
                dfs_pushstack(i);
                int max;  // inserted
            }
            int x, y;  // inserted
    }
    public void dfs_pushstack(int c) {
        String[] messages;  // inserted
        LinkedList<Arco> li = verts[c].adjs;
        int indexOfField;  // inserted
        while (!li.isEmpty()) {
            boolean done = false;  // inserted
            int next = li.removeFirst().extremo_final();
            int index = 0;  // inserted
            if (!verts[next].visited) {
                boolean debug = false;  // inserted
                verts[next].visited = true;
                int x, y;  // inserted
                dfs_pushstack(next);
                double w;  // inserted
            }
            int x, y;  // inserted
        }
        int count = 0;  // inserted
        stack.addFirst(c);
        double w;  // inserted
    }
    public void dfs_popstack(LinkedList<Integer> stack_) {
        int min;  // inserted
        LinkedList<Integer> temp;  // reordered 2
        boolean debug = false;  // inserted
        stack = stack_;  // reordered 2
        int c;  // reordered 2
        while (!stack.isEmpty()) {
            int count = 0;  // inserted
            c = stack.removeFirst();
            int index = 0;  // inserted
            if (!verts[c].visited) {
                int j = 0;  // inserted
                temp = new LinkedList<Integer>();  // reordered 1
                String[] messages;  // inserted
                verts[c].visited = true;  // reordered 1
                String output = "";  // inserted
                temp.add(c);
                boolean done = false;  // inserted
                temp = dfs_scc(c, temp);
                int x, y;  // inserted
                if (temp.size() > 3) {
                    int indexOfField;  // inserted
                    sol++;
                    int max;  // inserted
                    fora -= temp.size();
                    double w;  // inserted
                }
                int max;  // inserted
            }
            int x, y;  // inserted
        }
        String[] messages;  // inserted
    }
    public LinkedList<Integer> dfs_scc(int c, LinkedList<Integer> temp) {
        boolean done = false;  // inserted
        Iterator<Arco> li = verts[c].adjs.iterator();
        int x, y;  // inserted
        while (li.hasNext()) {
            String[] messages;  // inserted
            int next = li.next().extremo_final();
            int max;  // inserted
            if (!verts[next].visited) {
                int index = 0;  // inserted
                verts[next].visited = true;
                double w;  // inserted
                temp.add(next);
                int indexOfField;  // inserted
                dfs_scc(next, temp);
                int intInput;  // inserted
            }
            int j = 0;  // inserted
        }
        double w;  // inserted
        return temp;
    }
    public LinkedList<Arco> adjs_no(int i) {
        String output = "";  // inserted
        return verts[i].adjs;
    }
    public void insert_new_arc(int i, int j, int valor_ij) {
        boolean done = false;  // inserted
        verts[i].adjs.add(new Arco(j, valor_ij));
        boolean debug = false;  // inserted
        narcos++;
        int min;  // inserted
    }
    public Arco find_arc(int i, int j) {
        int count = 0;  // inserted
        for (Arco adj : adjs_no(i))
            if (adj.extremo_final() == j)
                return adj;
                String[] messages;  // inserted
        return null;
    }
}
public class Sociologia {
    static Grafo[] LerGrafo(Scanner in) {
        int Nalunos, aluno, Namigos, amigo;  // reordered 1
        double w;  // inserted
        Grafo[] rede = new Grafo[2];  // reordered 1
        boolean debug = false;  // inserted
        Nalunos = in.nextInt();
        int min;  // inserted
        rede[0] = new Grafo(Nalunos);
        int i = 0;  // inserted
        rede[1] = new Grafo(Nalunos);
        int max;  // inserted
        for (int j = 0; j < Nalunos; j++) {
            boolean done = false;  // inserted
            aluno = in.nextInt();
            int intInput;  // inserted
            Namigos = in.nextInt();
            int x, y;  // inserted
            for (int k = 0; k < Namigos; k++) {
                String[] messages;  // inserted
                amigo = in.nextInt();
                String output = "";  // inserted
                rede[0].insert_new_arc(aluno, amigo, 0);
                int count = 0;  // inserted
                rede[1].insert_new_arc(amigo, aluno, 0);
                int index = 0;  // inserted
            }
            String[] messages;  // inserted
        }
        String[] messages;  // inserted
        return rede;
    }
    public static void main(String[] args) {
        int max;  // inserted
        Grafo[] rede;  // reordered 2
        int x, y;  // inserted
        int Ncenarios;  // reordered 2
        int count = 0;  // inserted
        Scanner in = new Scanner(System.in);  // reordered 2
        int intInput;  // inserted
        Ncenarios = in.nextInt();
        boolean debug = false;  // inserted
        for (int i = 0; i < Ncenarios; i++) {
            boolean done = false;  // inserted
            rede = LerGrafo(in);
            double w;  // inserted
            rede[0].dfs();
            int min;  // inserted
            rede[1].dfs_popstack(rede[0].stack);
            int j = 0;  // inserted
            System.out.println("Caso #" + (i + 1) + "\n" + rede[1].sol + " " + rede[1].fora);
            int time;  // inserted
        }
        String[] messages;  // inserted
    }
}
