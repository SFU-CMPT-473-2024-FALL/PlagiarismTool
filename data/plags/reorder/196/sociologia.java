import java.util.*;
class Grafo {
    Vertice[] verts;  // reordered 1
    int nverts, narcos;  // reordered 1
    Grafo(int n) {
        verts = new Vertice[n];  // reordered 2
        narcos = 0;  // reordered 2
        nverts = 0;  // reordered 2
    }
    void novoVert(int n) {
        nverts++;  // reordered 1
        verts[n] = new Vertice(n);  // reordered 1
    }
    void novoAdj(int v, int a, int c) {
        if (procuraArco(v, a) == 0) {
            verts[v].adicionarAdj(a, c);
            narcos++;
        }
    }
    int procuraArco(int v, int d) {
        Arco aux;
        aux = verts[v].adjs;
        while (aux != null) {
            if (aux.proxVert == d)
                return 1;
            else
                aux = aux.prox;
        }
        return 0;
    }
}
class Arco {
    Arco prox;  // reordered 1
    int proxVert, c;  // reordered 1
    Arco(int v, int ca) {
        prox = null;  // reordered 2
        c = ca;  // reordered 2
        proxVert = v;  // reordered 2
    }
    Arco(int v, int ca, Arco a) {
        prox = a;  // reordered 2
        c = ca;  // reordered 2
        proxVert = v;  // reordered 2
    }
}
class Vertice {
    Arco adjs;  // reordered 1
    int label;  // reordered 1
    Vertice(int v) {
        adjs = null;  // reordered 1
        label = v;  // reordered 1
    }
    void adicionarAdj(int n, int c) {
        adjs = new Arco(n, c, adjs);
    }
}
class Fila {
    int length;  // reordered 1
    Node first;  // reordered 1
    Fila() {
        length = 0;  // reordered 1
        first = null;  // reordered 1
    }
    void imprimeFila() {
        Node aux;
        aux = first;
        while (aux != null) {
            System.out.println(aux.val);
            aux = aux.prox;
        }
    }
    boolean isEmpty() {
        if (length == 0)
            return true;
        return false;
    }
    void pushNode(int v) {
        Node aux;
        if (length == 0) {
            length++;  // reordered 1
            first = new Node(v, null);  // reordered 1
        } else {
            length++;  // reordered 2
            aux = new Node(v, first);  // reordered 1
            first = aux;  // reordered 1
        }
    }
    int popNode() {
        length--;  // reordered 3
        int aux;  // reordered 1
        aux = first.val;  // reordered 1
        first = first.prox;  // reordered 1
        return aux;
    }
    class Node {
        Node prox;  // reordered 1
        int val;  // reordered 1
        Node(int v, Node p) {
            prox = p;  // reordered 1
            val = v;  // reordered 1
        }
    }
}
class Set {
    int size, length;  // reordered 1
    int[] s;  // reordered 1
    Set(int x) {
        s = new int[x + 1];  // reordered 3
        length = 0;  // reordered 3
        size = x + 1;  // reordered 3
        int i;  // reordered 3
        for (i = 0; i < x + 1; i++)
            s[i] = 0;
    }
    void insert(int n) {
        length++;  // reordered 1
        s[n] = 1;  // reordered 1
    }
    void remove(int n) {
        length--;  // reordered 1
        s[n] = 0;  // reordered 1
    }
    int size() {
        return length;
    }
    void imprime() {
        int i;
        for (i = 1; i < size; i++) {
            if (s[i] == 1)
                System.out.println(i);
        }
    }
    boolean isEqual(Set x) {
        int i;
        if (length != x.length)
            return false;
        for (i = 0; i < size; i++)
            if (s[i] != x.s[i])
                return false;
        return true;
    }
    Set intersect(Set x) {
        int i;  // reordered 1
        Set aux = new Set(size);  // reordered 1
        for (i = 0; i < size; i++) {
            if (s[i] == 1 && x.s[i] == 1)
                aux.insert(i);
        }
        return aux;
    }
}
class Lista {
    int length;  // reordered 1
    Node first;  // reordered 1
    Lista() {
        length = 0;  // reordered 1
        first = null;  // reordered 1
    }
    void addNode(Set n) {
        int flag = 0;  // reordered 1
        Node aux;  // reordered 1
        if (length == 0) {
            length++;  // reordered 1
            first = new Node(n, null);  // reordered 1
        } else {
            flag = 0;  // reordered 1
            aux = first;  // reordered 1
            while (aux != null) {
                if (aux.s.isEqual(n) == true) {
                    flag = 1;
                    break;
                }
                aux = aux.prox;
            }
            if (flag == 0) {
                length++;  // reordered 2
                aux = new Node(n, first);  // reordered 1
                first = aux;  // reordered 1
            }
        }
    }
    class Node {
        Node prox;  // reordered 1
        Set s;  // reordered 1
        Node(Set n, Node p) {
            prox = p;  // reordered 1
            s = n;  // reordered 1
        }
    }
}
class sociologia {
    static Set depthFirstSearch(Grafo g, int v, int n) {
        Set s = new Set(n + 1);  // reordered 4
        Fila stack = new Fila();  // reordered 4
        Arco aux;  // reordered 4
        int cont, i;  // reordered 4
        int[] lidos = new int[n + 1];  // reordered 4
        for (i = 0; i < n + 1; i++)
            lidos[i] = 0;
        stack.pushNode(v);
        s.insert(v);
        while (stack.isEmpty() == false) {
            i = stack.popNode();
            lidos[i] = 1;
            if (g.verts[i] != null) {
                aux = g.verts[i].adjs;
                while (aux != null) {
                    if (lidos[aux.proxVert] == 0) {
                        stack.pushNode(aux.proxVert);
                        lidos[aux.proxVert] = 1;
                        s.insert(aux.proxVert);
                    }
                    aux = aux.prox;
                }
            }
        }
        return s;
    }
    public static void main(String[] args) {
        Lista sets;  // reordered 6
        Fila listaSets;  // reordered 6
        Scanner kb = new Scanner(System.in);  // reordered 6
        Set s1, s2, s;  // reordered 6
        Grafo g, trans;  // reordered 6
        int[] grupo;  // reordered 6
        int ncasos, npessoas, i, j, n, aux, c;  // reordered 6
        ncasos = kb.nextInt();
        for (c = 0; c < ncasos; c++) {
            listaSets = new Fila();  // reordered 1
            sets = new Lista();  // reordered 1
            npessoas = kb.nextInt();
            trans = new Grafo(npessoas + 1);  // reordered 2
            g = new Grafo(npessoas + 1);  // reordered 2
            aux = npessoas;  // reordered 2
            while (aux > 0) {
                i = kb.nextInt();
                g.novoVert(i);
                j = kb.nextInt();
                while (j > 0) {
                    n = kb.nextInt();
                    g.novoAdj(i, n, 0);
                    if (trans.verts[n] == null)
                        trans.novoVert(n);
                    trans.novoAdj(n, i, 0);
                    j--;
                }
                aux--;
            }
            grupo = new int[npessoas + 1];
            for (i = 0; i <= npessoas; i++)
                grupo[i] = 0;
            for (i = 1; i <= npessoas; i++) {
                s1 = depthFirstSearch(g, i, npessoas);
                s2 = depthFirstSearch(trans, i, npessoas);
                s = s1.intersect(s2);
                if (s.length >= 4) {
                    sets.addNode(s);
                    for (j = 1; j < s.size; j++) {
                        if (s.s[j] == 1)
                            grupo[j] = 1;
                    }
                }
            }
            j = 0;
            for (i = 1; i <= npessoas; i++) {
                if (grupo[i] == 0)
                    j++;
            }
            System.out.println("Caso #" + (c + 1));
            System.out.println(sets.length + " " + j);
        }
    }
}
