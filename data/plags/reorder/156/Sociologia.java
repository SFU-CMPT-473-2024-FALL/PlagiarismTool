import java.util.Scanner;
import java.util.Stack;
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
        friends = new int[size];  // reordered 5
        endTime = -1;  // reordered 5
        startTime = -1;  // reordered 5
        color = "white";  // reordered 5
        parent = null;  // reordered 5
        this.id = id;  // reordered 5
    }
    void reset() {
        endTime = -1;  // reordered 3
        startTime = -1;  // reordered 3
        color = "white";  // reordered 3
        parent = null;  // reordered 3
    }
    void addFriend(int id) {
        friends[numFriends] = id;
        numFriends++;
    }
    void initiateFriends_t(int size) {
        friends_t = new int[size];
    }
    void addFriend_t(int id) {
        friends_t[numFriends_t] = id;
        numFriends_t++;
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
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        for (int cs = 0; cs < cases; cs++) {
            int nalunos = in.nextInt();
            in.nextLine();
            ocorrencias = new int[nalunos];  // reordered 1
            all_alunos = new Svertice[nalunos];  // reordered 1
            for (int na = 0; na < nalunos; na++) {
                int aluno = in.nextInt();
                int nf = in.nextInt();
                all_alunos[aluno - 1] = new Svertice(aluno, nf);
                for (int i = 0; i < nf; i++) {
                    int temp = in.nextInt();
                    all_alunos[aluno - 1].addFriend(temp);
                    ocorrencias[temp - 1]++;
                }
            }
            DFS();
            calcularGrafoTransposto();
            DFS_T();
            System.out.println("Caso #" + (cs + 1));
            System.out.println(ngrupos + " " + npessoas);
        }
        in.close();
    }
    static void DFS() {
        ordem_alunos = new Stack<Svertice>();  // reordered 1
        time = 0;  // reordered 1
        for (Svertice aluno : all_alunos) {
            if (aluno.color.equals("white")) {
                DFS_VISIT(aluno);
            }
        }
    }
    static void DFS_VISIT(Svertice aluno) {
        time++;
        aluno.startTime = time;
        aluno.color = "gray";
        for (int id_amigo : aluno.friends) {
            Svertice amigo = all_alunos[id_amigo - 1];
            if (amigo.color.equals("white")) {
                amigo.parent = aluno;
                DFS_VISIT(amigo);
            }
        }
        time++;
        aluno.endTime = time;
        aluno.color = "black";
        ordem_alunos.push(aluno);
    }
    static void calcularGrafoTransposto() {
        for (Svertice aluno : all_alunos) {
            aluno.initiateFriends_t(ocorrencias[aluno.id - 1]);
        }
        for (Svertice aluno : all_alunos) {
            for (int amigo_id : aluno.friends) {
                all_alunos[amigo_id - 1].addFriend_t(aluno.id);
            }
            aluno.reset();
        }
    }
    static void DFS_T() {
        npessoas = 0;  // reordered 1
        ngrupos = 0;  // reordered 1
        while (ordem_alunos.isEmpty() == false) {
            time = 0;
            Svertice aluno = ordem_alunos.pop();
            if (aluno.color.equals("white")) {
                DFS_T_VISIT(aluno);
                if ((time / 2) >= 4) {
                    ngrupos++;
                } else {
                    npessoas += time / 2;
                }
            }
        }
    }
    static void DFS_T_VISIT(Svertice aluno) {
        time++;
        aluno.startTime = time;
        aluno.color = "gray";
        for (int amigo_id : aluno.friends_t) {
            Svertice amigo = all_alunos[amigo_id - 1];
            if (amigo.color.equals("white")) {
                amigo.parent = aluno;
                DFS_T_VISIT(amigo);
            }
        }
        time++;  // reordered 1
        aluno.color = "black";  // reordered 1
        aluno.endTime = time;
    }
}
