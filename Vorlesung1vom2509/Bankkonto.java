package Vorlesung1vom2509;

public class Bankkonto {
    private String inhaber;
    private int kontonummer;
    private double kontostand;

    public Bankkonto(String inhaber, int kontonummer, double kontostand) {
        this.inhaber = inhaber;
        this.kontonummer = kontonummer;
        this.kontostand = kontostand;
    }


    public void einzahlen (double eBetrag){
        kontostand += eBetrag;
    }

    public void auszahlen (double aBetrag){
        kontostand -= aBetrag;
    }

    public String getInhaber() {
        return inhaber;
    }

    public void setInhaber(String inhaber) {
        this.inhaber = inhaber;
    }

    public int getKontonummer() {
        return kontonummer;
    }

    public void setKontonummer(int kontonummer) {
        this.kontonummer = kontonummer;
    }

    public double getKontostand() {
        return kontostand;
    }

    public void setKontostand(int kontostand) {
        this.kontostand = kontostand;
    }



}
