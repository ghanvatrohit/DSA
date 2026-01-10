// 5. Find LCM of two numbers using loops (Method 1: Using HCF)
package Phase_2.Level_3;

import java.util.Scanner;

public class LCMOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers = ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int hcf = 1;
        int min = (a < b) ? a : b;

        // Find HCF using loop
        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }

        int lcm = (a * b) / hcf;

        System.out.println("LCM = " + lcm);
        sc.close();
    }
}
