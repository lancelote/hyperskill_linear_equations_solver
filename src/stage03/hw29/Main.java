package stage03.hw29;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [][] sudoku = new int[n*n][n*n];
        for (int i = 0; i < n*n; i++) {
            for (int j = 0; j < n*n; j++) {
                sudoku[i][j] = scanner.nextInt();
            }
        }
        if (solvable(sudoku, n)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static boolean solvable(int[][] sudoku, int n) {
        int[] expected = new int[sudoku.length];
        for (int i = 0; i < sudoku.length; i++) {
            expected[i] = i + 1;
        }

        // rows
        for (int i = 0; i < sudoku.length; i++) {
            int [] row = new int[sudoku.length];
            for (int j = 0; j < sudoku.length; j++) {
                row[j] = sudoku[i][j];
            }
            Arrays.sort(row);
            if (!Arrays.equals(row, expected)) {
                return false;
            }
        }

        // cols
        for (int j = 0; j < sudoku.length; j++) {
            int[] col = new int[sudoku.length];
            for (int i = 0; i < sudoku.length; i++) {
                col[i] = sudoku[i][j];
            }
            Arrays.sort(col);
            if (!Arrays.equals(col, expected)) {
                return false;
            }
        }

        // squares
        for (int k = 0; k < n; k++) {
            for (int l = 0; l < n; l++) {

                int squareIndex = 0;
                int[] square = new int[sudoku.length];
                for (int i = k * n; i < (k + 1) * n; i++) {
                    for (int j = l * n; j < (l + 1) * n; j++) {
                        square[squareIndex] = sudoku[i][j];
                        squareIndex += 1;
                    }
                }
                Arrays.sort(square);
                if (!Arrays.equals(square, expected)) {
                    return false;
                }
            }
        }
        return true;
    }
}