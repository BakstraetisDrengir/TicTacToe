package is.ru.tictactoe;

import static spark.Spark.*;

public class TicTacToe{
    public static void main(String[] args) {
        
        port(getHerokuPort());
        get("/", (req, res) -> makeGame());
        
        }

        static int getHerokuPort() {
            ProcessBuilder psb = new ProcessBuilder();
        if (psb.environment().get("PORT") != null) {
            return Integer.parseInt(psb.environment().get("PORT"));
        }
        return 4567;
        }

        static int makeGame() {
            CreateGame newGame = new CreateGame();
            // This is the array for the game board
            char arr [][] = {{'1', '2', '3'},{ '4', '5', '6'},{ '7', '8', '9'}};  
            
            newGame.displayGameBoard(arr);
            return 1;
        }
}