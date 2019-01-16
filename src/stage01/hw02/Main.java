package stage01.hw02;

import java.util.Scanner;

/**
 * Write a program that read two double values and prints the difference between the second and the first one.
 */
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        System.out.println(y - x);
    }
}