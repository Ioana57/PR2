package Vorlesung1vom2509;

public class Wein {
    private String name;
    private int age;
    private double alcoholPercentage;
    private double volume;

    public Wein(String name, int age, double alcoholPercentage, double weight) {
        this.name = name;
        this.age = age;
        this.alcoholPercentage = alcoholPercentage;
        this.volume = weight;
    }

    public double berechneAlkoholmenge(){
        return (alcoholPercentage / 100) * volume;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getAlcoholPercentage() {
        return alcoholPercentage;
    }
    public double getVolume() {
        return volume;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setAlcoholPercentage(double alcoholPercentage) {
        this.alcoholPercentage = alcoholPercentage;
    }
    public void setVolume(double volume) {
        this.volume = volume;
    }

}
