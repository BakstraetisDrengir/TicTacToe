package is.ru.tictactoe;

public class TicTacToe{
    public static void main(String[] args) {
        
        CreateGame newGame = new CreateGame();
            // This is the array for the game board
            char arr [][] = {{'1', '2', '3'},{ '4', '5', '6'},{ '7', '8', '9'}};  
            
            newGame.displayGameBoard(arr);
   
        }
   
}