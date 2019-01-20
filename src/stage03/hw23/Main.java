package stage03.hw23;

import java.util.Scanner;

/**
 * Write a program that reads an array of ints and outputs the maximum pairwise product in the given array of
 * non-negative numbers.
 * <p>
 * If the array has only one element then output the element.
 * <p>
 * Input data format
 * <p>
 * The first line of the input contains the number of elements in the array.
 * The second line contains the elements of the array separated by spaces.
 * <p>
 * The array always has at least one element.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(maxPairWise(numbers));
    }

    private static int maxPairWise(int[] numbers) {
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] * numbers[j] > max) {
                    max = numbers[i] * numbers[j];
                }
            }
        }
        return max;
    }
}