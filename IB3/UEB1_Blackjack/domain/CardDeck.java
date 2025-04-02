package IB3.UEB1_Blackjack.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

    public class  CardDeck {
        private static final String[] SUITS = {"♠", "♥", "♦", "♣"};
        private static final String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        private List<Card> cards;

        public CardDeck() {
            cards = new ArrayList<>();
            for (String suit : SUITS) {
                for (String rank : RANKS) {
                    cards.add(new Card(suit, rank));
                }
            }
            shuffle();
        }

        public void shuffle() {
            Collections.shuffle(cards);
        }

        public Card drawCard() {
            return cards.isEmpty() ? null : cards.remove(0);
        }
    }

    //---------------- Code von Hr. Hummel ------------------
    /*public Card getNextCard() {
        return new Card("Pik", "Ass");
    }*/




