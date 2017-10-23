//package main.java.is.ru.tictactoe;
package is.ru.tictactoe;
import java.util.Scanner;

public class CreateGame{
        // The array is a member variable
    static char arr [][];

    // Constructor
    CreateGame(){
        arr = new char[][] {{'1', '2', '3'},{ '4', '5', '6'},{ '7', '8', '9'}};
    }
        

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

        public static int getUserInput(char input)
		{
		    System.out.println("Position: ");
		    Scanner s = new Scanner(System.in);
		    String str = s.nextLine();
		    input = str.charAt(0);
		    // The right side of the || is bool (is the move legal)
		    while(!validateInput(input) || !/*isLegalMove(input)*/ false)
		    {
		        System.out.println("Illegal move!, Try again");
		        getUserInput(input);
		    }
		    return input - 48;
		}

        public static boolean validateInput(char input)
		{
		    int inputIntValue = Character.getNumericValue(input);
		    if (inputIntValue < 1 || inputIntValue > 9)
		    {
		        return false;
		    }
		    return true;
		}



}