package IB2.Vorlesung21vom1012;

import java.util.ArrayList;

public class Ort {
    private String name;
    private int entfernung;
    private ArrayList<Strasse> strassen;

    public Ort(String n) {
        this.name = n;
        this.strassen = new ArrayList<Strasse>();
    }

    public void addStrasse(Strasse str) {
        strassen.add(str);
    }

    public String toString() {
        return this.name + " hat " + strassen.size() + " Straßen und eine Entfernung von " + entfernung + " km zum Startort.";
    }

    public void setEntfernung(int entfernung) {
        this.entfernung = entfernung;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Strasse> getStrassen() {
        return strassen;
    }
}
