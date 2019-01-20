package stage03.hw18;

import java.util.Scanner;

/**
 * Write a program that reads an array of integers and an integer number n.
 * The program must check that array contain n.
 * <p>
 * Input data format
 * <p>
 * The first line contains the size of an array.
 * The second line contains elements of the array separated by the space.
 * The third line contains one integer number n.
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
        System.out.println(contains(numbers, n));
    }

    private static boolean contains(int[] numbers, int n) {
        boolean found = false;
        for (int number : numbers) {
            if (number == n) {
                found = true;
                break;
            }
        }
        return found;
    }
}