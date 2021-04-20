/*
 * Question 1.8
 */
package chapter01;

public class SetZeros {
    public static void setRowZero(int[][] matrix, int row) {
        for (int i = 0; i < matrix[row].length; i++) {
            matrix[row][i] = 0;
        }
    }
    
    public static void setColumnZero(int[][] matrix, int col) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][col] = 0;
        }
    }
    
    public static void setZeros(int[][] matrix) {
        boolean[] rowZero = new boolean[matrix.length];
        boolean[] colZero = new boolean[matrix[0].length];
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    rowZero[i] = true;
                    colZero[j] = true;
                }
            }
        }
        
        for (int i = 0; i < rowZero.length; i++) {
            if (rowZero[i]) setRowZero(matrix, i);
        }
        
        for (int i = 0; i < colZero.length; i++) {
            if (colZero[i]) setColumnZero(matrix, i);
        }
    }
    
    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%3d", arr[i][j]);
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
            {1, 0, 3, 0, 5},
            {2, 5, 1, 7, 3},
            {2, 5, 1, 7, 3}
        };
        setZeros(matrix);
        printArray(matrix);
    }
}
