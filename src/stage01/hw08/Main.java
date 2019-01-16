package stage01.hw08;

import java.util.Scanner;

/**
 * Problem
 * <p>
 * Write a program that reads the density of a liquid and the height of a column, and calculates the liquid pressure.
 * We suppose the gravity is 9.8 m/s² (Earth). Do not format the result.
 * <p>
 * Some explanations
 * <p>
 * When a person swims under the water, water pressure is felt acting on the person's eardrums. The deeper that person
 * swims, the greater the pressure. The pressure felt is due to the weight of the water above the person. As someone
 * swims deeper, there is more water above the person and therefore greater pressure. The pressure a liquid exerts
 * depends on its depth.
 * <p>
 * Liquid pressure also depends on the density of the liquid. If someone was submerged in a liquid more dense than
 * water, the pressure would be correspondingly greater. Thus we can say that the depth, density and liquid pressure
 * are directly proportionate. The pressure due to a liquid in liquid columns of constant density or at a depth
 * within a substance is represented by the following formula:
 * <p>
 * p = ρgh
 * <p>
 * where:
 * <p>
 * p is liquid pressure,
 * g is gravity at the surface of overlaying material,
 * ρ is density of liquid,
 * h is height of liquid column.
 */
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double density = scanner.nextDouble();
        double height = scanner.nextDouble();
        double gravity = 9.8;
        double pressure = density * gravity * height;
        System.out.println(pressure);
    }
}