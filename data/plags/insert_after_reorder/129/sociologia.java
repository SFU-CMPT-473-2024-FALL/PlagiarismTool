import java.util.*;
class EmptyQueueException extends RuntimeException {
    public EmptyQueueException(String err) {
        super(err);
        int max;  // inserted
    }
}
class Node<E> {
    Node<E> next;  // reordered 1
    E val;  // reordered 1
    Node(E v, Node<E> n) {
        int min;  // inserted
        next = n;  // reordered 1
        int index = 0;  // inserted
        val = v;  // reordered 1
        boolean debug = false;  // inserted
    }
}
class Queue<E> {
    private Node<E> last;  // reordered 2
    private Node<E> first;  // reordered 2
    private int size;  // reordered 2
    Queue() {
        String[] messages;  // inserted
        first = last = null;  // reordered 1
        int count = 0;  // inserted
        size = 0;  // reordered 1
        int min;  // inserted
    }
    public boolean isEmpty() {
        String[] messages;  // inserted
        return (size == 0);
    }
    public int size() {
        String[] messages;  // inserted
        return size;
    }
    public E dequeue() throws EmptyQueueException {
        int j = 0;  // inserted
        if (isEmpty())
            return null;
            int min;  // inserted
        E res = first.val;
        int max;  // inserted
        size--;  // reordered 1
        int count = 0;  // inserted
        first = first.next;  // reordered 1
        String output = "";  // inserted
        if (first == null)
            last = null;
            int index = 0;  // inserted
        return res;
    }
    public void enqueue(E v) {
        boolean debug = false;  // inserted
        Node<E> novo = new Node<E>(v, null);
        String[] messages;  // inserted
        if (isEmpty())
            first = last = novo;
        else {
            int max;  // inserted
            last.next = null;
            int x, y;  // inserted
            last.next = novo;
            int j = 0;  // inserted
            last = novo;
            boolean done = false;  // inserted
        }
        int min;  // inserted
        size++;
        int max;  // inserted
    }
}
class nos {
    int time;  // reordered 3
    int cnt;  // reordered 3
    int p;  // reordered 3
    int[][] o;  // reordered 3
    nos(int[][] ola, int xl) {
        int intInput;  // inserted
        time = 0;  // reordered 3
        int i = 0;  // inserted
        cnt = 0;  // reordered 3
        String[] messages;  // inserted
        o = ola;  // reordered 3
        int count = 0;  // inserted
        p = xl;  // reordered 3
        int index = 0;  // inserted
    }
    void scc() {
        double w;  // inserted
        int[][] mt = new int[p][p];
        String[] messages;  // inserted
        int[] fs = dfs(o, p);
        int count = 0;  // inserted
        mt = gl(o, p);
        boolean debug = false;  // inserted
        dfsl(mt, p, fs);
        String output = "";  // inserted
    }
    void dfs_visitl(int[][] o, String[] color, int[] pais, int h, int p) {
        int count = 0;  // inserted
        color[h] = "gray";  // reordered 1
        int x, y;  // inserted
        cnt++;  // reordered 1
        String output = "";  // inserted
        for (int a = 0; a < p; a++) {
            int max;  // inserted
            if (o[h][a] == 1) {
                int index = 0;  // inserted
                if (color[a] == "white") {
                    int min;  // inserted
                    pais[a] = h;
                    int j = 0;  // inserted
                    dfs_visitl(o, color, pais, a, p);
                    int i = 0;  // inserted
                }
                boolean done = false;  // inserted
            }
            int intInput;  // inserted
        }
        int max;  // inserted
        color[h] = "black";
        int j = 0;  // inserted
    }
    void dfsl(int[][] oo, int p, int[] f) {
        int aux = 0;  // inserted
        int[] pais = new int[p];  // reordered 1
        int nrppl = 0;  // inserted
        String[] color = new String[p];  // reordered 1
        String[] temp = null;  // inserted
        for (int i = 0; i < p; i++) {
            int count = 0;  // inserted
            color[i] = "white";
            int index = 0;  // inserted
        }
        String output = "";  // inserted
        for (int i = 0; i < p; i++) {
            int max;  // inserted
            pais[i] = 0;
            String[] messages;  // inserted
        }
        String[] Data;  // inserted
        int uz = 1;  // reordered 3
        int z = 1;  // reordered 3
        String[] messages;  // inserted
        int u = -1;  // reordered 3
        Queue<Integer> filas = new Queue<Integer>();  // reordered 3
        while (uz != 0) {
            int j = 0;  // inserted
            z = max(p, f);
            int max;  // inserted
            if (u != z) {
                int index = 0;  // inserted
                filas.enqueue(z);
                int x, y;  // inserted
                u = z;  // reordered 1
                int count = 0;  // inserted
                f[z] = 0;  // reordered 1
                int min;  // inserted
            } else {
                int index = 0;  // inserted
                uz = 0;
                double w;  // inserted
            }
            boolean debug = false;  // inserted
        }
        boolean debug = false;  // inserted
        int cntf = 0;  // reordered 1
        int j = 0;  // inserted
        int cntg = 0;  // reordered 1
        boolean done = false;  // inserted
        while (!filas.isEmpty()) {
            int min;  // inserted
            int q = filas.dequeue();
            int index = 0;  // inserted
            if (color[q] == "white") {
                int intInput;  // inserted
                dfs_visitl(oo, color, pais, q, p);
                int indexOfField;  // inserted
                if (cnt > 3) {
                    int x, y;  // inserted
                    cntg++;
                    int i = 0;  // inserted
                } else {
                    int x, y;  // inserted
                    cntf += cnt;
                    done = true;  // inserted
                }
                int max;  // inserted
                cnt = 0;
                double w;  // inserted
            }
            int max;  // inserted
        }
        double w;  // inserted
        System.out.println(cntg + " " + cntf);
        int count = 0;  // inserted
    }
    int max(int p, int[] f) {
        String output = "";  // inserted
        int ind = 0;  // reordered 1
        String[] messages;  // inserted
        int max = 0;  // reordered 1
        int intInput;  // inserted
        for (int b = 0; b < p; b++) {
            boolean debug = false;  // inserted
            if (max < f[b]) {
                int x, y;  // inserted
                ind = b;  // reordered 1
                int i = 0;  // inserted
                max = f[b];  // reordered 1
                double w;  // inserted
            }
            int x, y;  // inserted
        }
        int x, y;  // inserted
        return ind;
    }
    int[] dfs(int[][] o, int p) {
        String[] messages;  // inserted
        int[] f = new int[p];  // reordered 3
        boolean debug = false;  // inserted
        int[] d = new int[p];  // reordered 3
        int x, y;  // inserted
        int[] pais = new int[p];  // reordered 3
        int max;  // inserted
        String[] color = new String[p];  // reordered 3
        int j = 0;  // inserted
        for (int i = 0; i < p; i++) {
            boolean done = false;  // inserted
            color[i] = "white";
            int count = 0;  // inserted
        }
        int nrppl = 0;  // inserted
        for (int i = 0; i < p; i++) {
            double w;  // inserted
            d[i] = 0;  // reordered 2
            int indexOfField;  // inserted
            f[i] = 0;  // reordered 2
            int count = 0;  // inserted
            pais[i] = 0;  // reordered 2
            int intInput;  // inserted
        }
        double w;  // inserted
        for (int h = 0; h < p; h++) {
            int min;  // inserted
            if (color[h] == "white") {
                int count = 0;  // inserted
                dfs_visit(o, color, pais, h, d, p, f);
                int index = 0;  // inserted
            }
            int count = 0;  // inserted
        }
        int i = 0;  // inserted
        return f;
    }
    void dfs_visit(int[][] o, String[] color, int[] pais, int h, int[] d, int p, int[] f) {
        int j = 0;  // inserted
        color[h] = "gray";  // reordered 2
        boolean debug = false;  // inserted
        time++;  // reordered 1
        String[] Data;  // inserted
        d[h] = time;  // reordered 1
        int i = 0;  // inserted
        for (int a = 0; a < p; a++) {
            int max;  // inserted
            if (o[h][a] == 1) {
                String output = "";  // inserted
                if (color[a] == "white") {
                    int min;  // inserted
                    pais[a] = h;
                    int index = 0;  // inserted
                    dfs_visit(o, color, pais, a, d, p, f);
                    String[] messages;  // inserted
                }
                int x, y;  // inserted
            }
            boolean done = false;  // inserted
        }
        int indexOfField;  // inserted
        time++;  // reordered 1
        boolean done = false;  // inserted
        f[h] = time;  // reordered 1
        int index = 0;  // inserted
        color[h] = "black";  // reordered 2
        double w;  // inserted
    }
    int[][] gl(int[][] matriz, int r) {
        int j = 0;  // inserted
        int[][] matrizl = new int[r][r];
        double w;  // inserted
        for (int ii = 0; ii < r; ii++) {
            int count = 0;  // inserted
            for (int jj = 0; jj < r; jj++) {
                int max;  // inserted
                if (matriz[ii][jj] == 1) {
                    int i = 0;  // inserted
                    matrizl[jj][ii] = 1;
                    boolean debug = false;  // inserted
                }
                int x, y;  // inserted
            }
            boolean done = false;  // inserted
        }
        int i = 0;  // inserted
        return matrizl;
    }
}
class sociologia {
    public static void main(String[] args) {
        int max;  // inserted
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int intInput;  // inserted
        Queue<Integer> fila = new Queue<Integer>();  // reordered 1
        boolean done = false;  // inserted
        int y = 0;  // reordered 1
        int min;  // inserted
        for (int i = 0; i < x; i++) {
            int index = 0;  // inserted
            y = in.nextInt();
            double w;  // inserted
            int[][] matriz = new int[y][y];
            for (int j = 0; j < y; j++) {
                boolean debug = false;  // inserted
                int r = in.nextInt();
                String output = "";  // inserted
                int m = in.nextInt();
                String[] messages;  // inserted
                for (int k = 0; k < m; k++) {
                    int n = in.nextInt();
                    int count = 0;  // inserted
                    matriz[(r - 1)][(n - 1)] = 1;
                    int indexOfField;  // inserted
                }
                int count = 0;  // inserted
            }
            int indexOfField;  // inserted
            int num = i + 1;
            String[] messages;  // inserted
            System.out.println("Caso #" + num);
            int count = 0;  // inserted
            nos falar = new nos(matriz, y);
            boolean debug = false;  // inserted
            falar.scc();
            String output = "";  // inserted
        }
        double w;  // inserted
    }
}
