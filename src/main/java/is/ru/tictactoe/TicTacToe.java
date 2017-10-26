package is.ru.tictactoe;
import static spark.Spark.*;

public class TicTacToe{


    public static void main(String[] args) {
        staticFileLocation("/public"); 
        CreateGame newGame = new CreateGame();
        port(getHerokuPort());
        
        post(
            "/",(req, res) -> {
                String number = req.queryParams("userChoice");
                return number + 5;
            }
        );
        
        
        
        get("/", (req, res) -> {
            newGame.ResetGame();
            return newGame.displayGameBoard();
        });
        get("/playersMove/:input", (req, res) -> {
          String inputstring = req.params(":input");
          char input = inputstring.charAt(0);
          if(newGame.getUserInput(input)) {
            return newGame.displayGameBoard();
          }
          return "Error n stuff";
        });
    }

    static int getHerokuPort() {
        ProcessBuilder psb = new ProcessBuilder();
        if (psb.environment().get("PORT") != null) {
            return Integer.parseInt(psb.environment().get("PORT"));
        }
        return 4567;
    }
}
