package stage03.hw26;

import java.util.Scanner;

/**
 * Write a program that reads an array of ints and outputs the number of "triples" in the array.
 * <p>
 * A "triple" is three consecutive ints in increasing order differing by 1 (i.e. 3,4,5 is a triple, but 5,4,3 and 2,4,6
 * are not).
 * <p>
 * Input data format
 * <p>
 * The first line contains the size of an array.
 * The second line contains elements of the array separated by spaces.
 * <p>
 * Output data format
 * <p>
 * Only a single integer value - the number of "triples".
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(countTriples(numbers));
    }

    private static int countTriples(int[] numbers) {
        int triples = 0;
        for (int i = 0; i < numbers.length - 2; i++) {
            if (numbers[i] + 1 == numbers[i + 1] && numbers[i] + 2 == numbers[i + 2]) {
                triples += 1;
            }
        }
        return triples;
    }
}