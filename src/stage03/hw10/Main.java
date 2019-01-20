package stage03.hw10;

import java.util.Locale;
import java.util.Scanner;

/**
 * Given a program that may throw NullPointerException. Fix it to avoid the exception.
 * <p>
 * In the case when the exception can happen, the corrected program should output: "NullPointerException!".
 */
class FixingNullPointerException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        string = "null".equals(string) ? null : string;
        /* Do not change code above */

        if (string == null) {
            System.out.println("NullPointerException!");
        } else {
            System.out.println(string.toLowerCase(Locale.US));
        }
    }
}