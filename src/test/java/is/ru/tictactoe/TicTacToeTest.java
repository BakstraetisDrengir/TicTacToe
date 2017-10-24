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

    @Test
    public void testIfMoveIsIllegal(){
      CreateGame g = new CreateGame();
      g.markChoice('1');
      assertEquals(false,g.validateMove('1'));
    }
}
