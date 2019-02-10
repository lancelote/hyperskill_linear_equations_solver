package stage03.hw43;

public class Main {
    public static void main(String[] args) {
        Problem.main(args);
    }
}

/**
 * Write a program that searches the argument equal to "test" (without quotes), and then outputs its index in the
 * array args. If it is not found, the program must output "-1".
 */
class Problem {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            if ("test".equals(args[i])) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}
