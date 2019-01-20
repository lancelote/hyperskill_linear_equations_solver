package stage03.hw08;

import java.util.Scanner;

/**
 * Given a program that reads two integer numbers and performs integer division. The program outputs the result to the
 * standard output.
 * <p>
 * As it is, the program may throw an ArithmeticException if the divisor is zero. Fix it to avoid the exception.
 * <p>
 * In the case when the exception can happen, the fixed program should output: "Division by zero!".
 */
class FixingArithmeticException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (b == 0) {
            System.out.println("Division by zero!");
        } else {
            System.out.println(a / b);
        }
    }
}