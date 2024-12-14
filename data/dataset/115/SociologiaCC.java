import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
public class SociologiaCC {
    public static int BRANCO = 0;
    public static int CINZA = 1;
    public static int PRETO = 2;
    public static int n_alunos, n_grupos_tot, n_grupos;
    public static int[] finalizacao;
    public static Alunos[] listaAlunosT;
    public static LinkedList<Integer> grupos;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int conta = 0;
        Alunos[] listaAlunos;
        grupos = new LinkedList<Integer>();
        n_alunos = in.nextInt();
        in.nextLine();
        listaAlunos = new Alunos[n_alunos + 1];
        listaAlunosT = new Alunos[n_alunos + 1];
        finalizacao = new int[n_alunos + 1];
        for (int i = 1; i < n_alunos + 1; i++) {
            listaAlunos[i] = new Alunos(i);
            listaAlunosT[i] = new Alunos(i);
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
        int conta = 0;
        int gajo = 1;
        for (int i = 1; i < finalizacao.length; i++) {
            if (finalizacao[i] > conta) {
                conta = finalizacao[i];
                gajo = i;
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
        int count = 1;
        listaAlunosT[temp_aluno].cor = PRETO;
        for (Alunos aluno2 : listaAlunosT[temp_aluno].amigos) {
            if (aluno2.cor != PRETO) {
                count += dfsT(listaAlunosT, aluno2.aluno);
            }
        }
        return count;
    }
}
class Alunos {
    int aluno;
    int cor;
    ArrayList<Alunos> amigos;
    Alunos(int aluno) {
        this.aluno = aluno;
        this.cor = SociologiaCC.BRANCO;
        amigos = new ArrayList<Alunos>();
    }
}
