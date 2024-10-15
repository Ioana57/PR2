package Vorlesung6vom1410;

public class Cat extends Animal {

    public Cat(String name, int birthyear) {
        super(name, birthyear);
    }

    @Override
    public void speak() {
        System.out.println(super.getSpecies() + " macht: Meow");
    }

}
