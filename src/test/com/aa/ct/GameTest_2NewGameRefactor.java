package test.com.aa.ct;

import main.com.aa.ct.Game;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest_2NewGameRefactor {

    Game game;

    @Before
    public void setup() {
        game = new Game();
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
    public void gameShouldNotBeOverAfterPlayOneTurn() {
        game.playTo(1,1);
        assertFalse(game.isOver());
    }

    @Test
    public void gameShouldHaveNoWinnerAfterPlayOneTurn() {
        game.playTo(1, 1);
        assertNull(game.getWinner());
    }

    @Test
    public void gameCurrentPlayerShouldBe2ndAfterPlayOneTurn() {
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
}
