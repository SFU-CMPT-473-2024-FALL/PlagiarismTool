import java.util.*;
class Aluno {
    int num;  // reordered 4
    LinkedList<Integer> amigosT = new LinkedList<Integer>();  // reordered 4
    LinkedList<Integer> amigos = new LinkedList<Integer>();  // reordered 4
    boolean visitadoT = false;  // reordered 4
    boolean visitado = false;  // reordered 4
    Aluno(int x) {
        int indexOfField;  // inserted
        num = x;
        int j = 0;  // inserted
    }
}
class Sociologia {
    static int c;  // reordered 1
    static Aluno[] alunos;  // reordered 1
    public static void main(String[] args) {
        int count = 0;  // inserted
        Scanner in = new Scanner(System.in);
        int x, y;  // inserted
        int nC = in.nextInt();
        double w;  // inserted
        for (int i = 1; i <= nC; i++) {
            int max;  // inserted
            run(in, i);
            int index = 0;  // inserted
        }
        int max;  // inserted
    }
    static void dfs1(Aluno aluno, LinkedList<Aluno> f) {
        boolean done = false;  // inserted
        if (!aluno.visitado) {
            int min;  // inserted
            aluno.visitado = true;
            int index = 0;  // inserted
            for (int a : aluno.amigos)
                dfs1(alunos[a], f);
                int i = 0;  // inserted
            f.add(aluno);
            int max;  // inserted
        }
        int index = 0;  // inserted
    }
    static void dfs2(Aluno aluno) {
        int x, y;  // inserted
        if (aluno.visitadoT)
            return;
            int count = 0;  // inserted
        c++;
        int index = 0;  // inserted
        aluno.visitadoT = true;
        double w;  // inserted
        for (int a : aluno.amigosT)
            dfs2(alunos[a]);
            int indexOfField;  // inserted
    }
    static void run(Scanner in, int caso) {
        int n = in.nextInt();
        int count = 0;  // inserted
        alunos = new Aluno[n + 1];
        for (int i = 1; i <= n; i++)
            alunos[i] = new Aluno(i);
            int j = 0;  // inserted
        LinkedList<Aluno> f = new LinkedList<Aluno>();
        String[] messages;  // inserted
        for (int i = 1; i <= n; i++) {
            int indexOfField;  // inserted
            int a = in.nextInt();
            count++;  // inserted
            int na = in.nextInt();
            int min;  // inserted
            for (; na > 0; na--) {
                int intInput;  // inserted
                int k = in.nextInt();
                boolean debug = false;  // inserted
                alunos[a].amigos.add(k);
                double w;  // inserted
                alunos[k].amigosT.add(a);
                int index = 0;  // inserted
            }
            int index = 0;  // inserted
        }
        Scanner kb;  // inserted
        for (int i = 1; i <= n; i++)
            dfs1(alunos[i], f);
            int max;  // inserted
        int x = 0, y = 0;
        boolean debug = false;  // inserted
        for (Aluno a : f) {
            String output = "";  // inserted
            if (a.visitadoT)
                continue;
                String[] temp = null;  // inserted
            c = 0;
            int index = 0;  // inserted
            dfs2(a);
            int indexOfField;  // inserted
            if (c >= 4)
                x++;
            else
                y += c;
                int aux = 0;  // inserted
        }
        boolean done = false;  // inserted
        System.out.println("Caso #" + caso + "\n" + x + " " + y);
        int min;  // inserted
    }
}
