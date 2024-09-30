package Vorlesung2vom3009;

import java.util.ArrayList;

public class Gebäude {
    private ArrayList<Hörsaal> räume = new ArrayList<>();

    public int berechneGesamtzahlPlätze(){
        int plätze = 0;

        for (Hörsaal h : this.räume){
            plätze += h.getPlätze();
        }

        return plätze;
    }

    public void addHörsaal(Hörsaal hs){
        this.räume.add(hs);
    }
}
