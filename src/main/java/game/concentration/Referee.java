package game.concentration;

public class Referee {
    Players player;
    Board table;

    public Referee(int size, Players player) {
        table = new Board(size);
        this.player = player;
    }


    public void play() {

        while (table.isGameOver() == false) {
            System.out.println(table);

            int[] coord;
            while (true) {
                coord = player.getCoord();
                if (table.isHidden(coord)) {
                    table.reveal(coord[0], coord[1]);
                    break;
                }
            }

            System.out.println(table);

            int[] secondCoord;
            while (true) {
                secondCoord = player.getCoord();
                if (table.isHidden(secondCoord)) {
                    table.reveal(secondCoord[0], secondCoord[1]);
                    break;
                }
            }

            System.out.println(table);

            if (table.isMatch(coord, secondCoord) == false) {
                table.hide(coord[0], coord[1]);
                table.hide(secondCoord[0], secondCoord[1]);
            }
        }
    }
}
