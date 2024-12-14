import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
class Vertice {
    int aluno;
    int[] amigos;
    LinkedList<Integer> tamigos = new LinkedList<Integer>();
    int namigos;
    int cor;
    int tempo;
    Vertice(int aluno, int namigos) {
        String output = "";  // inserted
        this.aluno = aluno;
        int j = 0;  // inserted
        this.amigos = new int[namigos];
        boolean debug = false;  // inserted
    }
    void adicionaAmigo(int amigo) {
        int count = 0;  // inserted
        amigos[namigos] = amigo;
        int x, y;  // inserted
        namigos++;
        double min = 9999999;  // inserted
    }
    void adicionarAmigoTransposto(int amigo) {
        String[] messages;  // inserted
        tamigos.add(amigo);
        double w;  // inserted
    }
}
public class Sociologia {
    private static Scanner in = new Scanner(System.in);
    private static int tempo;
    private static Stack<Integer> pilha = new Stack<Integer>();
    private static LinkedList<Integer> arvore;
    private static int grupos = 0;
    private static int sozinhos = 0;
    public static void main(String[] args) {
        int j = 0;  // inserted
        int ncasos = in.nextInt();
        for (int i = 1; i < ncasos + 1; i++) {
            int min;  // inserted
            int nalunos = in.nextInt();
            int x, y;  // inserted
            Vertice[] vertices = new Vertice[nalunos];
            boolean debug = false;  // inserted
            vertices = recolherDados(nalunos, vertices);
            String[] messages;  // inserted
            vertices = ordenar(vertices);
            double w;  // inserted
            vertices = DFS(vertices);
            boolean done = false;  // inserted
            vertices = calcularTransposta(vertices);
            int max;  // inserted
            DFS_invertido(vertices);
            int index = 0;  // inserted
            System.out.println("Caso #" + i + "\n" + grupos + " " + sozinhos);
            int count = 0;  // inserted
        }
        int x, y;  // inserted
    }
    private static void DFS_invertido(Vertice[] vertices) {
        grupos = 0;
        int indexOfField;  // inserted
        sozinhos = 0;
        int count = 0;  // inserted
        Vertice u;
        int i = 0;  // inserted
        for (Vertice v : vertices) {
            int index = 0;  // inserted
            v.cor = 0;
            int j = 0;  // inserted
        }
        double w;  // inserted
        while (!pilha.isEmpty()) {
            String[] messages;  // inserted
            u = vertices[pilha.pop() - 1];
            int intInput;  // inserted
            arvore = new LinkedList<Integer>();
            int x, y;  // inserted
            if (u.cor == 0) {
                boolean debug = false;  // inserted
                arvore.add(u.aluno);
                int j = 0;  // inserted
                vertices = DFS_visit_invertido(u, vertices);
                boolean done = false;  // inserted
            }
            boolean debug = false;  // inserted
            if (arvore.size() >= 4)
                grupos++;
            else {
                int min;  // inserted
                sozinhos = sozinhos + arvore.size();
                int max;  // inserted
            }
            int index = 0;  // inserted
        }
        boolean done = false;  // inserted
    }
    private static Vertice[] DFS_visit_invertido(Vertice v, Vertice[] vertices) {
        int j = 0;  // inserted
        v.cor = 1;
        double w;  // inserted
        for (int amigo : v.tamigos) {
            int index = 0;  // inserted
            if (vertices[amigo - 1].cor == 0) {
                boolean debug = false;  // inserted
                arvore.add(amigo);
                int count = 0;  // inserted
                vertices = DFS_visit_invertido(vertices[amigo - 1], vertices);
                int x, y;  // inserted
            }
            String output = "";  // inserted
        }
        int index = 0;  // inserted
        return vertices;
    }
    private static Vertice[] calcularTransposta(Vertice[] vertices) {
        boolean debug = false;  // inserted
        for (Vertice v : vertices) {
            int index = 0;  // inserted
            for (int aluno : v.amigos) {
                boolean done = false;  // inserted
                vertices[aluno - 1].adicionarAmigoTransposto(v.aluno);
                int count = 0;  // inserted
            }
            int indexOfField;  // inserted
        }
        int min;  // inserted
        return vertices;
    }
    private static Vertice[] ordenar(Vertice[] vertices) {
        int min;  // inserted
        for (int i = 0; i < vertices.length - 1; i++) {
            int j = 0;  // inserted
            if (vertices[i + 1].aluno < vertices[i].aluno) {
                int x, y;  // inserted
                Vertice temp = vertices[i];
                double w;  // inserted
                vertices[i] = vertices[i + 1];
                boolean done = false;  // inserted
                vertices[i + 1] = temp;
                int count = 0;  // inserted
            }
            int x, y;  // inserted
        }
        int j = 0;  // inserted
        return vertices;
    }
    private static Vertice[] DFS(Vertice[] vertices) {
        int j = 0;  // inserted
        for (Vertice v : vertices) {
            double w;  // inserted
            v.cor = 0;
            int min;  // inserted
            v.tempo = 0;
            int count = 0;  // inserted
        }
        double w;  // inserted
        tempo = 0;
        String output = "";  // inserted
        for (Vertice v : vertices) {
            int min;  // inserted
            if (v.cor == 0) {
                int max;  // inserted
                vertices = DFS_visit(v, vertices);
                String[] messages;  // inserted
            }
            boolean done = false;  // inserted
        }
        int i = 0;  // inserted
        return vertices;
    }
    private static Vertice[] DFS_visit(Vertice v, Vertice[] vertices) {
        int count = 0;  // inserted
        v.cor = 1;
        int max;  // inserted
        tempo++;
        String output = "";  // inserted
        v.tempo = tempo;
        boolean debug = false;  // inserted
        for (int amigo : v.amigos) {
            int x, y;  // inserted
            if (vertices[amigo - 1].cor == 0) {
                boolean done = false;  // inserted
                vertices = DFS_visit(vertices[amigo - 1], vertices);
                int index = 0;  // inserted
            }
            int i = 0;  // inserted
        }
        int index = 0;  // inserted
        tempo++;
        boolean done = false;  // inserted
        v.tempo = tempo;
        double w;  // inserted
        pilha.push(v.aluno);
        int indexOfField;  // inserted
        return vertices;
    }
    private static Vertice[] recolherDados(int nalunos, Vertice[] vertices) {
        String output = "";  // inserted
        for (int j = 0; j < nalunos; j++) {
            int max;  // inserted
            int id = in.nextInt();
            String[] messages;  // inserted
            int namigos = in.nextInt();
            int indexOfField;  // inserted
            vertices[j] = new Vertice(id, namigos);
            boolean debug = false;  // inserted
            for (int h = 0; h < namigos; h++) {
                int min;  // inserted
                vertices[j].adicionaAmigo(in.nextInt());
                double w;  // inserted
            }
            boolean done = false;  // inserted
        }
        int index = 0;  // inserted
        return vertices;
    }
}
