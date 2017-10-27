# Desing report

## About the assignment 

The object of the assignmnet is to learn to set up technical infrastructure to support agile development. 

To achive this we used feature branch workflow on GitHub, test driven development and continuous integration/delivery while making a Tic Tac Toe application.

## Coding rules

We tried to keep all code as simple as possible(KISS) and tried not to repeat ourselfs(DRY).

* Class names are written in Pascal casing, functions and tests in Camel casing.
* The code should be loosely coupled.
* Comments are written in english and placed above functions
* All tests,functions and variables should have descriptive names.
* All code should be properly indented.
* We strived for consistency

## Design 

We decided to implement a simple version of Tic Tac Toe. 

| 1  | 2 | 3 |
|---|---|---|
| 4 | 5 | 6 |
| 7 | 8 | 9 |

Each player takes turn entering a number and the corresponding square is marked with either a X or an O token.

The 3X3 board is stored in a dimensional array. The players take turns entering a number between 1 and 9 and a function will update the array with corresponding changes.
Once a player has won the he will recive a message to that effect.

 ## Classes 

### TicTacToe.java
Creates an instance of the game and sets up connections with Heroku to create a playable application.

### CreateGame.java
A constructor initalizes the game array and sets the player to X. This class handles all business logic for the game.

### TicTacToeTest.java
All unit tests used in our test driven development.

### Graphical User Interface
To achive a running web application we have three documents:
* index.html (markup language)
* script.js (javascript script language)
* style.css (cascading style sheet)

 ## Class diagram

 ![alt text](https://github.com/BakstraetisDrengir/TicTacToe/tree/master/docs/img/cd.png "class_diagram") 