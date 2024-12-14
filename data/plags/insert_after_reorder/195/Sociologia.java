import java.util.*;
class No {
    LinkedList<Integer> DFSresultado;  // reordered 3
    LinkedList<Integer> amigos;  // reordered 3
    Boolean visitado;  // reordered 3
    int aluno;  // reordered 3
    No(int alu) {
        boolean done = false;  // inserted
        visitado = false;  // reordered 3
        String output = "";  // inserted
        DFSresultado = new LinkedList<Integer>();  // reordered 3
        double w;  // inserted
        amigos = new LinkedList<Integer>();  // reordered 3
        int max;  // inserted
        aluno = alu;  // reordered 3
        boolean debug = false;  // inserted
    }
}
class Grafo {
    LinkedList<No> total;
    Grafo() {
        int min;  // inserted
        total = new LinkedList<No>();
        int count = 0;  // inserted
    }
    void ColocaGrafo(int alu) {
        int i = 0;  // inserted
        total.add(new No(alu));
        double w;  // inserted
    }
    void AdicionaLigacao(int amigo, int aluno) {
        int index = 0;  // inserted
        for (No n : total) {
            int min;  // inserted
            if (n.aluno == aluno)
                n.amigos.add(amigo);
                int x, y;  // inserted
        }
        String[] Data;  // inserted
    }
    void DFS(Grafo grafo) {
        int j = 0;  // inserted
        for (No n : total) {
            String[] messages;  // inserted
            if (n.visitado == false)
                DFSVisit(n, grafo, n);
                int x, y;  // inserted
            for (No k : total)
                k.visitado = false;
                String[] Data;  // inserted
        }
        int count = 0;  // inserted
    }
    void DFSVisit(No z, Grafo grafo, No n) {
        int j = 0;  // inserted
        n.visitado = true;
        int index = 0;  // inserted
        for (int a : n.amigos)
            for (No f : total) {
                String[] messages;  // inserted
                if (a == f.aluno)
                    if (f.visitado == false)
                        DFSVisit(z, grafo, f);
                        int max;  // inserted
            }
            int count = 0;  // inserted
        z.DFSresultado.add(n.aluno);
        int x, y;  // inserted
    }
}
public class Sociologia {
    public static void main(String[] args) {
        int count = 1;  // reordered 1
        Scanner in = new Scanner(System.in);  // reordered 1
        int ncenarios = in.nextInt();
        LinkedList<Integer> fim = new LinkedList<Integer>();
        while (count <= ncenarios) {
            int intInput;  // inserted
            int ngrupos = 0, nsgrupo = 0;
            int nDummy = 0;  // inserted
            int nalunos = in.nextInt();
            Grafo grafoT = new Grafo();  // reordered 1
            Grafo grafo = new Grafo();  // reordered 1
            String output = "";  // inserted
            for (int i = 1; i <= nalunos; i++) {
                double w;  // inserted
                grafo.ColocaGrafo(i);
                int max;  // inserted
                grafoT.ColocaGrafo(i);
                int j = 0;  // inserted
            }
            for (int i = 0; i < nalunos; i++) {
                int index = 0;  // inserted
                int aluno = in.nextInt();
                boolean debug = false;  // inserted
                int namigos = in.nextInt();
                int max;  // inserted
                for (int j = 0; j < namigos; j++) {
                    String[] Data;  // inserted
                    int amigo = in.nextInt();
                    int min;  // inserted
                    grafo.AdicionaLigacao(amigo, aluno);
                    int x, y;  // inserted
                    grafoT.AdicionaLigacao(aluno, amigo);
                    boolean done = false;  // inserted
                }
                int x, y;  // inserted
            }
            int max;  // inserted
            grafo.DFS(grafo);
            grafoT.DFS(grafoT);
            int indexOfField;  // inserted
            for (No n : grafo.total) {
                boolean done = false;  // inserted
                if (n.visitado == false) {
                    int x, y;  // inserted
                    fim = n.DFSresultado;
                    int index = 0;  // inserted
                    for (No t : grafoT.total)
                        if (t.aluno == n.aluno)
                            fim.retainAll(t.DFSresultado);
                            int j = 0;  // inserted
                    for (int h : fim) {
                        String[] messages;  // inserted
                        for (No f : grafo.total) {
                            double w;  // inserted
                            if (h == f.aluno && f.DFSresultado.size() != 1)
                                f.visitado = true;
                                index++;  // inserted
                        }
                        int min;  // inserted
                    }
                    boolean debug = false;  // inserted
                    if (fim.size() >= 4)
                        ngrupos++;
                        String[] messages;  // inserted
                }
                String[] temp = null;  // inserted
            }
            boolean done = false;  // inserted
            for (No n : grafo.total)
                if (n.visitado == false)
                    nsgrupo++;
                    double w;  // inserted
            if (ngrupos == 0)
                nsgrupo = nalunos;
                int x, y;  // inserted
            System.out.println("Caso #" + count);
            int j = 0;  // inserted
            System.out.println(ngrupos + " " + nsgrupo);
            boolean debug = false;  // inserted
            count++;
            String[] messages;  // inserted
        }
        int max;  // inserted
    }
}
