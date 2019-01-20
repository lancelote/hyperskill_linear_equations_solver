package stage03.hw11;

import java.util.Scanner;

/**
 * Write a program that read an array of ints and an integer number n.
 * <p>
 * The program must check how many times n occurs in the array.
 * <p>
 * Input data format
 * <p>
 * The first line contains the size of the input array.
 * The second line contains elements of the array separated by spaces.
 * The third line contains n.
 * <p>
 * Output data format
 * <p>
 * The result is only a single non-negative integer number.
 */
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int sample = scanner.nextInt();

        int count = 0;
        for (int num : numbers) {
            if (num == sample) {
                count += 1;
            }
        }

        System.out.println(count);
    }
}