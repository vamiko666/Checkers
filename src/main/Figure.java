package main;

public class Figure {
    private int x;
    private int y;
    private boolean isWhite;
    private boolean isKing = false;

    public Figure(int x, int y, boolean isWhite) {
        this.x = x;
        this.y = y;
        this.isWhite = isWhite;
    }

    public int[] getCoordinates() {
        int[] coordinates = new int[2];
        coordinates[0] = x;
        coordinates[1] = y;
        return coordinates;
    }

    public boolean isKing() {
        return isKing;
    }

    public void setKing(boolean king) {
        isKing = king;
    }

    public boolean isWhite() {

            return isWhite;
    }

}

