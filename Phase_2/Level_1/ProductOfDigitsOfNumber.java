// 10.Print the product of digits of a given number.
package Phase_2.Level_1;

import java.util.Scanner;

public class ProductOfDigitsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int product = 1;

        while (n > 0) {
            int digit = n % 10;
            product = product * digit;
            n = n / 10;
        }

        System.out.print(product);
        sc.close();
    }
}
