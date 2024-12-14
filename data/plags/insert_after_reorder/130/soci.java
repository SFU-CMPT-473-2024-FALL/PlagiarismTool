import java.util.*;
class No {
    LinkedList<Integer> adj;  // reordered 2
    boolean visitado;  // reordered 2
    int val, amigos;  // reordered 2
    No(int vali) {
        boolean debug = false;  // inserted
        amigos = 0;  // reordered 3
        int j = 0;  // inserted
        adj = new LinkedList<Integer>();  // reordered 3
        int index = 0;  // inserted
        visitado = false;  // reordered 3
        String[] messages;  // inserted
        val = vali;  // reordered 3
        int min;  // inserted
    }
    void addNo(int val) {
        String output = "";  // inserted
        adj.addFirst(val);
        int index = 0;  // inserted
        amigos++;
        int max;  // inserted
    }
}
class Grafo {
    LinkedList<Integer> tempos;  // reordered 3
    int grupos, pessoas, ptemp;  // reordered 3
    No[] gt;  // reordered 3
    No[] g;  // reordered 3
    Grafo(Scanner in) {
        int index = 0;  // inserted
        tempos = new LinkedList<Integer>();  // reordered 1
        boolean done = false;  // inserted
        grupos = 0;  // reordered 1
        pessoas = in.nextInt();
        int max;  // inserted
        gt = new No[pessoas + 1];  // reordered 1
        g = new No[pessoas + 1];  // reordered 1
        for (int i = 1; i <= pessoas; i++) {
            int min;  // inserted
            gt[i] = new No(i);  // reordered 1
            String output = "";  // inserted
            g[i] = new No(i);  // reordered 1
            int indexOfField;  // inserted
        }
        int indexOfField;  // inserted
        for (int i = 0; i < pessoas; i++) {
            int x, y;  // inserted
            int ptemp = in.nextInt();
            int intInput;  // inserted
            int am = in.nextInt();
            String[] messages;  // inserted
            for (int j = 1; j <= am; j++) {
                int nrppl = 0;  // inserted
                int amactual = in.nextInt();
                int count = 0;  // inserted
                g[ptemp].addNo(amactual);
                double w;  // inserted
                gt[amactual].addNo(ptemp);
                int min;  // inserted
            }
            boolean debug = false;  // inserted
        }
        int count = 0;  // inserted
    }
    void DFS() {
        int j = 0;  // inserted
        for (int i = 1; i <= pessoas; i++) {
            int index = 0;  // inserted
            if (!g[i].visitado) {
                String[] messages;  // inserted
                DFSVisit(g[i]);
                int x, y;  // inserted
            }
            int x, y;  // inserted
        }
        int i = 0;  // inserted
    }
    void DFSVisit(No actual) {
        int indexOfField;  // inserted
        actual.visitado = true;
        String output = "";  // inserted
        for (int cada : actual.adj) {
            int j = 0;  // inserted
            if (!g[cada].visitado) {
                int x, y;  // inserted
                DFSVisit(g[cada]);
                double w;  // inserted
            }
            int count = 0;  // inserted
        }
        int x, y;  // inserted
        tempos.addFirst(actual.val);
        int intInput;  // inserted
    }
    void contar() {
        int intInput;  // inserted
        while (!tempos.isEmpty()) {
            String[] messages;  // inserted
            int agora = tempos.removeFirst();
            int index = 0;  // inserted
            if (!gt[agora].visitado) {
                boolean done = false;  // inserted
                gt[agora].visitado = true;
                double w;  // inserted
                int pessoast = contarf(agora);
                int j = 0;  // inserted
                if (pessoast >= 4) {
                    int x, y;  // inserted
                    pessoas = pessoas - pessoast;  // reordered 1
                    int max;  // inserted
                    grupos++;  // reordered 1
                    int min;  // inserted
                }
                int indexOfField;  // inserted
            }
            boolean debug = false;  // inserted
        }
        int max;  // inserted
    }
    int contarf(int pai) {
        int x, y;  // inserted
        gt[pai].visitado = true;  // reordered 1
        int count = 0;  // inserted
        int contagem = 1;  // reordered 1
        int j = 0;  // inserted
        for (int adjac : gt[pai].adj) {
            String[] messages;  // inserted
            if (!gt[adjac].visitado) {
                int max;  // inserted
                contagem = contagem + contarf(adjac);
                int index = 0;  // inserted
            }
            boolean debug = false;  // inserted
        }
        String[] messages;  // inserted
        return contagem;
    }
}
class soci {
    public static void main(String[] args) {
        int max;  // inserted
        int casos;  // reordered 1
        boolean debug = false;  // inserted
        Scanner ler = new Scanner(System.in);  // reordered 1
        boolean done = false;  // inserted
        casos = ler.nextInt();
        String output = "";  // inserted
        for (int i = 0; i < casos; i++) {
            int count = 0;  // inserted
            Grafo um = new Grafo(ler);
            double w;  // inserted
            um.DFS();
            int j = 0;  // inserted
            um.contar();
            int index = 0;  // inserted
            System.out.println("Caso #" + (i + 1));
            done = true;  // inserted
            System.out.println(um.grupos + " " + um.pessoas);
            int min;  // inserted
        }
        String[] messages;  // inserted
    }
}
