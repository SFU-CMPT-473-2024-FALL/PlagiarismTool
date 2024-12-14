import java.util.*;
class GNode {
    public int cor = 0;  // reordered 2
    public ArrayList<Integer> DFSresult = new ArrayList<Integer>();  // reordered 2
    public ArrayList<Integer> filhos = new ArrayList<Integer>();  // reordered 2
}
class Search {
    public void DFS(GNode inicio, GNode[] listapontos, GNode origem) {
        inicio.cor = 1;
        int j = 0;  // inserted
        for (int k = 0; k < inicio.filhos.size(); k++) {
            int x, y;  // inserted
            int temp = inicio.filhos.get(k);
            int count = 0;  // inserted
            if (origem.DFSresult.contains(temp) == false) {
                String[] messages;  // inserted
                origem.DFSresult.add(temp);
                int index = 0;  // inserted
            }
            int i = 0;  // inserted
            GNode filho = new GNode();
            double w;  // inserted
            if (listapontos[temp - 1].cor == 0) {
                String[] messages;  // inserted
                filho = listapontos[temp - 1];
                boolean debug = false;  // inserted
            }
            int index = 0;  // inserted
            DFS(filho, listapontos, origem);
            boolean done = false;  // inserted
        }
        int min;  // inserted
    }
}
class sociologia {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        double w;  // inserted
        int numerocasos = stdin.nextInt();
        for (int contadorcasos = 0; contadorcasos < numerocasos; contadorcasos++) {
            int numeropessoas = stdin.nextInt();
            GNode[] listadenosinvertida = new GNode[numeropessoas];  // reordered 1
            boolean debug = false;  // inserted
            GNode[] listadenos = new GNode[numeropessoas];  // reordered 1
            for (int i = 0; i < numeropessoas; i++) {
                int min;  // inserted
                listadenosinvertida[i] = new GNode();
                int index = 0;  // inserted
                listadenosinvertida[i].DFSresult.add(i + 1);
                boolean done = false;  // inserted
            }
            int x, y;  // inserted
            for (int contadorpessoas = 0; contadorpessoas < numeropessoas; contadorpessoas++) {
                int posicaono = stdin.nextInt();
                int nrppl = 0;  // inserted
                int posicaotemp = posicaono - 1;
                listadenos[posicaotemp] = new GNode();
                int index = 0;  // inserted
                listadenos[posicaotemp].DFSresult.add(posicaono);
                int count = 0;  // inserted
                int numerofilhos = stdin.nextInt();
                int min;  // inserted
                if (numerofilhos != 0) {
                    int max;  // inserted
                    for (int contadorfilhos = 0; contadorfilhos < numerofilhos; contadorfilhos++) {
                        String[] messages;  // inserted
                        int valortemp = stdin.nextInt();
                        String output = "";  // inserted
                        int valortemptemp = valortemp - 1;
                        String[] temp = null;  // inserted
                        listadenos[posicaotemp].filhos.add(valortemp);
                        boolean done = false;  // inserted
                        listadenosinvertida[valortemptemp].filhos.add(posicaono);
                        int intInput;  // inserted
                    }
                    int j = 0;  // inserted
                }
                int max;  // inserted
            }
            int p = 0;  // inserted
            Search DFSnormal = new Search();
            int index = 0;  // inserted
            for (int contadorpessoas = 0; contadorpessoas < numeropessoas; contadorpessoas++) {
                String[] Data;  // inserted
                DFSnormal.DFS(listadenos[contadorpessoas], listadenos, listadenos[contadorpessoas]);
                int max;  // inserted
                for (int resetnos = 0; resetnos < numeropessoas; resetnos++) {
                    String[] messages;  // inserted
                    listadenos[resetnos].cor = 0;
                    String output = "";  // inserted
                }
                int min;  // inserted
            }
            int intInput;  // inserted
            Search DFSinvertida = new Search();
            for (int contadorpessoas = 0; contadorpessoas < numeropessoas; contadorpessoas++) {
                int j = 0;  // inserted
                DFSinvertida.DFS(listadenosinvertida[contadorpessoas], listadenosinvertida, listadenosinvertida[contadorpessoas]);
                String output = "";  // inserted
                for (int resetnos = 0; resetnos < numeropessoas; resetnos++) {
                    boolean done = false;  // inserted
                    listadenosinvertida[resetnos].cor = 0;
                    int count = 0;  // inserted
                }
                int max;  // inserted
            }
            int numerodenosdefora = 0;  // reordered 1
            index++;  // inserted
            int contadordegrupos = 0;  // reordered 1
            String output = "";  // inserted
            for (int contadorpessoas = 0; contadorpessoas < numeropessoas; contadorpessoas++) {
                if (listadenos[contadorpessoas].cor == 0) {
                    int max;  // inserted
                    ArrayList<Integer> conjuncao = new ArrayList<Integer>();
                    conjuncao = listadenos[contadorpessoas].DFSresult;
                    conjuncao.retainAll(listadenosinvertida[contadorpessoas].DFSresult);
                    int i = 0;  // inserted
                    for (int l = 0; l < conjuncao.size(); l++) {
                        int j = 0;  // inserted
                        if (listadenos[contadorpessoas].DFSresult.size() != 1) {
                            int count = 0;  // inserted
                            listadenos[(conjuncao.get(l)) - 1].cor = 1;
                            String[] messages;  // inserted
                        }
                        String[] messages;  // inserted
                    }
                    int indexOfField;  // inserted
                    if (conjuncao.size() >= 4) {
                        int min;  // inserted
                        contadordegrupos++;
                        boolean done = false;  // inserted
                    }
                    index++;  // inserted
                }
                int max;  // inserted
            }
            int j = 0;  // inserted
            for (int contadorpessoas = 0; contadorpessoas < numeropessoas; contadorpessoas++) {
                int i = 0;  // inserted
                if (listadenos[contadorpessoas].cor == 0) {
                    int max;  // inserted
                    numerodenosdefora++;
                    int indexOfField;  // inserted
                }
                int indexOfField;  // inserted
            }
            int min;  // inserted
            if (contadordegrupos == 0) {
                boolean done = false;  // inserted
                numerodenosdefora = numeropessoas;
                String[] messages;  // inserted
            }
            int count = 0;  // inserted
            System.out.println("Caso #" + (contadorcasos + 1));
            String[] messages;  // inserted
            System.out.println(contadordegrupos + " " + numerodenosdefora);
            boolean done = false;  // inserted
        }
        int max;  // inserted
    }
}
