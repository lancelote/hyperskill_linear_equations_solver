package stage03.hw30;

import java.util.Scanner;

/**
 * Given a two-dimensional array (matrix) and the two numbers: i and j. Swap the columns with indices i and j within
 * the matrix.
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
        int colId1 = scanner.nextInt();
        int colId2 = scanner.nextInt();
        print(swap(matrix, colId1, colId2));
    }

    private static void print(int[][] matrix) {
        for (int[] row : matrix) {
            for (int item : row) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }

    private static int[][] swap(int[][] matrix, int colId1, int colId2) {
        int[][] result = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j == colId1) {
                    result[i][colId2] = matrix[i][j];
                } else if (j == colId2) {
                    result[i][colId1] = matrix[i][j];
                } else {
                    result[i][j] = matrix[i][j];
                }
            }
        }
        return result;
    }
}
