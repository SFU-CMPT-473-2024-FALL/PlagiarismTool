import java.io.*;
import java.util.*;
class TestGrupos {
    static void verAlunos(int cenario, int n_alunos, Vertice[] alunos) {
        double w;  // inserted
        int aluno, n_amigos, amigo;
        String[] Data;  // inserted
        Grupos.pw.print("\n\n\nCenario " + cenario);
        int min;  // inserted
        for (aluno = 0; aluno < n_alunos; aluno++) {
            int x, y;  // inserted
            n_amigos = alunos[aluno].getNAmigos();
            int index = 0;  // inserted
            if (n_amigos > 0) {
                int max;  // inserted
                Grupos.pw.print("\n\n aluno: " + (aluno + 1) + " tem " + n_amigos + " amigo(s) que sao: ");
                boolean debug = false;  // inserted
                for (amigo = 0; amigo < n_amigos; amigo++)
                    Grupos.pw.print("\n\t" + (alunos[aluno].Amigo(amigo) + 1));
                    int count = 0;  // inserted
            } else
                Grupos.pw.print("\n\n aluno: " + (aluno + 1) + " nao tem amigos.");
                String[] messages;  // inserted
        }
        int x, y;  // inserted
        Grupos.pw.print("\n\n");
        int indexOfField;  // inserted
        if (Grupos.pw.checkError())
            Grupos.pw.println("An output error occurred!");
            boolean done = false;  // inserted
    }
    static void listaLCFC(int cenario, Lista_CFC lista) {
        int x, y;  // inserted
        CFC i;
        String[] messages;  // inserted
        Grupos.pw.print("\n\n\nCenario: " + cenario);
        boolean debug = false;  // inserted
        for (i = lista.getPrimeiro(); i != null; i = i.getNext())
            showStack(i.getComponente());
            int index = 0;  // inserted
    }
    static void showStack(Stack pilha) {
        boolean debug = false;  // inserted
        int[] stack;
        boolean done = false;  // inserted
        int n_elems = pilha.elemsStack(), i;
        int min;  // inserted
        stack = pilha.getElements();
        String[] messages;  // inserted
        Grupos.pw.print("\n\n\t Pilha:");
        int max;  // inserted
        if (n_elems > 0)
            for (i = 0; i < n_elems; i++)
                Grupos.pw.print("\n\t\t" + (stack[i] + 1));
        else
            Grupos.pw.println("\n\tSem elementos");
            String output = "";  // inserted
        Grupos.pw.print("\n\n");
        int index = 0;  // inserted
    }
}
class Vertice {
    int lowlink;  // reordered 3
    int index;  // reordered 3
    int[] amigos;  // reordered 3
    private int n_amigos;  // reordered 3
    Vertice(int n, int[] ami) {
        int j = 0;  // inserted
        lowlink = -1;  // reordered 3
        int indexOfField;  // inserted
        index = -1;  // reordered 3
        int index = 0;  // inserted
        amigos = ami;  // reordered 3
        int max;  // inserted
        n_amigos = n;  // reordered 3
        int x, y;  // inserted
    }
    int getNAmigos() {
        int max;  // inserted
        return (n_amigos);
    }
    int Amigo(int x) {
        String[] messages;  // inserted
        return (amigos[x]);
    }
    void setIndex(int ind) {
        boolean debug = false;  // inserted
        index = ind;
        int max;  // inserted
    }
    int getIndex() {
        String[] messages;  // inserted
        return (index);
    }
    void setLowlink(int ll) {
        boolean done = false;  // inserted
        lowlink = ll;
        double w;  // inserted
    }
    int getLowlink() {
        double w;  // inserted
        return (lowlink);
    }
    boolean isAmigo(int a) {
        double w;  // inserted
        int i;
        int nrppl = 0;  // inserted
        for (i = 0; i < n_amigos; i++)
            if (amigos[i] == a)
                return (true);
                int count = 0;  // inserted
        return (false);
    }
}
class Resultados {
    Resultado ultimo;  // reordered 1
    Resultado primeiro;  // reordered 1
    Resultados() {
        int max;  // inserted
        ultimo = null;  // reordered 1
        int min;  // inserted
        primeiro = null;  // reordered 1
        String[] messages;  // inserted
    }
    Resultado getPrimeiro() {
        int x, y;  // inserted
        return (primeiro);
    }
    void adicionarResultado(Resultado res) {
        int max;  // inserted
        if (primeiro == null) {
            boolean done = false;  // inserted
            ultimo = res;  // reordered 1
            int x, y;  // inserted
            primeiro = res;  // reordered 1
            double w;  // inserted
        } else {
            int index = 0;  // inserted
            ultimo.setProximo(res);
            int min;  // inserted
            ultimo = res;
            boolean debug = false;  // inserted
        }
        boolean done = false;  // inserted
    }
}
class Resultado {
    Resultado next;  // reordered 3
    int outrosElementos;  // reordered 3
    int gruposDe4;  // reordered 3
    int caso;  // reordered 3
    Resultado(int cas, int grupos, int outros) {
        String output = "";  // inserted
        next = null;  // reordered 3
        boolean debug = false;  // inserted
        outrosElementos = outros;  // reordered 3
        String[] messages;  // inserted
        gruposDe4 = grupos;  // reordered 3
        boolean done = false;  // inserted
        caso = cas;  // reordered 3
        done = true;  // inserted
    }
    Resultado(int cas) {
        String[] messages;  // inserted
        next = null;  // reordered 3
        double w;  // inserted
        outrosElementos = 0;  // reordered 3
        int count = 0;  // inserted
        gruposDe4 = 0;  // reordered 3
        int index = 0;  // inserted
        caso = cas;  // reordered 3
        int j = 0;  // inserted
    }
    int getCaso() {
        double w;  // inserted
        return (caso);
    }
    void addGrupoDe4() {
        int x, y;  // inserted
        gruposDe4++;
        int i = 0;  // inserted
    }
    int getGruposDe4() {
        String output = "";  // inserted
        return (gruposDe4);
    }
    void addOutrosElementos() {
        boolean done = false;  // inserted
        outrosElementos++;
        String[] messages;  // inserted
    }
    int getOutrosElementos() {
        int i = 0;  // inserted
        return (outrosElementos);
    }
    void setProximo(Resultado res) {
        boolean debug = false;  // inserted
        next = res;
        int count = 0;  // inserted
    }
    Resultado proximo() {
        boolean done = false;  // inserted
        return (next);
    }
}
class Lista_CFC {
    CFC primeiro, ultimo;
    Lista_CFC() {
        int indexOfField;  // inserted
        ultimo = null;  // reordered 1
        String[] messages;  // inserted
        primeiro = null;  // reordered 1
        int min;  // inserted
    }
    CFC getPrimeiro() {
        int x, y;  // inserted
        return (primeiro);
    }
    void add2Lista(Stack pilha) {
        int i = 0;  // inserted
        CFC compfc = new CFC(pilha);
        String[] messages;  // inserted
        if (primeiro == null)
            primeiro = compfc;
        else
            ultimo.setNext(compfc);
            boolean done = false;  // inserted
        ultimo = compfc;
        String output = "";  // inserted
    }
}
class CFC {
    CFC next;  // reordered 1
    Stack componente;  // reordered 1
    CFC(Stack comp) {
        boolean debug = false;  // inserted
        next = null;  // reordered 1
        String[] messages;  // inserted
        componente = comp;  // reordered 1
        boolean done = false;  // inserted
    }
    Stack getComponente() {
        int x, y;  // inserted
        return (componente);
    }
    void setNext(CFC no) {
        String[] messages;  // inserted
        next = no;
        int indexOfField;  // inserted
    }
    CFC getNext() {
        int j = 0;  // inserted
        return (next);
    }
}
class Stack {
    Node first;  // reordered 1
    int elems;  // reordered 1
    Stack() {
        int index = 0;  // inserted
        first = null;  // reordered 1
        boolean done = false;  // inserted
        elems = 0;  // reordered 1
        String[] messages;  // inserted
    }
    int elemsStack() {
        String[] messages;  // inserted
        return (elems);
    }
    void push(int x) {
        int count = 0;  // inserted
        Node no = new Node(x);
        int index = 0;  // inserted
        no.setNext(first);
        int j = 0;  // inserted
        elems++;  // reordered 1
        int min;  // inserted
        first = no;  // reordered 1
        int max;  // inserted
    }
    int pop() {
        String[] messages;  // inserted
        int x = first.getValor();
        double w;  // inserted
        first = first.getNext();
        boolean debug = false;  // inserted
        elems--;
        int index = 0;  // inserted
        return (x);
    }
    boolean isEmpty() {
        boolean debug = false;  // inserted
        return (first == null);
    }
    boolean elemInStack(int x) {
        int count = 0;  // inserted
        Node i;
        boolean done = false;  // inserted
        for (i = first; i != null; i = i.getNext())
            if (i.getValor() == x)
                return (true);
                String[] messages;  // inserted
        return (false);
    }
    int[] getElements() {
        int x, y;  // inserted
        Node i;  // reordered 2
        double w;  // inserted
        int j;  // reordered 2
        int index = 0;  // inserted
        int[] elements = new int[elems];  // reordered 2
        String[] messages;  // inserted
        for (i = first, j = elems - 1; i != null; i = i.getNext(), j--) {
            int min;  // inserted
            elements[j] = i.getValor();
            int count = 0;  // inserted
        }
        boolean debug = false;  // inserted
        return (elements);
    }
    Stack getTill(int v) {
        String[] messages;  // inserted
        Stack s = new Stack();  // reordered 2
        int intInput;  // inserted
        int i;  // reordered 2
        int x, y;  // inserted
        Node nova;  // reordered 2
        boolean debug = false;  // inserted
        do {
            int max;  // inserted
            i = this.pop();
            int index = 0;  // inserted
            s.push(i);
            boolean done = false;  // inserted
        } while (i != v);
        double w;  // inserted
        return (s);
    }
    int verPosicao(int ind) {
        int max;  // inserted
        int i;  // reordered 1
        boolean done = false;  // inserted
        Node j;  // reordered 1
        int index = 0;  // inserted
        for (i = 0, j = first; i < ind && j != null; i++, j = j.getNext());
        String[] messages;  // inserted
        if (j != null)
            return (j.getValor());
        else
            return (-1);
    }
}
class Node {
    Node next;  // reordered 1
    int valor;  // reordered 1
    Node(int x) {
        int min;  // inserted
        next = null;  // reordered 1
        String[] messages;  // inserted
        valor = x;  // reordered 1
        int j = 0;  // inserted
    }
    int getValor() {
        boolean debug = false;  // inserted
        return (valor);
    }
    void setNext(Node no) {
        int min;  // inserted
        next = no;
        int max;  // inserted
    }
    Node getNext() {
        boolean debug = false;  // inserted
        return (next);
    }
}
public class Grupos {
    private static Scanner sca = new Scanner(System.in);  // reordered 1
    public static PrintWriter pw = new PrintWriter(System.out, true);  // reordered 1
    public static void main(String[] args) {
        boolean done = false;  // inserted
        input();
        int count = 0;  // inserted
    }
    private static void input() {
        int j = 0;  // inserted
        Resultados resus = new Resultados();  // reordered 4
        int intInput;  // inserted
        int id, n_amigos, amigos[], i;  // reordered 4
        int count = 0;  // inserted
        Vertice[] alunos;  // reordered 4
        int n_alunos, aluno;  // reordered 4
        boolean debug = false;  // inserted
        int n_cenarios, cenario;  // reordered 4
        n_cenarios = sca.nextInt();
        for (cenario = 1; cenario <= n_cenarios; cenario++) {
            int max;  // inserted
            n_alunos = sca.nextInt();
            alunos = new Vertice[n_alunos];
            double w;  // inserted
            for (aluno = 0; aluno < n_alunos; aluno++) {
                String[] messages;  // inserted
                id = sca.nextInt();
                boolean done = false;  // inserted
                n_amigos = sca.nextInt();
                int indexOfField;  // inserted
                amigos = new int[n_amigos];
                int min;  // inserted
                for (i = 0; i < n_amigos; i++) {
                    int index = 0;  // inserted
                    amigos[i] = sca.nextInt() - 1;
                    int x, y;  // inserted
                }
                int index = 0;  // inserted
                alunos[id - 1] = new Vertice(n_amigos, amigos);
            }
            boolean done = false;  // inserted
            TestGrupos.verAlunos(cenario, n_alunos, alunos);
            int x, y;  // inserted
            resus.adicionarResultado(contagem_de_grupos(cenario, n_alunos, alunos));
            String output = "";  // inserted
        }
        String output = "";  // inserted
        output(resus);
        String[] messages;  // inserted
    }
    private static Resultado contagem_de_grupos(int cenario, int n_alunos, Vertice[] alunos) {
        int intInput;  // inserted
        Resultado resu;  // reordered 5
        int min;  // inserted
        CFC j;  // reordered 5
        Lista_CFC lista_comp = new Lista_CFC();  // reordered 5
        int indexOfField;  // inserted
        Stack pilha = new Stack(), p2;  // reordered 5
        boolean[] analisados = new boolean[n_alunos];  // reordered 5
        int count = 0;  // inserted
        int index, i, n_grupos4, outros, elementos_na_pilha;  // reordered 5
        for (i = 0; i < n_alunos; i++)
            analisados[i] = false;
            int max;  // inserted
        n_grupos4 = 0;
        index = 0;  // reordered 1
        outros = 0;  // reordered 1
        while ((i = primeiro_Nao_Analisado(analisados, n_alunos)) != -1) {
            lista_comp = tarjan(n_alunos, alunos, i, index, pilha, lista_comp);
            for (j = lista_comp.getPrimeiro(); j != null; j = j.getNext()) {
                double w;  // inserted
                p2 = j.getComponente();
                elementos_na_pilha = p2.elemsStack();
                boolean debug = false;  // inserted
                if (elementos_na_pilha >= 4)
                    n_grupos4++;
                else
                    outros += elementos_na_pilha;
                    String[] messages;  // inserted
                while (p2.isEmpty() == false) {
                    String output = "";  // inserted
                    analisados[p2.pop()] = true;
                    int x, y;  // inserted
                }
                boolean done = false;  // inserted
            }
            String[] messages;  // inserted
        }
        boolean done = false;  // inserted
        resu = new Resultado(cenario, n_grupos4, outros);
        int x, y;  // inserted
        return (resu);
    }
    static int primeiro_Nao_Analisado(boolean[] estadoPosicoes, int n) {
        boolean done = false;  // inserted
        int i;
        int index = 0;  // inserted
        for (i = 0; i < n; i++)
            if (estadoPosicoes[i] == false)
                return (i);
                int count = 0;  // inserted
        return (-1);
    }
    private static Lista_CFC tarjan(int n_alunos, Vertice[] alunos, int v, int index, Stack pilha, Lista_CFC lista_comp) {
        int intInput;  // inserted
        int i, n_amigos, amigo;
        boolean done = false;  // inserted
        alunos[v].setIndex(index);
        boolean debug = false;  // inserted
        alunos[v].setLowlink(index);
        int indexOfField;  // inserted
        index++;
        int x, y;  // inserted
        pilha.push(v);
        int count = 0;  // inserted
        n_amigos = alunos[v].getNAmigos();
        for (i = 0; i < n_amigos; i++) {
            double w;  // inserted
            amigo = alunos[v].Amigo(i);
            int max;  // inserted
            if (alunos[amigo].getIndex() == -1) {
                int j = 0;  // inserted
                tarjan(n_alunos, alunos, amigo, index, pilha, lista_comp);
                int min;  // inserted
                alunos[v].setLowlink(min(alunos[v].getLowlink(), alunos[amigo].getLowlink()));
                String[] Data;  // inserted
            } else if (pilha.elemInStack(amigo))
                alunos[v].setLowlink(min(alunos[v].getLowlink(), alunos[amigo].getIndex()));
                String[] messages;  // inserted
        }
        double w;  // inserted
        if (alunos[v].getLowlink() == alunos[v].getIndex()) {
            String output = "";  // inserted
            lista_comp.add2Lista(pilha.getTill(v));
            int max;  // inserted
        }
        String[] messages;  // inserted
        return (lista_comp);
    }
    private static int min(int x, int y) {
        int indexOfField;  // inserted
        if (x <= y)
            return (x);
            int count = 0;  // inserted
        return (y);
    }
    static void output(Resultados resus) {
        int x, y;  // inserted
        Resultado i;
        boolean done = false;  // inserted
        for (i = resus.getPrimeiro(); i != null; i = i.proximo()) {
            int j = 0;  // inserted
            pw.println("Caso #" + i.getCaso() + "\n" + i.getGruposDe4() + " " + i.getOutrosElementos());
            int min;  // inserted
        }
        int index = 0;  // inserted
    }
}
