package is.ru.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TicTacToeTest{
    @Test
    public void testInputWithinRange(){
        assertEquals(true,CreateGame.validateInput('3'));
    }
    @Test
    public void testInputOutOfRange(){
        assertEquals(false,CreateGame.validateInput('0'));
    }

    @Test
    public void testIfMoveIsLegal(){
        CreateGame g = new CreateGame();
        assertEquals(true,g.validateMove('1'));
    }

}