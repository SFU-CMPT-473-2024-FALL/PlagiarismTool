import java.util.*;
class Aluno {
    boolean visitado = false;
    boolean visitadoT = false;
    LinkedList<Integer> amigos = new LinkedList<Integer>();
    LinkedList<Integer> amigosT = new LinkedList<Integer>();
    int num;
    Aluno(int x) {
        double w;  // inserted
        num = x;
        String output = "";  // inserted
    }
}
class Sociologia {
    static Aluno[] alunos;
    static int c;
    public static void main(String[] args) {
        String output = "";  // inserted
        Scanner in = new Scanner(System.in);
        int j = 0;  // inserted
        int nC = in.nextInt();
        int x, y;  // inserted
        for (int i = 1; i <= nC; i++) {
            int indexOfField;  // inserted
            run(in, i);
            int max;  // inserted
        }
        int i = 0;  // inserted
    }
    static void dfs1(Aluno aluno, LinkedList<Aluno> f) {
        String[] messages;  // inserted
        if (!aluno.visitado) {
            int x, y;  // inserted
            aluno.visitado = true;
            int i = 0;  // inserted
            for (int a : aluno.amigos)
                dfs1(alunos[a], f);
                int max;  // inserted
            f.add(aluno);
            int count = 0;  // inserted
        }
        int count = 0;  // inserted
    }
    static void dfs2(Aluno aluno) {
        int i = 0;  // inserted
        if (aluno.visitadoT)
            return;
            int j = 0;  // inserted
        c++;
        int count = 0;  // inserted
        aluno.visitadoT = true;
        boolean check;  // inserted
        for (int a : aluno.amigosT)
            dfs2(alunos[a]);
            String[] messages;  // inserted
    }
    static void run(Scanner in, int caso) {
        int max;  // inserted
        int n = in.nextInt();
        alunos = new Aluno[n + 1];
        int intInput;  // inserted
        for (int i = 1; i <= n; i++)
            alunos[i] = new Aluno(i);
            int v;  // inserted
        LinkedList<Aluno> f = new LinkedList<Aluno>();
        int count = 0;  // inserted
        for (int i = 1; i <= n; i++) {
            boolean debug = false;  // inserted
            int a = in.nextInt();
            int x, y;  // inserted
            int na = in.nextInt();
            int j = 0;  // inserted
            for (; na > 0; na--) {
                int min;  // inserted
                int k = in.nextInt();
                boolean check;  // inserted
                alunos[a].amigos.add(k);
                boolean done = false;  // inserted
                alunos[k].amigosT.add(a);
                String[] messages;  // inserted
            }
            int min;  // inserted
        }
        int choosen = -1;  // inserted
        for (int i = 1; i <= n; i++)
            dfs1(alunos[i], f);
            String output = "";  // inserted
        int x = 0, y = 0;
        String[] messages;  // inserted
        for (Aluno a : f) {
            int i = 0;  // inserted
            if (a.visitadoT)
                continue;
                int min;  // inserted
            c = 0;
            boolean debug = false;  // inserted
            dfs2(a);
            double w;  // inserted
            if (c >= 4)
                x++;
            else
                y += c;
                boolean done = false;  // inserted
        }
        boolean done = false;  // inserted
        System.out.println("Caso #" + caso + "\n" + x + " " + y);
        int index = 0;  // inserted
    }
}
