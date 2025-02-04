/*
 * Game.java
 * The program is simulating a game of "Rock Paper Scissors".
*/

import java.util.Scanner;
public class Game
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter first player's object:");
        char player1 = scan.next().charAt(0);
        System.out.println("Enter second player's object:");
        char player2 = scan.next().charAt(0);
        
        switch(player1){
            case 'R':
                if (player2 == 'R')
                    System.out.println("Game ends with a tie.");
                else if (player2 == 'P')
                    System.out.println("Player 2 wins.");
                else if (player2 == 'S')
                    System.out.println("Player 1 wins.");
                break;
            case 'P':
                if (player2 == 'R')
                    System.out.println("Player 1 wins.");
                else if (player2 == 'P')
                    System.out.println("Game ends with a tie.");
                else if (player2 == 'S')
                    System.out.println("Player 2 wins.");
                
                break;
            case 'S':
                if (player2 == 'R')
                    System.out.println("Player 2 wins.");
                else if (player2 == 'P')
                    System.out.println("Player 1 wins.");
                else if (player2 == 'S')
                    System.out.println("Game ends with a tie.");

                break;
            // This section is checking the results of the game.
        }
    } // end of method main
} //end of class Game