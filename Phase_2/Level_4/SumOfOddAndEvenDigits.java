package Phase_2.Level_4;

import java.util.Scanner;

public class SumOfOddAndEvenDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int n = sc.nextInt();

        int oddSum = 0;
        int evenSum = 0;

        int temp = n;

        while (temp > 0) {
            int digit = temp % 10;

            if (digit % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }

            temp = temp / 10;
        }

        System.out.println("Odd sum = " + oddSum);
        System.out.println("Even sum = " + evenSum);

        sc.close();
    }
}
