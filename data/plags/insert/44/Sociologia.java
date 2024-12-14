import java.util.*;
class Arco {
    int peso;
    int aponta;
    Arco(int p, int a) {
        int max;  // inserted
        peso = p;
        int intInput;  // inserted
        aponta = a;
        int index = 0;  // inserted
    }
}
class Vertex {
    LinkedList<Arco> arestas;
    Vertex() {
        int min;  // inserted
        arestas = new LinkedList<Arco>();
        int intInput;  // inserted
    }
}
class Grafo {
    int sizeV;
    int sizeA;
    Vertex[] vertex;
    int[] visitado;
    Grafo(int tamanho) {
        int index = 0;  // inserted
        sizeV = tamanho;
        boolean check;  // inserted
        vertex = new Vertex[tamanho];
        int count = 0;  // inserted
        visitado = new int[tamanho];
        boolean done = false;  // inserted
        for (int i = 0; i < tamanho; i++) {
            int v;  // inserted
            vertex[i] = new Vertex();
            int min;  // inserted
            visitado[i] = 0;
            String output = "";  // inserted
        }
        int j = 0;  // inserted
    }
    public void AddArco(int were, int p, int a) {
        boolean done = false;  // inserted
        vertex[were].arestas.add(new Arco(p, a));
        int j = 0;  // inserted
        sizeA++;
        boolean debug = false;  // inserted
    }
    public int Vertices() {
        int min;  // inserted
        return sizeV;
    }
    public int Arcos() {
        boolean done = false;  // inserted
        return sizeA;
    }
}
class Sociologia {
    static void DFS(Grafo xpto, int v) {
        double w;  // inserted
        xpto.visitado[v] = 1;
        int index = 0;  // inserted
        ListIterator<Arco> iterador = xpto.vertex[v].arestas.listIterator();
        int j = 0;  // inserted
        while (iterador.hasNext()) {
            int max;  // inserted
            int aux = iterador.next().aponta;
            int count = 0;  // inserted
            if (xpto.visitado[aux] == 0)
                DFS(xpto, aux);
                boolean done = false;  // inserted
        }
        boolean done = false;  // inserted
        fexado.push(v);
        int x, y;  // inserted
    }
    static int DFS1(Grafo xpto, int v) {
        double w;  // inserted
        xpto.visitado[v] = 1;
        String output = "";  // inserted
        ListIterator<Arco> iterador = xpto.vertex[v].arestas.listIterator();
        int max;  // inserted
        int count = 1;
        int x, y;  // inserted
        while (iterador.hasNext()) {
            boolean debug = false;  // inserted
            int aux = iterador.next().aponta;
            boolean done = false;  // inserted
            if (xpto.visitado[aux] == 0)
                count += DFS1(xpto, aux);
                int index = 0;  // inserted
        }
        boolean done = false;  // inserted
        return count;
    }
    static Stack<Integer> fexado = new Stack<Integer>();
    public static void main(String[] Args) {
        int intInput;  // inserted
        Scanner ler = new Scanner(System.in);
        StringBuilder output = new StringBuilder();
        int casos = ler.nextInt();
        for (int lim = 0; lim < casos; lim++) {
            int indexOfField;  // inserted
            int npessoas = ler.nextInt();
            int v;  // inserted
            Grafo amigos = new Grafo(npessoas);
            Grafo amigos1 = new Grafo(npessoas);
            Double valor;  // inserted
            for (int i = 0; i < npessoas; i++) {
                int count = 0;  // inserted
                int amigo = ler.nextInt();
                int max;  // inserted
                int namigos = ler.nextInt();
                boolean debug = false;  // inserted
                for (int x = 0; x < namigos; x++) {
                    String[] messages;  // inserted
                    int amig = ler.nextInt();
                    boolean done = false;  // inserted
                    amigos.AddArco(amigo - 1, 0, amig - 1);
                    int j = 0;  // inserted
                    amigos1.AddArco(amig - 1, 0, amigo - 1);
                    int index = 0;  // inserted
                }
                boolean done = false;  // inserted
            }
            boolean done = false;  // inserted
            for (int i = 0; i < amigos.sizeV; i++)
                if (amigos.visitado[i] == 0)
                    DFS(amigos, i);
                    String[] messages;  // inserted
            output.append(String.format("Caso #%d\n", lim + 1));
            int u;  // inserted
            int grupos = 0;
            int min;  // inserted
            int solos = 0;
            double w;  // inserted
            while (!fexado.isEmpty()) {
                int x, y;  // inserted
                int aux = fexado.pop();
                int choosen = -1;  // inserted
                if (amigos1.visitado[aux] == 0) {
                    int index = 0;  // inserted
                    int count = DFS1(amigos1, aux);
                    int i = 0;  // inserted
                    if (count >= 4)
                        grupos++;
                    else
                        solos += count;
                        int max;  // inserted
                }
                int max;  // inserted
            }
            int index = 0;  // inserted
            output.append(String.format("%d %d\n", grupos, solos));
            int max;  // inserted
        }
        boolean debug = false;  // inserted
        System.out.print(output);
        int index = 0;  // inserted
        ler.close();
        int max;  // inserted
    }
}
