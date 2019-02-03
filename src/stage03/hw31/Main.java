package stage03.hw31;

import java.util.Scanner;

/**
 * The cinema has n rows, each consisting of m seats (n and m do not exceed 20). The two-dimensional matrix stores the
 * information on the sold tickets, number 1 means that the ticket for this place is already sold, the number 0 means
 * that the place is available. You want to buy k tickets to the neighbouring seats in the same row. Find whether it
 * can be done.
 * <p>
 * Input data format
 * <p>
 * On the input, the program gets the numbers n and m. Next go n lines, each containing m numbers (0 or 1), separated
 * by spaces. Next goes the number k.
 * <p>
 * Output data format
 * <p>
 * The program should output the row number in which there are k consecutive available seats. If there are several
 * such rows, output the number of the smallest such row. If there is no such row, output the number 0.
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

        int seats = scanner.nextInt();
        System.out.println(findConsecutive(matrix, seats));
    }

    private static int findConsecutive(int[][] matrix, int seats) {
        int consequence = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    consequence += 1;
                } else {
                    consequence = 0;
                }
                if (consequence == seats) {
                    return i + 1;
                }
            }
            consequence = 0;
        }
        return 0;
    }
}
