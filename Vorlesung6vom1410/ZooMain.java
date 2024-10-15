package Vorlesung6vom1410;

import java.util.ArrayList;

public class ZooMain {

    public static void main(String[] args) throws Exception {
        ArrayList<Animal> tiere = new ArrayList<>();

        // Animal a = new Animal("Animal", "1934");  // abstrakt, daher keine Instanzen möglich!

        Animal c = new Cat("Sylvester", 1947);
        c.speak();
        tiere.add(c);

        Animal d = new Dog("Spike", 1963);
        d.speak();
        tiere.add(d);

        System.out.println("Anzahl der Tiere im Zoo: " + tiere.size());

    }

}
