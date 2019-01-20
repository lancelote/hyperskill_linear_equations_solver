package stage03.hw09;

import java.util.Scanner;

/**
 * Given a program that reads a string and a number N and outputs the Nth element of a string.
 * As it is, the program may throw StringIndexOutOfBoundsException. Fix it to avoid the exception. Do not forget about
 * negative numbers!
 * <p>
 * In the case when the exception can happen, the corrected program should output: "Out of bounds!".
 */
class FixingStringIndexOutOfBoundsException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        int index = scanner.nextInt();

        if (index < 0 || index >= string.length()) {
            System.out.println("Out of bounds!");
        } else {
            System.out.println(string.charAt(index));
        }
    }
}