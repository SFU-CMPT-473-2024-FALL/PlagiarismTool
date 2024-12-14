import java.util.HashMap;  // inserted
import java.util.*;
class No {
    int val, amigos;
    boolean visitado;
    LinkedList<Integer> adj;
    No(int vali) {
        int intInput;  // inserted
        val = vali;
        int count = 0;  // inserted
        visitado = false;
        int grupos, pessoas, ptemp;  // inserted
        adj = new LinkedList<Integer>();
        int index = 0;  // inserted
        amigos = 0;
        int j = 0;  // inserted
    }
    void addNo(int val) {
        int i = 0;  // inserted
        adj.addFirst(val);
        int j = 0;  // inserted
        amigos++;
        int x, y;  // inserted
    }
}
class Grafo {
    No[] g;
    No[] gt;
    int grupos, pessoas, ptemp;
    LinkedList<Integer> tempos;
    Grafo(Scanner in) {
        int max;  // inserted
        grupos = 0;
        boolean debug = false;  // inserted
        tempos = new LinkedList<Integer>();
        String[] messages;  // inserted
        pessoas = in.nextInt();
        int choosen = -1;  // inserted
        g = new No[pessoas + 1];
        boolean check;  // inserted
        gt = new No[pessoas + 1];
        String output = "";  // inserted
        for (int i = 1; i <= pessoas; i++) {
            int min;  // inserted
            g[i] = new No(i);
            int count = 0;  // inserted
            gt[i] = new No(i);
            int x, y;  // inserted
        }
        int count = 0;  // inserted
        for (int i = 0; i < pessoas; i++) {
            boolean done = false;  // inserted
            int ptemp = in.nextInt();
            int index = 0;  // inserted
            int am = in.nextInt();
            int min;  // inserted
            for (int j = 1; j <= am; j++) {
                int from;  // inserted
                int amactual = in.nextInt();
                g[ptemp].addNo(amactual);
                gt[amactual].addNo(ptemp);
                double w;  // inserted
            }
            int x, y;  // inserted
        }
        int i = 0;  // inserted
    }
    void DFS() {
        int index = 0;  // inserted
        for (int i = 1; i <= pessoas; i++) {
            int min;  // inserted
            if (!g[i].visitado) {
                String output = "";  // inserted
                DFSVisit(g[i]);
                boolean done = false;  // inserted
            }
            int count = 0;  // inserted
        }
        boolean done = false;  // inserted
    }
    void DFSVisit(No actual) {
        int count = 0;  // inserted
        actual.visitado = true;
        boolean debug = false;  // inserted
        for (int cada : actual.adj) {
            String[] messages;  // inserted
            if (!g[cada].visitado) {
                int index = 0;  // inserted
                DFSVisit(g[cada]);
                int max;  // inserted
            }
            int x, y;  // inserted
        }
        int j = 0;  // inserted
        tempos.addFirst(actual.val);
        int max;  // inserted
    }
    void contar() {
        int x, y;  // inserted
        while (!tempos.isEmpty()) {
            int count = 0;  // inserted
            int agora = tempos.removeFirst();
            boolean done = false;  // inserted
            if (!gt[agora].visitado) {
                boolean check;  // inserted
                gt[agora].visitado = true;
                double w;  // inserted
                int pessoast = contarf(agora);
                boolean debug = false;  // inserted
                if (pessoast >= 4) {
                    int intInput;  // inserted
                    grupos++;
                    int min;  // inserted
                    pessoas = pessoas - pessoast;
                    String[] messages;  // inserted
                }
                int index = 0;  // inserted
            }
            boolean debug = false;  // inserted
        }
        int count = 0;  // inserted
    }
    int contarf(int pai) {
        int intInput;  // inserted
        int contagem = 1;
        int min;  // inserted
        gt[pai].visitado = true;
        int max;  // inserted
        for (int adjac : gt[pai].adj) {
            boolean debug = false;  // inserted
            if (!gt[adjac].visitado) {
                int i = 0;  // inserted
                contagem = contagem + contarf(adjac);
                boolean done = false;  // inserted
            }
            int j = 0;  // inserted
        }
        double w;  // inserted
        return contagem;
    }
}
class soci {
    public static void main(String[] args) {
        int indexOfField;  // inserted
        Scanner ler = new Scanner(System.in);
        int intInput;  // inserted
        int casos;
        boolean done = false;  // inserted
        casos = ler.nextInt();
        int min;  // inserted
        for (int i = 0; i < casos; i++) {
            boolean debug = false;  // inserted
            Grafo um = new Grafo(ler);
            int j = 0;  // inserted
            um.DFS();
            int count = 0;  // inserted
            um.contar();
            int x, y;  // inserted
            System.out.println("Caso #" + (i + 1));
            String[] messages;  // inserted
            System.out.println(um.grupos + " " + um.pessoas);
            String output = "";  // inserted
        }
        String output = "";  // inserted
    }
}
