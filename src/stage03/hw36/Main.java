package stage03.hw36;

import java.util.Scanner;

/**
 * Output the matrix of size n×n, filled by the integers from 1 to n^2 in a spiral, coming from the top left corner
 * and twisted clockwise, as shown in the example (here n=5n=5n=5).
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];


        int count = 1;
        int shift = 0;

        while (count < n * n + 1) {
            // Top side
            for (int j = shift; j < n - shift - 1; j++) {
                matrix[shift][j] = count;
                count += 1;
            }

            // Right side
            for (int i = shift; i < n - shift - 1; i++) {
                matrix[i][n - shift - 1] = count;
                count += 1;
            }

            // Bottom side
            for (int j = n - shift - 1; j >= shift; j--) {
                matrix[n - shift - 1][j] = count;
                count += 1;
            }

            // Left side
            for (int i = n - shift - 2; i > shift; i--) {
                matrix[i][shift] = count;
                count += 1;
            }

            shift += 1;
        }

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
}
