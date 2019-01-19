package stage03.hw03;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Write a program that reads two integer numbers n and m ﻿from the standard input and then creates an integer array of
 * the size n filled with the same elements m. The program should output the array.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = m;
        }
        System.out.println(Arrays.toString(numbers));
    }
}