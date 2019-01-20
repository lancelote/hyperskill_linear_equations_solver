package stage03.hw16;

import java.util.Scanner;

/**
 * Write a program that reads an array of int's and checks the array is sorted ascending (from smallest to largest number).
 * <p>
 * Input data format
 * <p>
 * The first line contains the size of an array.
 * The second line contains elements of the array separated by spaces.
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
        System.out.println(isSorted(numbers));
    }

    private static boolean isSorted(int[] numbers) {
        boolean sorted = true;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i - 1] > numbers[i]) {
                sorted = false;
                break;
            }
        }
        return sorted;
    }
}