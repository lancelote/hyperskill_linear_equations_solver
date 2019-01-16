package stage01.hw03;

import java.util.Scanner;

/**
 * Given the radius ﻿of the circle, you need to find a rounded area of that circle. Use this formula: S=π*R^2
 * Where S - an area of a circle, π - Math.PI constant, R - radius of the circle.
 * Note that you need to output rounded area.
 */
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println(Math.round(area));
    }
}