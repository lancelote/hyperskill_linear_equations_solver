package stage03.hw19;

import java.util.Scanner;

/**
 * In some country, there are N companies, and the law of that country say that the taxes of each company are
 * individual and appointed by a president. President wants to know which company pays the most taxes. But sadly,
 * none of the president's proxies know math very well, so this work is transferred to you. Can you solve this problem?
 * <p>
 * The first line of the input contains N - the number of companies in this country.
 * The second line contains yearly incomes of each company. All numbers are non-negative integers.
 * The third line contains individual taxes for each company in percents of the company's income. All numbers are
 * integers from 0 to 100 inclusive.
 * <p>
 * You should output the number of the company that pays the most taxes. Keep in mind that the enumeration of the
 * companies starts from number 1. If there are several companies with the same payments sizes, output the number of
 * the company with the lowest number.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] income = new int[n];
        int[] taxPercent = new int[n];
        for (int i = 0; i < n; i++) {
            income[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            taxPercent[i] = scanner.nextInt();
        }
        System.out.println(maxTax(income, taxPercent));
    }

    private static int maxTax(int[] income, int[] taxPercent) {
        int biggestTaxIndex = 0;
        double biggestTax = income[0] * (taxPercent[0] / 100.0);
        for (int i = 1; i < income.length; i++) {
            double tax = income[i] * (taxPercent[i] / 100.0);
            if (tax > biggestTax) {
                biggestTax = tax;
                biggestTaxIndex = i;
            }
        }
        return biggestTaxIndex + 1;
    }
}