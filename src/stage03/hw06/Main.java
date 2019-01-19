package stage03.hw06;

import java.util.Scanner;

/**
 * Given a program that reads three numbers and outputs their sum.
 * <p>
 * Now the program cannot compile.
 * <p>
 * Fix all compile-time errors as well as logic-errors.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int sum = a + b + c;

        System.out.println(sum);
    }
}