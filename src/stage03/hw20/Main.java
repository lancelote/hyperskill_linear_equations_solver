package stage03.hw20;

import java.util.Arrays;
import java.util.Scanner;

/**
 * A right rotation is an operation which shifts each element of the array to the right.
 * <p>
 * For example, if a right rotation is 1 and array is {1,2,3,4,5}, the new array will be {5,1,2,3,4}.
 * <p>
 * Another example, if a right rotation is 2 and array {1,2,3,4,5}, the new array will be {4,5,1,2,3}, because
 * <p>
 * {1,2,3,4,5} ->  {5,1,2,3,4} ->  {4,5,1,2,3}.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = scanner.nextInt();
        }
        int rotation = scanner.nextInt();
        int[] rotated = rightRotation(numbers, rotation);
        System.out.println(Arrays.toString(rotated));
    }

    public static int[] rightRotation(int[] arr, int rotation) {
        int[] shifted = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            shifted[(i + rotation) % arr.length] = arr[i];
        }
        return shifted;
    }
}
