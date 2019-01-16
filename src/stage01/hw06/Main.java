package stage01.hw06;

import java.util.Scanner;

/**
 * Write a program that reads four double values a, b, c, d and then evaluates the following expression
 * <p>
 * a * 10.5 + b * 4.4 + (c + d) / 2.2
 * <p>
 * The program should output the result.
 */
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();

        System.out.println(a * 10.5 + b * 4.4 + (c + d) / 2.2);
    }
}