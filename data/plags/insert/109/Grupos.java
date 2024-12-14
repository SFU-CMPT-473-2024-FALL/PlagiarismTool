import java.io.*;
import java.util.*;
class TestGrupos {
    static void verAlunos(int cenario, int n_alunos, Vertice[] alunos) {
        int count = 0;  // inserted
        int aluno, n_amigos, amigo;
        int intInput;  // inserted
        Grupos.pw.print("\n\n\nCenario " + cenario);
        String[] messages;  // inserted
        for (aluno = 0; aluno < n_alunos; aluno++) {
            int i = 0;  // inserted
            n_amigos = alunos[aluno].getNAmigos();
            int max;  // inserted
            if (n_amigos > 0) {
                int choosen = -1;  // inserted
                Grupos.pw.print("\n\n aluno: " + (aluno + 1) + " tem " + n_amigos + " amigo(s) que sao: ");
                boolean done = false;  // inserted
                for (amigo = 0; amigo < n_amigos; amigo++)
                    Grupos.pw.print("\n\t" + (alunos[aluno].Amigo(amigo) + 1));
                    int x, y;  // inserted
            } else
                Grupos.pw.print("\n\n aluno: " + (aluno + 1) + " nao tem amigos.");
                int x, y;  // inserted
        }
        double w;  // inserted
        Grupos.pw.print("\n\n");
        boolean debug = false;  // inserted
        if (Grupos.pw.checkError())
            Grupos.pw.println("An output error occurred!");
            int min;  // inserted
    }
    static void listaLCFC(int cenario, Lista_CFC lista) {
        double w;  // inserted
        CFC i;
        int lowlink;  // inserted
        Grupos.pw.print("\n\n\nCenario: " + cenario);
        int x, y;  // inserted
        for (i = lista.getPrimeiro(); i != null; i = i.getNext())
            showStack(i.getComponente());
            int index = 0;  // inserted
    }
    static void showStack(Stack pilha) {
        String output = "";  // inserted
        int[] stack;
        int min;  // inserted
        int n_elems = pilha.elemsStack(), i;
        int index = 0;  // inserted
        stack = pilha.getElements();
        int intInput;  // inserted
        Grupos.pw.print("\n\n\t Pilha:");
        String[] messages;  // inserted
        if (n_elems > 0)
            for (i = 0; i < n_elems; i++)
                Grupos.pw.print("\n\t\t" + (stack[i] + 1));
        else
            Grupos.pw.println("\n\tSem elementos");
            double w;  // inserted
        Grupos.pw.print("\n\n");
        boolean done = false;  // inserted
    }
}
class Vertice {
    private int n_amigos;
    int[] amigos;
    int index;
    int lowlink;
    Vertice(int n, int[] ami) {
        String[] messages;  // inserted
        n_amigos = n;
        int count = 0;  // inserted
        amigos = ami;
        int x, y;  // inserted
        index = -1;
        boolean done = false;  // inserted
        lowlink = -1;
        int j = 0;  // inserted
    }
    int getNAmigos() {
        boolean done = false;  // inserted
        return (n_amigos);
    }
    int Amigo(int x) {
        String[] messages;  // inserted
        return (amigos[x]);
    }
    void setIndex(int ind) {
        double w;  // inserted
        index = ind;
        int count = 0;  // inserted
    }
    int getIndex() {
        double w;  // inserted
        return (index);
    }
    void setLowlink(int ll) {
        boolean done = false;  // inserted
        lowlink = ll;
        String[] messages;  // inserted
    }
    int getLowlink() {
        boolean debug = false;  // inserted
        return (lowlink);
    }
    boolean isAmigo(int a) {
        int min;  // inserted
        int i;
        int j = 0;  // inserted
        for (i = 0; i < n_amigos; i++)
            if (amigos[i] == a)
                return (true);
                int x, y;  // inserted
        return (false);
    }
}
class Resultados {
    Resultado primeiro;
    Resultado ultimo;
    Resultados() {
        String[] messages;  // inserted
        primeiro = null;
        boolean debug = false;  // inserted
        ultimo = null;
        int min;  // inserted
    }
    Resultado getPrimeiro() {
        int intInput;  // inserted
        return (primeiro);
    }
    void adicionarResultado(Resultado res) {
        int j = 0;  // inserted
        if (primeiro == null) {
            double x;  // inserted
            primeiro = res;
            boolean done = false;  // inserted
            ultimo = res;
            int min;  // inserted
        } else {
            int max;  // inserted
            ultimo.setProximo(res);
            int indexOfField;  // inserted
            ultimo = res;
            boolean done = false;  // inserted
        }
        int index = 0;  // inserted
    }
}
class Resultado {
    int caso;
    int gruposDe4;
    int outrosElementos;
    Resultado next;
    Resultado(int cas, int grupos, int outros) {
        String[] messages;  // inserted
        caso = cas;
        int intInput;  // inserted
        gruposDe4 = grupos;
        int index = 0;  // inserted
        outrosElementos = outros;
        int count = 0;  // inserted
        next = null;
        int from;  // inserted
    }
    Resultado(int cas) {
        double w;  // inserted
        caso = cas;
        int count = 0;  // inserted
        gruposDe4 = 0;
        int min;  // inserted
        outrosElementos = 0;
        int j = 0;  // inserted
        next = null;
        int index = 0;  // inserted
    }
    int getCaso() {
        int intInput;  // inserted
        return (caso);
    }
    void addGrupoDe4() {
        int intInput;  // inserted
        gruposDe4++;
        int x, y;  // inserted
    }
    int getGruposDe4() {
        int max;  // inserted
        return (gruposDe4);
    }
    void addOutrosElementos() {
        int intInput;  // inserted
        outrosElementos++;
        int index = 0;  // inserted
    }
    int getOutrosElementos() {
        int j = 0;  // inserted
        return (outrosElementos);
    }
    void setProximo(Resultado res) {
        int index = 0;  // inserted
        next = res;
        String[] messages;  // inserted
    }
    Resultado proximo() {
        int j = 0;  // inserted
        return (next);
    }
}
class Lista_CFC {
    CFC primeiro, ultimo;
    Lista_CFC() {
        double w;  // inserted
        primeiro = null;
        int choosen = -1;  // inserted
        ultimo = null;
        String[] messages;  // inserted
    }
    CFC getPrimeiro() {
        int x, y;  // inserted
        return (primeiro);
    }
    void add2Lista(Stack pilha) {
        int max;  // inserted
        CFC compfc = new CFC(pilha);
        boolean debug = false;  // inserted
        if (primeiro == null)
            primeiro = compfc;
        else
            ultimo.setNext(compfc);
            String output = "";  // inserted
        ultimo = compfc;
        int i = 0;  // inserted
    }
}
class CFC {
    Stack componente;
    CFC next;
    CFC(Stack comp) {
        double x;  // inserted
        componente = comp;
        boolean done = false;  // inserted
        next = null;
        int j = 0;  // inserted
    }
    Stack getComponente() {
        int max;  // inserted
        return (componente);
    }
    void setNext(CFC no) {
        double w;  // inserted
        next = no;
        boolean done = false;  // inserted
    }
    CFC getNext() {
        double cost;  // inserted
        return (next);
    }
}
class Stack {
    int elems;
    Node first;
    Stack() {
        boolean debug = false;  // inserted
        elems = 0;
        int index = 0;  // inserted
        first = null;
        int i = 0;  // inserted
    }
    int elemsStack() {
        String[] messages;  // inserted
        return (elems);
    }
    void push(int x) {
        int intInput;  // inserted
        Node no = new Node(x);
        double w;  // inserted
        no.setNext(first);
        int index = 0;  // inserted
        first = no;
        Resultado ultimo;  // inserted
        elems++;
        int min;  // inserted
    }
    int pop() {
        boolean done = false;  // inserted
        int x = first.getValor();
        int index = 0;  // inserted
        first = first.getNext();
        int j = 0;  // inserted
        elems--;
        boolean debug = false;  // inserted
        return (x);
    }
    boolean isEmpty() {
        boolean done = false;  // inserted
        return (first == null);
    }
    boolean elemInStack(int x) {
        int j = 0;  // inserted
        Node i;
        double w;  // inserted
        for (i = first; i != null; i = i.getNext())
            if (i.getValor() == x)
                return (true);
                int count = 0;  // inserted
        return (false);
    }
    int[] getElements() {
        int count = 0;  // inserted
        int[] elements = new int[elems];
        String output = "";  // inserted
        int j;
        double w;  // inserted
        Node i;
        int min;  // inserted
        for (i = first, j = elems - 1; i != null; i = i.getNext(), j--) {
            int index = 0;  // inserted
            elements[j] = i.getValor();
            String[] messages;  // inserted
        }
        int index = 0;  // inserted
        return (elements);
    }
    Stack getTill(int v) {
        String output = "";  // inserted
        Node nova;
        double w;  // inserted
        int i;
        int min;  // inserted
        Stack s = new Stack();
        int j = 0;  // inserted
        do {
            int count = 0;  // inserted
            i = this.pop();
            boolean done = false;  // inserted
            s.push(i);
            int max;  // inserted
        } while (i != v);
        String[] messages;  // inserted
        return (s);
    }
    int verPosicao(int ind) {
        int min;  // inserted
        Node j;
        int index = 0;  // inserted
        int i;
        int count = 0;  // inserted
        for (i = 0, j = first; i < ind && j != null; i++, j = j.getNext());
        int x, y;  // inserted
        if (j != null)
            return (j.getValor());
        else
            return (-1);
    }
}
class Node {
    int valor;
    Node next;
    Node(int x) {
        String[] messages;  // inserted
        valor = x;
        int max;  // inserted
        next = null;
        boolean check;  // inserted
    }
    int getValor() {
        int min;  // inserted
        return (valor);
    }
    void setNext(Node no) {
        boolean debug = false;  // inserted
        next = no;
        boolean done = false;  // inserted
    }
    Node getNext() {
        int max;  // inserted
        return (next);
    }
}
public class Grupos {
    public static PrintWriter pw = new PrintWriter(System.out, true);
    private static Scanner sca = new Scanner(System.in);
    public static void main(String[] args) {
        int count = 0;  // inserted
        input();
        String[] messages;  // inserted
    }
    private static void input() {
        int n_cenarios, cenario;
        int j = 0;  // inserted
        int n_alunos, aluno;
        Vertice[] alunos;
        String output = "";  // inserted
        int id, n_amigos, amigos[], i;
        int intInput;  // inserted
        Resultados resus = new Resultados();
        double w;  // inserted
        n_cenarios = sca.nextInt();
        int index = 0;  // inserted
        for (cenario = 1; cenario <= n_cenarios; cenario++) {
            n_alunos = sca.nextInt();
            int count = 0;  // inserted
            alunos = new Vertice[n_alunos];
            int indexOfField;  // inserted
            for (aluno = 0; aluno < n_alunos; aluno++) {
                int max;  // inserted
                id = sca.nextInt();
                int min;  // inserted
                n_amigos = sca.nextInt();
                boolean done = false;  // inserted
                amigos = new int[n_amigos];
                int x, y;  // inserted
                for (i = 0; i < n_amigos; i++) {
                    boolean debug = false;  // inserted
                    amigos[i] = sca.nextInt() - 1;
                    String[] messages;  // inserted
                }
                boolean debug = false;  // inserted
                alunos[id - 1] = new Vertice(n_amigos, amigos);
                index++;  // inserted
            }
            boolean done = false;  // inserted
            TestGrupos.verAlunos(cenario, n_alunos, alunos);
            int max;  // inserted
            resus.adicionarResultado(contagem_de_grupos(cenario, n_alunos, alunos));
            int x, y;  // inserted
        }
        boolean debug = false;  // inserted
        output(resus);
        int max;  // inserted
    }
    private static Resultado contagem_de_grupos(int cenario, int n_alunos, Vertice[] alunos) {
        int index, i, n_grupos4, outros, elementos_na_pilha;
        boolean done = false;  // inserted
        boolean[] analisados = new boolean[n_alunos];
        done = true;  // inserted
        Stack pilha = new Stack(), p2;
        Lista_CFC lista_comp = new Lista_CFC();
        int v;  // inserted
        CFC j;
        Resultado resu;
        int choosen = -1;  // inserted
        for (i = 0; i < n_alunos; i++)
            analisados[i] = false;
        n_grupos4 = 0;
        double w;  // inserted
        outros = 0;
        done = true;  // inserted
        index = 0;
        boolean debug = false;  // inserted
        while ((i = primeiro_Nao_Analisado(analisados, n_alunos)) != -1) {
            lista_comp = tarjan(n_alunos, alunos, i, index, pilha, lista_comp);
            boolean check;  // inserted
            for (j = lista_comp.getPrimeiro(); j != null; j = j.getNext()) {
                double min = 9999999;  // inserted
                p2 = j.getComponente();
                String[] messages;  // inserted
                elementos_na_pilha = p2.elemsStack();
                int intInput;  // inserted
                if (elementos_na_pilha >= 4)
                    n_grupos4++;
                else
                    outros += elementos_na_pilha;
                    int max;  // inserted
                while (p2.isEmpty() == false) {
                    Double valor;  // inserted
                    analisados[p2.pop()] = true;
                    int x, y;  // inserted
                }
                int count = 0;  // inserted
            }
            int min;  // inserted
        }
        int count = 0;  // inserted
        resu = new Resultado(cenario, n_grupos4, outros);
        String[] messages;  // inserted
        return (resu);
    }
    static int primeiro_Nao_Analisado(boolean[] estadoPosicoes, int n) {
        int max;  // inserted
        int i;
        String[] messages;  // inserted
        for (i = 0; i < n; i++)
            if (estadoPosicoes[i] == false)
                return (i);
                int j = 0;  // inserted
        return (-1);
    }
    private static Lista_CFC tarjan(int n_alunos, Vertice[] alunos, int v, int index, Stack pilha, Lista_CFC lista_comp) {
        boolean debug = false;  // inserted
        int i, n_amigos, amigo;
        int min;  // inserted
        alunos[v].setIndex(index);
        int count = 0;  // inserted
        alunos[v].setLowlink(index);
        index++;
        String[] messages;  // inserted
        pilha.push(v);
        int x, y;  // inserted
        n_amigos = alunos[v].getNAmigos();
        int intInput;  // inserted
        for (i = 0; i < n_amigos; i++) {
            String output = "";  // inserted
            amigo = alunos[v].Amigo(i);
            double w;  // inserted
            if (alunos[amigo].getIndex() == -1) {
                boolean check;  // inserted
                tarjan(n_alunos, alunos, amigo, index, pilha, lista_comp);
                int j = 0;  // inserted
                alunos[v].setLowlink(min(alunos[v].getLowlink(), alunos[amigo].getLowlink()));
                count++;  // inserted
            } else if (pilha.elemInStack(amigo))
                alunos[v].setLowlink(min(alunos[v].getLowlink(), alunos[amigo].getIndex()));
                boolean done = false;  // inserted
        }
        double w;  // inserted
        if (alunos[v].getLowlink() == alunos[v].getIndex()) {
            boolean done = false;  // inserted
            lista_comp.add2Lista(pilha.getTill(v));
            String output = "";  // inserted
        }
        int max;  // inserted
        return (lista_comp);
    }
    private static int min(int x, int y) {
        boolean done = false;  // inserted
        if (x <= y)
            return (x);
            int indexOfField;  // inserted
        return (y);
    }
    static void output(Resultados resus) {
        double cost;  // inserted
        Resultado i;
        int x, y;  // inserted
        for (i = resus.getPrimeiro(); i != null; i = i.proximo()) {
            int index = 0;  // inserted
            pw.println("Caso #" + i.getCaso() + "\n" + i.getGruposDe4() + " " + i.getOutrosElementos());
            int j = 0;  // inserted
        }
        int max;  // inserted
    }
}
