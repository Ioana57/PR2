package Testat2Uebung;

import java.util.ArrayList;
import java.util.Arrays;

public class TestPersonen {

    public static void main(String[] args) {
        Person[] personen = {
                new Student(),
                new Professor(),
                new Hausmeister(),
                new Person(),
        };

        // Konvertiere das Array in eine ArrayList
        ArrayList<Person> personenList = new ArrayList<>(Arrays.asList(personen));

        personenList.forEach(p -> p.spricht());
    }
}
