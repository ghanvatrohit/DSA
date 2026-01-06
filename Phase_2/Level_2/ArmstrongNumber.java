// 5. Check if a number is an Armstrong number
package Phase_2.Level_2;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to check Armstrong or not = ");
        int n = sc.nextInt();

        int original = n;
        int temp = n;
        int count = 0;

        // Step 1: Count number of digits
        if (temp == 0) {
            count = 1;
        } else {
            while (temp > 0) {
                temp = temp / 10;
                count++;
            }
        }

        // Step 2: Calculate sum of digits raised to power count
        int sum = 0;
        temp = n;   // reset temp for digit processing

        while (temp > 0) {
            int digit = temp % 10;

            int power = 1;
            for (int i = 1; i <= count; i++) {
                power = power * digit;
            }

            sum = sum + power;
            temp = temp / 10;
        }

        if (sum == original) {
            System.out.print("Given number is an Armstrong Number.");
        } else {
            System.out.print("Given number is NOT an Armstrong Number.");
        }

        sc.close();
    }
}
