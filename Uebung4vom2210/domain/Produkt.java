package Uebung4vom2210.domain;

public class Produkt {
    private String name;
    private String beschreibung;
    private float preis;
    private int gewicht;
    private int bestand;

    public Produkt(String name, String beschreibung, float preis, int gewicht, int bestand) {
        super();
        this.name = name;
        this.beschreibung = beschreibung;
        this.preis = preis;
        this.gewicht = gewicht;
        this.bestand = bestand;
    }

    public String getName() {
        return name;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public float getPreis() {
        return preis;
    }

    public int getGewicht() {
        return gewicht;
    }

    public int getBestand() {
        return bestand;
    }

    @Override
    public String toString() {
        return "Produkt [name=" + name + ", beschreibung=" + beschreibung + ", preis=" + preis + ", gewicht=" + gewicht
                + ", bestand=" + bestand + "]";
    }

}