package Vorlesung20vom0312;

public class Baum {
    private Knoten wurzel;

    public Baum() {
        wurzel = null;

        System.out.println("Leerer Baum angelegt.");
    }

    public void insert(int neu)  {
        if (wurzel == null) {
            wurzel = new Knoten(neu);
        } else if (wurzel != null) {
            wurzel.add(neu);
        }
    }

    public void inorderTraversierung() {
        if (wurzel == null)
            System.out.println("Baum ist leer.");
        else if (wurzel != null) {
            System.out.print("Inorder-Reihenfolge: ");
            wurzel.inorder();
        }
    }

    public void balance(Knoten knoten) {
        if (wurzel.deltaH <= 2){
            if ( wurzel.wert - wurzel.links.wert < 0){
                wurzel.wert = wurzel.links.wert;
            } else {

            }
        }
    }

    class Knoten {
        private int wert;
        private int htb;
        private int deltaH;
        private Knoten links, rechts;

        public Knoten(int wert) {
            this.wert = wert;
            this.links = null;
            this.rechts = null;

            this.htb = 0;
            this.deltaH = 0;

            System.out.println(wert + " als Knoten angelegt.");
        }

        public void add(int neu) {
            if (neu == this.wert)
                throw new IllegalArgumentException("Wert darf nicht doppelt gespeichert werden.");

            int htbL = 0;
            int htbR = 0;

            if (neu < this.wert) {		// nach links schauen
                if (links == null) {
                    links = new Knoten(neu);
                } else if (links != null) {
                    links.add(neu);
                }
                htbL = links.htb + 1;
                this.htb = Math.max(htbL, this.htb);
            } else if (neu > this.wert){	// nach rechts schauen
                if (rechts == null) {
                    rechts = new Knoten(neu);
                } else if (rechts != null) {
                    rechts.add(neu);
                }
                htbR = rechts.htb + 1;
                this.htb = Math.max(this.htb, htbR);
            }

            // hier Delta-h berechnen

            if (Math.abs(this.links.htb - this.rechts.htb) > 1) {
                balance(this);
            }

            // this.htb = Math.max(htbL, htbR); -> Bug, da ein evtl. vorher vorhandener Wert ignoriert wird
            System.out.println("Wert: " + this.wert + ", HTB: " + this.htb + ", DeltaH: " + this.deltaH);
        } // end add

        public void inorder() {
            if (links != null)
                links.inorder();

            System.out.print(this.wert + " ");

            if (rechts != null)
                rechts.inorder();
        }

    } // end Knoten

} // end Baum