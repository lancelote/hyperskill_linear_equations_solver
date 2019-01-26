package stage03.hw28;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Given an odd number n, not exceeding 15. Create a two-dimensional array (matrix) from n×n elements, by filling it
 * with "." symbols (each element of the matrix is a string containing a single symbol). Then fill the middle row of
 * the matrix, the middle column, and the main and the secondary diagonals with the "*" symbols. As a result, all "*"s
 * in the array must form the star figure. Output this matrix; elements of the array should be space separated.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        char[][] matrix = new char[size][size];
        starify(matrix);
        print(matrix);
    }

    private static void starify(char[][] matrix) {
        for (char[] row : matrix) {
            Arrays.fill(row, '.');
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (shouldBeStar(i, j, matrix.length)) {
                    matrix[i][j] = '*';
                }
            }
        }
    }

    private static boolean shouldBeStar(int i, int j, int size) {
        boolean star = false;
        if (i == j) {                     // main diagonal
            star = true;
        } else if (i + j == size - 1) {   // secondary diagonal
            star = true;
        } else if (i == size / 2) {     // middle row
            star = true;
        } else if (j == size / 2) {     // middle column
            star = true;
        }
        return star;
    }

    private static void print(char[][] matrix) {
        for (char[] row : matrix) {
            for (char item : row) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }
}