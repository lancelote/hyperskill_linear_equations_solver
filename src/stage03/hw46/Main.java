package stage03.hw46;

/**
 * The class Arrays includes a lot of useful methods for processing arrays. One is the binarySearch method. It allows
 * you to quickly find the index of an element in the given ordered array.
 * <p>
 * In this quiz, you need to call this method from the Arrays class without using an import statement.
 */
public class Main {
    public static void main(String[] args) {
    }

    public static int callBinarySearch(int[] nums, int key) {
        return java.util.Arrays.binarySearch(nums, key);
    }
}
