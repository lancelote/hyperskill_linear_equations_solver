package stage03.hw04;

import java.util.Arrays;

/**
 * Create an array of longs named longNumbers with three elements 100000000001, 100000000002, 100000000003.
 */
public class Main {

    public static void main(String[] args) {
        long[] longNumbers;
        longNumbers = new long[]{100000000001L, 100000000002L, 100000000003L};
        System.out.println(Arrays.toString(longNumbers));
    }
}