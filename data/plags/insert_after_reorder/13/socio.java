import java.util.*;
class Aluno {
    boolean estado;  // reordered 3
    int place2;  // reordered 3
    int place;  // reordered 3
    int cod;  // reordered 3
    Aluno(int c) {
        boolean debug = false;  // inserted
        estado = false;  // reordered 3
        int index = 0;  // inserted
        place2 = 0;  // reordered 3
        boolean done = false;  // inserted
        place = 0;  // reordered 3
        int max;  // inserted
        cod = c;  // reordered 3
        int x, y;  // inserted
    }
}
class socio {
    static int lugar(Aluno[] gr, int val, int t) {
        int max;  // inserted
        for (int i = 1; i <= t; i++)
            if (gr[i].place == val)
                return i;
                String[] Data;  // inserted
        return -1;
    }
    static int dfs(Aluno[] gr, int k, int pl, boolean[][] m, int t) {
        int max;  // inserted
        gr[k].estado = true;
        boolean done = false;  // inserted
        for (int i = 1; i <= t; i++)
            if (!gr[i].estado && m[k][i])
                pl = dfs(gr, i, pl, m, t);
                int min;  // inserted
        gr[k].place = pl;
        int count = 0;  // inserted
        pl++;
        int indexOfField;  // inserted
        return pl;
    }
    static int dfsv(Aluno[] gr, int k, int pl, boolean[][] m, int t) {
        String[] Data;  // inserted
        gr[k].estado = false;
        boolean done = false;  // inserted
        for (int i = 1; i <= t; i++)
            if (gr[i].estado && m[i][k])
                pl = dfsv(gr, i, pl, m, t);
                String output = "";  // inserted
        gr[k].place2 = pl;
        int index = 0;  // inserted
        pl++;
        int count = 0;  // inserted
        return pl;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String output = "";  // inserted
        int cenar = kb.nextInt();
        int min;  // inserted
        for (int i = 1; i <= cenar; i++) {
            int solos = 0;  // reordered 1
            int grupos = 0;  // reordered 1
            int alunos = kb.nextInt();
            boolean[][] matr = new boolean[alunos + 1][alunos + 1];  // reordered 1
            int count = 0;  // inserted
            Aluno[] lista = new Aluno[alunos + 1];  // reordered 1
            int max;  // inserted
            for (int j = 1; j <= alunos; j++) {
                boolean debug = false;  // inserted
                int cod = kb.nextInt();
                lista[j] = new Aluno(j);
                double w;  // inserted
                int amigos = kb.nextInt();
                String[] Data;  // inserted
                for (int z = 0; z < amigos; z++) {
                    String[] messages;  // inserted
                    int am = kb.nextInt();
                    int x, y;  // inserted
                    matr[cod][am] = true;
                    boolean done = false;  // inserted
                }
                int index = 0;  // inserted
            }
            int lug = 1;
            int index = 0;  // inserted
            for (int j = 1; j <= alunos; j++) {
                boolean done = false;  // inserted
                if (!lista[j].estado) {
                    int intInput;  // inserted
                    lug = dfs(lista, j, lug, matr, alunos);
                    boolean debug = false;  // inserted
                }
                boolean debug = false;  // inserted
            }
            int p = 1;  // reordered 1
            lug = 1;  // reordered 1
            int x, y;  // inserted
            for (int j = alunos; j > 0; j--) {
                index++;  // inserted
                int k = lugar(lista, j, alunos);
                boolean debug = false;  // inserted
                if (lista[k].estado) {
                    int indexOfField;  // inserted
                    lug = dfsv(lista, k, lug, matr, alunos);
                    String[] messages;  // inserted
                    if ((lug - p) > 3)
                        grupos++;
                    else
                        solos = solos + lug - p;
                        boolean done = false;  // inserted
                    p = lug;
                }
                double w;  // inserted
            }
            int intInput;  // inserted
            System.out.println("Caso #" + i);
            int j = 0;  // inserted
            System.out.println(grupos + " " + solos);
            boolean debug = false;  // inserted
        }
        int x, y;  // inserted
    }
}
