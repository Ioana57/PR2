package IB3.Binärbäume;

import java.util.ArrayList;
import java.util.LinkedList;

public class Baum {

    //Folie 4 Skript 04-Bäume
    private Knoten wurzel;
    private LinkedList<Knoten> bfs; //breath First Search = Breitensuche

    // Der Baum selber kann nur die Wurzel einfügen
    public void add(int zahl) {
        Knoten neu = new Knoten(zahl);
        if (wurzel == null) {
            this.wurzel = neu; //Das ist nur die Wurzel festzulegen
        } else {
            this.wurzel.add(neu);
        }
    }

    public void inorder(){
        if (wurzel == null) {
            System.out.println("Baum ist leer.");
        } else {
            wurzel.inorder();
        }
    }

    public void breitensuche(){
        if (wurzel == null) {
            System.out.println("Baum ist leer.");
        } else {
            bfs = new LinkedList<>();
            bfs.add(wurzel);
            wurzel.breitensuche();
        }
    }

    class Knoten {
        int zahl;
        private Knoten links;
        private Knoten rechts;

        public Knoten(int zahl) {
            this.zahl = zahl;
        }

        public void add(Knoten neu) {
            if (this.zahl > neu.zahl) {
                if (links == null) {
                    links = neu;
                } else {
                    links.add(neu); //Rekursion
                }
            } else if (this.zahl < neu.zahl){
                if (rechts == null) {
                    rechts = neu;
                } else {
                    rechts.add(neu); //Rekursion
                }
            } else if (this.zahl == neu.zahl) {
                throw new RuntimeException("Doppelte Zahlen sind nicht erlaubt!");
            }
        }

        public void inorder() {
            if(links != null){
                links.inorder();
            }
            System.out.println(this.zahl);

            if(rechts != null){
                rechts.inorder();
            }
        }

        public void breitensuche() {

            System.out.println(this.zahl);
            if (links != null) {
                bfs.add(links);
            }
            if (rechts != null) {
                bfs.add(rechts);
            }
            bfs.removeFirst();

            if (!bfs.isEmpty()) {
                bfs.getFirst().breitensuche();
            }

        }

        public int getZahl() {
            return zahl;
        }
    }
}


