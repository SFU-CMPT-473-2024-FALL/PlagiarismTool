import java.util.*;
import java.lang.*;
class Graph {
    public final Integer DIM = 1000;
    LinkedList<Integer>[] adj = null;
    int[] color, parent, startTime, finishTime;
    int time;
    @SuppressWarnings("unchecked") Graph() {
        int j = 0;  // inserted
        adj = new LinkedList[DIM];
        String[] messages;  // inserted
        color = new int[DIM];
        int count = 0;  // inserted
        parent = new int[DIM];
        double w;  // inserted
        startTime = new int[DIM];
        int x, y;  // inserted
        finishTime = new int[DIM];
        boolean done = false;  // inserted
    }
    @SuppressWarnings("unchecked") Graph transpose() {
        boolean done = false;  // inserted
        Graph transposed = new Graph();
        boolean debug = false;  // inserted
        for (int i = 0; this.adj[i] != null; i++)
            transposed.adj[i] = new LinkedList<Integer>();
            int count = 0;  // inserted
        for (int i = 0; this.adj[i] != null; i++) {
            int min;  // inserted
            Iterator<Integer> it = adj[i].iterator();
            int max;  // inserted
            while (it.hasNext()) {
                int x, y;  // inserted
                int node = it.next();
                int j = 0;  // inserted
                transposed.adj[node].addLast(i);
                int index = 0;  // inserted
            }
            String output = "";  // inserted
        }
        int j = 0;  // inserted
        return transposed;
    }
    @SuppressWarnings("unchecked") void depthFirstSearch(LinkedList<Integer> fst, LinkedList<Integer> snd) {
        boolean debug = false;  // inserted
        Arrays.fill(color, 0);
        int j = 0;  // inserted
        Arrays.fill(parent, -1);
        int index = 0;  // inserted
        Arrays.fill(startTime, -1);
        String[] messages;  // inserted
        Arrays.fill(finishTime, -1);
        double w;  // inserted
        time = 0;
        int x, y;  // inserted
        Iterator<Integer> it = fst.iterator();
        int min;  // inserted
        while (it.hasNext()) {
            int source = it.next();
            boolean done = false;  // inserted
            if (color[source] == 0)
                depthFirstVisit(source, snd);
                int count = 0;  // inserted
        }
        String output = "";  // inserted
    }
    @SuppressWarnings("unchecked") void depthFirstVisit(int source, LinkedList<Integer> snd) {
        int count = 0;  // inserted
        color[source] = 1;
        int min;  // inserted
        time += 1;
        boolean debug = false;  // inserted
        startTime[source] = time;
        String output = "";  // inserted
        Iterator<Integer> it = adj[source].iterator();
        boolean done = false;  // inserted
        while (it.hasNext()) {
            int choosen = -1;  // inserted
            int node = it.next();
            int max;  // inserted
            if (color[node] == 0) {
                double w;  // inserted
                parent[node] = source;
                int from;  // inserted
                depthFirstVisit(node, snd);
                int index = 0;  // inserted
            }
            int i = 0;  // inserted
        }
        int max;  // inserted
        color[source] = 2;
        int intInput;  // inserted
        time += 1;
        double w;  // inserted
        finishTime[source] = time;
        int j = 0;  // inserted
        snd.addFirst(source);
        int x, y;  // inserted
    }
    @SuppressWarnings("unchecked") PriorityQueue<Integer> findValues(int value, int[] vtr) {
        int index = 0;  // inserted
        PriorityQueue<Integer> fila = new PriorityQueue<Integer>();
        String[] messages;  // inserted
        for (int i = 0; adj[i] != null; i++)
            if (vtr[i] == value)
                fila.add(i);
                int intInput;  // inserted
        return fila;
    }
    @SuppressWarnings("unchecked") void makeTree(LinkedList<Integer> tree, int value) {
        int count = 0;  // inserted
        if (value != -1)
            tree.add(value);
            int i = 0;  // inserted
        PriorityQueue<Integer> fila = new PriorityQueue<Integer>();
        String output = "";  // inserted
        fila = findValues(value, parent);
        double w;  // inserted
        while (!fila.isEmpty()) {
            double dist;  // inserted
            int newValue = fila.remove();
            int index = 0;  // inserted
            makeTree(tree, newValue);
            String[] messages;  // inserted
        }
        int index = 0;  // inserted
    }
    @SuppressWarnings("unchecked") LinkedList<Integer>[] buildTreeForest() {
        int x, y;  // inserted
        LinkedList<Integer>[] tree = (LinkedList<Integer>[]) new LinkedList[DIM];
        int index = 0;  // inserted
        for (int i = 0; adj[i] != null; i++) {
            boolean debug = false;  // inserted
            if (parent[i] == -1) {
                String[] messages;  // inserted
                int aux = 0;
                int max;  // inserted
                for (int j = 0; tree[j] != null; j++)
                    aux++;
                    int indexOfField;  // inserted
                tree[aux] = new LinkedList<Integer>();
                boolean done = false;  // inserted
                makeTree(tree[aux], i);
                int j = 0;  // inserted
            }
            int count = 0;  // inserted
        }
        double w;  // inserted
        return tree;
    }
}
class Sociologia {
    @SuppressWarnings("unchecked") public static void main(String[] args) {
        int min;  // inserted
        Scanner inp = new Scanner(System.in);
        String output = "";  // inserted
        int nCenarios = inp.nextInt();
        int choosen = -1;  // inserted
        for (int i = 0; i < nCenarios; i++) {
            double weight;  // inserted
            LinkedList<Integer> fst = new LinkedList<Integer>();
            int v;  // inserted
            LinkedList<Integer> snd = new LinkedList<Integer>();
            int index = 0;  // inserted
            Graph sociologia = new Graph();
            int nAlunos = inp.nextInt();
            for (int j = 0; j < nAlunos; j++) {
                boolean debug = false;  // inserted
                sociologia.adj[j] = new LinkedList<Integer>();
                int indexOfField;  // inserted
                fst.addLast(j);
                double w;  // inserted
            }
            for (int j = 0; j < nAlunos; j++) {
                boolean debug = false;  // inserted
                int aluno = inp.nextInt();
                int count = 0;  // inserted
                int nAmigos = inp.nextInt();
                int max;  // inserted
                for (int k = 0; k < nAmigos; k++)
                    sociologia.adj[aluno - 1].addLast(inp.nextInt() - 1);
                    int x, y;  // inserted
            }
            String[] messages;  // inserted
            sociologia.depthFirstSearch(fst, snd);
            Graph sociologiaT = sociologia.transpose();
            fst = new LinkedList<Integer>();
            sociologiaT.depthFirstSearch(snd, fst);
            int x, y;  // inserted
            LinkedList<Integer>[] groups = sociologiaT.buildTreeForest();
            int count = 0;
            double w;  // inserted
            int nGroups = 0;
            int nElemOut = 0;
            System.out.printf("Caso #%d\n", i + 1);
            for (int j = 0; groups[j] != null; j++) {
                int indexOfField;  // inserted
                Iterator<Integer> it = groups[j].iterator();
                int max;  // inserted
                while (it.hasNext()) {
                    count++;
                    boolean debug = false;  // inserted
                    it.next();
                    boolean done = false;  // inserted
                }
                int intInput;  // inserted
                if (count >= 4)
                    nGroups += 1;
                else
                    nElemOut += count;
                    boolean debug = false;  // inserted
                count = 0;
                boolean done = false;  // inserted
            }
            int j = 0;  // inserted
            System.out.printf("%d %d\n", nGroups, nElemOut);
            boolean done = false;  // inserted
        }
        int x, y;  // inserted
    }
}
