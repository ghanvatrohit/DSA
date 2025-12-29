// 3. Take a 4-digit number and check if the first and last digits are equal.

package Phase_1.Level_3;

import java.util.Scanner;

public class CheckFirstLastDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 4-digit number = ");
        int num = sc.nextInt();

        if (num >= 1000 && num <= 9999) {

            int first = num / 1000;
            int last = num % 10;

            if (first == last) {
                System.out.println("Both digits are equal: " + first + " == " + last);
            } else {
                System.out.println("Both digits are not equal");
            }

        } else {
            System.out.println("Invalid input, please enter a 4-digit number");
        }

        sc.close();
    }
}
