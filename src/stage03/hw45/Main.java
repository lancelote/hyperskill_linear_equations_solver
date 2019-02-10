package stage03.hw45;

public class Main {
    public static void main(String[] args) {
        Problem.main(args);
    }
}

class Problem {
    public static void main(String[] args) {
        for (int i = 0; i < args.length - 1; i += 2) {
            System.out.println(args[i] + "=" + args[i + 1]);
        }
    }
}
