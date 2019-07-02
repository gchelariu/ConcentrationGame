package game.concentration;

import game.concentration.BotPlayer;
import game.concentration.HumanPlayer;

public class Main {

    public static void main(String[] args) {

        //Uncomment arbitru.play() and enjoy the game:D
        HumanPlayer player1 = new HumanPlayer("Gabriel");
        Referee arbitru = new Referee(4, player1);
        arbitru.play();

        //A bot is initialized that plays the game untill all symbols are revealed
        //Uncomment botArbitru.play() to start.
        BotPlayer player2 = new BotPlayer("Calculator");
        Referee botArbistru = new Referee(4,player2);
//        botArbistru.play();
    }
}

