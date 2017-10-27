package is.ru.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TicTacToeTest{
    @Test
    public void testInputWithinRange(){
        assertEquals(true,CreateGame.checkValidity('3'));
    }
    @Test
    public void testInputOutOfRange(){
        assertEquals(false,CreateGame.checkValidity('0'));
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

    @Test
    public void TestForWinInRow(){
      CreateGame g = new CreateGame();
      g.getUserInput('1');
      g.getUserInput('4');
      g.getUserInput('2');
      g.getUserInput('5');
      g.getUserInput('3');
      assertEquals(true, g.rowWin());
    }











    @Test
    public void TestGetPlayer(){
      CreateGame g = new CreateGame();
      assertEquals('X', g.getplayer());
    }
}
