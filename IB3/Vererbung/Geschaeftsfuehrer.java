package IB3.Vererbung;

import java.util.Date;

public class Geschaeftsfuehrer extends Manager {
    public boolean prokura;

    public Geschaeftsfuehrer(String name, double gehalt, String geboren, String abteilung) {
        super(name, gehalt, geboren, abteilung);
        this.prokura = true;

    }

    public String getDetails(){
        return name + ", geboren am " + geboren + " hat ein Gehalt von " + gehalt + " und leitet die Abteilung " + abteilung;
    }
}
