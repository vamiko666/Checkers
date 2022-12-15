package main;

public class Player {
    private String name;
    private boolean isWhite;


    public Player(String name, boolean isWhite) {
        this.name = name;
        this.isWhite = isWhite;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getIsWhite() {
        return isWhite;
    }

    public void setIsWhite(boolean isWhite) {
        this.isWhite = isWhite;
    }
    public void move(int x1,int y1,int x2,int y2, Field field){
        Figure[][] board= field.getBoard();
        if(isWhite == board[x1][y1].isWhite())  {


        }
    }
}




