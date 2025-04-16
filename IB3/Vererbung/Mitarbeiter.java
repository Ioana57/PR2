package IB3.Vererbung;

import java.util.Date;

public class Mitarbeiter {
    public String name;
    public double gehalt;
    public String geboren;

    public Mitarbeiter(String name, double gehalt, String geboren) {
        this.name = name;
        this.gehalt = gehalt;
        this.geboren = geboren;
    }

    public String getDetails(){
        return name + ", geboren am " + geboren + " hat ein Gehalt von " + gehalt;
    }
}
