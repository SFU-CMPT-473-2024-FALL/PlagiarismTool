import java.util.*;
class No {
    LinkedList<Integer> adj;  // reordered 2
    boolean visitado;  // reordered 2
    int val, amigos;  // reordered 2
    No(int vali) {
        amigos = 0;  // reordered 3
        adj = new LinkedList<Integer>();  // reordered 3
        visitado = false;  // reordered 3
        val = vali;  // reordered 3
    }
    void addNo(int val) {
        adj.addFirst(val);
        amigos++;
    }
}
class Grafo {
    LinkedList<Integer> tempos;  // reordered 3
    int grupos, pessoas, ptemp;  // reordered 3
    No[] gt;  // reordered 3
    No[] g;  // reordered 3
    Grafo(Scanner in) {
        tempos = new LinkedList<Integer>();  // reordered 1
        grupos = 0;  // reordered 1
        pessoas = in.nextInt();
        gt = new No[pessoas + 1];  // reordered 1
        g = new No[pessoas + 1];  // reordered 1
        for (int i = 1; i <= pessoas; i++) {
            gt[i] = new No(i);  // reordered 1
            g[i] = new No(i);  // reordered 1
        }
        for (int i = 0; i < pessoas; i++) {
            int ptemp = in.nextInt();
            int am = in.nextInt();
            for (int j = 1; j <= am; j++) {
                int amactual = in.nextInt();
                g[ptemp].addNo(amactual);
                gt[amactual].addNo(ptemp);
            }
        }
    }
    void DFS() {
        for (int i = 1; i <= pessoas; i++) {
            if (!g[i].visitado) {
                DFSVisit(g[i]);
            }
        }
    }
    void DFSVisit(No actual) {
        actual.visitado = true;
        for (int cada : actual.adj) {
            if (!g[cada].visitado) {
                DFSVisit(g[cada]);
            }
        }
        tempos.addFirst(actual.val);
    }
    void contar() {
        while (!tempos.isEmpty()) {
            int agora = tempos.removeFirst();
            if (!gt[agora].visitado) {
                gt[agora].visitado = true;
                int pessoast = contarf(agora);
                if (pessoast >= 4) {
                    pessoas = pessoas - pessoast;  // reordered 1
                    grupos++;  // reordered 1
                }
            }
        }
    }
    int contarf(int pai) {
        gt[pai].visitado = true;  // reordered 1
        int contagem = 1;  // reordered 1
        for (int adjac : gt[pai].adj) {
            if (!gt[adjac].visitado) {
                contagem = contagem + contarf(adjac);
            }
        }
        return contagem;
    }
}
class soci {
    public static void main(String[] args) {
        int casos;  // reordered 1
        Scanner ler = new Scanner(System.in);  // reordered 1
        casos = ler.nextInt();
        for (int i = 0; i < casos; i++) {
            Grafo um = new Grafo(ler);
            um.DFS();
            um.contar();
            System.out.println("Caso #" + (i + 1));
            System.out.println(um.grupos + " " + um.pessoas);
        }
    }
}
