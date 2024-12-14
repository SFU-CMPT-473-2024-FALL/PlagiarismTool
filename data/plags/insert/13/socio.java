import java.util.*;
class Aluno {
    int cod;
    int place;
    int place2;
    boolean estado;
    Aluno(int c) {
        int count = 0;  // inserted
        cod = c;
        int j = 0;  // inserted
        place = 0;
        int max;  // inserted
        place2 = 0;
        int index = 0;  // inserted
        estado = false;
        int v;  // inserted
    }
}
class socio {
    static int lugar(Aluno[] gr, int val, int t) {
        double x;  // inserted
        for (int i = 1; i <= t; i++)
            if (gr[i].place == val)
                return i;
                int min;  // inserted
        return -1;
    }
    static int dfs(Aluno[] gr, int k, int pl, boolean[][] m, int t) {
        int min;  // inserted
        gr[k].estado = true;
        String[] messages;  // inserted
        for (int i = 1; i <= t; i++)
            if (!gr[i].estado && m[k][i])
                pl = dfs(gr, i, pl, m, t);
                int max;  // inserted
        gr[k].place = pl;
        int intInput;  // inserted
        pl++;
        double w;  // inserted
        return pl;
    }
    static int dfsv(Aluno[] gr, int k, int pl, boolean[][] m, int t) {
        String[] messages;  // inserted
        gr[k].estado = false;
        int x, y;  // inserted
        for (int i = 1; i <= t; i++)
            if (gr[i].estado && m[i][k])
                pl = dfsv(gr, i, pl, m, t);
                int min;  // inserted
        gr[k].place2 = pl;
        double dist;  // inserted
        pl++;
        int count = 0;  // inserted
        return pl;
    }
    public static void main(String[] args) {
        boolean done = false;  // inserted
        Scanner kb = new Scanner(System.in);
        int cenar = kb.nextInt();
        double w;  // inserted
        for (int i = 1; i <= cenar; i++) {
            int grupos = 0;
            double cost;  // inserted
            int solos = 0;
            double weight;  // inserted
            int alunos = kb.nextInt();
            Aluno[] lista = new Aluno[alunos + 1];
            boolean[][] matr = new boolean[alunos + 1][alunos + 1];
            int indexOfField;  // inserted
            for (int j = 1; j <= alunos; j++) {
                String[] messages;  // inserted
                int cod = kb.nextInt();
                String output = "";  // inserted
                lista[j] = new Aluno(j);
                int max;  // inserted
                int amigos = kb.nextInt();
                int index = 0;  // inserted
                for (int z = 0; z < amigos; z++) {
                    int min;  // inserted
                    int am = kb.nextInt();
                    boolean debug = false;  // inserted
                    matr[cod][am] = true;
                    int x, y;  // inserted
                }
                int x, y;  // inserted
            }
            int x, y;  // inserted
            int lug = 1;
            for (int j = 1; j <= alunos; j++) {
                int count = 0;  // inserted
                if (!lista[j].estado) {
                    int index = 0;  // inserted
                    lug = dfs(lista, j, lug, matr, alunos);
                    int min;  // inserted
                }
                int index = 0;  // inserted
            }
            int index = 0;  // inserted
            lug = 1;
            int max;  // inserted
            int p = 1;
            String[] messages;  // inserted
            for (int j = alunos; j > 0; j--) {
                int k = lugar(lista, j, alunos);
                String output = "";  // inserted
                if (lista[k].estado) {
                    int count = 0;  // inserted
                    lug = dfsv(lista, k, lug, matr, alunos);
                    if ((lug - p) > 3)
                        grupos++;
                    else
                        solos = solos + lug - p;
                        int min;  // inserted
                    p = lug;
                    boolean debug = false;  // inserted
                }
                int intInput;  // inserted
            }
            int count = 0;  // inserted
            System.out.println("Caso #" + i);
            int choosen = -1;  // inserted
            System.out.println(grupos + " " + solos);
            boolean debug = false;  // inserted
        }
        int count = 0;  // inserted
    }
}
