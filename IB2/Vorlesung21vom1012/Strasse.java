package IB2.Vorlesung21vom1012;

public class Strasse {
    private Ort ort1;
    private Ort ort2;

    private int laenge;

    public Strasse(Ort ort1, Ort ort2, int laenge) {
        this.ort1 = ort1;
        this.ort2 = ort2;
        this.laenge = laenge;

        ort1.addStrasse(this);
        ort2.addStrasse(this);
    }

    public Ort getAndererOrt(Ort start) {
        if (ort1 == start){
            return ort2;
        }
        else {
            return ort1;
        }
    }

    public int getLaenge(){
        return laenge;
    }
}
