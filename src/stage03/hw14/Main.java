package stage03.hw14;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Write a program that reads an array of strings and checks the array is in alphabetical order.
 * <p>
 * There are several rules to do it:
 * 1) You can compare chars with < to see if one comes before the other one (i.e. by comparing ASCII values).
 * 2) Shorter strings come before longer strings whenever the shorter string is a subset of the longer one. So, "a"
 * comes before "abc".
 * <p>
 * 3) Finally, strings which are identical are in alphabetical order.
 * <p>
 * Input data format
 * <p>
 * The single input line contains strings separated by spaces.
 * <p>
 * Output data format
 * <p>
 * Only a single value - true or false.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] strings = line.split(" ");
        System.out.println(isOrdered(strings));
    }

    private static boolean isOrdered(String[] strings) {
        String[] original = strings.clone();
        Arrays.sort(strings);
        return Arrays.equals(original, strings);
    }
}