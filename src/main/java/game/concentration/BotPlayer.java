package game.concentration;

import java.util.Random;

public class BotPlayer implements Players {

    String nume;

    public BotPlayer(String nume){
        this.nume = nume;
    }

    @Override
    public int[] getCoord() {

        Random r = new Random();
        int a = r.nextInt(4);
        int b = r.nextInt(4);

        return new int[]{a, b};
    }
}
