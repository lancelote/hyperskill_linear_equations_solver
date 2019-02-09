package stage03.hw38;

import java.util.Scanner;

/**
 * Given the number n, not exceeding 10, and a matrix of size n × n.
 * <p>
 * Check whether this matrix is symmetric in relation to the main diagonal. Output the word “YES”, if it is symmetric
 * and the word “NO” otherwise.
 */
public class Main {
    public static void main(String[] args) {
        int[][] matrix = readMatrix();
        System.out.println(isSymmetric(matrix) ? "YES" : "NO");
    }

    private static boolean isSymmetric(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    private static int[][] readMatrix() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }
}
