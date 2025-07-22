package Backtracking;
public class Sudoku {
    public static void main(String[] args) {
        int sudoku[][] = {{0, 0, 0, 0, 0, 0, 0, 5, 0,},
        {2, 0 ,7, 0, 0, 9, 0 ,0 ,0},
        {6,0 ,0 ,3, 5, 1, 0, 0 ,0},
        {5, 0 ,0, 0, 0, 0, 0, 1 ,0},
        {0, 0 ,3, 0, 0, 0, 0, 0 ,8},
        {0, 0 ,0, 8, 2, 0, 5, 3, 0},
        {0, 0 ,0, 0, 7, 0, 8, 0, 4},
        {0, 0 ,6 ,2 ,0, 0, 0, 0, 0},
        {0 ,8, 0, 0, 0, 0, 7, 0, 0}};

        if (sudokusolver(sudoku, 0 ,0)) {
            System.out.println("solution exists");
            printsudoku(sudoku);
        } else {
            System.out.println("solution not exists");

        }
    }
    public static boolean sudokusolver(int sudoku[][], int row, int col){
        //base 
        if (row ==9) {
            return true;  
        }
        int nxtrow = row, nxtcol = col+1;
        if (col+1 ==9) {
            nxtrow = row+1;
            nxtcol = 0;
        }
        if (sudoku[row][col]!=0) {
            return sudokusolver(sudoku, nxtrow, nxtcol);
            
        }

        for(int digit = 1; digit<=9; digit++){
            if (isSafe(sudoku,row, col,digit)) {
                sudoku[row][col]= digit;
                if (sudokusolver(sudoku, nxtrow, nxtcol)) {
                    return true;
                }
                sudoku[row][col]=0;
            }
        }
        return false;


    }

    public static boolean isSafe(int sudoku[][], int row, int col, int digit){
        //colmn
        for(int i=0; i<=8; i++){
            if (sudoku[i][col]==digit) {
                return false;
            }
        }

        //row
        for(int j=0; j<=8; j++){
            if (sudoku[row][j]==digit) {
                return false;
            }
        }

        //grid
        int sr = (row/3)*3;
        int sc = (col/3)*3;
        for(int i=sr; i<sr+3; i++){
            for(int j=sc; j<sc+3; j++){
                if (sudoku[i][j]==digit) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void printsudoku(int sudoku[][]){
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                System.out.print(sudoku[i][j] +" ");
            }
            System.out.println();
        }
    }
    
}
