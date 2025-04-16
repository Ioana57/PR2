package IB3.Vererbung;

import java.util.Date;

public class Manager extends Mitarbeiter {
    public String abteilung;

    public Manager(String name, double gehalt, String geboren, String abteilung) {
        super(name, gehalt, geboren);
        this.abteilung = abteilung;
    }

    public String getDetails(){
        return super.getDetails() + " und leitet die Abteilung " + abteilung;

    }


}
