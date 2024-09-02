package org.example.kindle;

public class MatrixNineDegree {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}};
        int n = matrix.length;
        for (int[] ints : matrix) {
            for (int j = 0; j < n; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
        System.out.println("============================");
        rotateMatrix(matrix);
    }

    public static void rotateMatrix(int[][] matrix){
        if(matrix.length <= 1)
            return;
        int n = matrix.length;
        for (int i = 0; i < n/2; i++) {
            for (int j = 0; j < n -i -1; j++) {
                //Swap the element in clock wise direction
                //temp = top left
                int temp = matrix[i][j];
                //Assign bottom left to top left
                matrix[i][j] = matrix[n -1-j][i];
                //Assign bottom right to bottom left
                matrix[n -1-j][i] = matrix[n-1-i][n-1-j];
                //Assign top right to bottom right
                matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
                //Assign top left to top right
                matrix[j][n-1-i] = temp;
            }
        }
        for (int[] ints : matrix) {
            for (int j = 0; j < n; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}
