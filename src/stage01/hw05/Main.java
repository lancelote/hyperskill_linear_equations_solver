package stage01.hw05;

import java.util.Scanner;

/**
 * Write a program that reads the distance between the two cities in miles and the travel time by bus in hours,
 * and outputs the average speed of the bus.
 */
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double distance = scanner.nextDouble();
        double speed = scanner.nextDouble();
        System.out.println(distance / speed);
    }
}