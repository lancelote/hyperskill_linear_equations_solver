package stage03.hw39;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Write a method named getFirstAndLast. The method should take an array of ints and return a new array of ints.
 * The returned array must contain two elements - the first and the last elements of the input array.
 */
public class Main {

    public static int[] getFirstAndLast(int[] array) {
        return new int[]{array[0], array[array.length - 1]};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] result = getFirstAndLast(array);
        Arrays.stream(result).forEach(e -> System.out.print(e + " "));
    }
}
