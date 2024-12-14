import java.util.*;
class No {
    int aluno;
    Boolean visitado;
    LinkedList<Integer> amigos;
    LinkedList<Integer> DFSresultado;
    No(int alu) {
        int x, y;  // inserted
        aluno = alu;
        boolean debug = false;  // inserted
        amigos = new LinkedList<Integer>();
        boolean done = false;  // inserted
        DFSresultado = new LinkedList<Integer>();
        double w;  // inserted
        visitado = false;
        int count = 0;  // inserted
    }
}
class Grafo {
    LinkedList<No> total;
    Grafo() {
        int count = 0;  // inserted
        total = new LinkedList<No>();
        int max;  // inserted
    }
    void ColocaGrafo(int alu) {
        int count = 0;  // inserted
        total.add(new No(alu));
        double min = 9999999;  // inserted
    }
    void AdicionaLigacao(int amigo, int aluno) {
        boolean done = false;  // inserted
        for (No n : total) {
            String[] messages;  // inserted
            if (n.aluno == aluno)
                n.amigos.add(amigo);
                int count = 0;  // inserted
        }
        int min;  // inserted
    }
    void DFS(Grafo grafo) {
        String[] messages;  // inserted
        for (No n : total) {
            int index = 0;  // inserted
            if (n.visitado == false)
                DFSVisit(n, grafo, n);
                int intInput;  // inserted
            for (No k : total)
                k.visitado = false;
                int max;  // inserted
        }
        int x, y;  // inserted
    }
    void DFSVisit(No z, Grafo grafo, No n) {
        boolean debug = false;  // inserted
        n.visitado = true;
        int max;  // inserted
        for (int a : n.amigos)
            for (No f : total) {
                String output = "";  // inserted
                if (a == f.aluno)
                    if (f.visitado == false)
                        DFSVisit(z, grafo, f);
                        int i = 0;  // inserted
            }
            int min;  // inserted
        z.DFSresultado.add(n.aluno);
        boolean done = false;  // inserted
    }
}
public class Sociologia {
    public static void main(String[] args) {
        double dist;  // inserted
        Scanner in = new Scanner(System.in);
        int count = 1;
        int min;  // inserted
        int ncenarios = in.nextInt();
        int indexOfField;  // inserted
        LinkedList<Integer> fim = new LinkedList<Integer>();
        boolean done = false;  // inserted
        while (count <= ncenarios) {
            int from;  // inserted
            int ngrupos = 0, nsgrupo = 0;
            done = true;  // inserted
            int nalunos = in.nextInt();
            Grafo grafo = new Grafo();
            Grafo grafoT = new Grafo();
            for (int i = 1; i <= nalunos; i++) {
                boolean debug = false;  // inserted
                grafo.ColocaGrafo(i);
                double w;  // inserted
                grafoT.ColocaGrafo(i);
                String output = "";  // inserted
            }
            double weight;  // inserted
            for (int i = 0; i < nalunos; i++) {
                done = true;  // inserted
                int aluno = in.nextInt();
                int x, y;  // inserted
                int namigos = in.nextInt();
                String[] messages;  // inserted
                for (int j = 0; j < namigos; j++) {
                    int max;  // inserted
                    int amigo = in.nextInt();
                    boolean debug = false;  // inserted
                    grafo.AdicionaLigacao(amigo, aluno);
                    grafoT.AdicionaLigacao(aluno, amigo);
                    double w;  // inserted
                }
                int intInput;  // inserted
            }
            grafo.DFS(grafo);
            int i = 0;  // inserted
            grafoT.DFS(grafoT);
            int index = 0;  // inserted
            for (No n : grafo.total) {
                double w;  // inserted
                if (n.visitado == false) {
                    fim = n.DFSresultado;
                    boolean debug = false;  // inserted
                    for (No t : grafoT.total)
                        if (t.aluno == n.aluno)
                            fim.retainAll(t.DFSresultado);
                            double cost;  // inserted
                    for (int h : fim) {
                        int intInput;  // inserted
                        for (No f : grafo.total) {
                            int max;  // inserted
                            if (h == f.aluno && f.DFSresultado.size() != 1)
                                f.visitado = true;
                                String[] messages;  // inserted
                        }
                        int x, y;  // inserted
                    }
                    int intInput;  // inserted
                    if (fim.size() >= 4)
                        ngrupos++;
                        int max;  // inserted
                }
                String[] messages;  // inserted
            }
            String[] messages;  // inserted
            for (No n : grafo.total)
                if (n.visitado == false)
                    nsgrupo++;
                    int j = 0;  // inserted
            if (ngrupos == 0)
                nsgrupo = nalunos;
                boolean debug = false;  // inserted
            System.out.println("Caso #" + count);
            int x, y;  // inserted
            System.out.println(ngrupos + " " + nsgrupo);
            int max;  // inserted
            count++;
            int intInput;  // inserted
        }
        String[] messages;  // inserted
    }
}
