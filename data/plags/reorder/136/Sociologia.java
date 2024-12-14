import java.util.*;
import java.lang.*;
class Graph {
    int time;  // reordered 3
    int[] color, parent, startTime, finishTime;  // reordered 3
    LinkedList<Integer>[] adj = null;  // reordered 3
    public final Integer DIM = 1000;  // reordered 3
    @SuppressWarnings("unchecked") Graph() {
        finishTime = new int[DIM];  // reordered 4
        startTime = new int[DIM];  // reordered 4
        parent = new int[DIM];  // reordered 4
        color = new int[DIM];  // reordered 4
        adj = new LinkedList[DIM];  // reordered 4
    }
    @SuppressWarnings("unchecked") Graph transpose() {
        Graph transposed = new Graph();
        for (int i = 0; this.adj[i] != null; i++)
            transposed.adj[i] = new LinkedList<Integer>();
        for (int i = 0; this.adj[i] != null; i++) {
            Iterator<Integer> it = adj[i].iterator();
            while (it.hasNext()) {
                int node = it.next();
                transposed.adj[node].addLast(i);
            }
        }
        return transposed;
    }
    @SuppressWarnings("unchecked") void depthFirstSearch(LinkedList<Integer> fst, LinkedList<Integer> snd) {
        Arrays.fill(color, 0);
        Arrays.fill(parent, -1);
        Arrays.fill(startTime, -1);
        Arrays.fill(finishTime, -1);
        time = 0;
        Iterator<Integer> it = fst.iterator();
        while (it.hasNext()) {
            int source = it.next();
            if (color[source] == 0)
                depthFirstVisit(source, snd);
        }
    }
    @SuppressWarnings("unchecked") void depthFirstVisit(int source, LinkedList<Integer> snd) {
        time += 1;  // reordered 1
        startTime[source] = time;  // reordered 1
        color[source] = 1;  // reordered 2
        Iterator<Integer> it = adj[source].iterator();
        while (it.hasNext()) {
            int node = it.next();
            if (color[node] == 0) {
                parent[node] = source;
                depthFirstVisit(node, snd);
            }
        }
        time += 1;  // reordered 1
        finishTime[source] = time;  // reordered 1
        color[source] = 2;  // reordered 2
        snd.addFirst(source);
    }
    @SuppressWarnings("unchecked") PriorityQueue<Integer> findValues(int value, int[] vtr) {
        PriorityQueue<Integer> fila = new PriorityQueue<Integer>();
        for (int i = 0; adj[i] != null; i++)
            if (vtr[i] == value)
                fila.add(i);
        return fila;
    }
    @SuppressWarnings("unchecked") void makeTree(LinkedList<Integer> tree, int value) {
        if (value != -1)
            tree.add(value);
        PriorityQueue<Integer> fila = new PriorityQueue<Integer>();
        fila = findValues(value, parent);
        while (!fila.isEmpty()) {
            int newValue = fila.remove();
            makeTree(tree, newValue);
        }
    }
    @SuppressWarnings("unchecked") LinkedList<Integer>[] buildTreeForest() {
        LinkedList<Integer>[] tree = (LinkedList<Integer>[]) new LinkedList[DIM];
        for (int i = 0; adj[i] != null; i++) {
            if (parent[i] == -1) {
                int aux = 0;
                for (int j = 0; tree[j] != null; j++)
                    aux++;
                tree[aux] = new LinkedList<Integer>();
                makeTree(tree[aux], i);
            }
        }
        return tree;
    }
}
class Sociologia {
    @SuppressWarnings("unchecked") public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int nCenarios = inp.nextInt();
        for (int i = 0; i < nCenarios; i++) {
            Graph sociologia = new Graph();  // reordered 2
            LinkedList<Integer> snd = new LinkedList<Integer>();  // reordered 2
            LinkedList<Integer> fst = new LinkedList<Integer>();  // reordered 2
            int nAlunos = inp.nextInt();
            for (int j = 0; j < nAlunos; j++) {
                sociologia.adj[j] = new LinkedList<Integer>();
                fst.addLast(j);
            }
            for (int j = 0; j < nAlunos; j++) {
                int aluno = inp.nextInt();
                int nAmigos = inp.nextInt();
                for (int k = 0; k < nAmigos; k++)
                    sociologia.adj[aluno - 1].addLast(inp.nextInt() - 1);
            }
            sociologia.depthFirstSearch(fst, snd);
            Graph sociologiaT = sociologia.transpose();
            fst = new LinkedList<Integer>();
            sociologiaT.depthFirstSearch(snd, fst);
            LinkedList<Integer>[] groups = sociologiaT.buildTreeForest();
            int nElemOut = 0;  // reordered 2
            int nGroups = 0;  // reordered 2
            int count = 0;  // reordered 2
            System.out.printf("Caso #%d\n", i + 1);
            for (int j = 0; groups[j] != null; j++) {
                Iterator<Integer> it = groups[j].iterator();
                while (it.hasNext()) {
                    count++;
                    it.next();
                }
                if (count >= 4)
                    nGroups += 1;
                else
                    nElemOut += count;
                count = 0;
            }
            System.out.printf("%d %d\n", nGroups, nElemOut);
        }
    }
}
