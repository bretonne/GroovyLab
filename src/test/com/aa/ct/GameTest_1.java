package test.com.aa.ct;

import static org.junit.Assert.*;

import main.com.aa.ct.Game;
import org.junit.Test;

public class GameTest_1 {

    @Test
    public void gameShouldNotBeOverAfterNewGame() {
        Game game = new Game();
        assertFalse(game.isOver());
    }

    @Test
    public void gameShouldHaveNoWinnerAfterNewGame() {
        Game game = new Game();
        assertNull(game.getWinner());
    }

    @Test
    public void gameCurrentPlayerShouldBe1stAfterNewGame() {
        Game game = new Game();
        assertEquals(1, game.getCurrentPlayer());
    }
}
