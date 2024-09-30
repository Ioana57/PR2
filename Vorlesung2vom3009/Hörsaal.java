package Vorlesung2vom3009;

public class Hörsaal {
    private String name;
    private int plätze; //nicht static

    public Hörsaal (String name, int plätze){
        this.name = name;
        this.plätze = plätze;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPlätze() {
        return plätze;
    }

    public void setPlätze(int plätze) {
        this.plätze = plätze;
    }
}
