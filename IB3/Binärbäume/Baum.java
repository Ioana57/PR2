package IB3.Binärbäume;

public class Baum {

    //Folie 4 Skript 04-Bäume
    private Knoten wurzel;

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
                    links.add(neu);
                }
            } else if (this.zahl < neu.zahl){
                if (rechts == null) {
                    rechts = neu;
                } else {
                    rechts.add(neu);
                }
            } else if (this.zahl == neu.zahl) {
                throw new RuntimeException("Doppelte Zahlen sind nicht erlaubt!");
            }
        }

        public int getZahl() {
            return zahl;
        }
    }

    public void add(int zahl) {
        Knoten neu = new Knoten(zahl);
        if (wurzel == null) {
            this.wurzel = neu; //Das ist nur die Wurzel festzulegen
        } else {
            this.wurzel.add(neu);
        }
    }
}


