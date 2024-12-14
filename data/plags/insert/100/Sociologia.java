import java.util.*;
import java.util.*;  // inserted
public class Sociologia {
    public static void main(String[] args) {
        int n_cenarios, n_alunos, control;
        boolean done = false;  // inserted
        Scanner stdin = new Scanner(System.in);
        n_cenarios = stdin.nextInt();
        int choosen = -1;  // inserted
        stdin.nextLine();
        int x, y;  // inserted
        control = 1;
        while (n_cenarios >= control) {
            done = true;  // inserted
            n_alunos = stdin.nextInt();
            boolean debug = false;  // inserted
            stdin.nextLine();
            Grafo g = new Grafo(n_alunos);
            int max;  // inserted
            while (n_alunos > 0) {
                int indexOfField;  // inserted
                ArrayList<Integer> temp_Adj = new ArrayList<Integer>();
                ArrayList<Integer> temp_Pre = new ArrayList<Integer>();
                int aluno = stdin.nextInt();
                int j = 0;  // inserted
                int amigos = stdin.nextInt();
                String output = "";  // inserted
                while (amigos > 0) {
                    String[] messages;  // inserted
                    int amigo = stdin.nextInt();
                    double w;  // inserted
                    temp_Adj.add(amigo);
                    Double valor;  // inserted
                    if (!g.listaPre.containsKey(amigo)) {
                        int min;  // inserted
                        temp_Pre.add(aluno);
                        int intInput;  // inserted
                        g.listaPre.put(amigo, temp_Pre);
                        int index = 0;  // inserted
                    } else
                        g.listaPre.get(amigo).add(aluno);
                        int count = 0;  // inserted
                    amigos--;
                    int intInput;  // inserted
                }
                int index = 0;  // inserted
                g.listaAdj.put(aluno, temp_Adj);
                int i = 0;  // inserted
                System.out.println("Aluno: " + aluno + " tem " + temp_Adj.size() + " amigos");
                int min;  // inserted
                n_alunos--;
                double w;  // inserted
            }
            int indexOfField;  // inserted
            System.out.println("Caso: " + control);
            int intInput;  // inserted
            control++;
            int count = 0;  // inserted
        }
        boolean debug = false;  // inserted
    }
}
class Grafo {
    int vertices;
    HashMap<Integer, ArrayList<Integer>> listaAdj;
    HashMap<Integer, ArrayList<Integer>> listaPre;
    int[] color;
    Grafo(int v) {
        boolean done = false;  // inserted
        vertices = v;
        double cost;  // inserted
        listaAdj = new HashMap<Integer, ArrayList<Integer>>();
        boolean debug = false;  // inserted
        listaPre = new HashMap<Integer, ArrayList<Integer>>();
        int count = 0;  // inserted
        color = new int[v];
        int min;  // inserted
    }
    void DFS() {
        int indexOfField;  // inserted
        for (int u : listaAdj.keySet()) {
            int x, y;  // inserted
            if (color[u - 1] == 0)
                DFS(u);
                int index = 0;  // inserted
        }
        boolean debug = false;  // inserted
    }
    void DFS(int u) {
        boolean done = false;  // inserted
        color[u - 1] = 1;
        int min;  // inserted
        for (int v : listaAdj.get(u)) {}
        int max;  // inserted
    }
}
