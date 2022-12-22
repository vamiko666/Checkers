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
    public void move(int x1,int y1,int x2,int y2, Field field) {
        Figure[][] board = field.getBoard();
        if(board[x1][y1] !=null ){


        }
    }

    public boolean canMove(int x1, int y1, int x2, int y2, Figure[][] board) {
        Figure figure =board[x1][x2];
        if(x2>9 || y2>9){
            return false;
        }
        if (figure.isWhite() == isWhite) {
            if(figure.isWhite()==true){
                if((board[x1+1][y1+1]==null || board[x1-1][y2+1]==null) & (x1+1==x2 || x1-1==x2) & y1==y2 ){
                    return true;
                }else if(board[x2][y2]==null & (x1+2==x2 || x1-2==x2) & y1+2==y2){
                    return true;

                }else if(figure.isKing()){
                    if(x1<x2) {
                        for (int i = x1; i <= x2; i++) {
                            for (int j = y1; j <= y2; j++) {
                                int count = 0;
                                if (board[i][j] != null)
                                    count += 1;
                                if (count > 1) {
                                    break;
                                }

                            }
                        }
                    }else{
                        for (int i = x1; i >= x2; i--) {
                            for (int j = y1; j <= y2; j++) {
                                int count = 0;
                                if (board[i][j] != null)
                                    count += 1;
                                if (count > 1) {
                                    break;

                    }
                }

            }

        }
    }
}




