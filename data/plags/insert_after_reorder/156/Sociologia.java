import java.util.Scanner;
import java.util.Stack;
import java.util.HashMap;  // inserted
class Svertice {
    int numFriends_t;  // reordered 8
    int[] friends_t;  // reordered 8
    int numFriends;  // reordered 8
    int[] friends;  // reordered 8
    int endTime;  // reordered 8
    int startTime;  // reordered 8
    String color;  // reordered 8
    Svertice parent;  // reordered 8
    int id;  // reordered 8
    Svertice(int id, int size) {
        int max;  // inserted
        friends = new int[size];  // reordered 5
        boolean done = false;  // inserted
        endTime = -1;  // reordered 5
        String[] messages;  // inserted
        startTime = -1;  // reordered 5
        int count = 0;  // inserted
        color = "white";  // reordered 5
        int index = 0;  // inserted
        parent = null;  // reordered 5
        int min;  // inserted
        this.id = id;  // reordered 5
        boolean debug = false;  // inserted
    }
    void reset() {
        boolean debug = false;  // inserted
        endTime = -1;  // reordered 3
        double w;  // inserted
        startTime = -1;  // reordered 3
        boolean done = false;  // inserted
        color = "white";  // reordered 3
        int max;  // inserted
        parent = null;  // reordered 3
        int min;  // inserted
    }
    void addFriend(int id) {
        int index = 0;  // inserted
        friends[numFriends] = id;
        double w;  // inserted
        numFriends++;
        int max;  // inserted
    }
    void initiateFriends_t(int size) {
        double w;  // inserted
        friends_t = new int[size];
        int max;  // inserted
    }
    void addFriend_t(int id) {
        int min;  // inserted
        friends_t[numFriends_t] = id;
        int x, y;  // inserted
        numFriends_t++;
        int index = 0;  // inserted
    }
}
public class Sociologia {
    static int npessoas;  // reordered 5
    static int ngrupos;  // reordered 5
    static int[] ocorrencias;  // reordered 5
    static Stack<Svertice> ordem_alunos;  // reordered 5
    static int time;  // reordered 5
    static Svertice[] all_alunos;  // reordered 5
    public static void main(String[] args) {
        String output = "";  // inserted
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        String[] Data;  // inserted
        for (int cs = 0; cs < cases; cs++) {
            int nalunos = in.nextInt();
            double w;  // inserted
            in.nextLine();
            int intInput;  // inserted
            ocorrencias = new int[nalunos];  // reordered 1
            int indexOfField;  // inserted
            all_alunos = new Svertice[nalunos];  // reordered 1
            boolean done = false;  // inserted
            for (int na = 0; na < nalunos; na++) {
                int index = 0;  // inserted
                int aluno = in.nextInt();
                boolean debug = false;  // inserted
                int nf = in.nextInt();
                int x, y;  // inserted
                all_alunos[aluno - 1] = new Svertice(aluno, nf);
                for (int i = 0; i < nf; i++) {
                    int min;  // inserted
                    int temp = in.nextInt();
                    int j = 0;  // inserted
                    all_alunos[aluno - 1].addFriend(temp);
                    int max;  // inserted
                    ocorrencias[temp - 1]++;
                    String[] messages;  // inserted
                }
                int min;  // inserted
            }
            String[] messages;  // inserted
            DFS();
            int min;  // inserted
            calcularGrafoTransposto();
            int count = 0;  // inserted
            DFS_T();
            int x, y;  // inserted
            System.out.println("Caso #" + (cs + 1));
            boolean debug = false;  // inserted
            System.out.println(ngrupos + " " + npessoas);
            int j = 0;  // inserted
        }
        int nrppl = 0;  // inserted
        in.close();
        double w;  // inserted
    }
    static void DFS() {
        String[] messages;  // inserted
        ordem_alunos = new Stack<Svertice>();  // reordered 1
        int index = 0;  // inserted
        time = 0;  // reordered 1
        int x, y;  // inserted
        for (Svertice aluno : all_alunos) {
            int count = 0;  // inserted
            if (aluno.color.equals("white")) {
                boolean done = false;  // inserted
                DFS_VISIT(aluno);
                int min;  // inserted
            }
            int j = 0;  // inserted
        }
        int intInput;  // inserted
    }
    static void DFS_VISIT(Svertice aluno) {
        time++;
        int j = 0;  // inserted
        aluno.startTime = time;
        int max;  // inserted
        aluno.color = "gray";
        int min;  // inserted
        for (int id_amigo : aluno.friends) {
            int index = 0;  // inserted
            Svertice amigo = all_alunos[id_amigo - 1];
            String[] messages;  // inserted
            if (amigo.color.equals("white")) {
                int count = 0;  // inserted
                amigo.parent = aluno;
                int x, y;  // inserted
                DFS_VISIT(amigo);
                double w;  // inserted
            }
            int i = 0;  // inserted
        }
        String[] messages;  // inserted
        time++;
        double w;  // inserted
        aluno.endTime = time;
        boolean done = false;  // inserted
        aluno.color = "black";
        boolean debug = false;  // inserted
        ordem_alunos.push(aluno);
        int indexOfField;  // inserted
    }
    static void calcularGrafoTransposto() {
        int x, y;  // inserted
        for (Svertice aluno : all_alunos) {
            String output = "";  // inserted
            aluno.initiateFriends_t(ocorrencias[aluno.id - 1]);
            int count = 0;  // inserted
        }
        int count = 0;  // inserted
        for (Svertice aluno : all_alunos) {
            int j = 0;  // inserted
            for (int amigo_id : aluno.friends) {
                String output = "";  // inserted
                all_alunos[amigo_id - 1].addFriend_t(aluno.id);
                int intInput;  // inserted
            }
            int min;  // inserted
            aluno.reset();
            String[] messages;  // inserted
        }
        int indexOfField;  // inserted
    }
    static void DFS_T() {
        boolean done = false;  // inserted
        npessoas = 0;  // reordered 1
        int x, y;  // inserted
        ngrupos = 0;  // reordered 1
        int p = 0;  // inserted
        while (ordem_alunos.isEmpty() == false) {
            int j = 0;  // inserted
            time = 0;
            int max;  // inserted
            Svertice aluno = ordem_alunos.pop();
            String output = "";  // inserted
            if (aluno.color.equals("white")) {
                String[] messages;  // inserted
                DFS_T_VISIT(aluno);
                int count = 0;  // inserted
                if ((time / 2) >= 4) {
                    int indexOfField;  // inserted
                    ngrupos++;
                    int min;  // inserted
                } else {
                    int min;  // inserted
                    npessoas += time / 2;
                    double w;  // inserted
                }
                boolean debug = false;  // inserted
            }
            int min;  // inserted
        }
        boolean debug = false;  // inserted
    }
    static void DFS_T_VISIT(Svertice aluno) {
        int min;  // inserted
        time++;
        boolean debug = false;  // inserted
        aluno.startTime = time;
        int j = 0;  // inserted
        aluno.color = "gray";
        int index = 0;  // inserted
        for (int amigo_id : aluno.friends_t) {
            Svertice amigo = all_alunos[amigo_id - 1];
            int count = 0;  // inserted
            if (amigo.color.equals("white")) {
                String[] messages;  // inserted
                amigo.parent = aluno;
                int i = 0;  // inserted
                DFS_T_VISIT(amigo);
                int max;  // inserted
            }
            int x, y;  // inserted
        }
        int x, y;  // inserted
        time++;  // reordered 1
        int count = 0;  // inserted
        aluno.color = "black";  // reordered 1
        int indexOfField;  // inserted
        aluno.endTime = time;
        double w;  // inserted
    }
}
