package stage03.hw15;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Write a program that reads an unsorted array of integers and two numbers n and m. The program must check if n and m occur next to each other in the array (in any order).
 * <p>
 * Input data format
 * <p>
 * The first line contains the size of an array.
 * The second line contains elements of the array.
 * The third line contains two integer numbers n and m.
 * All numbers in the same line are separated by the space character.
 * <p>
 * Output data format
 * <p>
 * Only a single value: true or false.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println(nextToEachOtherIn(n, m, numbers));
    }

    private static boolean nextToEachOtherIn(int n, int m, int[] numbers) {
        boolean near = false;
        int[] sample1 = {n, m};
        int[] sample2 = {m, n};
        for (int i = 1; i < numbers.length; i++) {
            int[] subset = Arrays.copyOfRange(numbers, i - 1, i + 1);
            if (Arrays.equals(subset, sample1) || Arrays.equals(subset, sample2)) {
                near = true;
                break;
            }
        }
        return near;
    }
}