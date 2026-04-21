/**
 * TicTacToeApp UC1 - Display Empty Tic-Tac-Toe Board
 *
 * This class demonstrates the initialization and display of a 3x3
 * Tic-Tac-Toe board using a 2D array and nested loops.
 *
 * @author Developer
 * @version 1.0
 */
public class TicTacToe {

    public static void main(String[] args) {
        // 1. Create a 3x3 character array to represent the game board
        char[][] board = new char[3][3];

        // 2. Initialize all cells with the '-' placeholder using nested loops
        for (int i = 0; i < 3; i++) {         
            for (int j = 0; j < 3; j++) {     
                board[i][j] = '-';
            }
        }

        // 3. Print the board clearly to the console
        System.out.println("Welcome to Tic-Tac-Toe!");
        System.out.println("Current Board:");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}