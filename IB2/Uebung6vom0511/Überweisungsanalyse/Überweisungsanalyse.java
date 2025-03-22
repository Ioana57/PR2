package IB2.Uebung6vom0511.Überweisungsanalyse;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

public class Überweisungsanalyse {
    public static void main(String[] args) throws FileNotFoundException {
        List<Transaction> transactions = new ArrayList<Transaction>();

        Scanner sc = new Scanner(new File("Uebung6vom0511/Überweisungsanalyse/synthetic_data.csv"));
        sc.nextLine();
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] cols = line.split(",");

            Account sender = new Account(cols[0], cols[1]);
            Account receiver = new Account(cols[2], cols[3]);
            double amount = Double.parseDouble(cols[4]);
            String currency = cols[5];
            // Falls die Zeile weniger als 7 Spalten hat, recCountry auf null setzen
            String recCountry = (cols.length > 6 && !cols[6].isEmpty()) ? cols[6] : null;

            transactions.add(new Transaction(sender, receiver, amount, currency, recCountry));
        }
        sc.close();

        // Aufgabe 1: Filter für EUR-Transaktionen über 1000
        System.out.println("Aufgabe 1: ");
        transactions.stream()
                .filter(tr -> "EUR".equals(tr.getCurrency()))
                .filter(tr -> tr.getAmount() >= 1000)
                .forEach(t -> System.out.println(t.getAmount() + " " + t.getCurrency()));

        // Aufgabe 2: Ausgabe aller Auslandstransaktionen
        System.out.println("Aufgabe 2: ");
        transactions.stream()
                .filter(tr -> tr.getRecCountry() !=null)
                .forEach(t -> System.out.println(t.getAmount()
                                                    + " " + t.getCurrency()
                                                    + " " + t.getRecCountry()));

        //Aufgabe 3: Gesamtsumme der Überweisungen in den jeweiligen Währungen
        System.out.println("Aufgabe 3: ");
        Map<String, Double> totalAmountsByCurrency = transactions.stream()
                .collect(Collectors.groupingBy(Transaction::getCurrency, Collectors.summingDouble(Transaction::getAmount)));

        totalAmountsByCurrency.forEach((currency, total) ->
                System.out.printf("Währung: %s, Gesamtsumme: %.2f\n", currency, total));


        // Aufgabe 4: Prozentuale Anteile der Überweisungen in den verschiedenen Währungen
        System.out.println("Aufgabe 4: ");
        long totalTransactions = transactions.size();

        Map<String, Long> currencyCounts = transactions.stream()
                .collect(Collectors.groupingBy(Transaction::getCurrency, Collectors.counting()));
        currencyCounts.forEach((currency, count) -> {
            double percentage = (count * 100.0) / totalTransactions;
            System.out.printf("%s: %.2f%%\n", currency, percentage);
        });


        // Aufgabe 5: Summe der ausgehenden USD-Transaktionen für "Holly Wood"
        System.out.println("Aufgabe 5: ");
        double anz = transactions.stream()
                .filter(tr -> "Holly Wood".equals(tr.getSender().getName()))
                .filter(tr -> "USD".equals(tr.getCurrency()))
                .mapToDouble(tr -> tr.getAmount())
                .reduce((double l, double r)-> l+r).getAsDouble();

        System.out.println(anz);
    }
}

class Transaction {
    private Account receiver;
    private Account sender;
    private double amount;
    private String currency;
    private String recCountry;

    public Transaction(Account sender, Account receiver,double amount, String currency, String recCountry) {
        this.receiver = receiver;
        this.sender = sender;
        this.amount = amount;
        this.currency = currency;
        this.recCountry = recCountry;

    }

    public Account getReceiver() {
        return receiver;
    }

    public void setReceiver(Account receiver) {
        this.receiver = receiver;
    }

    public Account getSender() {
        return sender;
    }

    public void setSender(Account sender) {
        this.sender = sender;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getRecCountry() {
        return recCountry;
    }

    public void setRecCountry(String recCountry) {
        this.recCountry = recCountry;
    }
}

class Account {
    private String name;
    private String number;

    public Account(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}


