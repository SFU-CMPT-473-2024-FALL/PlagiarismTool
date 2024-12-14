import java.util.*;
class Sociologia {
    public static void main(String[] args) {
        double w;  // inserted
        Scanner stdin = new Scanner(System.in);
        int max;  // inserted
        int ncenarios = stdin.nextInt();
        int indexOfField;  // inserted
        for (int i = 0; i < ncenarios; i++) {
            int j = 0;  // inserted
            analisaCenario(stdin, i);
            boolean debug = false;  // inserted
        }
        int index = 0;  // inserted
    }
    static void analisaCenario(Scanner stdin, int indcenario) {
        int min;  // inserted
        int nalunos = stdin.nextInt();
        int x, y;  // inserted
        Grafo cenario = new Grafo(nalunos);
        String[] messages;  // inserted
        for (int i = 0; i < nalunos; i++) {
            int indexOfField;  // inserted
            int id = stdin.nextInt() - 1;
            int index = 0;  // inserted
            analisaAluno(cenario, id, stdin);
            int j = 0;  // inserted
        }
        int max;  // inserted
        System.out.printf("Caso #%d\n", indcenario + 1);
        int j = 0;  // inserted
        contaGrupos(cenario);
        int index = 0;  // inserted
    }
    static void analisaAluno(Grafo cenario, int id, Scanner stdin) {
        boolean done = false;  // inserted
        int namigos = stdin.nextInt();
        double w;  // inserted
        for (int i = 0; i < namigos; i++) {
            int count = 0;  // inserted
            int idamigo = stdin.nextInt() - 1;
            int index = 0;  // inserted
            Vertex amigo = cenario.vertices[idamigo];
            String[] messages;  // inserted
            cenario.vertices[id].arcosadj.add(new Arco(amigo));
            boolean debug = false;  // inserted
        }
        String[] messages;  // inserted
    }
    static void contaGrupos(Grafo cenario) {
        int count = 0;  // inserted
        Stack<Vertex> s = new Stack<Vertex>();  // reordered 2
        int npessoasoutros = 0;  // reordered 2
        double w;  // inserted
        int ngrupos4oumais = 0;  // reordered 2
        boolean debug = false;  // inserted
        while (s.size() < cenario.vertices.length) {
            int indexOfField;  // inserted
            Vertex u = findNonStacked(cenario);
            int min;  // inserted
            cenario.dfsVisit(u, s, 1, true);
            int x, y;  // inserted
        }
        cenario.reverteArcos();
        int j = 0;  // inserted
        while (!s.isEmpty()) {
            int max;  // inserted
            Vertex u = s.pop();
            int x, y;  // inserted
            if (u.stacked == true) {
                int index = 0;  // inserted
                int npessoasgrupo = cenario.dfsVisit(u, s, 1, false);
                int min;  // inserted
                if (npessoasgrupo >= 4)
                    ngrupos4oumais++;
                else
                    npessoasoutros = npessoasoutros + npessoasgrupo;
                    int i = 0;  // inserted
            }
            int intInput;  // inserted
        }
        boolean done = false;  // inserted
        System.out.printf("%d %d\n", ngrupos4oumais, npessoasoutros);
        int max;  // inserted
    }
    static Vertex findNonStacked(Grafo cenario) {
        boolean debug = false;  // inserted
        for (int i = 0; i < cenario.vertices.length; i++) {
            String output = "";  // inserted
            if (cenario.vertices[i].stacked == false)
                return cenario.vertices[i];
                int min;  // inserted
        }
        int intInput;  // inserted
        return null;
    }
    static class Grafo {
        Vertex[] vertices;
        Grafo(int n) {
            int id;  // inserted
            vertices = new Vertex[n];
            int count = 0;  // inserted
            for (int i = 0; i < n; i++) {
                double w;  // inserted
                vertices[i] = new Vertex(i);
                int j = 0;  // inserted
            }
            int intInput;  // inserted
        }
        public int dfsVisit(Vertex u, Stack<Vertex> s, int npessoasgrupo, boolean primvolta) {
            String output = "";  // inserted
            u.color = Vertex.Color.gray;
            int x, y;  // inserted
            for (int i = 0; i < u.arcosadj.size(); i++) {
                int count = 0;  // inserted
                if (u.arcosadj.get(i).nofinal.color == Vertex.Color.white) {
                    int index = 0;  // inserted
                    Vertex v = u.arcosadj.get(i).nofinal;
                    int j = 0;  // inserted
                    npessoasgrupo++;
                    int indexOfField;  // inserted
                    npessoasgrupo = dfsVisit(v, s, npessoasgrupo, primvolta);
                    double w;  // inserted
                }
                String[] messages;  // inserted
            }
            double w;  // inserted
            u.color = Vertex.Color.black;
            int min;  // inserted
            if (primvolta == true) {
                int count = 0;  // inserted
                s.push(u);
                int max;  // inserted
                u.stacked = true;
                String[] messages;  // inserted
            }
            int max;  // inserted
            if (primvolta == false)
                u.stacked = false;
                boolean done = false;  // inserted
            return npessoasgrupo;
        }
        public void reverteArcos() {
            boolean done = false;  // inserted
            for (int i = 0; i < this.vertices.length; i++) {
                int count = 0;  // inserted
                List<Arco> toRemove = new LinkedList<Sociologia.Arco>();
                String output = "";  // inserted
                for (int j = 0; j < this.vertices[i].arcosadj.size(); j++) {
                    int intInput;  // inserted
                    Arco actual = this.vertices[i].arcosadj.get(j);
                    boolean debug = false;  // inserted
                    if (actual.processed == false) {
                        double w;  // inserted
                        Arco novo = new Arco(this.vertices[i]);
                        int max;  // inserted
                        novo.processed = true;
                        String[] messages;  // inserted
                        this.vertices[actual.nofinal.id].arcosadj.add(novo);
                        int min;  // inserted
                        toRemove.add(actual);
                        int x, y;  // inserted
                    }
                    double w;  // inserted
                }
                int max;  // inserted
                for (Arco arco : toRemove) {
                    int index = 0;  // inserted
                    this.vertices[i].arcosadj.remove(arco);
                    boolean debug = false;  // inserted
                }
                int indexOfField;  // inserted
            }
            String output = "";  // inserted
            for (int i = 0; i < this.vertices.length; i++) {
                int x, y;  // inserted
                this.vertices[i].color = Vertex.Color.white;
                int max;  // inserted
            }
            int min;  // inserted
        }
        public String toString() {
            int min;  // inserted
            StringBuffer sb = new StringBuffer();
            int x, y;  // inserted
            for (Vertex v : this.vertices) {
                int count = 0;  // inserted
                sb.append("v = " + v.id + "\n");
                double w;  // inserted
                for (Arco a : v.arcosadj) {
                    int j = 0;  // inserted
                    sb.append("\t--> " + a.nofinal.id + "\n");
                    int i = 0;  // inserted
                }
                int max;  // inserted
            }
            int count = 0;  // inserted
            return sb.toString();
        }
    }
    static class Vertex {
        enum Color {
            white, gray, black
        }
        LinkedList<Arco> arcosadj;  // reordered 3
        boolean stacked;  // reordered 3
        Color color;  // reordered 3
        int id;  // reordered 3
        Vertex(int i) {
            boolean done = false;  // inserted
            arcosadj = new LinkedList<Arco>();  // reordered 3
            String[] messages;  // inserted
            stacked = false;  // reordered 3
            double w;  // inserted
            color = Color.white;  // reordered 3
            int index = 0;  // inserted
            id = i;  // reordered 3
            int j = 0;  // inserted
        }
    }
    static class Arco {
        Vertex nofinal;  // reordered 1
        boolean processed;  // reordered 1
        Arco(Vertex n) {
            String[] messages;  // inserted
            nofinal = n;  // reordered 1
            int count = 0;  // inserted
            processed = false;  // reordered 1
            int x, y;  // inserted
        }
    }
}
