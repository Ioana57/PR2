package IB2.Vorlesung6vom1410;

public class Maus extends Animal {
    public Maus(String name, int birthyear) {
        super(name, birthyear);
    }
    @Override
    public void speak(){
        System.out.println(super.getSpecies() + " macht: Kitz");
    }
}
