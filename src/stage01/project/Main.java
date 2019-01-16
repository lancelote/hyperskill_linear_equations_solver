package stage01.project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        LinearEquation equation = new LinearEquation(a, b);
        System.out.println(equation.solve());
    }
}


class LinearEquation {
    private double a;
    private double b;

    LinearEquation(double a, double b) {
        this.a = a;
        this.b = b;
    }

    double solve() {
        return this.b / this.a;
    }
}