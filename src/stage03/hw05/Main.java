package stage03.hw05;

import java.util.Scanner;

/**
 * Given a program that reads two lines and outputs them in another order.
 * <p>
 * Now the program cannot compile.
 * <p>
 * Fix all compile-time errors as well as logic-errors.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();

        System.out.println(line2);
        System.out.println(line1);
    }
}