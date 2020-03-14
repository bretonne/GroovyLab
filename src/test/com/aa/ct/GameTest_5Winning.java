package test.com.aa.ct;

import main.com.aa.ct.GameTicTacToe;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest_5Winning {

    GameTicTacToe game;

    @Before
    public void setup() {
        game = new GameTicTacToe();
    }

    public void takeTurns(int[][] turns)  {
        for (int[] turn : turns) {
            game.playTo(turn[0], turn[1]);
        }
    }

    @Test
    public void gameShouldNotBeOverAfterNewGame() {
        assertFalse(game.isOver());
    }

    @Test
    public void gameShouldHaveNoWinnerAfterNewGame() {
        assertNull(game.getWinner());
    }

    @Test
    public void gameCurrentPlayerShouldBe1stAfterNewGame() {
        assertEquals(1, game.getCurrentPlayer());
    }

    @Test
    public void gameShouldHave0TurnPlayedAfterNewGame() {
        assertEquals(0, game.getTurnsTaken());
    }

    @Test
    public void gameShouldNotBeOverAfterPlayOneTurn()  {
        game.playTo(1, 1);

        assertFalse(game.isOver());
    }

    @Test
    public void gameShouldHaveNoWinnerAfterPlayOneTurn() {
        game.playTo(1, 1);
        assertNull(game.getWinner());
    }

    @Test
    public void gameCurrentPlayerShouldBe2ndAfterPlayOneTurn()  {
        game.playTo(1, 1);
        assertEquals(2, game.getCurrentPlayer());
    }

    @Test
    public void gameShouldHave1TurnPlayedAfterPlayOneTurn() {
        game.playTo(1, 1);
        assertEquals(1, game.getTurnsTaken());
    }

    @Test
    public void gameShouldNotBeOverAfterAnotherTurnPlayed() {
        game.playTo(1, 1);
        game.playTo(1, 2);

        assertFalse(game.isOver());
    }

    @Test
    public void gameShouldHaveNoWinnerAfterAnotherTurnPlayed() {
        game.playTo(1, 1);
        game.playTo(1, 2);

        assertNull(game.getWinner());
    }

    @Test
    public void gameShouldCurrentPlayer1stPlayer_AfterAnotherTurnPlayed() {
        game.playTo(1, 1);
        game.playTo(1, 2);

        assertEquals(1, game.getCurrentPlayer());
    }

    @Test
    public void gameShould2TurnsPlayed_AfterAnotherTurnPlayed() {
        game.playTo(1, 1);
        game.playTo(1, 2);

        assertEquals(2, game.getTurnsTaken());
    }

    @Test
    public void gameShouldNotBeOver_WhenDuplicateSenarioIsPlayed() {
        setUpDuplicateScenario();

        assertFalse(game.isOver());
    }

    @Test
    public void gameShouldHaveNoWinner_WhenDuplicateSenarioIsPlayed() {
        setUpDuplicateScenario();

        assertNull(game.getWinner());
    }

    @Test
    public void gameShouldHaveCurrentPlayer1stPlayer_WhenDuplicateScenarioIsPlayed() {
        setUpDuplicateScenario();

        assertEquals(1, game.getCurrentPlayer());
    }

    @Test
    public void gameShouldHave2turnsPlayed_WhenDuplicateScenarioIsPlayed() {
        setUpDuplicateScenario();

        assertEquals(2, game.getTurnsTaken());
    }

    @Test
    public void gameShouldGetError_WhenDuplicateScenarioIsPlayed() {
        setUpDuplicateScenario();

        assertEquals("Cannot duplicate cells when play", game.getError());
    }


    @Test
    public void gameShouldBeOverWhenWinningScenarioPlayed() {
        setupWinningScenario();

        assertTrue(game.isOver());
    }

    @Test
    public void winnerShouldBe1stPlayerWhenWinningScenarioPlayed() {
        setupWinningScenario();

        assertEquals(GameTicTacToe.FIRST_PLAYER, game.getWinner());
    }

    @Test
    public void currentPlayerShouldBe1stPlayerWhenWinningScenarioPlayed() {
        setupWinningScenario();

        assertEquals(1, game.getCurrentPlayer());
    }

    @Test
    public void gameShouldHavePlayed5Turns_WhenWinningScenarioPlayed() {
        setupWinningScenario();

        assertEquals(5, game.getTurnsTaken());
    }


    private void setupWinningScenario() {
        int[][] turns = {{0,0}, {1,1}, {0,1}, {1, 0}, {0, 2}};
        takeTurns(turns);
    }

    private void setUpDuplicateScenario() {
        int[][] turns = {{2,2}, {1,1}, {2,2}};
        takeTurns(turns);
    }

}
