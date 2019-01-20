package stage03.hw25;

import java.util.Scanner;

/**
 * Write a program that calculates the sum of the elements of an array of ints.
 * <p>
 * Input data format
 * <p>
 * The first line contains the size of an array.
 * The second line contains elements of the array separated by spaces.
 * <p>
 * Output data format
 * <p>
 * The sum of the input array elements.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(sum(numbers));
    }

    private static int sum(int[] numbers) {
        int arraySum = 0;
        for (int number : numbers) {
            arraySum += number;
        }
        return arraySum;
    }
}