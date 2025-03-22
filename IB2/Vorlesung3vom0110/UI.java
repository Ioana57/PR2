package IB2.Vorlesung3vom0110;

import java.util.Scanner;

public class UI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Warenkorb warenkorb = new Warenkorb();

        Produkt p1 = new Produkt(123,"laptop",999.99);
        Produkt p2 = new Produkt(456,"handy",799.99);
        Produkt p3 = new Produkt(789,"kopfhörer",259.99);

        System.out.println("Willkommen");
        System.out.println("Verfügbare Produkte: ");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());

        while(true) {
            System.out.println("Gebe Name des Produktes, um es im Warenkorb einzulegen oder exit, um rauszukommen");
            String name = sc.nextLine();

            if(name.equals("exit")) {
                break;
            }

            switch(name.toLowerCase()) {
                case "laptop":
                    warenkorb.produktHinzufügen(p1);
                    break;

                case "handy":
                    warenkorb.produktHinzufügen(p2);
                    break;

                case "kopfhörer":
                    warenkorb.produktHinzufügen(p3);
                    break;

                default:
                    System.out.println("Produkt nicht gefunden");
                    break;


            }

        }

        sc.close();
        System.out.println("Dein Warenkorb: " + warenkorb.toString());


    }
}
