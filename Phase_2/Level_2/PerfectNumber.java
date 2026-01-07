// 6. Check if a number is a perfect number
package Phase_2.Level_2;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to check perfect or not = ");
        int n = sc.nextInt();

        int sum = 0;

        // Proper divisors are from 1 to n/2
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }

        if (sum == n && n != 0) {
            System.out.println("Given number is a Perfect Number.");
        } else {
            System.out.println("Given number is NOT a Perfect Number.");
        }

        sc.close();
    }
}
