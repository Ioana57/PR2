package Uebung4vom2210.tui;

import Uebung4vom2210.domain.OnlineShop;
import Uebung4vom2210.domain.Produkt;

import java.io.FileNotFoundException;
import java.util.Scanner;



public class TUI {
    private OnlineShop shop;
    private Scanner kb;

    public static void main(String[] args) {

        try {
            new TUI();
        } catch (FileNotFoundException e) {
            System.err.println("Produktpalette konnte nicht geladen werden.");
            System.out.println("Auf Wiedersehen!");
        }

        System.out.println("Danke für Ihren Einkauf! - Auf Wiedersehen!");
    }

    public TUI() throws FileNotFoundException {
        kb = new Scanner(System.in);

        shop = new OnlineShop();
        this.willkommen();
    }

    private void willkommen() {
        System.out.println("Willkommen bei Rhenus, dem Mannheimer Online-Baumarkt!");
        System.out.println();

        String eingabe = "";
        do {
            System.out.println("Produktsuche ('alle' für eine Übersicht; 'exit' für Beenden). ");
            System.out.print("> ");
            eingabe = kb.nextLine();

            Produkt[] trefferliste = shop.findeProdukte(eingabe);

            if (trefferliste.length == 0)
                System.out.println("Keine Treffer für: " + eingabe);
            else
                trefferlisteAusgeben(trefferliste);

            System.out.println("0 = zurück zur Suche; Zahl des Produkt für Details.");
            System.out.print("> ");
            eingabe = kb.nextLine();

            try {
                int zahl = Integer.parseInt(eingabe);

                if (zahl > 0 && zahl < trefferliste.length)
                    produktDetailsAnzeigen(trefferliste[zahl-1]);
            } catch(NumberFormatException nfe) {
                System.err.println("Inkorrekte Eingabe!");
            }

        } while(!eingabe.toLowerCase().equals("exit"));
    }

    private void trefferlisteAusgeben(Produkt[] trefferliste) {
        for (int i = 0; i < trefferliste.length; i++)
            System.out.printf("%2d) %s %5.2f Euro%n", i+1, trefferliste[i].getName(), trefferliste[i].getPreis());

        System.out.println();
    }

    private void produktDetailsAnzeigen(Produkt p) {
        System.out.printf("%s für nur %5.2f%n", p.getName(), p.getPreis());
        System.out.println(p.getBeschreibung());
        System.out.println("Produktgewicht: " + p.getGewicht() + " g");

        if (p.getBestand() > 10)
            System.out.println("mehr als 10 Stück auf Lager");
        else if (p.getBestand() > 0)
            System.out.println("nur noch " + p.getBestand() + " Stück auf Lager");
        else
            System.out.println("leider gerade ausverkauft");

        System.out.println();
    }

}
