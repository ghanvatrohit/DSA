// 8. Print the sum of all odd numbers up to n.
package Phase_2.Level_1;

import java.util.Scanner;

public class SumOfOddNumbersUpToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n to print sum of all odd numbers = ");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        System.out.print(sum);
        sc.close();
    }
}