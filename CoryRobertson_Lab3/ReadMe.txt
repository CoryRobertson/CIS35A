
Lab 3 Tic Tac Toe Game

    Due Feb 20 by 11:30am Points 10 Available after Feb 3 at 11:30pm

Description

In a game of Tic Tac Toe, two players take turns making an available cell in a 3 x 3 grid with their respective tokens (either X or O). When one player has placed three tokens in a horizontal, vertical, or diagonal row on the grid, the game is over and that  player has won. A stalemate occurs when all the cells on the grid have been filled with tokens and neither player has achieved a win.

Write a program that emulates a Tic Tac Toe game.

When you are done, a typical session will look like this:

 Welcome to tic-tac-toe.
 Enter coordinates for your move following the X and O prompts.
   1 2 3
A   | | 
   -----
B   | | 
   -----
C   | |

X:A2
   1 2 3
A   |X| 
   -----
B   | | 
   -----
C   | |

O:B3
   1 2 3
A   |X| 
   -----
B   | |O
   -----
C   | |

And so on. Illegal moves will prompt the user again for a new move. A win or a stalemate will be announced, mentioning the winning side if any. The program will terminate whenever a single game is complete.

For this lab, you will be provided with a base file to work with. The base file can be downloaded from:

https://github.com/victoryu/CIS35A-Labs (Links to an external site.)

You will add and/or modify the code, as instructed below. Do not change the overall structure of the program. Just fill in with your code at TODO and Step #.

This file has the general framework of the TicTacToe class. An object of this class will represent a tic-tac-toe "board". The board will be represented internally by a two dimensional array of characters (3 x 3), and by a character indicating who's turn it is ('X' or 'O'). These are stored in the class instance variables as follows.

private char[][] board;
private char player; // 'X' or 'O'

You will need to define the following methods:

1. A constructor: 

public TicTacToe()

to create an empty board, with initial value of a space ('  ')

2. play method

public boolean play(String position)

if position represents a valid move (e.g., A1, B3), add the current player's symbol to the board and return true. Otherwise, return false.

3. switchTurn method

public void switchTurn()

switches the current player from X to O, or vice versa.

4. won method

public boolean won()

Returns true if the current player has filled three in a row, column or either diagonal. Otherwise, return false.

5. stalemate method

public boolean stalemate()

Returns true if there are no places left to move;

6. printBoard method

 public void print()

prints the current board

7. Use the following test code in your main method to create a TicTacToe object and print it using the printBoard method given, so as to test your code. Your printBoard method should produce the first board in the example above.

public static void main(String[] args) {

       Scanner in = new Scanner(System.in);
       TicTacToe game = new TicTacToe();
       System.out.println("Welcome to Tic-tac-toe");
       System.out.println("Enter coordinates for your move following the X and O prompts");
       
       while(!game.stalemate()) 
       {
              game.print();
              System.out.print(game.getPlayer() + ":");

              //Loop while the method play does not return true when given their move.
              //Body of loop should ask for a different move
              while(!game.play(in.next()))
              {
                    System.out.println("Illegal move. Enter your move.");
                    System.out.print(game.getPlayer() + ":");
               }
              //If the game is won, call break;
              if(game.won())
                  break;

              //Switch the turn
              game.switchTurn();

        }
        game.print();
        if(game.won())
        {
             System.out.println("Player "+game.getPlayer()+" Wins!!!!");
        } 
        else 
        {
             System.out.println("Stalemate");
        }
}

Test the following cases:

1. A player makes a legal movement;

2. A player makes an illegal movement;

3. Player X wins

4. Player X loses

5. Stalemate (neither player wins)
 Submission

    Create a Java source code file named TicTacToe.java
    Test your program with the above 5 test cases, capture the test output and save it in the file
    Put the files in (1) and (2) in a directory named FirstnameLastname_Lab3
    Submit the folder (3) in G:\vyu\cis35a\dropbox

Grading

Grading will be based on the correctness, cleanness, clarity, and accuracy. Emphasis is placed on meeting the requirements.

9-10 points : All the requirements are met. The program is complete and clean.
8-9 points: Most requirements are met. The program works in general with a few errors.
7-8 points: Some requirements are met. One or more important features are missing. The program works in general with some errors.
6-7 points: The program only partially works.
0-6 points: The program does not work as specified. Syntax errors. Most requirements are not met.