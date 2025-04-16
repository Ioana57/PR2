package IB3.Vererbung;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Vererbung
        Mitarbeiter A = new Mitarbeiter("Tom Schmitt", 3000,  "05.07.2000");
        System.out.println(A.getDetails());
        Manager B = new Manager("Tim Seen", 5000, "06.04.1998", "Marketing");
        System.out.println(B.getDetails());

        // Polymorphismus
        Mitarbeiter mi = new Mitarbeiter("Müller", 3100, "05.07.1967");
        Manager ma = new Geschaeftsfuehrer("Stromberg", 10000, "01.01.1956", "IT");
        Mitarbeiter mi2 = new Manager("Mayer", 5500, "06.04.1998", "IT");

        ArrayList<Mitarbeiter> team = new ArrayList<Mitarbeiter>();
        team.add(mi);
        team.add(ma);
        team.add(mi2);

        for (Mitarbeiter m : team) {
            System.out.println(m.getDetails());
        }



    }
}
