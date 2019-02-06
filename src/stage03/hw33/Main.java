package stage03.hw33;

import java.util.Scanner;

/**
 * Find the indexes of the initial appearance of the maximum element in a matrix.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        printBiggestIndex(matrix);
    }

    private static void printBiggestIndex(int[][] matrix) {
        int biggest = matrix[0][0];
        int biggestI = 0;
        int biggestJ = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > biggest) {
                    biggest = matrix[i][j];
                    biggestI = i;
                    biggestJ = j;
                }
            }
        }
        System.out.println(biggestI + " " + biggestJ);
    }
}
