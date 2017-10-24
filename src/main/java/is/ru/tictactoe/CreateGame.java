//package main.java.is.ru.tictactoe;
package is.ru.tictactoe;
import java.util.Scanner;

public class CreateGame{
        // The array is a member variable
    static char arr [][];
    char userInput;
	  char player;

    // Constructor
    CreateGame(){
        arr = new char[][] {{'1', '2', '3'},{ '4', '5', '6'},{ '7', '8', '9'}};
        player = 'X';
    }


        // This method takes in a character array and
        // displays the game board
        static char[][] displayGameBoard(char arr [][])
	    {
            for (int row = 0; row < 3; row++)
            {
                for (int col = 0; col < 3; col++)
                {
                    System.out.print(arr[row][col] + " ");

                }
                System.out.println();
            }
            return arr;
	    }

        public static int getUserInput(char input)
		{
		    System.out.println("Position: ");
		    Scanner s = new Scanner(System.in);
		    String str = s.nextLine();
		    input = str.charAt(0);
		    // The right side of the || is bool (is the move legal)
		    while(!validateInput(input) || !validateMove(input))
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

        public static boolean validateMove (char num)
        {
            if (num == '1')
            {
                if (arr[0][0] == 'X' || arr[0][0] == 'O' )
                {
                    return false;
                }
            }
            if (num == '2')
            {
                if (arr[0][1] == 'X' || arr[0][1] == 'O')
                {
                    return false;
                }
            }
            if (num == '3')
            {
                if (arr[0][2] == 'X' || arr[0][2] == 'O')
                {
                    return false;
                }
            }
            if (num == '4')
            {
                if (arr[1][0] == 'X' || arr[1][0] == 'O')
                {
                    return false;
                }
            }
            if (num == '5')
            {
                if (arr[1][1] == 'X' || arr[1][1] == 'O')
                {
                    return false;
                }
            }
            if (num == '6')
            {
                if (arr[1][2] == 'X' || arr[1][2] == 'O')
                {
                    return false;
                }
            }
            if (num == '7')
            {
                if (arr[2][0] == 'X' || arr[2][0] == 'O')
                {
                    return false;
                }
            }
            if (num == '8')
            {
                if (arr[2][1] == 'X' || arr[2][1] == 'O')
                {
                    return false;
                }
            }
            if (num == '9')
            {
                if (arr[2][2] == 'X' || arr[2][2] == 'O')
                {
                    return false;
                }
            }
            return true;
        }

        void markChoice(char input)
        {
          if (input == '1')
          {
              arr[0][0] = player;
          }

          else if (input == '2')
          {
              arr[0][1] = player;
          }

          else if (input == '3')
          {
              arr[0][2] = player;
          }

          else if (input == '4')
          {
              arr[1][0] = player;
          }

          else if (input == '5')
          {
              arr[1][1] = player;
          }

          else if (input == '6')
          {
              arr[1][2] = player;
          }

          else if (input == '7')
          {
              arr[2][0] = player;
          }

          else if (input == '8')
          {
              arr[2][1] = player;
          }
          else if (input == '9')
          {
              arr[2][2] = player;
          }

      }

      void changePlayer()
    	{
    	    if (player == 'X')
    	    {
    	        player = 'O';
    	    }
    	    else
    	    {
    	        player = 'X';
    	    }
    	}
}
