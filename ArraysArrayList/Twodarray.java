public class Twodarray {
    public static void main(String[] args) {
        int array[][] =  { {4,7,8},{8,8,7} };
        int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
        int cout7 = 0;

        int row = 2, column = 3;
        int[][] matrix = { {2, 3, 7}, {5, 6, 7} };

        // Display original matrix
           printMatrix(matrix);
           // Transpose the matrix
             int[][] transpose = new int[column][row];
             for(int i = 0; i<row; i++) {
                  for (int j = 0; j<column; j++) {
                    transpose[j][i] = matrix[i][j];
}
}
                          // print the transposed matrix
                        printMatrix(transpose);


        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[0].length; j++){
                if(array[i][j]==7){
                cout7++;
                }
            }

        }
        System.out.println("count "+ cout7);

        sum(nums);

    }

    public static void sum(int[][] nums){
        int sum = 0;
            for(int j = 0; j<nums[0].length; j++){
                sum+= nums[1][j];
        }
        System.out.println(sum);
    }
    public static void printMatrix(int[][] matrix) {
        System.out.println("The matrix is: ");
        for(int i=0; i<matrix.length; i++) {
        for (int j=0; j<matrix[0].length; j++) {
        System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
        }
        }
        
    
}
