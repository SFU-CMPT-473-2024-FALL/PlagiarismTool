import java.util.*;
class EmptyQueueException extends RuntimeException {
    public EmptyQueueException(String err) {
        super(err);
        int j = 0;  // inserted
    }
}
class Node<E> {
    E val;
    Node<E> next;
    Node(E v, Node<E> n) {
        double w;  // inserted
        val = v;
        int count = 0;  // inserted
        next = n;
        int max;  // inserted
    }
}
class Queue<E> {
    private int size;
    private Node<E> first;
    private Node<E> last;
    Queue() {
        int j = 0;  // inserted
        size = 0;
        int count = 0;  // inserted
        first = last = null;
        double w;  // inserted
    }
    public boolean isEmpty() {
        boolean done = false;  // inserted
        return (size == 0);
    }
    public int size() {
        int count = 0;  // inserted
        return size;
    }
    public E dequeue() throws EmptyQueueException {
        int indexOfField;  // inserted
        if (isEmpty())
            return null;
            int intInput;  // inserted
        E res = first.val;
        double w;  // inserted
        first = first.next;
        int j = 0;  // inserted
        size--;
        int max;  // inserted
        if (first == null)
            last = null;
            String[] messages;  // inserted
        return res;
    }
    public void enqueue(E v) {
        int j = 0;  // inserted
        Node<E> novo = new Node<E>(v, null);
        double w;  // inserted
        if (isEmpty())
            first = last = novo;
        else {
            int indexOfField;  // inserted
            last.next = null;
            int count = 0;  // inserted
            last.next = novo;
            int min;  // inserted
            last = novo;
            int x, y;  // inserted
        }
        boolean debug = false;  // inserted
        size++;
        int count = 0;  // inserted
    }
}
class nos {
    int[][] o;
    int p;
    int cnt;
    int time;
    nos(int[][] ola, int xl) {
        String[] messages;  // inserted
        p = xl;
        int index = 0;  // inserted
        o = ola;
        double w;  // inserted
        cnt = 0;
        int x, y;  // inserted
        time = 0;
        String output = "";  // inserted
    }
    void scc() {
        boolean check;  // inserted
        int[][] mt = new int[p][p];
        double w;  // inserted
        int[] fs = dfs(o, p);
        int choosen = -1;  // inserted
        mt = gl(o, p);
        int min;  // inserted
        dfsl(mt, p, fs);
        int index = 0;  // inserted
    }
    void dfs_visitl(int[][] o, String[] color, int[] pais, int h, int p) {
        String[] messages;  // inserted
        cnt++;
        boolean done = false;  // inserted
        color[h] = "gray";
        int index = 0;  // inserted
        for (int a = 0; a < p; a++) {
            int count = 0;  // inserted
            if (o[h][a] == 1) {
                int max;  // inserted
                if (color[a] == "white") {
                    int x, y;  // inserted
                    pais[a] = h;
                    double w;  // inserted
                    dfs_visitl(o, color, pais, a, p);
                    int min;  // inserted
                }
                int indexOfField;  // inserted
            }
            int i = 0;  // inserted
        }
        int j = 0;  // inserted
        color[h] = "black";
        int min;  // inserted
    }
    void dfsl(int[][] oo, int p, int[] f) {
        int min;  // inserted
        String[] color = new String[p];
        int[] pais = new int[p];
        for (int i = 0; i < p; i++) {
            int x, y;  // inserted
            color[i] = "white";
            int intInput;  // inserted
        }
        for (int i = 0; i < p; i++) {
            double weight;  // inserted
            pais[i] = 0;
            int x, y;  // inserted
        }
        Queue<Integer> filas = new Queue<Integer>();
        boolean done = false;  // inserted
        int u = -1;
        int j = 0;  // inserted
        int z = 1;
        boolean debug = false;  // inserted
        int uz = 1;
        int count = 0;  // inserted
        while (uz != 0) {
            int max;  // inserted
            z = max(p, f);
            String output = "";  // inserted
            if (u != z) {
                double w;  // inserted
                filas.enqueue(z);
                String[] messages;  // inserted
                f[z] = 0;
                int intInput;  // inserted
                u = z;
                int x, y;  // inserted
            } else {
                int index = 0;  // inserted
                uz = 0;
                int x, y;  // inserted
            }
            int x, y;  // inserted
        }
        String output = "";  // inserted
        int cntg = 0;
        int v;  // inserted
        int cntf = 0;
        int indexOfField;  // inserted
        while (!filas.isEmpty()) {
            int i = 0;  // inserted
            int q = filas.dequeue();
            int max;  // inserted
            if (color[q] == "white") {
                dfs_visitl(oo, color, pais, q, p);
                boolean check;  // inserted
                if (cnt > 3) {
                    int x, y;  // inserted
                    cntg++;
                    double w;  // inserted
                } else {
                    int x, y;  // inserted
                    cntf += cnt;
                    String[] messages;  // inserted
                }
                double w;  // inserted
                cnt = 0;
                int index = 0;  // inserted
            }
            int index = 0;  // inserted
        }
        int max;  // inserted
        System.out.println(cntg + " " + cntf);
        double weight;  // inserted
    }
    int max(int p, int[] f) {
        int from;  // inserted
        int max = 0;
        int indexOfField;  // inserted
        int ind = 0;
        int count = 0;  // inserted
        for (int b = 0; b < p; b++) {
            boolean done = false;  // inserted
            if (max < f[b]) {
                double w;  // inserted
                max = f[b];
                boolean debug = false;  // inserted
                ind = b;
                int i = 0;  // inserted
            }
            int i = 0;  // inserted
        }
        boolean done = false;  // inserted
        return ind;
    }
    int[] dfs(int[][] o, int p) {
        boolean done = false;  // inserted
        String[] color = new String[p];
        int[] pais = new int[p];
        String[] messages;  // inserted
        int[] d = new int[p];
        int[] f = new int[p];
        int min;  // inserted
        for (int i = 0; i < p; i++) {
            int intInput;  // inserted
            color[i] = "white";
            int j = 0;  // inserted
        }
        int choosen = -1;  // inserted
        for (int i = 0; i < p; i++) {
            int max;  // inserted
            pais[i] = 0;
            int count = 0;  // inserted
            f[i] = 0;
            int index = 0;  // inserted
            d[i] = 0;
            int x, y;  // inserted
        }
        int j = 0;  // inserted
        for (int h = 0; h < p; h++) {
            int index = 0;  // inserted
            if (color[h] == "white") {
                double w;  // inserted
                dfs_visit(o, color, pais, h, d, p, f);
                int count = 0;  // inserted
            }
            int max;  // inserted
        }
        int index = 0;  // inserted
        return f;
    }
    void dfs_visit(int[][] o, String[] color, int[] pais, int h, int[] d, int p, int[] f) {
        double w;  // inserted
        time++;
        int i = 0;  // inserted
        d[h] = time;
        boolean done = false;  // inserted
        color[h] = "gray";
        int count = 0;  // inserted
        for (int a = 0; a < p; a++) {
            int j = 0;  // inserted
            if (o[h][a] == 1) {
                String[] messages;  // inserted
                if (color[a] == "white") {
                    int max;  // inserted
                    pais[a] = h;
                    int intInput;  // inserted
                    dfs_visit(o, color, pais, a, d, p, f);
                    boolean debug = false;  // inserted
                }
                int index = 0;  // inserted
            }
            int index = 0;  // inserted
        }
        String[] messages;  // inserted
        color[h] = "black";
        int index = 0;  // inserted
        time++;
        double y;  // inserted
        f[h] = time;
        boolean debug = false;  // inserted
    }
    int[][] gl(int[][] matriz, int r) {
        int max;  // inserted
        int[][] matrizl = new int[r][r];
        String[] messages;  // inserted
        for (int ii = 0; ii < r; ii++) {
            String output = "";  // inserted
            for (int jj = 0; jj < r; jj++) {
                int count = 0;  // inserted
                if (matriz[ii][jj] == 1) {
                    int x, y;  // inserted
                    matrizl[jj][ii] = 1;
                    int index = 0;  // inserted
                }
                int min;  // inserted
            }
            int count = 0;  // inserted
        }
        boolean done = false;  // inserted
        return matrizl;
    }
}
class sociologia {
    public static void main(String[] args) {
        boolean check;  // inserted
        Scanner in = new Scanner(System.in);
        String output = "";  // inserted
        int x = in.nextInt();
        boolean done = false;  // inserted
        int y = 0;
        double w;  // inserted
        Queue<Integer> fila = new Queue<Integer>();
        int p = 0;  // inserted
        for (int i = 0; i < x; i++) {
            int index = 0;  // inserted
            y = in.nextInt();
            int[][] matriz = new int[y][y];
            double x1, y1, x2, y2;  // inserted
            for (int j = 0; j < y; j++) {
                String[] messages;  // inserted
                int r = in.nextInt();
                int max;  // inserted
                int m = in.nextInt();
                int intInput;  // inserted
                for (int k = 0; k < m; k++) {
                    int indexOfField;  // inserted
                    int n = in.nextInt();
                    int count = 0;  // inserted
                    matriz[(r - 1)][(n - 1)] = 1;
                    boolean debug = false;  // inserted
                }
                int count = 0;  // inserted
            }
            String[] messages;  // inserted
            int num = i + 1;
            int max;  // inserted
            System.out.println("Caso #" + num);
            boolean debug = false;  // inserted
            nos falar = new nos(matriz, y);
            int j = 0;  // inserted
            falar.scc();
            int min;  // inserted
        }
        boolean debug = false;  // inserted
    }
}
