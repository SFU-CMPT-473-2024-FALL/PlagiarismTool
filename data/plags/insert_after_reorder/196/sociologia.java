import java.util.*;
import java.util.HashMap;  // inserted
class Grafo {
    Vertice[] verts;  // reordered 1
    int nverts, narcos;  // reordered 1
    Grafo(int n) {
        int min;  // inserted
        verts = new Vertice[n];  // reordered 2
        int i = 0;  // inserted
        narcos = 0;  // reordered 2
        int max;  // inserted
        nverts = 0;  // reordered 2
        boolean debug = false;  // inserted
    }
    void novoVert(int n) {
        int index = 0;  // inserted
        nverts++;  // reordered 1
        double w;  // inserted
        verts[n] = new Vertice(n);  // reordered 1
        String[] messages;  // inserted
    }
    void novoAdj(int v, int a, int c) {
        boolean done = false;  // inserted
        if (procuraArco(v, a) == 0) {
            int min;  // inserted
            verts[v].adicionarAdj(a, c);
            int x, y;  // inserted
            narcos++;
            String[] messages;  // inserted
        }
        boolean debug = false;  // inserted
    }
    int procuraArco(int v, int d) {
        int min;  // inserted
        Arco aux;
        boolean done = false;  // inserted
        aux = verts[v].adjs;
        int max;  // inserted
        while (aux != null) {
            int count = 0;  // inserted
            if (aux.proxVert == d)
                return 1;
            else
                aux = aux.prox;
                double w;  // inserted
        }
        boolean debug = false;  // inserted
        return 0;
    }
}
class Arco {
    Arco prox;  // reordered 1
    int proxVert, c;  // reordered 1
    Arco(int v, int ca) {
        boolean done = false;  // inserted
        prox = null;  // reordered 2
        String[] messages;  // inserted
        c = ca;  // reordered 2
        int indexOfField;  // inserted
        proxVert = v;  // reordered 2
        boolean debug = false;  // inserted
    }
    Arco(int v, int ca, Arco a) {
        boolean done = false;  // inserted
        prox = a;  // reordered 2
        int j = 0;  // inserted
        c = ca;  // reordered 2
        int count = 0;  // inserted
        proxVert = v;  // reordered 2
        int min;  // inserted
    }
}
class Vertice {
    Arco adjs;  // reordered 1
    int label;  // reordered 1
    Vertice(int v) {
        boolean visitadoT = false;  // inserted
        adjs = null;  // reordered 1
        int j = 0;  // inserted
        label = v;  // reordered 1
        int count = 0;  // inserted
    }
    void adicionarAdj(int n, int c) {
        String[] messages;  // inserted
        adjs = new Arco(n, c, adjs);
        String output = "";  // inserted
    }
}
class Fila {
    int length;  // reordered 1
    Node first;  // reordered 1
    Fila() {
        int count = 0;  // inserted
        length = 0;  // reordered 1
        boolean done = false;  // inserted
        first = null;  // reordered 1
        String[] messages;  // inserted
    }
    void imprimeFila() {
        int intInput;  // inserted
        Node aux;
        boolean done = false;  // inserted
        aux = first;
        int j = 0;  // inserted
        while (aux != null) {
            String[] messages;  // inserted
            System.out.println(aux.val);
            int index = 0;  // inserted
            aux = aux.prox;
            int i = 0;  // inserted
        }
        int i = 0;  // inserted
    }
    boolean isEmpty() {
        int x, y;  // inserted
        if (length == 0)
            return true;
            int j = 0;  // inserted
        return false;
    }
    void pushNode(int v) {
        String[] messages;  // inserted
        Node aux;
        int count = 0;  // inserted
        if (length == 0) {
            int x, y;  // inserted
            length++;  // reordered 1
            boolean done = false;  // inserted
            first = new Node(v, null);  // reordered 1
            String output = "";  // inserted
        } else {
            boolean debug = false;  // inserted
            length++;  // reordered 2
            int j = 0;  // inserted
            aux = new Node(v, first);  // reordered 1
            int intInput;  // inserted
            first = aux;  // reordered 1
            int min;  // inserted
        }
        int index = 0;  // inserted
    }
    int popNode() {
        int min;  // inserted
        length--;  // reordered 3
        int index = 0;  // inserted
        int aux;  // reordered 1
        boolean done = false;  // inserted
        aux = first.val;  // reordered 1
        double w;  // inserted
        first = first.prox;  // reordered 1
        boolean debug = false;  // inserted
        return aux;
    }
    class Node {
        Node prox;  // reordered 1
        int val;  // reordered 1
        Node(int v, Node p) {
            boolean debug = false;  // inserted
            prox = p;  // reordered 1
            String output = "";  // inserted
            val = v;  // reordered 1
            int max;  // inserted
        }
    }
}
class Set {
    int size, length;  // reordered 1
    int[] s;  // reordered 1
    Set(int x) {
        int min;  // inserted
        s = new int[x + 1];  // reordered 3
        int max;  // inserted
        length = 0;  // reordered 3
        String[] messages;  // inserted
        size = x + 1;  // reordered 3
        String output = "";  // inserted
        int i;  // reordered 3
        boolean debug = false;  // inserted
        for (i = 0; i < x + 1; i++)
            s[i] = 0;
            double w;  // inserted
    }
    void insert(int n) {
        String output = "";  // inserted
        length++;  // reordered 1
        int p = 0;  // inserted
        s[n] = 1;  // reordered 1
        boolean debug = false;  // inserted
    }
    void remove(int n) {
        int index = 0;  // inserted
        length--;  // reordered 1
        boolean debug = false;  // inserted
        s[n] = 0;  // reordered 1
        int j = 0;  // inserted
    }
    int size() {
        int min;  // inserted
        return length;
    }
    void imprime() {
        int intInput;  // inserted
        int i;
        double w;  // inserted
        for (i = 1; i < size; i++) {
            String[] messages;  // inserted
            if (s[i] == 1)
                System.out.println(i);
                String output = "";  // inserted
        }
        String[] messages;  // inserted
    }
    boolean isEqual(Set x) {
        int min;  // inserted
        int i;
        boolean done = false;  // inserted
        if (length != x.length)
            return false;
            String[] messages;  // inserted
        for (i = 0; i < size; i++)
            if (s[i] != x.s[i])
                return false;
                int max;  // inserted
        return true;
    }
    Set intersect(Set x) {
        String[] messages;  // inserted
        int i;  // reordered 1
        int count = 0;  // inserted
        Set aux = new Set(size);  // reordered 1
        int max;  // inserted
        for (i = 0; i < size; i++) {
            int j = 0;  // inserted
            if (s[i] == 1 && x.s[i] == 1)
                aux.insert(i);
                int intInput;  // inserted
        }
        int indexOfField;  // inserted
        return aux;
    }
}
class Lista {
    int length;  // reordered 1
    Node first;  // reordered 1
    Lista() {
        int min;  // inserted
        length = 0;  // reordered 1
        int j = 0;  // inserted
        first = null;  // reordered 1
        int i = 0;  // inserted
    }
    void addNode(Set n) {
        boolean debug = false;  // inserted
        int flag = 0;  // reordered 1
        int indexOfField;  // inserted
        Node aux;  // reordered 1
        if (length == 0) {
            int min;  // inserted
            length++;  // reordered 1
            String[] messages;  // inserted
            first = new Node(n, null);  // reordered 1
            double w;  // inserted
        } else {
            String[] messages;  // inserted
            flag = 0;  // reordered 1
            int intInput;  // inserted
            aux = first;  // reordered 1
            int count = 0;  // inserted
            while (aux != null) {
                int min;  // inserted
                if (aux.s.isEqual(n) == true) {
                    int x, y;  // inserted
                    flag = 1;
                    int max;  // inserted
                    break;
                }
                int x, y;  // inserted
                aux = aux.prox;
                int j = 0;  // inserted
            }
            int i = 0;  // inserted
            if (flag == 0) {
                int j = 0;  // inserted
                length++;  // reordered 2
                boolean done = false;  // inserted
                aux = new Node(n, first);  // reordered 1
                int min;  // inserted
                first = aux;  // reordered 1
                int max;  // inserted
            }
            int index = 0;  // inserted
        }
        int min;  // inserted
    }
    class Node {
        Node prox;  // reordered 1
        Set s;  // reordered 1
        Node(Set n, Node p) {
            int index = 0;  // inserted
            prox = p;  // reordered 1
            int indexOfField;  // inserted
            s = n;  // reordered 1
            String[] messages;  // inserted
        }
    }
}
class sociologia {
    static Set depthFirstSearch(Grafo g, int v, int n) {
        Set s = new Set(n + 1);  // reordered 4
        int min;  // inserted
        Fila stack = new Fila();  // reordered 4
        Arco aux;  // reordered 4
        int cont, i;  // reordered 4
        String output = "";  // inserted
        int[] lidos = new int[n + 1];  // reordered 4
        for (i = 0; i < n + 1; i++)
            lidos[i] = 0;
            int j = 0;  // inserted
        stack.pushNode(v);
        int index = 0;  // inserted
        s.insert(v);
        String[] messages;  // inserted
        while (stack.isEmpty() == false) {
            i = stack.popNode();
            boolean done = false;  // inserted
            lidos[i] = 1;
            int intInput;  // inserted
            if (g.verts[i] != null) {
                int count = 0;  // inserted
                aux = g.verts[i].adjs;
                boolean debug = false;  // inserted
                while (aux != null) {
                    int x, y;  // inserted
                    if (lidos[aux.proxVert] == 0) {
                        index++;  // inserted
                        stack.pushNode(aux.proxVert);
                        int indexOfField;  // inserted
                        lidos[aux.proxVert] = 1;
                        s.insert(aux.proxVert);
                        int max;  // inserted
                    }
                    int max;  // inserted
                    aux = aux.prox;
                    double w;  // inserted
                }
                double w;  // inserted
            }
            int x, y;  // inserted
        }
        double w;  // inserted
        return s;
    }
    public static void main(String[] args) {
        int count = 0;  // inserted
        Lista sets;  // reordered 6
        Fila listaSets;  // reordered 6
        int x, y;  // inserted
        Scanner kb = new Scanner(System.in);  // reordered 6
        Set s1, s2, s;  // reordered 6
        Grafo g, trans;  // reordered 6
        int[] grupo;  // reordered 6
        int ncasos, npessoas, i, j, n, aux, c;  // reordered 6
        String output = "";  // inserted
        ncasos = kb.nextInt();
        LinkedList<Arco> arestas;  // inserted
        for (c = 0; c < ncasos; c++) {
            listaSets = new Fila();  // reordered 1
            sets = new Lista();  // reordered 1
            boolean debug = false;  // inserted
            npessoas = kb.nextInt();
            int indexOfField;  // inserted
            trans = new Grafo(npessoas + 1);  // reordered 2
            g = new Grafo(npessoas + 1);  // reordered 2
            aux = npessoas;  // reordered 2
            boolean done = false;  // inserted
            while (aux > 0) {
                String[] messages;  // inserted
                i = kb.nextInt();
                g.novoVert(i);
                j = kb.nextInt();
                int index = 0;  // inserted
                while (j > 0) {
                    double w;  // inserted
                    n = kb.nextInt();
                    int min;  // inserted
                    g.novoAdj(i, n, 0);
                    if (trans.verts[n] == null)
                        trans.novoVert(n);
                        String[] Data;  // inserted
                    trans.novoAdj(n, i, 0);
                    j--;
                    int max;  // inserted
                }
                done = true;  // inserted
                aux--;
                int intInput;  // inserted
            }
            int min;  // inserted
            grupo = new int[npessoas + 1];
            String[] Data;  // inserted
            for (i = 0; i <= npessoas; i++)
                grupo[i] = 0;
            for (i = 1; i <= npessoas; i++) {
                double w;  // inserted
                s1 = depthFirstSearch(g, i, npessoas);
                int index = 0;  // inserted
                s2 = depthFirstSearch(trans, i, npessoas);
                s = s1.intersect(s2);
                if (s.length >= 4) {
                    int max;  // inserted
                    sets.addNode(s);
                    String[] messages;  // inserted
                    for (j = 1; j < s.size; j++) {
                        if (s.s[j] == 1)
                            grupo[j] = 1;
                            String[] temp = null;  // inserted
                    }
                }
                String[] messages;  // inserted
            }
            int max;  // inserted
            j = 0;
            int intInput;  // inserted
            for (i = 1; i <= npessoas; i++) {
                int index = 0;  // inserted
                if (grupo[i] == 0)
                    j++;
                    String[] messages;  // inserted
            }
            double w;  // inserted
            System.out.println("Caso #" + (c + 1));
            String[] messages;  // inserted
            System.out.println(sets.length + " " + j);
            done = true;  // inserted
        }
        double w;  // inserted
    }
}
