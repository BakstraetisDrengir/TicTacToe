//package main.java.is.ru.tictactoe;
package is.ru.tictactoe;

public class CreateGame{
        
        

        // This method takes in a character array and
        // displays the game board
        static void displayGameBoard(char arr [][])
	    {
            for (int row = 0; row < 3; row++)
            {
                for (int col = 0; col < 3; col++)
                {
                    System.out.print(arr[row][col] + " ");

                }
                System.out.println();
            }
	    }

}