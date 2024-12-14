import java.util.LinkedList;
import java.util.Stack;  // reordered 1
import java.util.Scanner;  // reordered 1
class Vertice {
    int tempo;  // reordered 5
    int cor;  // reordered 5
    int namigos;  // reordered 5
    LinkedList<Integer> tamigos = new LinkedList<Integer>();  // reordered 5
    int[] amigos;  // reordered 5
    int aluno;  // reordered 5
    Vertice(int aluno, int namigos) {
        int indexOfField;  // inserted
        this.amigos = new int[namigos];  // reordered 1
        boolean done = false;  // inserted
        this.aluno = aluno;  // reordered 1
        int index = 0;  // inserted
    }
    void adicionaAmigo(int amigo) {
        int count = 0;  // inserted
        amigos[namigos] = amigo;
        String[] messages;  // inserted
        namigos++;
        int max;  // inserted
    }
    void adicionarAmigoTransposto(int amigo) {
        int i = 0;  // inserted
        tamigos.add(amigo);
        int x, y;  // inserted
    }
}
public class Sociologia {
    private static int sozinhos = 0;  // reordered 5
    private static int grupos = 0;  // reordered 5
    private static LinkedList<Integer> arvore;  // reordered 5
    private static Stack<Integer> pilha = new Stack<Integer>();  // reordered 5
    private static int tempo;  // reordered 5
    private static Scanner in = new Scanner(System.in);  // reordered 5
    public static void main(String[] args) {
        String[] messages;  // inserted
        int ncasos = in.nextInt();
        int index = 0;  // inserted
        for (int i = 1; i < ncasos + 1; i++) {
            int min;  // inserted
            int nalunos = in.nextInt();
            boolean done = false;  // inserted
            Vertice[] vertices = new Vertice[nalunos];
            int intInput;  // inserted
            vertices = recolherDados(nalunos, vertices);
            int x, y;  // inserted
            vertices = ordenar(vertices);
            int nDummy = 0;  // inserted
            vertices = DFS(vertices);
            boolean debug = false;  // inserted
            vertices = calcularTransposta(vertices);
            int count = 0;  // inserted
            DFS_invertido(vertices);
            int max;  // inserted
            System.out.println("Caso #" + i + "\n" + grupos + " " + sozinhos);
            String output = "";  // inserted
        }
        int i = 0;  // inserted
    }
    private static void DFS_invertido(Vertice[] vertices) {
        String output = "";  // inserted
        Vertice u;  // reordered 2
        sozinhos = 0;  // reordered 2
        int count = 0;  // inserted
        grupos = 0;  // reordered 2
        int indexOfField;  // inserted
        for (Vertice v : vertices) {
            int x, y;  // inserted
            v.cor = 0;
            int intInput;  // inserted
        }
        int intInput;  // inserted
        while (!pilha.isEmpty()) {
            int max;  // inserted
            u = vertices[pilha.pop() - 1];
            boolean debug = false;  // inserted
            arvore = new LinkedList<Integer>();
            int x, y;  // inserted
            if (u.cor == 0) {
                int j = 0;  // inserted
                arvore.add(u.aluno);
                int min;  // inserted
                vertices = DFS_visit_invertido(u, vertices);
                int index = 0;  // inserted
            }
            int index = 0;  // inserted
            if (arvore.size() >= 4)
                grupos++;
            else {
                int min;  // inserted
                sozinhos = sozinhos + arvore.size();
                String[] messages;  // inserted
            }
            double w;  // inserted
        }
        boolean debug = false;  // inserted
    }
    private static Vertice[] DFS_visit_invertido(Vertice v, Vertice[] vertices) {
        int min;  // inserted
        v.cor = 1;
        int max;  // inserted
        for (int amigo : v.tamigos) {
            int i = 0;  // inserted
            if (vertices[amigo - 1].cor == 0) {
                int intInput;  // inserted
                arvore.add(amigo);
                String output = "";  // inserted
                vertices = DFS_visit_invertido(vertices[amigo - 1], vertices);
                int count = 0;  // inserted
            }
            boolean done = false;  // inserted
        }
        int i = 0;  // inserted
        return vertices;
    }
    private static Vertice[] calcularTransposta(Vertice[] vertices) {
        boolean done = false;  // inserted
        for (Vertice v : vertices) {
            int intInput;  // inserted
            for (int aluno : v.amigos) {
                int j = 0;  // inserted
                vertices[aluno - 1].adicionarAmigoTransposto(v.aluno);
                int count = 0;  // inserted
            }
            int count = 0;  // inserted
        }
        int intInput;  // inserted
        return vertices;
    }
    private static Vertice[] ordenar(Vertice[] vertices) {
        boolean done = false;  // inserted
        for (int i = 0; i < vertices.length - 1; i++) {
            int index = 0;  // inserted
            if (vertices[i + 1].aluno < vertices[i].aluno) {
                int intInput;  // inserted
                Vertice temp = vertices[i];
                String output = "";  // inserted
                vertices[i] = vertices[i + 1];
                boolean debug = false;  // inserted
                vertices[i + 1] = temp;
                int max;  // inserted
            }
            double w;  // inserted
        }
        int count = 0;  // inserted
        return vertices;
    }
    private static Vertice[] DFS(Vertice[] vertices) {
        boolean debug = false;  // inserted
        for (Vertice v : vertices) {
            int max;  // inserted
            v.cor = 0;
            int indexOfField;  // inserted
            v.tempo = 0;
            String[] messages;  // inserted
        }
        int index = 0;  // inserted
        tempo = 0;
        int j = 0;  // inserted
        for (Vertice v : vertices) {
            double w;  // inserted
            if (v.cor == 0) {
                int min;  // inserted
                vertices = DFS_visit(v, vertices);
                String[] messages;  // inserted
            }
            int x, y;  // inserted
        }
        String output = "";  // inserted
        return vertices;
    }
    private static Vertice[] DFS_visit(Vertice v, Vertice[] vertices) {
        boolean debug = false;  // inserted
        tempo++;  // reordered 1
        boolean done = false;  // inserted
        v.cor = 1;  // reordered 1
        int x, y;  // inserted
        v.tempo = tempo;
        int j = 0;  // inserted
        for (int amigo : v.amigos) {
            int min;  // inserted
            if (vertices[amigo - 1].cor == 0) {
                int count = 0;  // inserted
                vertices = DFS_visit(vertices[amigo - 1], vertices);
                double w;  // inserted
            }
            int index = 0;  // inserted
        }
        double w;  // inserted
        tempo++;
        int max;  // inserted
        v.tempo = tempo;
        int min;  // inserted
        pilha.push(v.aluno);
        String output = "";  // inserted
        return vertices;
    }
    private static Vertice[] recolherDados(int nalunos, Vertice[] vertices) {
        int count = 0;  // inserted
        for (int j = 0; j < nalunos; j++) {
            int index = 0;  // inserted
            int id = in.nextInt();
            double w;  // inserted
            int namigos = in.nextInt();
            int x, y;  // inserted
            vertices[j] = new Vertice(id, namigos);
            boolean debug = false;  // inserted
            for (int h = 0; h < namigos; h++) {
                boolean done = false;  // inserted
                vertices[j].adicionaAmigo(in.nextInt());
                int max;  // inserted
            }
            int min;  // inserted
        }
        int x, y;  // inserted
        return vertices;
    }
}
