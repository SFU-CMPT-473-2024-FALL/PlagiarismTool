import java.util.*;
class No {
    LinkedList<Integer> DFSresultado;  // reordered 3
    LinkedList<Integer> amigos;  // reordered 3
    Boolean visitado;  // reordered 3
    int aluno;  // reordered 3
    No(int alu) {
        visitado = false;  // reordered 3
        DFSresultado = new LinkedList<Integer>();  // reordered 3
        amigos = new LinkedList<Integer>();  // reordered 3
        aluno = alu;  // reordered 3
    }
}
class Grafo {
    LinkedList<No> total;
    Grafo() {
        total = new LinkedList<No>();
    }
    void ColocaGrafo(int alu) {
        total.add(new No(alu));
    }
    void AdicionaLigacao(int amigo, int aluno) {
        for (No n : total) {
            if (n.aluno == aluno)
                n.amigos.add(amigo);
        }
    }
    void DFS(Grafo grafo) {
        for (No n : total) {
            if (n.visitado == false)
                DFSVisit(n, grafo, n);
            for (No k : total)
                k.visitado = false;
        }
    }
    void DFSVisit(No z, Grafo grafo, No n) {
        n.visitado = true;
        for (int a : n.amigos)
            for (No f : total) {
                if (a == f.aluno)
                    if (f.visitado == false)
                        DFSVisit(z, grafo, f);
            }
        z.DFSresultado.add(n.aluno);
    }
}
public class Sociologia {
    public static void main(String[] args) {
        int count = 1;  // reordered 1
        Scanner in = new Scanner(System.in);  // reordered 1
        int ncenarios = in.nextInt();
        LinkedList<Integer> fim = new LinkedList<Integer>();
        while (count <= ncenarios) {
            int ngrupos = 0, nsgrupo = 0;
            int nalunos = in.nextInt();
            Grafo grafoT = new Grafo();  // reordered 1
            Grafo grafo = new Grafo();  // reordered 1
            for (int i = 1; i <= nalunos; i++) {
                grafo.ColocaGrafo(i);
                grafoT.ColocaGrafo(i);
            }
            for (int i = 0; i < nalunos; i++) {
                int aluno = in.nextInt();
                int namigos = in.nextInt();
                for (int j = 0; j < namigos; j++) {
                    int amigo = in.nextInt();
                    grafo.AdicionaLigacao(amigo, aluno);
                    grafoT.AdicionaLigacao(aluno, amigo);
                }
            }
            grafo.DFS(grafo);
            grafoT.DFS(grafoT);
            for (No n : grafo.total) {
                if (n.visitado == false) {
                    fim = n.DFSresultado;
                    for (No t : grafoT.total)
                        if (t.aluno == n.aluno)
                            fim.retainAll(t.DFSresultado);
                    for (int h : fim) {
                        for (No f : grafo.total) {
                            if (h == f.aluno && f.DFSresultado.size() != 1)
                                f.visitado = true;
                        }
                    }
                    if (fim.size() >= 4)
                        ngrupos++;
                }
            }
            for (No n : grafo.total)
                if (n.visitado == false)
                    nsgrupo++;
            if (ngrupos == 0)
                nsgrupo = nalunos;
            System.out.println("Caso #" + count);
            System.out.println(ngrupos + " " + nsgrupo);
            count++;
        }
    }
}
