public class NQueensBruteForce {    
    // Recursive function to solve the problem
    public static void solveNQueens(char[][] board, int col) {
        if (col == board.length) {
            printBoard(board);
            return;
        }
        for (int row = 0; row < board.length; row++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q'; // Place queen
                solveNQueens(board, col + 1); // Recur to place the rest
                board[row][col] = '.'; // Backtrack
            }
        }
    }
    // Check if placing a queen is safe
    public static boolean isSafe(char[][] board, int row, int col) {
        // Check this row on left side
        for (int j = 0; j < col; j++) {
            if (board[row][j] == 'Q') {
                return false;
            }
        }
        // Check upper-left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // Check lower-left diagonal
        for (int i = row, j = col; i < board.length && j >= 0; i++, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
    // Print the board
    public static void printBoard(char[][] board) {
        System.out.println("------ Solution ------");
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 4; // You can change N here
        char[][] board = new char[n][n];
        // Initialize board with '.'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        solveNQueens(board, 0);
    }
}
