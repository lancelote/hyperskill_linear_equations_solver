package stage03.hw41;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Write a method named addValueByIndex.
 * <p>
 * The method should take an array of longs and adds a value to the specified element by its index.
 * <p>
 * Here are description of the parameters:
 * <p>
 * 1. an array of longs;
 * 2. the index of an element (int);
 * 3. a value for adding (long).
 * <p>
 * The method must return nothing.
 */
public class Main {

    public static void addValueByIndex(long[] array, int index, long value) {
        array[index] += value;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToLong(Long::parseLong)
                .toArray();
        int index = scanner.nextInt();
        long value = scanner.nextLong();
        addValueByIndex(array, index, value);
        Arrays.stream(array).forEach(e -> System.out.print(e + " "));
    }
}
