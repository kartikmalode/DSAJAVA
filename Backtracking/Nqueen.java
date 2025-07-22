package Backtracking;
public class Nqueen {
    public static void main(String[] args) {
        int n = 4;
        char board[][]= new char[n][n];
        //initialize
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
               board[i][j] = 'x';
            }
        }
       if (nqeen(board, 0)) {
        System.out.println("solution is possible");
        printboard(board);
        
       } else{
        System.out.println("solution not possible");
       }
      //  System.out.println("total ways "+count);
      int x=3, m=3;

      System.out.println(gridways(0, 0, x, m));
    }

    public static boolean isSafe(char board[][], int row, int col){
        //verticalup
        for(int i=row-1; i>=0; i--){
            if (board[i][col]=='Q') {
                return false;
                
            }
        }
        //leftdiagonal
        for(int i= row-1, j=col-1; i>=0 && j>=0; i--,j--){
            if (board[i][j]=='Q') {
                return false;
                
            }
        }
        //rightdiagonal
        for(int i = row-1, j=col+1; i>=0 && j<board.length; i--,j++){
            if (board[i][j]=='Q') {
                return false;
                
            }
        }
        return true;
    }
    static int count = 0;

    public static boolean nqeen(char board[][], int row){
        //base
        if (row==board.length) {
           // printboard(board);
           count++;
            return true;
            
        }

        //column

        for(int j=0; j<board.length; j++){
            if(isSafe(board,row,j)) {
            board[row][j] = 'Q';
            if(nqeen(board, row+1)){
                return true;
            }
            board[row][j] = 'x';// backtraking

      
        }
    }
    return false;
}
    public static void printboard(char board[][]){
        System.out.println("-------chess board-----");

        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j]+ " ");
            }
            System.out.println();
        }
    } 


    // grid ways 
    public static int gridways(int i, int j , int x, int m){
        if (i == x-1 && j==m-1) {
            return 1;
        } else if(i==x || j==m) {
            return 0;
            
        }
        int w1 = gridways(i+1, j, x, m);
        int w2 = gridways(i, j+1, x, m);
        return w1 + w2;
        

    }

    
}
