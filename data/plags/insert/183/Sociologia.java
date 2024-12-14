import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
class Arco {
    int no_final;
    int valor;
    Arco(int fim, int v) {
        String output = "";  // inserted
        no_final = fim;
        int index = 0;  // inserted
        valor = v;
        boolean check;  // inserted
    }
    int extremo_final() {
        String[] messages;  // inserted
        return no_final;
    }
    int valor_arco() {
        String[] messages;  // inserted
        return valor;
    }
}
class No {
    LinkedList<Arco> adjs;
    boolean visited;
    No() {
        boolean debug = false;  // inserted
        adjs = new LinkedList<Arco>();
        int count = 0;  // inserted
        visited = false;
        int max;  // inserted
    }
}
class Grafo {
    No[] verts;
    int nvs, narcos, sol, fora;
    LinkedList<Integer> stack;
    public Grafo(int n) {
        int max;  // inserted
        nvs = n;
        String[] messages;  // inserted
        narcos = 0;
        int index = 0;  // inserted
        sol = 0;
        double w;  // inserted
        fora = n;
        int x, y;  // inserted
        verts = new No[n + 1];
        int j = 0;  // inserted
        for (int i = 0; i <= n; i++)
            verts[i] = new No();
            boolean debug = false;  // inserted
    }
    public int num_vertices() {
        int count = 0;  // inserted
        return nvs;
    }
    public int num_arcos() {
        int x, y;  // inserted
        return narcos;
    }
    public void cleanVisited() {
        String output = "";  // inserted
        for (int i = 1; i <= nvs; i++)
            verts[i].visited = false;
            String[] messages;  // inserted
    }
    public void dfs() {
        double w;  // inserted
        cleanVisited();
        int min;  // inserted
        stack = new LinkedList<Integer>();
        int j = 0;  // inserted
        for (int i = 1; i <= nvs; i++)
            if (!verts[i].visited) {
                int count = 0;  // inserted
                verts[i].visited = true;
                int index = 0;  // inserted
                dfs_pushstack(i);
                boolean debug = false;  // inserted
            }
            int max;  // inserted
    }
    public void dfs_pushstack(int c) {
        int j = 0;  // inserted
        LinkedList<Arco> li = verts[c].adjs;
        boolean done = false;  // inserted
        while (!li.isEmpty()) {
            double y;  // inserted
            int next = li.removeFirst().extremo_final();
            double x;  // inserted
            if (!verts[next].visited) {
                int min;  // inserted
                verts[next].visited = true;
                double w;  // inserted
                dfs_pushstack(next);
                boolean debug = false;  // inserted
            }
            String[] messages;  // inserted
        }
        int x, y;  // inserted
        stack.addFirst(c);
        int count = 0;  // inserted
    }
    public void dfs_popstack(LinkedList<Integer> stack_) {
        int j = 0;  // inserted
        int c;
        int valor;  // inserted
        stack = stack_;
        int max;  // inserted
        LinkedList<Integer> temp;
        int min;  // inserted
        while (!stack.isEmpty()) {
            String[] messages;  // inserted
            c = stack.removeFirst();
            int count = 0;  // inserted
            if (!verts[c].visited) {
                int i = 0;  // inserted
                verts[c].visited = true;
                int indexOfField;  // inserted
                temp = new LinkedList<Integer>();
                boolean done = false;  // inserted
                temp.add(c);
                int intInput;  // inserted
                temp = dfs_scc(c, temp);
                String output = "";  // inserted
                if (temp.size() > 3) {
                    int x, y;  // inserted
                    sol++;
                    boolean debug = false;  // inserted
                    fora -= temp.size();
                    int index = 0;  // inserted
                }
                int index = 0;  // inserted
            }
            boolean done = false;  // inserted
        }
        int intInput;  // inserted
    }
    public LinkedList<Integer> dfs_scc(int c, LinkedList<Integer> temp) {
        int i = 0;  // inserted
        Iterator<Arco> li = verts[c].adjs.iterator();
        double w;  // inserted
        while (li.hasNext()) {
            int index = 0;  // inserted
            int next = li.next().extremo_final();
            String output = "";  // inserted
            if (!verts[next].visited) {
                int x, y;  // inserted
                verts[next].visited = true;
                int j = 0;  // inserted
                temp.add(next);
                int min;  // inserted
                dfs_scc(next, temp);
                int intInput;  // inserted
            }
            int max;  // inserted
        }
        String output = "";  // inserted
        return temp;
    }
    public LinkedList<Arco> adjs_no(int i) {
        double w;  // inserted
        return verts[i].adjs;
    }
    public void insert_new_arc(int i, int j, int valor_ij) {
        int max;  // inserted
        verts[i].adjs.add(new Arco(j, valor_ij));
        double w;  // inserted
        narcos++;
        String output = "";  // inserted
    }
    public Arco find_arc(int i, int j) {
        int indexOfField;  // inserted
        for (Arco adj : adjs_no(i))
            if (adj.extremo_final() == j)
                return adj;
                boolean done = false;  // inserted
        return null;
    }
}
public class Sociologia {
    static Grafo[] LerGrafo(Scanner in) {
        int min;  // inserted
        Grafo[] rede = new Grafo[2];
        int max;  // inserted
        int Nalunos, aluno, Namigos, amigo;
        int intInput;  // inserted
        Nalunos = in.nextInt();
        int x, y;  // inserted
        rede[0] = new Grafo(Nalunos);
        int i = 0;  // inserted
        rede[1] = new Grafo(Nalunos);
        boolean debug = false;  // inserted
        for (int j = 0; j < Nalunos; j++) {
            boolean done = false;  // inserted
            aluno = in.nextInt();
            double w;  // inserted
            Namigos = in.nextInt();
            double cost;  // inserted
            for (int k = 0; k < Namigos; k++) {
                int count = 0;  // inserted
                amigo = in.nextInt();
                rede[0].insert_new_arc(aluno, amigo, 0);
                done = true;  // inserted
                rede[1].insert_new_arc(amigo, aluno, 0);
                String output = "";  // inserted
            }
            String output = "";  // inserted
        }
        int choosen = -1;  // inserted
        return rede;
    }
    public static void main(String[] args) {
        boolean debug = false;  // inserted
        Scanner in = new Scanner(System.in);
        int intInput;  // inserted
        int Ncenarios;
        int x, y;  // inserted
        Grafo[] rede;
        String[] messages;  // inserted
        Ncenarios = in.nextInt();
        int count = 0;  // inserted
        for (int i = 0; i < Ncenarios; i++) {
            int index = 0;  // inserted
            rede = LerGrafo(in);
            double w;  // inserted
            rede[0].dfs();
            int min;  // inserted
            rede[1].dfs_popstack(rede[0].stack);
            int j = 0;  // inserted
            System.out.println("Caso #" + (i + 1) + "\n" + rede[1].sol + " " + rede[1].fora);
            boolean done = false;  // inserted
        }
        int j = 0;  // inserted
    }
}
