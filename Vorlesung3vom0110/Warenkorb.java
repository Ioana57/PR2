package Vorlesung3vom0110;

import java.util.ArrayList;
import java.util.List;

public class Warenkorb {
    private ArrayList<Produkt> produkte = new ArrayList<>();


    public void produktHinzufügen(Produkt produkt){
        produkte.add(produkt);
    }

    public void produktEntfernen(Produkt produkt){
        produkte.remove(produkt);
    }

    public double berechneGesamtpreis(){
        double gesamtpreis = 0;

        for(Produkt p : this.produkte){
            gesamtpreis += p.getPrice();
        }

        return gesamtpreis;
    }

    public List<Produkt> getProducts() {
        return produkte;
    }

    @Override
    public String toString() {
        return "Cart: " + produkte.toString() + ", Total: $" + berechneGesamtpreis();
    }

}
