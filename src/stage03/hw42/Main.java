package stage03.hw42;

public class Main {
    public static void main(String[] args) {
        Problem.main(args);
    }
}

/**
 * Write a program that takes an operator ("+", "-", "*") and two values as the command-line arguments and then
 * outputs the result of the operator in the standard output. If the passed operator is not from the list, it must
 * output the string "Unknown operator" without quotes.
 */
class Problem {
    public static void main(String[] args) {
        int first = Integer.parseInt(args[1]);
        int second = Integer.parseInt(args[2]);

        switch (args[0]) {
            case "+":
                System.out.println(first + second);
                break;
            case "-":
                System.out.println(first - second);
                break;
            case "*":
                System.out.println(first * second);
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }
    }
}
