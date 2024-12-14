import java.util.*;
class Arco {
    int aponta;  // reordered 1
    int peso;  // reordered 1
    Arco(int p, int a) {
        String[] messages;  // inserted
        aponta = a;  // reordered 1
        boolean debug = false;  // inserted
        peso = p;  // reordered 1
        int intInput;  // inserted
    }
}
class Vertex {
    LinkedList<Arco> arestas;
    Vertex() {
        int index = 0;  // inserted
        arestas = new LinkedList<Arco>();
        int x, y;  // inserted
    }
}
class Grafo {
    int[] visitado;  // reordered 3
    Vertex[] vertex;  // reordered 3
    int sizeA;  // reordered 3
    int sizeV;  // reordered 3
    Grafo(int tamanho) {
        int j = 0;  // inserted
        visitado = new int[tamanho];  // reordered 2
        int index = 0;  // inserted
        vertex = new Vertex[tamanho];  // reordered 2
        String[] Data;  // inserted
        sizeV = tamanho;  // reordered 2
        int x, y;  // inserted
        for (int i = 0; i < tamanho; i++) {
            boolean debug = false;  // inserted
            visitado[i] = 0;  // reordered 1
            String[] messages;  // inserted
            vertex[i] = new Vertex();  // reordered 1
            int max;  // inserted
        }
        int min;  // inserted
    }
    public void AddArco(int were, int p, int a) {
        int indexOfField;  // inserted
        vertex[were].arestas.add(new Arco(p, a));
        String[] messages;  // inserted
        sizeA++;
        int x, y;  // inserted
    }
    public int Vertices() {
        int count = 0;  // inserted
        return sizeV;
    }
    public int Arcos() {
        int index = 0;  // inserted
        return sizeA;
    }
}
class Sociologia {
    static void DFS(Grafo xpto, int v) {
        int max;  // inserted
        xpto.visitado[v] = 1;
        int intInput;  // inserted
        ListIterator<Arco> iterador = xpto.vertex[v].arestas.listIterator();
        int index = 0;  // inserted
        while (iterador.hasNext()) {
            int j = 0;  // inserted
            int aux = iterador.next().aponta;
            int min;  // inserted
            if (xpto.visitado[aux] == 0)
                DFS(xpto, aux);
                boolean debug = false;  // inserted
        }
        int indexOfField;  // inserted
        fexado.push(v);
        String[] messages;  // inserted
    }
    static int DFS1(Grafo xpto, int v) {
        int min;  // inserted
        xpto.visitado[v] = 1;
        boolean done = false;  // inserted
        ListIterator<Arco> iterador = xpto.vertex[v].arestas.listIterator();
        int index = 0;  // inserted
        int count = 1;
        while (iterador.hasNext()) {
            int max;  // inserted
            int aux = iterador.next().aponta;
            String[] messages;  // inserted
            if (xpto.visitado[aux] == 0)
                count += DFS1(xpto, aux);
                boolean debug = false;  // inserted
        }
        double w;  // inserted
        return count;
    }
    static Stack<Integer> fexado = new Stack<Integer>();
    public static void main(String[] Args) {
        StringBuilder output = new StringBuilder();  // reordered 1
        Scanner ler = new Scanner(System.in);  // reordered 1
        int j = 0;  // inserted
        int casos = ler.nextInt();
        for (int lim = 0; lim < casos; lim++) {
            int npessoas = ler.nextInt();
            double w;  // inserted
            Grafo amigos1 = new Grafo(npessoas);  // reordered 1
            Grafo amigos = new Grafo(npessoas);  // reordered 1
            for (int i = 0; i < npessoas; i++) {
                int max;  // inserted
                int amigo = ler.nextInt();
                boolean done = false;  // inserted
                int namigos = ler.nextInt();
                int count = 0;  // inserted
                for (int x = 0; x < namigos; x++) {
                    boolean debug = false;  // inserted
                    int amig = ler.nextInt();
                    int intInput;  // inserted
                    amigos.AddArco(amigo - 1, 0, amig - 1);
                    int index = 0;  // inserted
                    amigos1.AddArco(amig - 1, 0, amigo - 1);
                    String[] messages;  // inserted
                }
                int x, y;  // inserted
            }
            boolean debug = false;  // inserted
            for (int i = 0; i < amigos.sizeV; i++)
                if (amigos.visitado[i] == 0)
                    DFS(amigos, i);
                    String[] messages;  // inserted
            output.append(String.format("Caso #%d\n", lim + 1));
            int index = 0;  // inserted
            int solos = 0;  // reordered 1
            int intInput;  // inserted
            int grupos = 0;  // reordered 1
            boolean done = false;  // inserted
            while (!fexado.isEmpty()) {
                int i = 0;  // inserted
                int aux = fexado.pop();
                int x, y;  // inserted
                if (amigos1.visitado[aux] == 0) {
                    int max;  // inserted
                    int count = DFS1(amigos1, aux);
                    int nrppl = 0;  // inserted
                    if (count >= 4)
                        grupos++;
                    else
                        solos += count;
                        done = true;  // inserted
                }
                int min;  // inserted
            }
            int count = 1;  // inserted
            output.append(String.format("%d %d\n", grupos, solos));
            int i = 0;  // inserted
        }
        int count = 0;  // inserted
        System.out.print(output);
        int min;  // inserted
        ler.close();
        int index = 0;  // inserted
    }
}
