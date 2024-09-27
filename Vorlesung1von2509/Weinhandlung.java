package Vorlesung1von2509;

public class Weinhandlung {
    public static void main(String[] args) {
        Wein w1 = new Wein("Pinot Grigio", 5, 12.5, 2 );

        double alkoholmenge = w1.berechneAlkoholmenge();
        System.out.printf("In der Flasche '%s' sind %.2f Liter Alkohol enthalten.%n", w1.getName(), alkoholmenge);
    }
}
