package is.ru.tictactoe;

import java.net.URLDecoder;
import static spark.Spark.*;

public class TicTacToe{


    public static void main(String[] args) {
        staticFileLocation("/public");
        CreateGame newGame = new CreateGame();
        port(getHerokuPort());

        post(
            "/newgame",(req, res) -> {
                newGame.ResetGame();
                String output = newGame.displayGameBoard() + "<h2>" + newGame.getplayer()+ "\'s turn</h2>";
                return output;
            }
        );
        post("/playersmove", (req, res) -> {
          String inputstring =  req.queryParams("input");
          char input = inputstring.charAt(0);
          if(newGame.getUserInput(input)) {
            String output = newGame.displayGameBoard();
            if(newGame.isWin()){
              output+= "<h2 style=\"color:green;\">" + newGame.getWinner() + " Wins</h2>";
            }
            else if (newGame.draw()) {
              output += "<h2 style=\"color:purple;\">It's a Draw</h2>";
            }
            else {
              output+= "<h2>" + newGame.getplayer()+ "\'s turn</h2>";
            }
            return output;
          }
          if(newGame.isWin()||newGame.draw()) {
            return newGame.displayGameBoard() + "The Game is over!, go read a book";
          }
          return newGame.displayGameBoard() + "<h2 style=\"color:red;\">Illegal Move!</h2><h2>" + newGame.getplayer()+ "\'s turn</h2>";
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
