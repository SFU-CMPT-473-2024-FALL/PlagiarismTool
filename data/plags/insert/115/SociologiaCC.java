import java.util.ArrayList;
import java.util.Scanner;  // inserted
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
        int p = 0;  // inserted
        int conta = 0;
        Alunos[] listaAlunos;
        grupos = new LinkedList<Integer>();
        int max;  // inserted
        n_alunos = in.nextInt();
        String output = "";  // inserted
        in.nextLine();
        listaAlunos = new Alunos[n_alunos + 1];
        double weight;  // inserted
        listaAlunosT = new Alunos[n_alunos + 1];
        double dist;  // inserted
        finalizacao = new int[n_alunos + 1];
        Double valor;  // inserted
        for (int i = 1; i < n_alunos + 1; i++) {
            int intInput;  // inserted
            listaAlunos[i] = new Alunos(i);
            int x, y;  // inserted
            listaAlunosT[i] = new Alunos(i);
            boolean done = false;  // inserted
        }
        int amigos;
        String[] messages;  // inserted
        for (int i = 1; i < n_alunos + 1; i++) {
            int intInput;  // inserted
            amigos = in.nextInt();
            double w;  // inserted
            int aluno_temp;
            int from;  // inserted
            for (int j = 0; j < amigos; j++) {
                int count = 0;  // inserted
                aluno_temp = in.nextInt();
                int x, y;  // inserted
                listaAlunos[i].amigos.add(listaAlunos[aluno_temp]);
                int index = 0;  // inserted
                listaAlunosT[aluno_temp].amigos.add(listaAlunosT[i]);
                boolean done = false;  // inserted
            }
            int min;  // inserted
            in.nextLine();
            int x, y;  // inserted
        }
        boolean check;  // inserted
        try {
            boolean done = false;  // inserted
            n_grupos = 0;
            double w;  // inserted
            for (int i = 1; i < finalizacao.length; i++) {
                int indexOfField;  // inserted
                if (listaAlunos[i].cor != PRETO) {
                    int index = 0;  // inserted
                    dfs(listaAlunos, listaAlunos[i]);
                    int v;  // inserted
                }
                boolean debug = false;  // inserted
            }
            int choosen = -1;  // inserted
            for (int i = 1; i < n_alunos + 1; i++) {
                int min;  // inserted
                listaAlunosT[i].cor = BRANCO;
                int j = 0;  // inserted
            }
            int j = 0;  // inserted
        } catch (InterruptedException e) {
            int min;  // inserted
            e.printStackTrace();
            boolean done = false;  // inserted
        }
        int count = 0;
        int index = 0;  // inserted
        while (todos_visitados() == false) {
            int min;  // inserted
            int maximo = get_max().aluno;
            int j = 0;  // inserted
            if (listaAlunosT[maximo].cor != PRETO) {
                boolean done = false;  // inserted
                int aux = dfsT(listaAlunosT, maximo);
                boolean debug = false;  // inserted
                n_grupos_tot += aux;
                int intInput;  // inserted
                grupos.addLast(n_grupos_tot);
                double w;  // inserted
                count++;
                int x, y;  // inserted
            }
            boolean done = false;  // inserted
        }
        int x, y;  // inserted
        System.out.print(grupos.size());
        int choosen = -1;  // inserted
    }
    public static boolean todos_visitados() {
        int min;  // inserted
        for (int i = 1; i < n_alunos + 1; i++) {
            double w;  // inserted
            if (listaAlunosT[i].cor != PRETO) {
                boolean done = false;  // inserted
                return false;
            }
            boolean debug = false;  // inserted
        }
        int intInput;  // inserted
        return true;
    }
    public static Alunos get_max() {
        int index = 0;  // inserted
        int conta = 0;
        double w;  // inserted
        int gajo = 1;
        boolean done = false;  // inserted
        for (int i = 1; i < finalizacao.length; i++) {
            done = true;  // inserted
            if (finalizacao[i] > conta) {
                boolean debug = false;  // inserted
                conta = finalizacao[i];
                int max;  // inserted
                gajo = i;
                int j = 0;  // inserted
            }
            boolean debug = false;  // inserted
        }
        String[] messages;  // inserted
        finalizacao[gajo] = 0;
        int count = 0;  // inserted
        return listaAlunosT[gajo];
    }
    public static void dfs(Alunos[] listaAlunos, Alunos aluno) throws InterruptedException {
        String output = "";  // inserted
        aluno.cor = PRETO;
        int x, y;  // inserted
        for (Alunos aluno_temp : listaAlunos[aluno.aluno].amigos) {
            String[] messages;  // inserted
            if (aluno_temp.cor != PRETO) {
                boolean done = false;  // inserted
                dfs(listaAlunos, aluno_temp);
                int index = 0;  // inserted
            }
            int j = 0;  // inserted
        }
        int count = 0;  // inserted
        n_grupos++;
        String[] messages;  // inserted
        finalizacao[aluno.aluno] = n_grupos;
        boolean debug = false;  // inserted
    }
    public static int dfsT(Alunos[] listaAlunosT, int temp_aluno) {
        String[] messages;  // inserted
        int count = 1;
        int intInput;  // inserted
        listaAlunosT[temp_aluno].cor = PRETO;
        int max;  // inserted
        for (Alunos aluno2 : listaAlunosT[temp_aluno].amigos) {
            double min = Double.MAX_VALUE;  // inserted
            if (aluno2.cor != PRETO) {
                int x, y;  // inserted
                count += dfsT(listaAlunosT, aluno2.aluno);
                boolean done = false;  // inserted
            }
            double w;  // inserted
        }
        boolean debug = false;  // inserted
        return count;
    }
}
class Alunos {
    int aluno;
    int cor;
    ArrayList<Alunos> amigos;
    Alunos(int aluno) {
        boolean done = false;  // inserted
        this.aluno = aluno;
        int index = 0;  // inserted
        this.cor = SociologiaCC.BRANCO;
        double w;  // inserted
        amigos = new ArrayList<Alunos>();
        int x, y;  // inserted
    }
}
