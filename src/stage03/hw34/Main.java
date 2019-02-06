package stage03.hw34;

import java.util.Scanner;

/**
 * In some design style, a 4x4 matrix pattern is considered looking pretty if it doesn't consist of a 2x2 matrix of
 * the same color. Your task is to write the program that outputs "YES" if the 4x4 matrix is looking pretty, otherwise
 * output "NO".
 * <p>
 * Input contains 4 lines, each line contains 4 symbols, different symbols represent different colors: W stands for
 * white color, B - black, R - red, G - green, Y - yellow.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 4;
        char[][] pattern = new char[size][size];
        for (int i = 0; i < size; i++) {
            String row = scanner.next();
            for (int j = 0; j < size; j++) {
                pattern[i][j] = row.charAt(j);
            }
        }
        boolean pretty = isPretty(pattern);
        System.out.println(pretty ? "YES" : "NO");
    }

    private static boolean isPretty(char[][] pattern) {
        for (int i = 0; i < pattern.length - 1; i++) {
            for (int j = 0; j < pattern[i].length - 1; j++) {
                char current = pattern[i][j];
                if (current == pattern[i][j + 1] && current == pattern[i + 1][j] && current == pattern[i + 1][j + 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}
