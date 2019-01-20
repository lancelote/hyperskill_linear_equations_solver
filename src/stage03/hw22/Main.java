package stage03.hw22;

import java.util.Scanner;

/**
 * Write a program that reads an array of ints and outputs the length of the longest sequence in ascending order.
 * Elements of the sequence must go one after another.
 * <p>
 * Input data format
 * <p>
 * The first line contains the size of an array.
 * The second line contains elements of the array separated by spaces.
 * <p>
 * Example
 * <p>
 * The input array is 1 2 4 1 2 3 5 7 4 3. In this case, the length of the longest sequence in ascending order is 5.
 * It includes the following elements: 1 2 3 5 7.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(longestAscending(numbers));
    }

    private static int longestAscending(int[] numbers) {
        int length = 1;
        int current = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > current) {
                length += 1;
                current = numbers[i];
            }
        }
        return length;
    }
}