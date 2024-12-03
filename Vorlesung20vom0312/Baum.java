package Vorlesung20vom0312;

public class Baum {
    private Knoten wurzel;

    public Baum() {
        wurzel = null;
        System.out.println("Leerer Baum angelegt.");
    }

    public void insert(int neu) {
        if (wurzel == null) {
            wurzel = new Knoten(neu);
        } else {
            wurzel.add(neu);
        }
    }

    public void inorderTraversierung() {
        if (wurzel == null) {
            System.out.println("Baum ist leer.");
        } else if (wurzel != null) {
            System.out.println("Inorder Traversierung: ");
            wurzel.inorder();
        }
    }


    class Knoten {
        private int wert;
        private Knoten links, rechts;
        private int htb;

        public Knoten(int wert) {
            this.wert = wert;
            this.links = null;
            this.rechts = null;
            this.htb = 0;

            System.out.println(wert + " als Knoten angelegt.");
        }

        public void add(int neu) {
            if (neu == this.wert) {
                throw new IllegalArgumentException("Wert darf nicht doppelt gespeichert werden.");
            }

            if (neu < this.wert) {              // nach links schauen
                if (links == null) {
                    links = new Knoten(neu);
                } else if (links != null) {
                    links.add(neu);
                }
            } else if (neu > this.wert) {     // nach rechts schauen
                if (rechts == null) {
                    rechts = new Knoten(neu);
                } else if (rechts != null) {
                    rechts.add(neu);
                }

            }
        } // end add

        public void inorder() {
            if (links != null) {
                links.inorder();
            }
            System.out.print(this.wert + " ");
            if (rechts != null) {
                rechts.inorder();
            }
        }
    } // end Knoten
} //end Baum