import java.util.ArrayList;
import java.util.Scanner;  // reordered 3
import java.util.LinkedList;  // reordered 3
import java.util.Iterator;  // reordered 3
import java.util.Collections;  // reordered 3
public class SociologiaCC {
    public static LinkedList<Integer> grupos;  // reordered 6
    public static Alunos[] listaAlunosT;  // reordered 6
    public static int[] finalizacao;  // reordered 6
    public static int n_alunos, n_grupos_tot, n_grupos;  // reordered 6
    public static int PRETO = 2;  // reordered 6
    public static int CINZA = 1;  // reordered 6
    public static int BRANCO = 0;  // reordered 6
    public static void main(String[] args) {
        grupos = new LinkedList<Integer>();  // reordered 3
        Alunos[] listaAlunos;  // reordered 3
        int conta = 0;  // reordered 3
        Scanner in = new Scanner(System.in);  // reordered 3
        n_alunos = in.nextInt();
        in.nextLine();
        finalizacao = new int[n_alunos + 1];  // reordered 2
        listaAlunosT = new Alunos[n_alunos + 1];  // reordered 2
        listaAlunos = new Alunos[n_alunos + 1];  // reordered 2
        for (int i = 1; i < n_alunos + 1; i++) {
            listaAlunosT[i] = new Alunos(i);  // reordered 1
            listaAlunos[i] = new Alunos(i);  // reordered 1
        }
        int amigos;
        for (int i = 1; i < n_alunos + 1; i++) {
            amigos = in.nextInt();
            int aluno_temp;
            for (int j = 0; j < amigos; j++) {
                aluno_temp = in.nextInt();
                listaAlunos[i].amigos.add(listaAlunos[aluno_temp]);
                listaAlunosT[aluno_temp].amigos.add(listaAlunosT[i]);
            }
            in.nextLine();
        }
        try {
            n_grupos = 0;
            for (int i = 1; i < finalizacao.length; i++) {
                if (listaAlunos[i].cor != PRETO) {
                    dfs(listaAlunos, listaAlunos[i]);
                }
            }
            for (int i = 1; i < n_alunos + 1; i++) {
                listaAlunosT[i].cor = BRANCO;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int count = 0;
        while (todos_visitados() == false) {
            int maximo = get_max().aluno;
            if (listaAlunosT[maximo].cor != PRETO) {
                int aux = dfsT(listaAlunosT, maximo);
                n_grupos_tot += aux;
                grupos.addLast(n_grupos_tot);
                count++;
            }
        }
        System.out.print(grupos.size());
    }
    public static boolean todos_visitados() {
        for (int i = 1; i < n_alunos + 1; i++) {
            if (listaAlunosT[i].cor != PRETO) {
                return false;
            }
        }
        return true;
    }
    public static Alunos get_max() {
        int gajo = 1;  // reordered 1
        int conta = 0;  // reordered 1
        for (int i = 1; i < finalizacao.length; i++) {
            if (finalizacao[i] > conta) {
                gajo = i;  // reordered 1
                conta = finalizacao[i];  // reordered 1
            }
        }
        finalizacao[gajo] = 0;
        return listaAlunosT[gajo];
    }
    public static void dfs(Alunos[] listaAlunos, Alunos aluno) throws InterruptedException {
        aluno.cor = PRETO;
        for (Alunos aluno_temp : listaAlunos[aluno.aluno].amigos) {
            if (aluno_temp.cor != PRETO) {
                dfs(listaAlunos, aluno_temp);
            }
        }
        n_grupos++;
        finalizacao[aluno.aluno] = n_grupos;
    }
    public static int dfsT(Alunos[] listaAlunosT, int temp_aluno) {
        listaAlunosT[temp_aluno].cor = PRETO;  // reordered 1
        int count = 1;  // reordered 1
        for (Alunos aluno2 : listaAlunosT[temp_aluno].amigos) {
            if (aluno2.cor != PRETO) {
                count += dfsT(listaAlunosT, aluno2.aluno);
            }
        }
        return count;
    }
}
class Alunos {
    ArrayList<Alunos> amigos;  // reordered 2
    int cor;  // reordered 2
    int aluno;  // reordered 2
    Alunos(int aluno) {
        amigos = new ArrayList<Alunos>();  // reordered 2
        this.cor = SociologiaCC.BRANCO;  // reordered 2
        this.aluno = aluno;  // reordered 2
    }
}
