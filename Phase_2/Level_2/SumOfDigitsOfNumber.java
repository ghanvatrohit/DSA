// 4. Find the sum of digits of a number.
package Phase_2.Level_2;

import java.util.Scanner;

public class SumOfDigitsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int n = sc.nextInt();

        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            n = n / 10;
            sum = sum + digit;
        }
        System.out.print("The sum of digit is " + sum);

        sc.close();
    }
}
