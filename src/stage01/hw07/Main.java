package stage01.hw07;

import java.util.Scanner;

/**
 * Write a program that reads three double values a, b, c, and then solving the simplest equation:
 * <p>
 * a * x + b = c
 * <p>
 * The program should output the value of x.
 * <p>
 * It's guaranteed, a is not 0.
 */
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        System.out.println((c - b) / a);
    }
}