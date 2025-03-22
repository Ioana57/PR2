package IB2.Vorlesung6vom1410;

public abstract class Animal {
    private String name;
    private int birthyear;
    private String species;

    public Animal(String name, int birthyear) {
        this.name = name;
        this.birthyear = birthyear;

        species = this.getClass().getName();
        species = species.substring(species.lastIndexOf(".")+1);
    }

    public abstract void speak();

    public String getSpecies() {
        return species;
    }

}