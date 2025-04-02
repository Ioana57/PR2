package IB3.UEB1_Blackjack.domain;

public class Card {
    private final String suit;
    private final String rank;

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    public int getValue() {
        if ("JQK".contains(rank)) return 10;
        if ("A".equals(rank)) return 11;
        return Integer.parseInt(rank);
    }

    @Override
    public String toString() {
        return rank + suit;
    }
}


//------- Code von Prof. Hummel ---------
/*public class Card {
    private String suite;
    private String value;
    private int points;

    public Card(String suite, String value) {
        this.suite = suite;
        this.value = value;

        if ("BubeDameKönig".contains(value))
            points = 10;
        else if ("Ass".equals(value))
            points = 11;
        else
            points = Integer.parseInt(value);
    }

    public int getPoints() {
        return this.points;
    }

    public String toString() {
        return suite + " " + value;
    }

}*/
