package IB2.Vorlesung6vom1410;

public class ZooFactory {

    public static Animal zooFactory(String species, String name, int year){
        switch (species){
            case "Dog":
                return new Dog(name, year);
            case "Cat":
                return new Cat(name, year);
            case "Maus":
                return new Maus(name, year);
        }
        return null;
    }
}
