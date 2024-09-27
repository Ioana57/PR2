package Vorlesung1von2509;

public class Lauf {
    private double strecke;
    private double zeit;

    public Lauf(double strecke, double zeit) {
        this.strecke = strecke;
        this.zeit = zeit;
    }

    public double geschwindigkeit(){
        return (double) strecke / zeit;

    }

    public double getStrecke() {
        return strecke;
    }

    public void setStrecke(int strecke) {
        this.strecke = strecke;
    }

    public double getZeit() {
        return zeit;
    }

    public void setZeit(int zeit) {
        this.zeit = zeit;
    }
}
