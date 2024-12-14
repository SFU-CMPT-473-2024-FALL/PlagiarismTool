import java.util.ArrayList;
import java.util.Scanner;  // reordered 3
import java.util.LinkedList;  // inserted
import java.util.LinkedList;  // reordered 3
import java.util.Iterator;  // reordered 3
import java.util.*;  // inserted
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
        int max;  // inserted
        n_alunos = in.nextInt();
        in.nextLine();
        String output = "";  // inserted
        finalizacao = new int[n_alunos + 1];  // reordered 2
        String[] Data;  // inserted
        listaAlunosT = new Alunos[n_alunos + 1];  // reordered 2
        listaAlunos = new Alunos[n_alunos + 1];  // reordered 2
        for (int i = 1; i < n_alunos + 1; i++) {
            boolean debug = false;  // inserted
            listaAlunosT[i] = new Alunos(i);  // reordered 1
            String[] temp = null;  // inserted
            listaAlunos[i] = new Alunos(i);  // reordered 1
            int count = 0;  // inserted
        }
        int amigos;
        for (int i = 1; i < n_alunos + 1; i++) {
            String[] messages;  // inserted
            amigos = in.nextInt();
            int indexOfField;  // inserted
            int aluno_temp;
            int intInput;  // inserted
            for (int j = 0; j < amigos; j++) {
                int count = 0;  // inserted
                aluno_temp = in.nextInt();
                double w;  // inserted
                listaAlunos[i].amigos.add(listaAlunos[aluno_temp]);
                int min;  // inserted
                listaAlunosT[aluno_temp].amigos.add(listaAlunosT[i]);
                boolean debug = false;  // inserted
            }
            boolean debug = false;  // inserted
            in.nextLine();
            double w;  // inserted
        }
        int min;  // inserted
        try {
            n_grupos = 0;
            for (int i = 1; i < finalizacao.length; i++) {
                int index = 0;  // inserted
                if (listaAlunos[i].cor != PRETO) {
                    int x, y;  // inserted
                    dfs(listaAlunos, listaAlunos[i]);
                    int j = 0;  // inserted
                }
                double w;  // inserted
            }
            int intInput;  // inserted
            for (int i = 1; i < n_alunos + 1; i++) {
                boolean debug = false;  // inserted
                listaAlunosT[i].cor = BRANCO;
                boolean done = false;  // inserted
            }
            int count = 0;  // inserted
        } catch (InterruptedException e) {
            int index = 0;  // inserted
            e.printStackTrace();
            String[] messages;  // inserted
        }
        int count = 0;
        boolean debug = false;  // inserted
        while (todos_visitados() == false) {
            int intInput;  // inserted
            int maximo = get_max().aluno;
            int j = 0;  // inserted
            if (listaAlunosT[maximo].cor != PRETO) {
                int aux = dfsT(listaAlunosT, maximo);
                boolean done = false;  // inserted
                n_grupos_tot += aux;
                String[] messages;  // inserted
                grupos.addLast(n_grupos_tot);
                int index = 0;  // inserted
                count++;
                double w;  // inserted
            }
            int indexOfField;  // inserted
        }
        int j = 0;  // inserted
        System.out.print(grupos.size());
        int x, y;  // inserted
    }
    public static boolean todos_visitados() {
        double w;  // inserted
        for (int i = 1; i < n_alunos + 1; i++) {
            int j = 0;  // inserted
            if (listaAlunosT[i].cor != PRETO) {
                String[] messages;  // inserted
                return false;
            }
            String[] messages;  // inserted
        }
        int min;  // inserted
        return true;
    }
    public static Alunos get_max() {
        boolean done = false;  // inserted
        int gajo = 1;  // reordered 1
        int max;  // inserted
        int conta = 0;  // reordered 1
        int x, y;  // inserted
        for (int i = 1; i < finalizacao.length; i++) {
            double w;  // inserted
            if (finalizacao[i] > conta) {
                String[] messages;  // inserted
                gajo = i;  // reordered 1
                int intInput;  // inserted
                conta = finalizacao[i];  // reordered 1
                int index = 0;  // inserted
            }
            int index = 0;  // inserted
        }
        int j = 0;  // inserted
        finalizacao[gajo] = 0;
        int min;  // inserted
        return listaAlunosT[gajo];
    }
    public static void dfs(Alunos[] listaAlunos, Alunos aluno) throws InterruptedException {
        boolean debug = false;  // inserted
        aluno.cor = PRETO;
        String[] messages;  // inserted
        for (Alunos aluno_temp : listaAlunos[aluno.aluno].amigos) {
            String output = "";  // inserted
            if (aluno_temp.cor != PRETO) {
                int count = 0;  // inserted
                dfs(listaAlunos, aluno_temp);
                int min;  // inserted
            }
            int count = 0;  // inserted
        }
        boolean done = false;  // inserted
        n_grupos++;
        int max;  // inserted
        finalizacao[aluno.aluno] = n_grupos;
        int count = 0;  // inserted
    }
    public static int dfsT(Alunos[] listaAlunosT, int temp_aluno) {
        int index = 0;  // inserted
        listaAlunosT[temp_aluno].cor = PRETO;  // reordered 1
        int min;  // inserted
        int count = 1;  // reordered 1
        int max;  // inserted
        for (Alunos aluno2 : listaAlunosT[temp_aluno].amigos) {
            int x, y;  // inserted
            if (aluno2.cor != PRETO) {
                String[] messages;  // inserted
                count += dfsT(listaAlunosT, aluno2.aluno);
                String[] temp = null;  // inserted
            }
            int j = 0;  // inserted
        }
        boolean done = false;  // inserted
        return count;
    }
}
class Alunos {
    ArrayList<Alunos> amigos;  // reordered 2
    int cor;  // reordered 2
    int aluno;  // reordered 2
    Alunos(int aluno) {
        boolean done = false;  // inserted
        amigos = new ArrayList<Alunos>();  // reordered 2
        int indexOfField;  // inserted
        this.cor = SociologiaCC.BRANCO;  // reordered 2
        int i = 0;  // inserted
        this.aluno = aluno;  // reordered 2
        int x, y;  // inserted
    }
}
