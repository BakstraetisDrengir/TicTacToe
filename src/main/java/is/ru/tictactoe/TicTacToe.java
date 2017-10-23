package is.ru.tictactoe;
import static spark.Spark.*;

public class TicTacToe{
    
    
    
    public static void main(String[] args) {
        
        //port(getHerokuPort());
        //get("/", (req, res) -> makeGame());
        
        CreateGame newGame = new CreateGame();
		//newGame.displayGameBoard(arr);
        char input = 0;

		int x = newGame.getUserInput(input);
		System.out.println("USER INPUT: " + x);

        }

        




        static int getHerokuPort() {
            ProcessBuilder psb = new ProcessBuilder();
        if (psb.environment().get("PORT") != null) {
            return Integer.parseInt(psb.environment().get("PORT"));
        }
        return 4567;
        }







        
}