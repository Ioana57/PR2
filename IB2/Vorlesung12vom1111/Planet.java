package IB2.Vorlesung12vom1111;

//import static enums.Planet.*;  // nur notwendig aus anderen Klassen

import java.util.Arrays;

public enum Planet {
    MERKUR, VENUS, ERDE, MARS, JUPITER, SATURN, URANUS, NEPTUN;

    public static void main (String [] args) {
        System.out.println("Hallo Planeten!");
        System.out.println(Planet.MERKUR.name());
        System.out.println(Planet.valueOf("VENUS"));

        System.out.println(ERDE == MARS);

        String input = "Erde".toUpperCase();
        Planet e = Planet.valueOf(input);
        System.out.println(ERDE == e);
        System.out.println(e.toString());

//        for (Planet p : Planet.values()) {
//            System.out.println(p.name());
//        }

        Planet[] planeten = Planet.values();
//        Arrays.stream(planeten).forEach(System.out::println);
        Arrays.stream(planeten).forEach(p -> System.out.println((p.ordinal() +1)+ " " + p));

        System.out.println(ERDE.compareTo(MARS));
        System.out.println(ERDE.compareTo(MERKUR));
    }

    @Override
    public String toString() {
        return name().charAt(0) + name().substring(1).toLowerCase();
    }
}
