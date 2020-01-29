package main.com.aa.ct;

public class GameTicTacToe {

    private boolean gameOver = false;
    private String winner = null;
    private int currentPlayer = 1;
    private int turnsTaken = 0;

    private int[][] fields;

    public GameTicTacToe() {
        fields = new int[2][2];
    }

    public boolean isOver() {
        return gameOver;
    }

    public String getWinner() {
        return winner;
    }

    public int getCurrentPlayer() {
        return currentPlayer;
    }

    public int getTurnsTaken() {
        return turnsTaken;
    }

    public void playTo(int x, int y) {
        if (currentPlayer==1)
            currentPlayer = 2;
        else
            currentPlayer = 1;

        turnsTaken++;
    }

}
