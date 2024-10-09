package Vorlesung4vom0210;

import java.util.ArrayList;

public class Firma {
    private ArrayList<Mitarbeiter> mas = new ArrayList<>();
    public static void main(String[] args) {
        Mitarbeiter mi = new Mitarbeiter("Müller", "27.10.1972");
        System.out.println(mi.toString());		// nutzt die von Object geerbte Methode
        System.out.println(mi.getDetails());

        System.out.println();

        Manager ma = new Manager("Stromberg", "01.02.1970", "Finanzen");
        System.out.println(ma.toString());		// wieder die Methode von Object
        System.out.println(ma.getDetails());



        Firma hal = new Firma();
        hal.mitarbeiterEinstellen(mi);
        hal.mitarbeiterEinstellen(ma);
        hal.mitarbeiterEinstellen(new Mitarbeiter("Mayer", "12.12.1999"));

        System.out.println(ma.getAbteilung());
        //ma = mi; //geht nicht!, down-cast muss mit (typ) eingegeben werden
        mi = ma; // Upcast
        //System.out.println(mi.getAbteilung()); -> geht nicht, weil Typ Mitarbeiter von mi "filtert" die Methode weg
        System.out.println(mi.getGehalt());
        System.out.println(ma.getAbteilung());
        //System.out.println(mi.getAbteilung()); //geht nicht! wg. statischem Typ Mitarbeiter

        Mitarbeiter[] angestellte = new Mitarbeiter[5];
        angestellte[0] = mi;
        angestellte[1] = ma; //sinnvollerer Upcast

        Object[] instanzen = new Object[5];
        instanzen[0] = mi;
        instanzen[1] = ma;


        if (mi instanceof Manager) { //Downcast immer prüfen!
            ma = (Manager) mi; //Downcast mit (typ)
        System.out.println(((Manager)mi).getAbteilung());
        }

        //Klausurfragen gerne gefragt
        //Manager gf = (Manager) new Mitarbeiter("Schmitt", "12.01.1975");
        //Fehlermeldung, class Mitarbeiter cannot be cast to class Manager
    }

    private void mitarbeiterEinstellen(Mitarbeiter m){
        mas.add(m);
    }

    private void gehaltsErhöhung(){
        for(Mitarbeiter m : mas){
            double erhöhung = 0.02;

            //sout (m instanceof String)  //das geht NICHT, muss zur Vererbungshierarchie

            if(m instanceof Manager){
                erhöhung = 0.12; //0.02 wird überschrieben
            } //else if (m instanceof Mitarbeiter) {
                //erhöhung = 0.02;
            //}

            //else if (m instanceof Geschäftsführer)
            // erhöhung = 0.2;

            m.setGehalt(m.getGehalt() * (1+erhöhung));
        }
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

    public double getGehalt() {
        return gehalt;
    }

    public void setGehalt(double gehalt) {
        this.gehalt = gehalt;
    }
}

class Manager extends Mitarbeiter {
    private String abteilung;

    public Manager(String name, String geburtsdatum, String abteilung) {
        super(name, 65000, geburtsdatum); // das MUSS gemacht werden!
        this.abteilung = abteilung;
    }

    public String getDetails() {
        return super.getDetails() + " " + abteilung;
    }

    public String getAbteilung() {
        return abteilung;
    }

    public void setAbteilung(String abteilung) {
        this.abteilung = abteilung;
    }
}