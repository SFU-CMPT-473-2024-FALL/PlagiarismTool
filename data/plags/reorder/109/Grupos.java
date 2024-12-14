import java.io.*;
import java.util.*;
class TestGrupos {
    static void verAlunos(int cenario, int n_alunos, Vertice[] alunos) {
        int aluno, n_amigos, amigo;
        Grupos.pw.print("\n\n\nCenario " + cenario);
        for (aluno = 0; aluno < n_alunos; aluno++) {
            n_amigos = alunos[aluno].getNAmigos();
            if (n_amigos > 0) {
                Grupos.pw.print("\n\n aluno: " + (aluno + 1) + " tem " + n_amigos + " amigo(s) que sao: ");
                for (amigo = 0; amigo < n_amigos; amigo++)
                    Grupos.pw.print("\n\t" + (alunos[aluno].Amigo(amigo) + 1));
            } else
                Grupos.pw.print("\n\n aluno: " + (aluno + 1) + " nao tem amigos.");
        }
        Grupos.pw.print("\n\n");
        if (Grupos.pw.checkError())
            Grupos.pw.println("An output error occurred!");
    }
    static void listaLCFC(int cenario, Lista_CFC lista) {
        CFC i;
        Grupos.pw.print("\n\n\nCenario: " + cenario);
        for (i = lista.getPrimeiro(); i != null; i = i.getNext())
            showStack(i.getComponente());
    }
    static void showStack(Stack pilha) {
        int[] stack;
        int n_elems = pilha.elemsStack(), i;
        stack = pilha.getElements();
        Grupos.pw.print("\n\n\t Pilha:");
        if (n_elems > 0)
            for (i = 0; i < n_elems; i++)
                Grupos.pw.print("\n\t\t" + (stack[i] + 1));
        else
            Grupos.pw.println("\n\tSem elementos");
        Grupos.pw.print("\n\n");
    }
}
class Vertice {
    int lowlink;  // reordered 3
    int index;  // reordered 3
    int[] amigos;  // reordered 3
    private int n_amigos;  // reordered 3
    Vertice(int n, int[] ami) {
        lowlink = -1;  // reordered 3
        index = -1;  // reordered 3
        amigos = ami;  // reordered 3
        n_amigos = n;  // reordered 3
    }
    int getNAmigos() {
        return (n_amigos);
    }
    int Amigo(int x) {
        return (amigos[x]);
    }
    void setIndex(int ind) {
        index = ind;
    }
    int getIndex() {
        return (index);
    }
    void setLowlink(int ll) {
        lowlink = ll;
    }
    int getLowlink() {
        return (lowlink);
    }
    boolean isAmigo(int a) {
        int i;
        for (i = 0; i < n_amigos; i++)
            if (amigos[i] == a)
                return (true);
        return (false);
    }
}
class Resultados {
    Resultado ultimo;  // reordered 1
    Resultado primeiro;  // reordered 1
    Resultados() {
        ultimo = null;  // reordered 1
        primeiro = null;  // reordered 1
    }
    Resultado getPrimeiro() {
        return (primeiro);
    }
    void adicionarResultado(Resultado res) {
        if (primeiro == null) {
            ultimo = res;  // reordered 1
            primeiro = res;  // reordered 1
        } else {
            ultimo.setProximo(res);
            ultimo = res;
        }
    }
}
class Resultado {
    Resultado next;  // reordered 3
    int outrosElementos;  // reordered 3
    int gruposDe4;  // reordered 3
    int caso;  // reordered 3
    Resultado(int cas, int grupos, int outros) {
        next = null;  // reordered 3
        outrosElementos = outros;  // reordered 3
        gruposDe4 = grupos;  // reordered 3
        caso = cas;  // reordered 3
    }
    Resultado(int cas) {
        next = null;  // reordered 3
        outrosElementos = 0;  // reordered 3
        gruposDe4 = 0;  // reordered 3
        caso = cas;  // reordered 3
    }
    int getCaso() {
        return (caso);
    }
    void addGrupoDe4() {
        gruposDe4++;
    }
    int getGruposDe4() {
        return (gruposDe4);
    }
    void addOutrosElementos() {
        outrosElementos++;
    }
    int getOutrosElementos() {
        return (outrosElementos);
    }
    void setProximo(Resultado res) {
        next = res;
    }
    Resultado proximo() {
        return (next);
    }
}
class Lista_CFC {
    CFC primeiro, ultimo;
    Lista_CFC() {
        ultimo = null;  // reordered 1
        primeiro = null;  // reordered 1
    }
    CFC getPrimeiro() {
        return (primeiro);
    }
    void add2Lista(Stack pilha) {
        CFC compfc = new CFC(pilha);
        if (primeiro == null)
            primeiro = compfc;
        else
            ultimo.setNext(compfc);
        ultimo = compfc;
    }
}
class CFC {
    CFC next;  // reordered 1
    Stack componente;  // reordered 1
    CFC(Stack comp) {
        next = null;  // reordered 1
        componente = comp;  // reordered 1
    }
    Stack getComponente() {
        return (componente);
    }
    void setNext(CFC no) {
        next = no;
    }
    CFC getNext() {
        return (next);
    }
}
class Stack {
    Node first;  // reordered 1
    int elems;  // reordered 1
    Stack() {
        first = null;  // reordered 1
        elems = 0;  // reordered 1
    }
    int elemsStack() {
        return (elems);
    }
    void push(int x) {
        Node no = new Node(x);
        no.setNext(first);
        elems++;  // reordered 1
        first = no;  // reordered 1
    }
    int pop() {
        int x = first.getValor();
        first = first.getNext();
        elems--;
        return (x);
    }
    boolean isEmpty() {
        return (first == null);
    }
    boolean elemInStack(int x) {
        Node i;
        for (i = first; i != null; i = i.getNext())
            if (i.getValor() == x)
                return (true);
        return (false);
    }
    int[] getElements() {
        Node i;  // reordered 2
        int j;  // reordered 2
        int[] elements = new int[elems];  // reordered 2
        for (i = first, j = elems - 1; i != null; i = i.getNext(), j--) {
            elements[j] = i.getValor();
        }
        return (elements);
    }
    Stack getTill(int v) {
        Stack s = new Stack();  // reordered 2
        int i;  // reordered 2
        Node nova;  // reordered 2
        do {
            i = this.pop();
            s.push(i);
        } while (i != v);
        return (s);
    }
    int verPosicao(int ind) {
        int i;  // reordered 1
        Node j;  // reordered 1
        for (i = 0, j = first; i < ind && j != null; i++, j = j.getNext());
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
        next = null;  // reordered 1
        valor = x;  // reordered 1
    }
    int getValor() {
        return (valor);
    }
    void setNext(Node no) {
        next = no;
    }
    Node getNext() {
        return (next);
    }
}
public class Grupos {
    private static Scanner sca = new Scanner(System.in);  // reordered 1
    public static PrintWriter pw = new PrintWriter(System.out, true);  // reordered 1
    public static void main(String[] args) {
        input();
    }
    private static void input() {
        Resultados resus = new Resultados();  // reordered 4
        int id, n_amigos, amigos[], i;  // reordered 4
        Vertice[] alunos;  // reordered 4
        int n_alunos, aluno;  // reordered 4
        int n_cenarios, cenario;  // reordered 4
        n_cenarios = sca.nextInt();
        for (cenario = 1; cenario <= n_cenarios; cenario++) {
            n_alunos = sca.nextInt();
            alunos = new Vertice[n_alunos];
            for (aluno = 0; aluno < n_alunos; aluno++) {
                id = sca.nextInt();
                n_amigos = sca.nextInt();
                amigos = new int[n_amigos];
                for (i = 0; i < n_amigos; i++) {
                    amigos[i] = sca.nextInt() - 1;
                }
                alunos[id - 1] = new Vertice(n_amigos, amigos);
            }
            TestGrupos.verAlunos(cenario, n_alunos, alunos);
            resus.adicionarResultado(contagem_de_grupos(cenario, n_alunos, alunos));
        }
        output(resus);
    }
    private static Resultado contagem_de_grupos(int cenario, int n_alunos, Vertice[] alunos) {
        Resultado resu;  // reordered 5
        CFC j;  // reordered 5
        Lista_CFC lista_comp = new Lista_CFC();  // reordered 5
        Stack pilha = new Stack(), p2;  // reordered 5
        boolean[] analisados = new boolean[n_alunos];  // reordered 5
        int index, i, n_grupos4, outros, elementos_na_pilha;  // reordered 5
        for (i = 0; i < n_alunos; i++)
            analisados[i] = false;
        n_grupos4 = 0;
        index = 0;  // reordered 1
        outros = 0;  // reordered 1
        while ((i = primeiro_Nao_Analisado(analisados, n_alunos)) != -1) {
            lista_comp = tarjan(n_alunos, alunos, i, index, pilha, lista_comp);
            for (j = lista_comp.getPrimeiro(); j != null; j = j.getNext()) {
                p2 = j.getComponente();
                elementos_na_pilha = p2.elemsStack();
                if (elementos_na_pilha >= 4)
                    n_grupos4++;
                else
                    outros += elementos_na_pilha;
                while (p2.isEmpty() == false) {
                    analisados[p2.pop()] = true;
                }
            }
        }
        resu = new Resultado(cenario, n_grupos4, outros);
        return (resu);
    }
    static int primeiro_Nao_Analisado(boolean[] estadoPosicoes, int n) {
        int i;
        for (i = 0; i < n; i++)
            if (estadoPosicoes[i] == false)
                return (i);
        return (-1);
    }
    private static Lista_CFC tarjan(int n_alunos, Vertice[] alunos, int v, int index, Stack pilha, Lista_CFC lista_comp) {
        int i, n_amigos, amigo;
        alunos[v].setIndex(index);
        alunos[v].setLowlink(index);
        index++;
        pilha.push(v);
        n_amigos = alunos[v].getNAmigos();
        for (i = 0; i < n_amigos; i++) {
            amigo = alunos[v].Amigo(i);
            if (alunos[amigo].getIndex() == -1) {
                tarjan(n_alunos, alunos, amigo, index, pilha, lista_comp);
                alunos[v].setLowlink(min(alunos[v].getLowlink(), alunos[amigo].getLowlink()));
            } else if (pilha.elemInStack(amigo))
                alunos[v].setLowlink(min(alunos[v].getLowlink(), alunos[amigo].getIndex()));
        }
        if (alunos[v].getLowlink() == alunos[v].getIndex()) {
            lista_comp.add2Lista(pilha.getTill(v));
        }
        return (lista_comp);
    }
    private static int min(int x, int y) {
        if (x <= y)
            return (x);
        return (y);
    }
    static void output(Resultados resus) {
        Resultado i;
        for (i = resus.getPrimeiro(); i != null; i = i.proximo()) {
            pw.println("Caso #" + i.getCaso() + "\n" + i.getGruposDe4() + " " + i.getOutrosElementos());
        }
    }
}
