package stage03.hw24;

import java.util.Scanner;

/**
 * Write a program that reads an array of integers and finds the minimum value of the array.
 * <p>
 * Input data format
 * <p>
 * The first line contains the size of an array.
 * The second line contains elements of the array separated by spaces.
 * <p>
 * Output data format
 * <p>
 * An integer number representing the minimum in the input array.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(min(numbers));
    }

    private static int min(int[] numbers) {
        int minNumber = numbers[0];
        for (int number : numbers) {
            if (number < minNumber) {
                minNumber = number;
            }
        }
        return minNumber;
    }
}