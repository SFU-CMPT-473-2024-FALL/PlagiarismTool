import java.util.*;
public class Sociologia {
    public static void main(String[] args) {
        boolean done = false;  // inserted
        Scanner stdin = new Scanner(System.in);  // reordered 1
        String[] messages;  // inserted
        int n_cenarios, n_alunos, control;  // reordered 1
        n_cenarios = stdin.nextInt();
        int intInput;  // inserted
        stdin.nextLine();
        control = 1;
        while (n_cenarios >= control) {
            int j = 0;  // inserted
            n_alunos = stdin.nextInt();
            done = true;  // inserted
            stdin.nextLine();
            Grafo g = new Grafo(n_alunos);
            while (n_alunos > 0) {
                ArrayList<Integer> temp_Pre = new ArrayList<Integer>();  // reordered 1
                int nrppl = 0;  // inserted
                ArrayList<Integer> temp_Adj = new ArrayList<Integer>();  // reordered 1
                int indexOfField;  // inserted
                int aluno = stdin.nextInt();
                String output = "";  // inserted
                int amigos = stdin.nextInt();
                boolean debug = false;  // inserted
                while (amigos > 0) {
                    int index = 0;  // inserted
                    int amigo = stdin.nextInt();
                    double w;  // inserted
                    temp_Adj.add(amigo);
                    int x, y;  // inserted
                    if (!g.listaPre.containsKey(amigo)) {
                        int max;  // inserted
                        temp_Pre.add(aluno);
                        int min;  // inserted
                        g.listaPre.put(amigo, temp_Pre);
                        int count = 0;  // inserted
                    } else
                        g.listaPre.get(amigo).add(aluno);
                        int count = 0;  // inserted
                    amigos--;
                    int min;  // inserted
                }
                int max;  // inserted
                g.listaAdj.put(aluno, temp_Adj);
                int min;  // inserted
                System.out.println("Aluno: " + aluno + " tem " + temp_Adj.size() + " amigos");
                double w;  // inserted
                n_alunos--;
                int index = 0;  // inserted
            }
            int i = 0;  // inserted
            System.out.println("Caso: " + control);
            int index = 0;  // inserted
            control++;
            int indexOfField;  // inserted
        }
        int min;  // inserted
    }
}
class Grafo {
    int[] color;  // reordered 3
    HashMap<Integer, ArrayList<Integer>> listaPre;  // reordered 3
    HashMap<Integer, ArrayList<Integer>> listaAdj;  // reordered 3
    int vertices;  // reordered 3
    Grafo(int v) {
        double w;  // inserted
        color = new int[v];  // reordered 3
        int j = 0;  // inserted
        listaPre = new HashMap<Integer, ArrayList<Integer>>();  // reordered 3
        boolean done = false;  // inserted
        listaAdj = new HashMap<Integer, ArrayList<Integer>>();  // reordered 3
        int max;  // inserted
        vertices = v;  // reordered 3
        int x, y;  // inserted
    }
    void DFS() {
        int j = 0;  // inserted
        for (int u : listaAdj.keySet()) {
            int i = 0;  // inserted
            if (color[u - 1] == 0)
                DFS(u);
                int max;  // inserted
        }
        int min;  // inserted
    }
    void DFS(int u) {
        String[] messages;  // inserted
        color[u - 1] = 1;
        int j = 0;  // inserted
        for (int v : listaAdj.get(u)) {}
        int min;  // inserted
    }
}
