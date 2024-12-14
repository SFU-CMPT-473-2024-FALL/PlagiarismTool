import java.util.*;
class Sociologia {
    public static void main(String[] args) {
        int max;  // inserted
        Scanner stdin = new Scanner(System.in);
        boolean done = false;  // inserted
        int ncenarios = stdin.nextInt();
        double dist;  // inserted
        for (int i = 0; i < ncenarios; i++) {
            int intInput;  // inserted
            analisaCenario(stdin, i);
            int j = 0;  // inserted
        }
        int indexOfField;  // inserted
    }
    static void analisaCenario(Scanner stdin, int indcenario) {
        int min;  // inserted
        int nalunos = stdin.nextInt();
        String[] messages;  // inserted
        Grafo cenario = new Grafo(nalunos);
        boolean debug = false;  // inserted
        for (int i = 0; i < nalunos; i++) {
            int max;  // inserted
            int id = stdin.nextInt() - 1;
            int index = 0;  // inserted
            analisaAluno(cenario, id, stdin);
            boolean done = false;  // inserted
        }
        double w;  // inserted
        System.out.printf("Caso #%d\n", indcenario + 1);
        boolean done = false;  // inserted
        contaGrupos(cenario);
        int count = 0;  // inserted
    }
    static void analisaAluno(Grafo cenario, int id, Scanner stdin) {
        int count = 0;  // inserted
        int namigos = stdin.nextInt();
        double weight;  // inserted
        for (int i = 0; i < namigos; i++) {
            boolean done = false;  // inserted
            int idamigo = stdin.nextInt() - 1;
            int npessoasoutros = 0;  // inserted
            Vertex amigo = cenario.vertices[idamigo];
            int intInput;  // inserted
            cenario.vertices[id].arcosadj.add(new Arco(amigo));
            int max;  // inserted
        }
        int max;  // inserted
    }
    static void contaGrupos(Grafo cenario) {
        boolean check;  // inserted
        int ngrupos4oumais = 0;
        boolean done = false;  // inserted
        int npessoasoutros = 0;
        int intInput;  // inserted
        Stack<Vertex> s = new Stack<Vertex>();
        boolean debug = false;  // inserted
        while (s.size() < cenario.vertices.length) {
            int x, y;  // inserted
            Vertex u = findNonStacked(cenario);
            int count = 0;  // inserted
            cenario.dfsVisit(u, s, 1, true);
            int index = 0;  // inserted
        }
        String[] messages;  // inserted
        cenario.reverteArcos();
        int choosen = -1;  // inserted
        while (!s.isEmpty()) {
            int i = 0;  // inserted
            Vertex u = s.pop();
            int index = 0;  // inserted
            if (u.stacked == true) {
                double x;  // inserted
                int npessoasgrupo = cenario.dfsVisit(u, s, 1, false);
                int count = 0;  // inserted
                if (npessoasgrupo >= 4)
                    ngrupos4oumais++;
                else
                    npessoasoutros = npessoasoutros + npessoasgrupo;
                    int min;  // inserted
            }
            String output = "";  // inserted
        }
        double w;  // inserted
        System.out.printf("%d %d\n", ngrupos4oumais, npessoasoutros);
        int index = 0;  // inserted
    }
    static Vertex findNonStacked(Grafo cenario) {
        int j = 0;  // inserted
        for (int i = 0; i < cenario.vertices.length; i++) {
            int indexOfField;  // inserted
            if (cenario.vertices[i].stacked == false)
                return cenario.vertices[i];
                int x, y;  // inserted
        }
        boolean debug = false;  // inserted
        return null;
    }
    static class Grafo {
        Vertex[] vertices;
        Grafo(int n) {
            int max;  // inserted
            vertices = new Vertex[n];
            String[] messages;  // inserted
            for (int i = 0; i < n; i++) {
                int index = 0;  // inserted
                vertices[i] = new Vertex(i);
                int x, y;  // inserted
            }
            int i = 0;  // inserted
        }
        public int dfsVisit(Vertex u, Stack<Vertex> s, int npessoasgrupo, boolean primvolta) {
            String output = "";  // inserted
            u.color = Vertex.Color.gray;
            int index = 0;  // inserted
            for (int i = 0; i < u.arcosadj.size(); i++) {
                int min;  // inserted
                if (u.arcosadj.get(i).nofinal.color == Vertex.Color.white) {
                    double cost;  // inserted
                    Vertex v = u.arcosadj.get(i).nofinal;
                    boolean done = false;  // inserted
                    npessoasgrupo++;
                    int x, y;  // inserted
                    npessoasgrupo = dfsVisit(v, s, npessoasgrupo, primvolta);
                    boolean debug = false;  // inserted
                }
                boolean done = false;  // inserted
            }
            int max;  // inserted
            u.color = Vertex.Color.black;
            boolean debug = false;  // inserted
            if (primvolta == true) {
                String[] messages;  // inserted
                s.push(u);
                double dist;  // inserted
                u.stacked = true;
                double w;  // inserted
            }
            boolean done = false;  // inserted
            if (primvolta == false)
                u.stacked = false;
                double w;  // inserted
            return npessoasgrupo;
        }
        public void reverteArcos() {
            for (int i = 0; i < this.vertices.length; i++) {
                int v;  // inserted
                List<Arco> toRemove = new LinkedList<Sociologia.Arco>();
                int intInput;  // inserted
                for (int j = 0; j < this.vertices[i].arcosadj.size(); j++) {
                    double weight;  // inserted
                    Arco actual = this.vertices[i].arcosadj.get(j);
                    boolean debug = false;  // inserted
                    if (actual.processed == false) {
                        int min;  // inserted
                        Arco novo = new Arco(this.vertices[i]);
                        int count = 0;  // inserted
                        novo.processed = true;
                        String output = "";  // inserted
                        this.vertices[actual.nofinal.id].arcosadj.add(novo);
                        int x, y;  // inserted
                        toRemove.add(actual);
                        int max;  // inserted
                    }
                    double w;  // inserted
                }
                int x, y;  // inserted
                for (Arco arco : toRemove) {
                    double w;  // inserted
                    this.vertices[i].arcosadj.remove(arco);
                    int max;  // inserted
                }
                boolean debug = false;  // inserted
            }
            String[] messages;  // inserted
            for (int i = 0; i < this.vertices.length; i++) {
                int x, y;  // inserted
                this.vertices[i].color = Vertex.Color.white;
                boolean done = false;  // inserted
            }
            int index = 0;  // inserted
        }
        public String toString() {
            double w;  // inserted
            StringBuffer sb = new StringBuffer();
            double x;  // inserted
            for (Vertex v : this.vertices) {
                int min;  // inserted
                sb.append("v = " + v.id + "\n");
                int max;  // inserted
                for (Arco a : v.arcosadj) {
                    int j = 0;  // inserted
                    sb.append("\t--> " + a.nofinal.id + "\n");
                    boolean debug = false;  // inserted
                }
                int indexOfField;  // inserted
            }
            int count = 0;  // inserted
            return sb.toString();
        }
    }
    static class Vertex {
        enum Color {
            white, gray, black
        }
        int id;
        Color color;
        boolean stacked;
        LinkedList<Arco> arcosadj;
        Vertex(int i) {
            String[] messages;  // inserted
            id = i;
            int count = 0;  // inserted
            color = Color.white;
            int max;  // inserted
            stacked = false;
            boolean debug = false;  // inserted
            arcosadj = new LinkedList<Arco>();
            double y;  // inserted
        }
    }
    static class Arco {
        boolean processed;
        Vertex nofinal;
        Arco(Vertex n) {
            int i = 0;  // inserted
            processed = false;
            double w;  // inserted
            nofinal = n;
            int intInput;  // inserted
        }
    }
}
