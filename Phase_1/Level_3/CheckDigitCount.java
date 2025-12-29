// 4. Check whether a given integer is single-digit, double-digit, or multi-digit.
package Phase_1.Level_3;

import java.util.Scanner;

public class CheckDigitCount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer = ");
        int num = sc.nextInt();

        int absNum = Math.abs(num); // handle negative numbers

        if (absNum >= 0 && absNum <= 9) {
            System.out.println("Single-digit number");
        } else if (absNum >= 10 && absNum <= 99) {
            System.out.println("Double-digit number");
        } else {
            System.out.println("Multi-digit number");
        }

        sc.close();
    }
}
