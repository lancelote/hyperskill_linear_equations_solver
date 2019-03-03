package stage03.hw55;

public class Main {
    public static void methodCatchingExceptions() {
        try {
            methodThrowingExceptions();
        } catch (CException e) {
            System.out.println("C");
        } catch (AException e) {
            System.out.println("A OR B");
        } catch (RootException e) {
            System.out.println("ROOT OR D");
        }
    }

    public static void methodThrowingExceptions() throws RootException {
    }
}

class RootException extends Exception {
}

class AException extends RootException {
}

class BException extends AException {
}

class CException extends AException {
}

class DException extends RootException {
}
