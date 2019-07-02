package game.concentration;

import java.util.Random;

public class Board {

    private Piece[][] matrice;

    Board(int size) {
        matrice = new Piece[size][size];

        Symbol arr[] = Symbol.values();
        Random r = new Random();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 2; j++) {
                int row;
                int col;
                do {
                    row = r.nextInt(size);
                    col = r.nextInt(size);
                } while (matrice[row][col] != null);
                matrice[row][col] = new Piece(arr[i]);
            }
        }
    }

    @Override
    public String toString() {
        String acumulator = "";
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice.length; j++) {
                if (matrice[i][j].hidden) {
                    acumulator += "X";
                } else {
                    acumulator += matrice[i][j].symbol;
                }
            }
            acumulator += "\n";
        }
        return acumulator;
    }


    public void reveal(int a, int b) {
        matrice[a][b].hidden = false;
    }

    public boolean isMatch(int[] coord, int[] secondCoord) {
        if(matrice[coord[0]][coord[1]].symbol == matrice[secondCoord[0]][secondCoord[1]].symbol){
            return true;
        } else {
            return false;
        }
    }

    public void hide(int i, int i1) {
        matrice[i][i1].hidden = true;
    }

    public boolean isHidden(int[] coord) {
        return matrice[coord[0]][coord[1]].hidden;
    }

    public boolean isGameOver() {
        boolean finish = false;
        int count = 0;
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice.length; j++) {
                if(matrice[i][j].hidden == true){
                    count++;
                }
                if(count !=0){
                    break;
                }
            }
        }
        if (count == 0){
            finish = true;
        }
        return finish;
    }
}
