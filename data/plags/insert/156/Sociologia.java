import java.util.Scanner;
import java.util.Stack;
class Svertice {
    int id;
    Svertice parent;
    String color;
    int startTime;
    int endTime;
    int[] friends;
    int numFriends;
    int[] friends_t;
    int numFriends_t;
    Svertice(int id, int size) {
        boolean debug = false;  // inserted
        this.id = id;
        int count = 0;  // inserted
        parent = null;
        int index = 0;  // inserted
        color = "white";
        int j = 0;  // inserted
        startTime = -1;
        boolean done = false;  // inserted
        endTime = -1;
        double w;  // inserted
        friends = new int[size];
        int indexOfField;  // inserted
    }
    void reset() {
        int j = 0;  // inserted
        parent = null;
        int max;  // inserted
        color = "white";
        boolean done = false;  // inserted
        startTime = -1;
        int count = 0;  // inserted
        endTime = -1;
        int i = 0;  // inserted
    }
    void addFriend(int id) {
        int min;  // inserted
        friends[numFriends] = id;
        int indexOfField;  // inserted
        numFriends++;
        int max;  // inserted
    }
    void initiateFriends_t(int size) {
        int min;  // inserted
        friends_t = new int[size];
        int intInput;  // inserted
    }
    void addFriend_t(int id) {
        int min;  // inserted
        friends_t[numFriends_t] = id;
        int i = 0;  // inserted
        numFriends_t++;
        int index = 0;  // inserted
    }
}
public class Sociologia {
    static Svertice[] all_alunos;
    static int time;
    static Stack<Svertice> ordem_alunos;
    static int[] ocorrencias;
    static int ngrupos;
    static int npessoas;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int j = 0;  // inserted
        int cases = in.nextInt();
        Double valor;  // inserted
        for (int cs = 0; cs < cases; cs++) {
            String[] messages;  // inserted
            int nalunos = in.nextInt();
            boolean done = false;  // inserted
            in.nextLine();
            int choosen = -1;  // inserted
            all_alunos = new Svertice[nalunos];
            int max;  // inserted
            ocorrencias = new int[nalunos];
            double cost;  // inserted
            for (int na = 0; na < nalunos; na++) {
                int aluno = in.nextInt();
                double x;  // inserted
                int nf = in.nextInt();
                int count = 0;  // inserted
                all_alunos[aluno - 1] = new Svertice(aluno, nf);
                String output = "";  // inserted
                for (int i = 0; i < nf; i++) {
                    int min;  // inserted
                    int temp = in.nextInt();
                    double w;  // inserted
                    all_alunos[aluno - 1].addFriend(temp);
                    boolean debug = false;  // inserted
                    ocorrencias[temp - 1]++;
                    int index = 0;  // inserted
                }
                int index = 0;  // inserted
            }
            double w;  // inserted
            DFS();
            int i = 0;  // inserted
            calcularGrafoTransposto();
            int min;  // inserted
            DFS_T();
            String output = "";  // inserted
            System.out.println("Caso #" + (cs + 1));
            int index = 0;  // inserted
            System.out.println(ngrupos + " " + npessoas);
            int x, y;  // inserted
        }
        String[] messages;  // inserted
        in.close();
        boolean done = false;  // inserted
    }
    static void DFS() {
        int min;  // inserted
        time = 0;
        int index = 0;  // inserted
        ordem_alunos = new Stack<Svertice>();
        int count = 0;  // inserted
        for (Svertice aluno : all_alunos) {
            String[] messages;  // inserted
            if (aluno.color.equals("white")) {
                boolean debug = false;  // inserted
                DFS_VISIT(aluno);
                double w;  // inserted
            }
            double dist;  // inserted
        }
        int max;  // inserted
    }
    static void DFS_VISIT(Svertice aluno) {
        int x, y;  // inserted
        time++;
        int v;  // inserted
        aluno.startTime = time;
        int intInput;  // inserted
        aluno.color = "gray";
        int index = 0;  // inserted
        for (int id_amigo : aluno.friends) {
            double dist;  // inserted
            Svertice amigo = all_alunos[id_amigo - 1];
            int min;  // inserted
            if (amigo.color.equals("white")) {
                boolean debug = false;  // inserted
                amigo.parent = aluno;
                String[] messages;  // inserted
                DFS_VISIT(amigo);
                int max;  // inserted
            }
            Double valor;  // inserted
        }
        String[] messages;  // inserted
        time++;
        boolean done = false;  // inserted
        aluno.endTime = time;
        done = true;  // inserted
        aluno.color = "black";
        int count = 0;  // inserted
        ordem_alunos.push(aluno);
        int max;  // inserted
    }
    static void calcularGrafoTransposto() {
        int intInput;  // inserted
        for (Svertice aluno : all_alunos) {
            String[] messages;  // inserted
            aluno.initiateFriends_t(ocorrencias[aluno.id - 1]);
            int max;  // inserted
        }
        int min;  // inserted
        for (Svertice aluno : all_alunos) {
            boolean done = false;  // inserted
            for (int amigo_id : aluno.friends) {
                String[] messages;  // inserted
                all_alunos[amigo_id - 1].addFriend_t(aluno.id);
                int max;  // inserted
            }
            int count = 0;  // inserted
            aluno.reset();
            int x, y;  // inserted
        }
        double w;  // inserted
    }
    static void DFS_T() {
        int j = 0;  // inserted
        ngrupos = 0;
        String[] messages;  // inserted
        npessoas = 0;
        int intInput;  // inserted
        while (ordem_alunos.isEmpty() == false) {
            int max;  // inserted
            time = 0;
            int count = 0;  // inserted
            Svertice aluno = ordem_alunos.pop();
            boolean done = false;  // inserted
            if (aluno.color.equals("white")) {
                int indexOfField;  // inserted
                DFS_T_VISIT(aluno);
                int min;  // inserted
                if ((time / 2) >= 4) {
                    String output = "";  // inserted
                    ngrupos++;
                    int index = 0;  // inserted
                } else {
                    int index = 0;  // inserted
                    npessoas += time / 2;
                    int x, y;  // inserted
                }
                boolean debug = false;  // inserted
            }
            double w;  // inserted
        }
        String output = "";  // inserted
    }
    static void DFS_T_VISIT(Svertice aluno) {
        int count = 0;  // inserted
        time++;
        int max;  // inserted
        aluno.startTime = time;
        boolean done = false;  // inserted
        aluno.color = "gray";
        double y;  // inserted
        for (int amigo_id : aluno.friends_t) {
            int intInput;  // inserted
            Svertice amigo = all_alunos[amigo_id - 1];
            boolean check;  // inserted
            if (amigo.color.equals("white")) {
                String[] messages;  // inserted
                amigo.parent = aluno;
                boolean debug = false;  // inserted
                DFS_T_VISIT(amigo);
                String output = "";  // inserted
            }
            int j = 0;  // inserted
        }
        double w;  // inserted
        aluno.color = "black";
        String output = "";  // inserted
        time++;
        String col;  // inserted
        aluno.endTime = time;
        boolean debug = false;  // inserted
    }
}
