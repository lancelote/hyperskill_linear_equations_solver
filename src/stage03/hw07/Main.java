package stage03.hw07;

import java.util.Scanner;

/**
 * Given a program that reads one number and outputs it incremented by one.
 * <p>
 * Now the program cannot compile.
 * <p>
 * Fix all compile-time errors as well as logic-errors.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int nextInt = number + 1;

        System.out.println(nextInt);
    }
}