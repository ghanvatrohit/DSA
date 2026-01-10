// 8. Check if a number is a Strong Number
// Strong Number: sum of factorials of digits = number

package Phase_2.Level_3;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number = ");
        int n = sc.nextInt();

        int original = n;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;

            // calculate factorial of digit
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact = fact * i;
            }

            sum = sum + fact;
            n = n / 10;
        }

        if (sum == original) {
            System.out.println("The number is a Strong Number.");
        } else {
            System.out.println("The number is NOT a Strong Number.");
        }

        sc.close();
    }
}
