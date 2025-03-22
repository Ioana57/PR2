package IB2.Vorlesung6vom1410;

import java.util.Scanner;

public class UI {
    public static void main(String[] args) {

        Zoo zoo = new Zoo();
        Scanner sc = new Scanner(System.in);

        System.out.println("Willkommen im Zoo!\n");

        while(true){
            System.out.println("Wähle Option aus: ");
            System.out.println("1. Erzeuge Tier");
            System.out.println("2. Tier sprechen lassen");
            System.out.println("3. Exit");

            String option = sc.nextLine();

            switch (option) {
                case "1":
                    System.out.println("Tierart: ");
                    String tierart = sc.nextLine();
                    System.out.println("Tiername: ");
                    String tiername = sc.nextLine();
                    System.out.println("Geburtsjahr: ");
                    int geburtsjahr = sc.nextInt();
                    zoo.addTiere(tierart, tiername, geburtsjahr);
                    break;

                case "2":
                    System.out.println("Welches Tiere sollen sprechen?");
                    //System.out.println(zoo.tiere);
                    String tier = sc.nextLine();
                    switch (tier) {
                        case "Dog":
                            //Dog.speak();
                    }

                case "3":
                    System.out.println("Programm beendet.");
                    sc.close();
                    return;

                default:
                    System.out.println("Ungültig");
            }
        }
    }
}
