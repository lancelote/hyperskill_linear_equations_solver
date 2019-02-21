package stage03.hw54;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        while (!"0".equals(line)) {
            try {
                System.out.println(toInt(line));
            } catch (NumberFormatException e) {
                System.out.println("Invalid user input: " + line);
            }
            line = scanner.nextLine();
        }
    }

    private static int toInt(String line) throws NumberFormatException {
        return Integer.parseInt(line) * 10;
    }
}
