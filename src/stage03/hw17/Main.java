package stage03.hw17;

import java.util.Scanner;

/**
 * Write a program that reads an array of ints named A and cyclically shift the elements of the array to the right:
 * A[0] goes to the place of A[1], A[1] - to the place of A[2], ..., and the last element goes to the place of A[0]).
 * <p>
 * Input data format
 * <p>
 * The first line of the input contains the number of elements in the array. The second line – the elements of the array.
 * <p>
 * Output data format
 * <p>
 * The single line contains all shifted elements of the array. Elements must be separated by the space character.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = scanner.nextInt();
        }
        int[] shifted = shift(numbers);
        for (int num : shifted) {
            System.out.print(num + " ");
        }
    }

    private static int[] shift(int[] numbers) {
        int[] shifted = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            shifted[(i + 1) % numbers.length] = numbers[i];
        }
        return shifted;
    }
}