//package main.java.is.ru.tictactoe;
package is.ru.tictactoe;

import java.util.Scanner;

public class CreateGame {
    // The array is a member variable, :)
    static char arr[][];
    char userInput;
    char player;
    char winner;
    int counter;

    // Constructor
    public CreateGame() {
        arr = new char[][] { { '1', '2', '3' }, { '4', '5', '6' }, { '7', '8', '9' } };
        player = 'X';
    }

    // This method takes in a character array and
    public void resetGame() {
        arr = new char[][] { { '1', '2', '3' }, { '4', '5', '6' }, { '7', '8', '9' } };
        player = 'X';
        counter = 0;
    }

    // displays the game board
    static String displayGameBoard() {
        String output = "<h1>";
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                output += arr[row][col] + " ";
            }
            output += "<br>";
        }
        return output + "</h1>";
    }

    // This method gets and returns the user input
    public boolean getUserInput(char input) {
        if (checkValidity(input) && validateMove(input) && !isWin()) {
            markChoice(input);
            if (isWin()) {
                winner = player;
            }
            changePlayer();
            counter++;
            draw();
            return true;
        }
        return false;
    }

    // This method checks the validity of the user input
    public static boolean checkValidity(char userInput) {
        if (Character.isDigit(userInput)) {
            String s = Character.toString(userInput);
            int number = Integer.parseInt(s);
            if (number > 0 && number < 10) {
                return true;
            }
        }
        return false;
    }

    // Check square
    public static boolean validateMove(char num) {
        if (num == '1') {
            if (arr[0][0] == 'X' || arr[0][0] == 'O') {
                return false;
            }
        }
        if (num == '2') {
            if (arr[0][1] == 'X' || arr[0][1] == 'O') {
                return false;
            }
        }
        if (num == '3') {
            if (arr[0][2] == 'X' || arr[0][2] == 'O') {
                return false;
            }
        }
        if (num == '4') {
            if (arr[1][0] == 'X' || arr[1][0] == 'O') {
                return false;
            }
        }
        if (num == '5') {
            if (arr[1][1] == 'X' || arr[1][1] == 'O') {
                return false;
            }
        }
        if (num == '6') {
            if (arr[1][2] == 'X' || arr[1][2] == 'O') {
                return false;
            }
        }
        if (num == '7') {
            if (arr[2][0] == 'X' || arr[2][0] == 'O') {
                return false;
            }
        }
        if (num == '8') {
            if (arr[2][1] == 'X' || arr[2][1] == 'O') {
                return false;
            }
        }
        if (num == '9') {
            if (arr[2][2] == 'X' || arr[2][2] == 'O') {
                return false;
            }
        }
        return true;
    }

    // Fill square with players mark
    void markChoice(char input) {
        if (input == '1') {
            arr[0][0] = player;
        }

        else if (input == '2') {
            arr[0][1] = player;
        }

        else if (input == '3') {
            arr[0][2] = player;
        }

        else if (input == '4') {
            arr[1][0] = player;
        }

        else if (input == '5') {
            arr[1][1] = player;
        }

        else if (input == '6') {
            arr[1][2] = player;
        }

        else if (input == '7') {
            arr[2][0] = player;
        }

        else if (input == '8') {
            arr[2][1] = player;
        } else if (input == '9') {
            arr[2][2] = player;
        }

    }

    // Change player between turns
    private void changePlayer() {
        if (player == 'X') {
            player = 'O';
        } else {
            player = 'X';
        }
    }

    //
    public char getplayer() {
        return player;
    }

    // Check for row win
    public boolean rowWin() {
        for (int i = 0; i < 3; i++) {
            if (arr[i][0] == arr[i][1] && arr[i][1] == arr[i][2]) {
                return true;
            }
        }
        return false;
    }

    // Check for column win
    public boolean colWin() {
        for (int i = 0; i < 3; i++) {
            if (arr[0][i] == arr[1][i] && arr[1][i] == arr[2][i]) {
                return true;
            }
        }
        return false;
    }

    // Check for diagonal win
    public boolean diagnonalWin() {
        if (arr[0][0] == arr[1][1] && arr[1][1] == arr[2][2]) {
            return true;
        }
        if ((arr[0][2] == arr[1][1] && arr[1][1] == arr[2][0])) {
            return true;
        }
        return false;
    }

    // Check for draw
    public boolean draw() {

        if (counter == 9) {
            return true;
        }
        return false;
    }

    // Check for winner
    public boolean isWin() {
        if (colWin() || rowWin() || diagnonalWin()) {
            return true;
        } else {
            return false;
        }
    }

    // Get winner
    public char getWinner() {
        return winner;
    }

}
