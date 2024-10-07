package Vorlesung4vom0210;

public class Main {
    public static void main(String[] args) {
        Mitarbeiter mi = new Mitarbeiter("Müller", "27.10.1972");
        System.out.println(mi.toString());		// nutzt die von Object geerbte Methode
        System.out.println(mi.getDetails());

        System.out.println();

        Manager ma = new Manager("Stromberg", "01.02.1970");
        System.out.println(ma.toString());		// wieder die Methode von Object
        System.out.println(ma.getDetails());
    }
}

class Mitarbeiter extends Object {
    private String name;
    private double gehalt;
    private String geburtsdatum;

    public Mitarbeiter(String name, String geburtsdatum) {
        this(name, 35000, geburtsdatum);
    }

    public Mitarbeiter(String name, double gehalt, String geburtsdatum) {
        this.name = name;
        this.gehalt = gehalt;
        this.geburtsdatum = geburtsdatum;
    }

    public String getDetails() {
        return name;
    }
}

class Manager extends Mitarbeiter {
    private String abteilung;

    public Manager(String name, String geburtsdatum) {
        super(name, 65000, geburtsdatum);	// das MUSS gemacht werden!
    }

    public String getDetails() {
        return super.getDetails() + " " + abteilung;
    }
}