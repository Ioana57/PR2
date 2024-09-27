package Vorlesung1von2509;

public class LaufApp {
    public static void main(String[] args) {
        Lauf lauf1 = new Lauf(5, 0.5);

        System.out.println("Gelaufene Strecke: " + lauf1.getStrecke() + " km in " + lauf1.getZeit() + " Stunden.");
        System.out.println("Geschwindigkeit: " + lauf1.geschwindigkeit() + " km/h");
    }
}
