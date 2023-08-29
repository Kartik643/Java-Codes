package BackTracking;

public class NQueens {


    static boolean isSafe(char board[][], int row, int col) {
        // vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // diagonally left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // diagonally right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }


    static void nQueens(char board[][], int row){

        if(row == board.length){
//            printBoard(board);
            count++;
            return;
        }

        //column loop
        for(int j = 0;j<board.length;j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                nQueens(board,row+1); // function call
                board[row][j] = 'x';    //backtracking step
            }
        }
    }

    static boolean isnQueens(char board[][], int row){

        if(row == board.length){
            printBoard(board);
            count++;
            return true;
        }

        //column loop
        for(int j = 0;j<board.length;j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                if(isnQueens(board,row+1)){
                    return true;
                }
                board[row][j] = 'x';    //backtracking step
            }
        }
        return false;
    }

    static void printBoard(char board[][]){

        System.out.println("---------Chess Board-----------");
        for(int i = 0;i< board.length;i++){
            for(int j = 0;j< board.length;j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int count = 0;

    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];

        //initialize
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                board[i][j] = 'x';
            }
        }
        if(isnQueens(board, 0)){
            System.out.println("solution is possible");
        }else{
            System.out.println("solution is not possible");
        }
//        System.out.println("Total ways to solve n queens = " + count);
    }
}
