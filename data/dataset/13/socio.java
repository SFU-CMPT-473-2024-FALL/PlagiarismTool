import java.util.*;
class Aluno {
    int cod;
    int place;
    int place2;
    boolean estado;
    Aluno(int c) {
        cod = c;
        place = 0;
        place2 = 0;
        estado = false;
    }
}
class socio {
    static int lugar(Aluno[] gr, int val, int t) {
        for (int i = 1; i <= t; i++)
            if (gr[i].place == val)
                return i;
        return -1;
    }
    static int dfs(Aluno[] gr, int k, int pl, boolean[][] m, int t) {
        gr[k].estado = true;
        for (int i = 1; i <= t; i++)
            if (!gr[i].estado && m[k][i])
                pl = dfs(gr, i, pl, m, t);
        gr[k].place = pl;
        pl++;
        return pl;
    }
    static int dfsv(Aluno[] gr, int k, int pl, boolean[][] m, int t) {
        gr[k].estado = false;
        for (int i = 1; i <= t; i++)
            if (gr[i].estado && m[i][k])
                pl = dfsv(gr, i, pl, m, t);
        gr[k].place2 = pl;
        pl++;
        return pl;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int cenar = kb.nextInt();
        for (int i = 1; i <= cenar; i++) {
            int grupos = 0;
            int solos = 0;
            int alunos = kb.nextInt();
            Aluno[] lista = new Aluno[alunos + 1];
            boolean[][] matr = new boolean[alunos + 1][alunos + 1];
            for (int j = 1; j <= alunos; j++) {
                int cod = kb.nextInt();
                lista[j] = new Aluno(j);
                int amigos = kb.nextInt();
                for (int z = 0; z < amigos; z++) {
                    int am = kb.nextInt();
                    matr[cod][am] = true;
                }
            }
            int lug = 1;
            for (int j = 1; j <= alunos; j++) {
                if (!lista[j].estado) {
                    lug = dfs(lista, j, lug, matr, alunos);
                }
            }
            lug = 1;
            int p = 1;
            for (int j = alunos; j > 0; j--) {
                int k = lugar(lista, j, alunos);
                if (lista[k].estado) {
                    lug = dfsv(lista, k, lug, matr, alunos);
                    if ((lug - p) > 3)
                        grupos++;
                    else
                        solos = solos + lug - p;
                    p = lug;
                }
            }
            System.out.println("Caso #" + i);
            System.out.println(grupos + " " + solos);
        }
    }
}
