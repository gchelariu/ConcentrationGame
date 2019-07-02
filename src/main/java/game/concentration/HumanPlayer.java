package game.concentration;

import java.util.Scanner;

public class HumanPlayer implements Players {
    String nume;

    HumanPlayer(String nume){
        this.nume = nume;
    }

    @Override
    public int[] getCoord() {
        Scanner s = new Scanner(System.in);
        System.out.println("Click here and enter the coordonates like: x x");
        int a = s.nextInt();
        int b = s.nextInt();
        if(a > 3 || b > 3){
            System.out.println("The maximum set of coordonates are: 3 3");
            System.out.println("Please rerun the programme and don't exceed the limit.");
        }
        int[] array = new int[]{a, b};
        return array;
    }
}
