package stage01.hw04;

import java.util.Scanner;

/**
 * Write a program that reads a temperature in Celsius (°C) and shows its equivalent in Fahrenheit temperature (°F).
 * <p>
 * Use the following formula:
 * <p>
 * F = C * 1.8 + 32
 * <p>
 * Where C is a temperature in Celsius, F - is a temperature in Fahrenheit.
 */
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius = scanner.nextDouble();
        double fahrenheit = celsius * 1.8 + 32;
        System.out.println(fahrenheit);
    }
}