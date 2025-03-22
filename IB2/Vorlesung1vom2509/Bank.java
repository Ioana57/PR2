package IB2.Vorlesung1vom2509;

public class Bank {

    public static void main(String[] args) {
        Bankkonto bankkonto1 = new Bankkonto("Ioana",234, 100.50);

        System.out.println("Kontonummer: " + bankkonto1.getKontonummer());
        System.out.println("Kontostand: " + bankkonto1.getKontostand());

        bankkonto1.auszahlen(50);
        System.out.println("Kontostand: " + bankkonto1.getKontostand());

        bankkonto1.einzahlen(200.50);
        System.out.println("Kontostand: " + bankkonto1.getKontostand());
    }

}
