package is.ru.tictactoe;
import static spark.Spark.*;

public class TicTacToe{



    public static void main(String[] args) {

        port(getHerokuPort());
        get("/", (req, res) -> {
            return "No route specified. Try /add/1,2";
        });
        get(
            "/add/:input",
            (req, res) -> StartGame()
        );

    }

    public static char[][] StartGame(){
      char gameBoard[][] = new char[][] {{'1', '2', '3'},{ '4', '5', '6'},{ '7', '8', '9'}};
      CreateGame newGame = new CreateGame();

      return newGame.displayGameBoard(gameBoard);
    }





        static int getHerokuPort() {
            ProcessBuilder psb = new ProcessBuilder();
        if (psb.environment().get("PORT") != null) {
            return Integer.parseInt(psb.environment().get("PORT"));
        }
        return 4567;
        }








}
