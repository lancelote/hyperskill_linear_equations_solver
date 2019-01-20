package stage03.hw13;

import java.util.Scanner;

/**
 * Write a program that read an array of ints and finds the index of the first maximum in an array.
 * <p>
 * Input data format
 * <p>
 * The first line contains the number of elements in the array.
 * The second line contains the array elements separated by spaces.
 * An array always has at least one element.
 * <p>
 * Output data format
 * <p>
 * Only a single integer value - the index of the first maximum.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(getMaxIndex(numbers));
    }

    private static int getMaxIndex(int[] numbers) {
        int maxNum = numbers[0];
        int maxIndex = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxNum) {
                maxNum = numbers[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}