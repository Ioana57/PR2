package IB3.UEB1_Blackjack.tui;

import IB3.UEB1_Blackjack.facade.BlackJackGame;
import java.util.Scanner;

public class BlackJackTui {
    private Scanner scanner = new Scanner(System.in);
    private BlackJackGame game;

    public void start() {
        System.out.println("Willkommen bei BlackJack!");

        do {
            game = new BlackJackGame();
            playRound();
            System.out.print("Möchtest du eine neue Runde spielen? (j/n): ");
        } while (scanner.nextLine().equalsIgnoreCase("j"));

        System.out.println("Danke fürs Spielen!");
    }

    private void playRound() {
        System.out.println("Deine Karten: " + game.getPlayerHandAsString());
        System.out.println("Karte des Dealers: " + game.getDealerHandAsString(false));

        while (game.getPlayerScore() < 21) {
            System.out.print("Möchtest du eine Karte ziehen? (j/n): ");
            if (!scanner.nextLine().equalsIgnoreCase("j")) {
                break;
            }
            game.playerHit();
            System.out.println("Deine Karten: " + game.getPlayerHandAsString());

            if (game.isPlayerBust()) {
                System.out.println("Du hast über 21! Der Dealer gewinnt.");
                return;
            }
        }

        game.dealerPlay();
        System.out.println("Karten des Dealers: " + game.getDealerHandAsString(true));
        System.out.println(game.determineWinner());
    }
}
