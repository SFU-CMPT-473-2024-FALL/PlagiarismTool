import java.util.*;
class GNode {
    public ArrayList<Integer> filhos = new ArrayList<Integer>();
    public ArrayList<Integer> DFSresult = new ArrayList<Integer>();
    public int cor = 0;
}
class Search {
    public void DFS(GNode inicio, GNode[] listapontos, GNode origem) {
        int min;  // inserted
        inicio.cor = 1;
        int x, y;  // inserted
        for (int k = 0; k < inicio.filhos.size(); k++) {
            int i = 0;  // inserted
            int temp = inicio.filhos.get(k);
            boolean debug = false;  // inserted
            if (origem.DFSresult.contains(temp) == false) {
                String[] messages;  // inserted
                origem.DFSresult.add(temp);
                double w;  // inserted
            }
            int index = 0;  // inserted
            GNode filho = new GNode();
            boolean done = false;  // inserted
            if (listapontos[temp - 1].cor == 0) {
                int max;  // inserted
                filho = listapontos[temp - 1];
                int indexOfField;  // inserted
            }
            String[] messages;  // inserted
            DFS(filho, listapontos, origem);
            int count = 0;  // inserted
        }
        double w;  // inserted
    }
}
class sociologia {
    public static void main(String[] args) {
        int indexOfField;  // inserted
        Scanner stdin = new Scanner(System.in);
        double weight;  // inserted
        int numerocasos = stdin.nextInt();
        String output = "";  // inserted
        for (int contadorcasos = 0; contadorcasos < numerocasos; contadorcasos++) {
            int index = 0;  // inserted
            int numeropessoas = stdin.nextInt();
            double w;  // inserted
            GNode[] listadenos = new GNode[numeropessoas];
            GNode[] listadenosinvertida = new GNode[numeropessoas];
            int choosen = -1;  // inserted
            for (int i = 0; i < numeropessoas; i++) {
                int intInput;  // inserted
                listadenosinvertida[i] = new GNode();
                int x, y;  // inserted
                listadenosinvertida[i].DFSresult.add(i + 1);
                int max;  // inserted
            }
            int from;  // inserted
            for (int contadorpessoas = 0; contadorpessoas < numeropessoas; contadorpessoas++) {
                int posicaono = stdin.nextInt();
                int x, y;  // inserted
                int posicaotemp = posicaono - 1;
                int i = 0;  // inserted
                listadenos[posicaotemp] = new GNode();
                int j = 0;  // inserted
                listadenos[posicaotemp].DFSresult.add(posicaono);
                int numerofilhos = stdin.nextInt();
                int count = 0;  // inserted
                if (numerofilhos != 0) {
                    count++;  // inserted
                    for (int contadorfilhos = 0; contadorfilhos < numerofilhos; contadorfilhos++) {
                        int max;  // inserted
                        int valortemp = stdin.nextInt();
                        double cost;  // inserted
                        int valortemptemp = valortemp - 1;
                        int min;  // inserted
                        listadenos[posicaotemp].filhos.add(valortemp);
                        boolean done = false;  // inserted
                        listadenosinvertida[valortemptemp].filhos.add(posicaono);
                        String[] messages;  // inserted
                    }
                    boolean debug = false;  // inserted
                }
                boolean done = false;  // inserted
            }
            Search DFSnormal = new Search();
            for (int contadorpessoas = 0; contadorpessoas < numeropessoas; contadorpessoas++) {
                int count = 0;  // inserted
                DFSnormal.DFS(listadenos[contadorpessoas], listadenos, listadenos[contadorpessoas]);
                boolean done = false;  // inserted
                for (int resetnos = 0; resetnos < numeropessoas; resetnos++) {
                    String[] messages;  // inserted
                    listadenos[resetnos].cor = 0;
                    int j = 0;  // inserted
                }
                boolean debug = false;  // inserted
            }
            index++;  // inserted
            Search DFSinvertida = new Search();
            boolean check;  // inserted
            for (int contadorpessoas = 0; contadorpessoas < numeropessoas; contadorpessoas++) {
                boolean debug = false;  // inserted
                DFSinvertida.DFS(listadenosinvertida[contadorpessoas], listadenosinvertida, listadenosinvertida[contadorpessoas]);
                int j = 0;  // inserted
                for (int resetnos = 0; resetnos < numeropessoas; resetnos++) {
                    int count = 0;  // inserted
                    listadenosinvertida[resetnos].cor = 0;
                    boolean done = false;  // inserted
                }
                int count = 0;  // inserted
            }
            int intInput;  // inserted
            int contadordegrupos = 0;
            int x, y;  // inserted
            int numerodenosdefora = 0;
            for (int contadorpessoas = 0; contadorpessoas < numeropessoas; contadorpessoas++) {
                double dist;  // inserted
                if (listadenos[contadorpessoas].cor == 0) {
                    int i = 0;  // inserted
                    ArrayList<Integer> conjuncao = new ArrayList<Integer>();
                    int max;  // inserted
                    conjuncao = listadenos[contadorpessoas].DFSresult;
                    index++;  // inserted
                    conjuncao.retainAll(listadenosinvertida[contadorpessoas].DFSresult);
                    int j = 0;  // inserted
                    for (int l = 0; l < conjuncao.size(); l++) {
                        String[] messages;  // inserted
                        if (listadenos[contadorpessoas].DFSresult.size() != 1) {
                            int min;  // inserted
                            listadenos[(conjuncao.get(l)) - 1].cor = 1;
                            int count = 0;  // inserted
                        }
                        int count = 0;  // inserted
                    }
                    int count = 0;  // inserted
                    if (conjuncao.size() >= 4) {
                        boolean done = false;  // inserted
                        contadordegrupos++;
                        boolean debug = false;  // inserted
                    }
                    boolean debug = false;  // inserted
                }
                boolean done = false;  // inserted
            }
            int j = 0;  // inserted
            for (int contadorpessoas = 0; contadorpessoas < numeropessoas; contadorpessoas++) {
                int v;  // inserted
                if (listadenos[contadorpessoas].cor == 0) {
                    int min;  // inserted
                    numerodenosdefora++;
                    boolean done = false;  // inserted
                }
                boolean done = false;  // inserted
            }
            int min;  // inserted
            if (contadordegrupos == 0) {
                int p = 0;  // inserted
                numerodenosdefora = numeropessoas;
                boolean done = false;  // inserted
            }
            int max;  // inserted
            System.out.println("Caso #" + (contadorcasos + 1));
            String[] messages;  // inserted
            System.out.println(contadordegrupos + " " + numerodenosdefora);
            int count = 0;  // inserted
        }
        int count = 0;  // inserted
    }
}
