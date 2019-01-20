package stage03.hw21;

import java.util.Scanner;

/**
 * Write a program that reads an array of ints and an integer number n. The program must sum all the array elements
 * greater than n.
 * <p>
 * Input data format
 * <p>
 * The first line contains the size of an array.
 * The second line contains elements of the array separated by spaces.
 * The third line contains the number n.
 * <p>
 * Output data format
 * <p>
 * Only a single number representing the sum.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = scanner.nextInt();
        }
        int limit = scanner.nextInt();
        System.out.println(sumGreaterThan(numbers, limit));
    }

    private static int sumGreaterThan(int[] numbers, int limit) {
        int sum = 0;
        for (int number : numbers) {
            if (number > limit) {
                sum += number;
            }
        }
        return sum;
    }
}