package stage03.hw52;

import java.util.Scanner;

public class Main {

    public static double convertStringToDouble(String s) {
        try {
            return Double.parseDouble(s);
        } catch (RuntimeException e) {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        line = "none".equalsIgnoreCase(line) ? null : line;
        double result = convertStringToDouble(line);
        System.out.println(result);
    }
}
