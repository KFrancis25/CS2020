import java.util.Scanner;

public class NoughtsAndCrosses {
    private static String player;

    public static void main(String[] args) {
        // Game variables
        String[][] board = new String[3][3];
        String player = "X", computer = "O";
        Scanner scanner = new Scanner(System.in);
        boolean firstMove = true;

        // Main game loop
        while (true) {
            printBoard(board);
            System.out.println("Enter the row and column for your move (0-2)");
            String move = scanner.nextLine();

            if (moveUserMove(board, move, player, firstMove)) {
                firstMove = false;
                if (checkWin(board, player)) {
                    System.out.println("You win!");
                    break;
                } else if (checkWin(board, computer)) {
                    System.out.println("You lose!");
                    break;
                } else if (isFull(board)) {
                    System.out.println("It's a tie!");
                    break;
                }
            }

            String computerMove = makeComputerMove(board, computer);
            board[computerMove.charAt(0) - '0'][computerMove.charAt(1) - '0'] = computer;
            firstMove = false;

            if (checkWin(board, computer)) {
                System.out.println("You lose!");
                break;
            } else if (checkWin(board, player)) {
                System.out.println("You win!");
                break;
            } else if (isFull(board)) {
                System.out.println("It's a tie!");
                break;
            }
        }
    }

    private static boolean moveUserMove(String[][] board, String move, String player, boolean firstMove) {
        if (move.length() != 2 || !Character.isDigit(move.charAt(0)) || !Character.isDigit(move.charAt(1))) {
            System.out.println("Invalid input. Please enter a number between 0 and 2.");
            return false;
        }

        int row = move.charAt(0) - '0';
        int col = move.charAt(1) - '0';

        if (board[row][col] != null) {
            System.out.println("Invalid move. Square is already occupied.");
            return false;
        }

        board[row][col] = player;
        return true;
    }

    private static String makeComputerMove(String[][] board, String computer) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == null) {
                    board[i][j] = computer;
                    if (checkWin(board, computer)) {
                        return "" + i + j;
                    }
                    board[i][j] = null;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == null) {
                    board[i][j] = player;
                    if (checkWin(board, player)) {
                        return "" + i + j;
                    }
                    board[i][j] = null;
                }
            }
        }

        // Choose a random square
        return "" + (int) (Math.random() * 3) + (int) (Math.random() * 3);
    }

    private static boolean checkWin(String[][] board, String player) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                return true;
            }
        }
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }
        return false;
    }

    private static boolean isFull(String[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == null) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void printBoard(String[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] == null ? " " : board[i][j]);
                if (j < 2) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("---------");
            }
        }
    }
}