package is.ru.tictactoe;
import static spark.Spark.*;

public class TicTacToe{



    public static void main(String[] args) {

        port(getHerokuPort());
        get("/", (req, res) -> {
            char arr[][] = new char[][] {{'1', '2', '3'},{ '4', '5', '6'},{ '7', '8', '9'}};
            for (int row = 0; row < 3; row++)
            {
                for (int col = 0; col < 3; col++)
                {
                    System.out.print(arr[row][col] + " ");

                }
                System.out.println();
            }
            return StartGame();
        });
    }

    public static char[][] StartGame(){
      char gameBoard[][] = new char[][] {{'1', '2', '3'},{ '4', '5', '6'},{ '7', '8', '9'}};
      CreateGame newGame = new CreateGame();

      return gameBoard;
    }

    static int getHerokuPort() {
        ProcessBuilder psb = new ProcessBuilder();
        if (psb.environment().get("PORT") != null) {
            return Integer.parseInt(psb.environment().get("PORT"));
        }
        return 4567;
    }
}
