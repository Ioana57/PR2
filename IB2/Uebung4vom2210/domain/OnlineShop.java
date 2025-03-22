package IB2.Uebung4vom2210.domain;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class OnlineShop {
    private ArrayList<Produkt> lager;

    public OnlineShop() throws FileNotFoundException {
        lager = new ArrayList<>();

        produkteLaden();
    }

    private void produkteLaden() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("resources/produkte.csv"));

        int cnt = 0;
        while (sc.hasNextLine()) {
            String produkt = sc.nextLine();

            if (produkt.startsWith("Name"))
                continue;

            String[] spalten = produkt.split(";");
            spalten[2] = spalten[2].replaceAll(",", ".");
            spalten[3] = spalten[3].substring(0, spalten[3].indexOf(","));
            spalten[4] = spalten[4].substring(0, spalten[4].indexOf(","));

            lager.add(new Produkt(spalten[0], spalten[1], Float.parseFloat(spalten[2]), Integer.parseInt(spalten[3]), Integer.parseInt(spalten[4])));
            cnt++;
        } // while

        System.out.println(cnt + " Produkte geladen.");

        sc.close();
    }

    public Produkt[] findeProdukte(String suchbegriff) {
        ArrayList<Produkt> trefferliste = new ArrayList<>();

        if (suchbegriff.equals("alle"))
            trefferliste = lager;
        else
            for (Produkt p : lager) {
                if (p.getName().contains(suchbegriff) || p.getBeschreibung().contains(suchbegriff))
                    trefferliste.add(p);
            }

        return trefferliste.toArray(new Produkt[0]);
    }
}
