// 4. Find HCF (GCD) of two numbers using loops
// HCF = Highest Common Factor
// GCD = Greatest Common Divisor

package Phase_2.Level_3;

import java.util.Scanner;

public class HCFOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the two numbers = ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int hcf = 1;

        // Find the smaller number
        int min = (a < b) ? a : b;

        // Loop to find common divisors
        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;   // keep updating
            }
        }

        System.out.println("HCF (GCD) = " + hcf);
        sc.close();
    }
}
