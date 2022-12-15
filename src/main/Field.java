package main;

public class Field {
    private Figure[][] board = new Figure[8][8];

    public Field() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 9; j += 2) {
                board[i][j] = new Figure(i, j, true);
            }
        }
        for (int i = 5; i < 9; i++) {
            for (int j = 0; j < 9; j += 2) {
                board[i][j] = new Figure(i, j, false);
            }
        }
    }


    public Figure[][] getBoard() {
        return board;
    }
}
