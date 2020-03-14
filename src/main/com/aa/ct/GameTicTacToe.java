package main.com.aa.ct;

public class GameTicTacToe {

    public static final String FIRST_PLAYER = "X";
    public static final String SECOND_PLAYER = "O";

    private boolean gameOver = false;
    private String winner = null;
    private int currentPlayer = 1;
    private int turnsTaken = 0;

    private String[][] cells;

    private String error;

    public GameTicTacToe() {
        cells = new String[3][3];
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

    public String getError() {
        return error;
    }

    public void playTo(int x, int y)  {
        if (cells[x][y]==null) {
            cells[x][y] = (currentPlayer == 1) ? FIRST_PLAYER : SECOND_PLAYER;

            turnsTaken++;

            checkGameOver();
            if (!isOver()) {
                if (currentPlayer == 1)
                    currentPlayer = 2;
                else
                    currentPlayer = 1;
            }
        }
        else {
            error = "Cannot duplicate cells when play";
        }
    }

    public void checkGameOver() {
        for (int i=0; i<3; i++) {
            String[] row = cells[0];
            if (row[0]==null || row[1]==null || row[2]==null)
                continue;
            if (row[0].equals(row[1]) && row[1].equals(row[2]))
            {
                gameOver = true;
                winner = row[0];
            }
        }

        for (int j=0; j<3; j++) {
            if (cells[0][j]==null || cells[1][j]==null || cells[2][j]==null)
                continue;
            if (cells[0][j].equals(cells[1][j]) && cells[1][j].equals(cells[2][j]))
            {
                gameOver = true;
                winner = cells[0][j];
            }
        }
    }

}
