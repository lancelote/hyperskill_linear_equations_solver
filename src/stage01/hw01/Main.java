package stage01.hw01;

import java.util.Scanner;

/**
 * Write a program which reads a double value x x x and evaluates the result of x3+x2+x+1  x^3 + x^2 + x + 1
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double result = Math.pow(x, 3) + Math.pow(x, 2) + x + 1;
        System.out.println(result);
    }
}