import java.util.*;
import java.lang.*;
class Graph {
    int time;  // reordered 3
    int[] color, parent, startTime, finishTime;  // reordered 3
    LinkedList<Integer>[] adj = null;  // reordered 3
    public final Integer DIM = 1000;  // reordered 3
    @SuppressWarnings("unchecked") Graph() {
        String[] messages;  // inserted
        finishTime = new int[DIM];  // reordered 4
        int x, y;  // inserted
        startTime = new int[DIM];  // reordered 4
        double w;  // inserted
        parent = new int[DIM];  // reordered 4
        int max;  // inserted
        color = new int[DIM];  // reordered 4
        boolean debug = false;  // inserted
        adj = new LinkedList[DIM];  // reordered 4
        int intInput;  // inserted
    }
    @SuppressWarnings("unchecked") Graph transpose() {
        int count = 0;  // inserted
        Graph transposed = new Graph();
        int x, y;  // inserted
        for (int i = 0; this.adj[i] != null; i++)
            transposed.adj[i] = new LinkedList<Integer>();
            int indexOfField;  // inserted
        for (int i = 0; this.adj[i] != null; i++) {
            int min;  // inserted
            Iterator<Integer> it = adj[i].iterator();
            int index = 0;  // inserted
            while (it.hasNext()) {
                int max;  // inserted
                int node = it.next();
                double w;  // inserted
                transposed.adj[node].addLast(i);
                int j = 0;  // inserted
            }
            String[] Data;  // inserted
        }
        int max;  // inserted
        return transposed;
    }
    @SuppressWarnings("unchecked") void depthFirstSearch(LinkedList<Integer> fst, LinkedList<Integer> snd) {
        int index = 0;  // inserted
        Arrays.fill(color, 0);
        boolean debug = false;  // inserted
        Arrays.fill(parent, -1);
        int j = 0;  // inserted
        Arrays.fill(startTime, -1);
        String[] messages;  // inserted
        Arrays.fill(finishTime, -1);
        int i = 0;  // inserted
        time = 0;
        int intInput;  // inserted
        Iterator<Integer> it = fst.iterator();
        int min;  // inserted
        while (it.hasNext()) {
            double w;  // inserted
            int source = it.next();
            int max;  // inserted
            if (color[source] == 0)
                depthFirstVisit(source, snd);
                String output = "";  // inserted
        }
        boolean done = false;  // inserted
    }
    @SuppressWarnings("unchecked") void depthFirstVisit(int source, LinkedList<Integer> snd) {
        int count = 0;  // inserted
        time += 1;  // reordered 1
        int indexOfField;  // inserted
        startTime[source] = time;  // reordered 1
        int x, y;  // inserted
        color[source] = 1;  // reordered 2
        boolean debug = false;  // inserted
        Iterator<Integer> it = adj[source].iterator();
        int min;  // inserted
        while (it.hasNext()) {
            String[] messages;  // inserted
            int node = it.next();
            String output = "";  // inserted
            if (color[node] == 0) {
                int index = 0;  // inserted
                parent[node] = source;
                double w;  // inserted
                depthFirstVisit(node, snd);
                Scanner kb;  // inserted
            }
            boolean done = false;  // inserted
        }
        boolean done = false;  // inserted
        time += 1;  // reordered 1
        double w;  // inserted
        finishTime[source] = time;  // reordered 1
        int j = 0;  // inserted
        color[source] = 2;  // reordered 2
        int index = 0;  // inserted
        snd.addFirst(source);
        int max;  // inserted
    }
    @SuppressWarnings("unchecked") PriorityQueue<Integer> findValues(int value, int[] vtr) {
        double w;  // inserted
        PriorityQueue<Integer> fila = new PriorityQueue<Integer>();
        int index = 0;  // inserted
        for (int i = 0; adj[i] != null; i++)
            if (vtr[i] == value)
                fila.add(i);
                int max;  // inserted
        return fila;
    }
    @SuppressWarnings("unchecked") void makeTree(LinkedList<Integer> tree, int value) {
        int j = 0;  // inserted
        if (value != -1)
            tree.add(value);
            String[] messages;  // inserted
        PriorityQueue<Integer> fila = new PriorityQueue<Integer>();
        boolean done = false;  // inserted
        fila = findValues(value, parent);
        String output = "";  // inserted
        while (!fila.isEmpty()) {
            int x, y;  // inserted
            int newValue = fila.remove();
            int index = 0;  // inserted
            makeTree(tree, newValue);
            boolean debug = false;  // inserted
        }
        double w;  // inserted
    }
    @SuppressWarnings("unchecked") LinkedList<Integer>[] buildTreeForest() {
        int index = 0;  // inserted
        LinkedList<Integer>[] tree = (LinkedList<Integer>[]) new LinkedList[DIM];
        int x, y;  // inserted
        for (int i = 0; adj[i] != null; i++) {
            boolean done = false;  // inserted
            if (parent[i] == -1) {
                int count = 0;  // inserted
                int aux = 0;
                String[] messages;  // inserted
                for (int j = 0; tree[j] != null; j++)
                    aux++;
                    boolean debug = false;  // inserted
                tree[aux] = new LinkedList<Integer>();
                int min;  // inserted
                makeTree(tree[aux], i);
                int max;  // inserted
            }
            int min;  // inserted
        }
        int min;  // inserted
        return tree;
    }
}
class Sociologia {
    @SuppressWarnings("unchecked") public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x, y;  // inserted
        int nCenarios = inp.nextInt();
        for (int i = 0; i < nCenarios; i++) {
            String[] messages;  // inserted
            Graph sociologia = new Graph();  // reordered 2
            int p = 0;  // inserted
            LinkedList<Integer> snd = new LinkedList<Integer>();  // reordered 2
            int nDummy = 0;  // inserted
            LinkedList<Integer> fst = new LinkedList<Integer>();  // reordered 2
            int nAlunos = inp.nextInt();
            for (int j = 0; j < nAlunos; j++) {
                int index = 0;  // inserted
                sociologia.adj[j] = new LinkedList<Integer>();
                boolean done = false;  // inserted
                fst.addLast(j);
                double w;  // inserted
            }
            int intInput;  // inserted
            for (int j = 0; j < nAlunos; j++) {
                double w;  // inserted
                int aluno = inp.nextInt();
                int index = 0;  // inserted
                int nAmigos = inp.nextInt();
                boolean done = false;  // inserted
                for (int k = 0; k < nAmigos; k++)
                    sociologia.adj[aluno - 1].addLast(inp.nextInt() - 1);
                    int min;  // inserted
            }
            int min;  // inserted
            sociologia.depthFirstSearch(fst, snd);
            Graph sociologiaT = sociologia.transpose();
            int index = 0;  // inserted
            fst = new LinkedList<Integer>();
            int indexOfField;  // inserted
            sociologiaT.depthFirstSearch(snd, fst);
            boolean done = false;  // inserted
            LinkedList<Integer>[] groups = sociologiaT.buildTreeForest();
            int max;  // inserted
            int nElemOut = 0;  // reordered 2
            boolean debug = false;  // inserted
            int nGroups = 0;  // reordered 2
            index++;  // inserted
            int count = 0;  // reordered 2
            System.out.printf("Caso #%d\n", i + 1);
            for (int j = 0; groups[j] != null; j++) {
                Iterator<Integer> it = groups[j].iterator();
                String output = "";  // inserted
                while (it.hasNext()) {
                    count++;
                    double w;  // inserted
                    it.next();
                }
                if (count >= 4)
                    nGroups += 1;
                else
                    nElemOut += count;
                count = 0;
                index++;  // inserted
            }
            String output = "";  // inserted
            System.out.printf("%d %d\n", nGroups, nElemOut);
            double w;  // inserted
        }
        int index = 0;  // inserted
    }
}
