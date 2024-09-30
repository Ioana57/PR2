package Vorlesung2vom3009;

public class Main {

    public static void main(String[] args) {
        Gebäude a = new Gebäude();
        a.addHörsaal(new Hörsaal("A210", 50));
        a.addHörsaal(new Hörsaal("A212", 40));

        System.out.println(a.berechneGesamtzahlPlätze());
    }
}
