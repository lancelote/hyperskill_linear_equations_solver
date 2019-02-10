package stage03.hw44;

public class Main {
    public static void main(String[] args) {
        Problem.main(args);
    }
}

/**
 * Write a program that takes an operator ("MAX", "MIN", "SUM") and a sequence of numbers as the command-line
 * arguments and then outputs the result of the operator in the standard output.
 * <p>
 * The description of the operators:
 * <p>
 * "MAX" finds the max value of a sequence of numbers;
 * "MIN" find the min value of a sequence of numbers
 * "SUM" calculates the sum of a sequence of numbers.
 * <p>
 * <p>
 * It is guaranteed that a correct operation and at least one number passed.
 */
class Problem {
    public static void main(String[] args) {
        int[] numbers = new int[args.length - 1];
        for (int i = 1; i < args.length; i++) {
            numbers[i - 1] = Integer.parseInt(args[i]);
        }

        switch (args[0]) {
            case "MAX":
                System.out.println(max(numbers));
                break;
            case "MIN":
                System.out.println(min(numbers));
                break;
            case "SUM":
                System.out.println(sum(numbers));
                break;
            default:
                System.out.println("Unknown command");
                break;
        }
    }

    private static int max(int[] numbers) {
        int biggest = numbers[0];
        for (int number : numbers) {
            if (number > biggest) {
                biggest = number;
            }
        }
        return biggest;
    }

    private static int min(int[] numbers) {
        int smallest = numbers[0];
        for (int number : numbers) {
            if (number < smallest) {
                smallest = number;
            }
        }
        return smallest;
    }

    private static int sum(int[] numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }
}
