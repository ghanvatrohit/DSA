// 2. Take a 3-digit number and determine if the middle digit is the largest, smallest, or neither

package Phase_1.Level_3;

import java.util.Scanner;

public class CheckMiddleDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a three-digit number = ");
        int num = sc.nextInt();

        if (num >= 100 && num <= 999) {

            int d1 = num / 100;
            int d2 = (num / 10) % 10;
            int d3 = num % 10;

            if (d2 < d1 && d2 < d3) {
                System.out.println("Middle digit is the smallest: " + d2);
            } else if (d2 > d1 && d2 > d3) {
                System.out.println("Middle digit is the largest: " + d2);
            } else {
                System.out.println("Middle digit is neither largest nor smallest");
            }

        } else {
            System.out.println("Invalid input");
        }

        sc.close();
    }
}
