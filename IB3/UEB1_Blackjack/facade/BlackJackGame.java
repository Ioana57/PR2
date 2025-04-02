package IB3.UEB1_Blackjack.facade;

import IB3.UEB1_Blackjack.domain.CardDeck;
import IB3.UEB1_Blackjack.domain.Hand;


public class BlackJackGame {
    private CardDeck deck;
    private Hand playerHand;
    private Hand dealerHand;

    public BlackJackGame() {
        deck = new CardDeck();
        playerHand = new Hand();
        dealerHand = new Hand();

        playerHand.addCard(deck.drawCard());
        playerHand.addCard(deck.drawCard());
        dealerHand.addCard(deck.drawCard());
        dealerHand.addCard(deck.drawCard());
    }

    public String getPlayerHandAsString() {
        return playerHand.toString();
    }

    public String getDealerHandAsString(boolean showAll) {
        return showAll ? dealerHand.toString() : dealerHand.getCards().get(0) + " und eine verdeckte Karte.";
    }

    public int getPlayerScore() {
        return playerHand.getValue();
    }

    public int getDealerScore() {
        return dealerHand.getValue();
    }

    public boolean isPlayerBust() {
        return playerHand.isBust();
    }

    public boolean isDealerBust() {
        return dealerHand.isBust();
    }

    public void playerHit() {
        playerHand.addCard(deck.drawCard());
    }

    public void dealerPlay() {
        while (dealerHand.getValue() < 17) {
            dealerHand.addCard(deck.drawCard());
        }
    }

    public String determineWinner() {
        if (isPlayerBust()) return "Du hast über 21! Der Dealer gewinnt.";
        if (isDealerBust()) return "Der Dealer hat über 21! Du gewinnst!";
        if (getPlayerScore() > getDealerScore()) return "Du hast gewonnen!";
        if (getPlayerScore() < getDealerScore()) return "Der Dealer hat gewonnen!";
        return "Unentschieden!";
    }
}



/*public class BlackJackGame {
    private CardDeck deck;

    public BlackJackGame() {
        this.deck = new CardDeck();
    }

    public Card getNextCard() {
        return deck.getNextCard();
    }

}*/
