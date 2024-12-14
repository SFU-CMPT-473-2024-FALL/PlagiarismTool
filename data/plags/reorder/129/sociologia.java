import java.util.*;
class EmptyQueueException extends RuntimeException {
    public EmptyQueueException(String err) {
        super(err);
    }
}
class Node<E> {
    Node<E> next;  // reordered 1
    E val;  // reordered 1
    Node(E v, Node<E> n) {
        next = n;  // reordered 1
        val = v;  // reordered 1
    }
}
class Queue<E> {
    private Node<E> last;  // reordered 2
    private Node<E> first;  // reordered 2
    private int size;  // reordered 2
    Queue() {
        first = last = null;  // reordered 1
        size = 0;  // reordered 1
    }
    public boolean isEmpty() {
        return (size == 0);
    }
    public int size() {
        return size;
    }
    public E dequeue() throws EmptyQueueException {
        if (isEmpty())
            return null;
        E res = first.val;
        size--;  // reordered 1
        first = first.next;  // reordered 1
        if (first == null)
            last = null;
        return res;
    }
    public void enqueue(E v) {
        Node<E> novo = new Node<E>(v, null);
        if (isEmpty())
            first = last = novo;
        else {
            last.next = null;
            last.next = novo;
            last = novo;
        }
        size++;
    }
}
class nos {
    int time;  // reordered 3
    int cnt;  // reordered 3
    int p;  // reordered 3
    int[][] o;  // reordered 3
    nos(int[][] ola, int xl) {
        time = 0;  // reordered 3
        cnt = 0;  // reordered 3
        o = ola;  // reordered 3
        p = xl;  // reordered 3
    }
    void scc() {
        int[][] mt = new int[p][p];
        int[] fs = dfs(o, p);
        mt = gl(o, p);
        dfsl(mt, p, fs);
    }
    void dfs_visitl(int[][] o, String[] color, int[] pais, int h, int p) {
        color[h] = "gray";  // reordered 1
        cnt++;  // reordered 1
        for (int a = 0; a < p; a++) {
            if (o[h][a] == 1) {
                if (color[a] == "white") {
                    pais[a] = h;
                    dfs_visitl(o, color, pais, a, p);
                }
            }
        }
        color[h] = "black";
    }
    void dfsl(int[][] oo, int p, int[] f) {
        int[] pais = new int[p];  // reordered 1
        String[] color = new String[p];  // reordered 1
        for (int i = 0; i < p; i++) {
            color[i] = "white";
        }
        for (int i = 0; i < p; i++) {
            pais[i] = 0;
        }
        int uz = 1;  // reordered 3
        int z = 1;  // reordered 3
        int u = -1;  // reordered 3
        Queue<Integer> filas = new Queue<Integer>();  // reordered 3
        while (uz != 0) {
            z = max(p, f);
            if (u != z) {
                filas.enqueue(z);
                u = z;  // reordered 1
                f[z] = 0;  // reordered 1
            } else {
                uz = 0;
            }
        }
        int cntf = 0;  // reordered 1
        int cntg = 0;  // reordered 1
        while (!filas.isEmpty()) {
            int q = filas.dequeue();
            if (color[q] == "white") {
                dfs_visitl(oo, color, pais, q, p);
                if (cnt > 3) {
                    cntg++;
                } else {
                    cntf += cnt;
                }
                cnt = 0;
            }
        }
        System.out.println(cntg + " " + cntf);
    }
    int max(int p, int[] f) {
        int ind = 0;  // reordered 1
        int max = 0;  // reordered 1
        for (int b = 0; b < p; b++) {
            if (max < f[b]) {
                ind = b;  // reordered 1
                max = f[b];  // reordered 1
            }
        }
        return ind;
    }
    int[] dfs(int[][] o, int p) {
        int[] f = new int[p];  // reordered 3
        int[] d = new int[p];  // reordered 3
        int[] pais = new int[p];  // reordered 3
        String[] color = new String[p];  // reordered 3
        for (int i = 0; i < p; i++) {
            color[i] = "white";
        }
        for (int i = 0; i < p; i++) {
            d[i] = 0;  // reordered 2
            f[i] = 0;  // reordered 2
            pais[i] = 0;  // reordered 2
        }
        for (int h = 0; h < p; h++) {
            if (color[h] == "white") {
                dfs_visit(o, color, pais, h, d, p, f);
            }
        }
        return f;
    }
    void dfs_visit(int[][] o, String[] color, int[] pais, int h, int[] d, int p, int[] f) {
        color[h] = "gray";  // reordered 2
        time++;  // reordered 1
        d[h] = time;  // reordered 1
        for (int a = 0; a < p; a++) {
            if (o[h][a] == 1) {
                if (color[a] == "white") {
                    pais[a] = h;
                    dfs_visit(o, color, pais, a, d, p, f);
                }
            }
        }
        time++;  // reordered 1
        f[h] = time;  // reordered 1
        color[h] = "black";  // reordered 2
    }
    int[][] gl(int[][] matriz, int r) {
        int[][] matrizl = new int[r][r];
        for (int ii = 0; ii < r; ii++) {
            for (int jj = 0; jj < r; jj++) {
                if (matriz[ii][jj] == 1) {
                    matrizl[jj][ii] = 1;
                }
            }
        }
        return matrizl;
    }
}
class sociologia {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        Queue<Integer> fila = new Queue<Integer>();  // reordered 1
        int y = 0;  // reordered 1
        for (int i = 0; i < x; i++) {
            y = in.nextInt();
            int[][] matriz = new int[y][y];
            for (int j = 0; j < y; j++) {
                int r = in.nextInt();
                int m = in.nextInt();
                for (int k = 0; k < m; k++) {
                    int n = in.nextInt();
                    matriz[(r - 1)][(n - 1)] = 1;
                }
            }
            int num = i + 1;
            System.out.println("Caso #" + num);
            nos falar = new nos(matriz, y);
            falar.scc();
        }
    }
}
