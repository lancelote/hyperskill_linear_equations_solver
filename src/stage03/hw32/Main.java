package stage03.hw32;

import java.util.Scanner;

/**
 * Given the number n, not greater than 100. Create the matrix of size n×n and fill it by the following rule.
 * Numbers 0 should be stored on the primary diagonal. The two diagonals, adjacent to the primary one, should contain
 * numbers 1. The next two diagonals - numbers 2, etc.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[][] matrix = new int[size][size];
        fill(matrix);
        print(matrix);
    }

    private static void print(int[][] matrix) {
        for (int[] row : matrix) {
            for (int item : row) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }

    private static void fill(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = Math.abs(i - j);
            }
        }
    }
}
