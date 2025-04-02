package IB3.UEB1_Blackjack.tui;

import IB3.UEB1_Blackjack.facade.BlackJackGame;

public class TuiMain {
    public static void main(String[] args) {
        new BlackJackTui().start();
    }
}



// ------------ Code von Hr. Hummel -----------------
/*public class TuiMain {
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        MainMenu menu = new MainMenu(new BlackJackGame());

        menu.show();

        kb.close();
    }

}*/
