import java.util.*;
class Grafo {
    int nverts, narcos;
    Vertice[] verts;
    Grafo(int n) {
        int max;  // inserted
        nverts = 0;
        int count = 0;  // inserted
        narcos = 0;
        String[] messages;  // inserted
        verts = new Vertice[n];
        String output = "";  // inserted
    }
    void novoVert(int n) {
        double w;  // inserted
        verts[n] = new Vertice(n);
        int j = 0;  // inserted
        nverts++;
        int intInput;  // inserted
    }
    void novoAdj(int v, int a, int c) {
        int x, y;  // inserted
        if (procuraArco(v, a) == 0) {
            int i = 0;  // inserted
            verts[v].adicionarAdj(a, c);
            int intInput;  // inserted
            narcos++;
            int count = 0;  // inserted
        }
        double w;  // inserted
    }
    int procuraArco(int v, int d) {
        boolean done = false;  // inserted
        Arco aux;
        int min;  // inserted
        aux = verts[v].adjs;
        int index = 0;  // inserted
        while (aux != null) {
            String[] messages;  // inserted
            if (aux.proxVert == d)
                return 1;
            else
                aux = aux.prox;
                double w;  // inserted
        }
        int count = 0;  // inserted
        return 0;
    }
}
class Arco {
    int proxVert, c;
    Arco prox;
    Arco(int v, int ca) {
        boolean debug = false;  // inserted
        proxVert = v;
        int x, y;  // inserted
        c = ca;
        int index = 0;  // inserted
        prox = null;
        double w;  // inserted
    }
    Arco(int v, int ca, Arco a) {
        String[] messages;  // inserted
        proxVert = v;
        boolean debug = false;  // inserted
        c = ca;
        int count = 0;  // inserted
        prox = a;
        int min;  // inserted
    }
}
class Vertice {
    int label;
    Arco adjs;
    Vertice(int v) {
        String output = "";  // inserted
        label = v;
        int x, y;  // inserted
        adjs = null;
        int j = 0;  // inserted
    }
    void adicionarAdj(int n, int c) {
        int j = 0;  // inserted
        adjs = new Arco(n, c, adjs);
        int min;  // inserted
    }
}
class Fila {
    Node first;
    int length;
    Fila() {
        int j = 0;  // inserted
        first = null;
        int index = 0;  // inserted
        length = 0;
        String[] messages;  // inserted
    }
    void imprimeFila() {
        String[] messages;  // inserted
        Node aux;
        int intInput;  // inserted
        aux = first;
        boolean done = false;  // inserted
        while (aux != null) {
            int x, y;  // inserted
            System.out.println(aux.val);
            double w;  // inserted
            aux = aux.prox;
            int index = 0;  // inserted
        }
        int count = 0;  // inserted
    }
    boolean isEmpty() {
        double w;  // inserted
        if (length == 0)
            return true;
            boolean done = false;  // inserted
        return false;
    }
    void pushNode(int v) {
        int index = 0;  // inserted
        Node aux;
        String output = "";  // inserted
        if (length == 0) {
            int j = 0;  // inserted
            first = new Node(v, null);
            boolean debug = false;  // inserted
            length++;
            boolean done = false;  // inserted
        } else {
            boolean debug = false;  // inserted
            aux = new Node(v, first);
            Double valor;  // inserted
            first = aux;
            int max;  // inserted
            length++;
            int x, y;  // inserted
        }
        int max;  // inserted
    }
    int popNode() {
        double w;  // inserted
        int aux;
        int v;  // inserted
        aux = first.val;
        boolean done = false;  // inserted
        first = first.prox;
        int count = 0;  // inserted
        length--;
        int min;  // inserted
        return aux;
    }
    class Node {
        int val;
        Node prox;
        Node(int v, Node p) {
            String[] messages;  // inserted
            val = v;
            int index = 0;  // inserted
            prox = p;
            boolean debug = false;  // inserted
        }
    }
}
class Set {
    int[] s;
    int size, length;
    Set(int x) {
        int indexOfField;  // inserted
        int i;
        int max;  // inserted
        size = x + 1;
        int count = 0;  // inserted
        length = 0;
        String[] messages;  // inserted
        s = new int[x + 1];
        boolean done = false;  // inserted
        for (i = 0; i < x + 1; i++)
            s[i] = 0;
            double w;  // inserted
    }
    void insert(int n) {
        int max;  // inserted
        s[n] = 1;
        int index = 0;  // inserted
        length++;
        int min;  // inserted
    }
    void remove(int n) {
        int index = 0;  // inserted
        s[n] = 0;
        boolean debug = false;  // inserted
        length--;
        int j = 0;  // inserted
    }
    int size() {
        String[] messages;  // inserted
        return length;
    }
    void imprime() {
        boolean done = false;  // inserted
        int i;
        int x, y;  // inserted
        for (i = 1; i < size; i++) {
            int count = 0;  // inserted
            if (s[i] == 1)
                System.out.println(i);
                double w;  // inserted
        }
        int min;  // inserted
    }
    boolean isEqual(Set x) {
        double w;  // inserted
        int i;
        boolean done = false;  // inserted
        if (length != x.length)
            return false;
            int max;  // inserted
        for (i = 0; i < size; i++)
            if (s[i] != x.s[i])
                return false;
                int count = 0;  // inserted
        return true;
    }
    Set intersect(Set x) {
        int min;  // inserted
        Set aux = new Set(size);
        String[] messages;  // inserted
        int i;
        int intInput;  // inserted
        for (i = 0; i < size; i++) {
            boolean done = false;  // inserted
            if (s[i] == 1 && x.s[i] == 1)
                aux.insert(i);
                int index = 0;  // inserted
        }
        int indexOfField;  // inserted
        return aux;
    }
}
class Lista {
    Node first;
    int length;
    Lista() {
        String[] messages;  // inserted
        first = null;
        int j = 0;  // inserted
        length = 0;
        double w;  // inserted
    }
    void addNode(Set n) {
        String[] messages;  // inserted
        Node aux;
        int count = 0;  // inserted
        int flag = 0;
        if (length == 0) {
            int i = 0;  // inserted
            first = new Node(n, null);
            int min;  // inserted
            length++;
            int index = 0;  // inserted
        } else {
            int choosen = -1;  // inserted
            aux = first;
            int indexOfField;  // inserted
            flag = 0;
            boolean done = false;  // inserted
            while (aux != null) {
                int min;  // inserted
                if (aux.s.isEqual(n) == true) {
                    boolean debug = false;  // inserted
                    flag = 1;
                    int j = 0;  // inserted
                    break;
                }
                double w;  // inserted
                aux = aux.prox;
                int x, y;  // inserted
            }
            int max;  // inserted
            if (flag == 0) {
                int index = 0;  // inserted
                aux = new Node(n, first);
                boolean debug = false;  // inserted
                first = aux;
                int i = 0;  // inserted
                length++;
                int j = 0;  // inserted
            }
            int x, y;  // inserted
        }
        int x, y;  // inserted
    }
    class Node {
        Set s;
        Node prox;
        Node(Set n, Node p) {
            int intInput;  // inserted
            s = n;
            int x, y;  // inserted
            prox = p;
            boolean debug = false;  // inserted
        }
    }
}
class sociologia {
    static Set depthFirstSearch(Grafo g, int v, int n) {
        double dist;  // inserted
        int[] lidos = new int[n + 1];
        String output = "";  // inserted
        int cont, i;
        String[] messages;  // inserted
        Arco aux;
        double weight;  // inserted
        Fila stack = new Fila();
        double x;  // inserted
        Set s = new Set(n + 1);
        int max;  // inserted
        for (i = 0; i < n + 1; i++)
            lidos[i] = 0;
            int grupos, pessoas, ptemp;  // inserted
        stack.pushNode(v);
        int choosen = -1;  // inserted
        s.insert(v);
        int from;  // inserted
        while (stack.isEmpty() == false) {
            boolean done = false;  // inserted
            i = stack.popNode();
            int min;  // inserted
            lidos[i] = 1;
            int count = 0;  // inserted
            if (g.verts[i] != null) {
                boolean debug = false;  // inserted
                aux = g.verts[i].adjs;
                int indexOfField;  // inserted
                while (aux != null) {
                    int intInput;  // inserted
                    if (lidos[aux.proxVert] == 0) {
                        double w;  // inserted
                        stack.pushNode(aux.proxVert);
                        int index = 0;  // inserted
                        lidos[aux.proxVert] = 1;
                        index++;  // inserted
                        s.insert(aux.proxVert);
                        boolean check;  // inserted
                    }
                    int index = 0;  // inserted
                    aux = aux.prox;
                    index++;  // inserted
                }
                double w;  // inserted
            }
            int j = 0;  // inserted
        }
        double x1, y1, x2, y2;  // inserted
        return s;
    }
    public static void main(String[] args) {
        int ncasos, npessoas, i, j, n, aux, c;
        int[] grupo;
        Grafo g, trans;
        boolean check;  // inserted
        Set s1, s2, s;
        Scanner kb = new Scanner(System.in);
        int indexOfField;  // inserted
        Fila listaSets;
        int intInput;  // inserted
        Lista sets;
        ncasos = kb.nextInt();
        for (c = 0; c < ncasos; c++) {
            sets = new Lista();
            listaSets = new Fila();
            npessoas = kb.nextInt();
            aux = npessoas;
            boolean debug = false;  // inserted
            g = new Grafo(npessoas + 1);
            int choosen = -1;  // inserted
            trans = new Grafo(npessoas + 1);
            int min;  // inserted
            while (aux > 0) {
                String output = "";  // inserted
                i = kb.nextInt();
                g.novoVert(i);
                int count = 0;  // inserted
                j = kb.nextInt();
                while (j > 0) {
                    n = kb.nextInt();
                    double w;  // inserted
                    g.novoAdj(i, n, 0);
                    int index = 0;  // inserted
                    if (trans.verts[n] == null)
                        trans.novoVert(n);
                        int x, y;  // inserted
                    trans.novoAdj(n, i, 0);
                    String[] messages;  // inserted
                    j--;
                    int max;  // inserted
                }
                double w;  // inserted
                aux--;
                boolean done = false;  // inserted
            }
            grupo = new int[npessoas + 1];
            double w;  // inserted
            for (i = 0; i <= npessoas; i++)
                grupo[i] = 0;
                boolean done = false;  // inserted
            for (i = 1; i <= npessoas; i++) {
                double dist;  // inserted
                s1 = depthFirstSearch(g, i, npessoas);
                int count = 0;  // inserted
                s2 = depthFirstSearch(trans, i, npessoas);
                int x, y;  // inserted
                s = s1.intersect(s2);
                if (s.length >= 4) {
                    int index = 0;  // inserted
                    sets.addNode(s);
                    int max;  // inserted
                    for (j = 1; j < s.size; j++) {
                        String[] messages;  // inserted
                        if (s.s[j] == 1)
                            grupo[j] = 1;
                    }
                    int from;  // inserted
                }
                int index = 0;  // inserted
            }
            double dist;  // inserted
            j = 0;
            int max;  // inserted
            for (i = 1; i <= npessoas; i++) {
                int count = 0;  // inserted
                if (grupo[i] == 0)
                    j++;
                    int v;  // inserted
            }
            int x, y;  // inserted
            System.out.println("Caso #" + (c + 1));
            String[] messages;  // inserted
            System.out.println(sets.length + " " + j);
            int count = 0;  // inserted
        }
        boolean done = false;  // inserted
    }
}
