import java.util.*;
public class Sociologia {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);  // reordered 1
        int n_cenarios, n_alunos, control;  // reordered 1
        n_cenarios = stdin.nextInt();
        stdin.nextLine();
        control = 1;
        while (n_cenarios >= control) {
            n_alunos = stdin.nextInt();
            stdin.nextLine();
            Grafo g = new Grafo(n_alunos);
            while (n_alunos > 0) {
                ArrayList<Integer> temp_Pre = new ArrayList<Integer>();  // reordered 1
                ArrayList<Integer> temp_Adj = new ArrayList<Integer>();  // reordered 1
                int aluno = stdin.nextInt();
                int amigos = stdin.nextInt();
                while (amigos > 0) {
                    int amigo = stdin.nextInt();
                    temp_Adj.add(amigo);
                    if (!g.listaPre.containsKey(amigo)) {
                        temp_Pre.add(aluno);
                        g.listaPre.put(amigo, temp_Pre);
                    } else
                        g.listaPre.get(amigo).add(aluno);
                    amigos--;
                }
                g.listaAdj.put(aluno, temp_Adj);
                System.out.println("Aluno: " + aluno + " tem " + temp_Adj.size() + " amigos");
                n_alunos--;
            }
            System.out.println("Caso: " + control);
            control++;
        }
    }
}
class Grafo {
    int[] color;  // reordered 3
    HashMap<Integer, ArrayList<Integer>> listaPre;  // reordered 3
    HashMap<Integer, ArrayList<Integer>> listaAdj;  // reordered 3
    int vertices;  // reordered 3
    Grafo(int v) {
        color = new int[v];  // reordered 3
        listaPre = new HashMap<Integer, ArrayList<Integer>>();  // reordered 3
        listaAdj = new HashMap<Integer, ArrayList<Integer>>();  // reordered 3
        vertices = v;  // reordered 3
    }
    void DFS() {
        for (int u : listaAdj.keySet()) {
            if (color[u - 1] == 0)
                DFS(u);
        }
    }
    void DFS(int u) {
        color[u - 1] = 1;
        for (int v : listaAdj.get(u)) {}
    }
}
