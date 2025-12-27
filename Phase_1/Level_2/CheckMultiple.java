// 4. Check if one of two given numbers is a multiple of the other.

package Phase_1.Level_2;

import java.util.Scanner;

public class CheckMultiple {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a :- ");
        int a = sc.nextInt();

        System.out.print("Enter the value of b :- ");
        int b = sc.nextInt();

        if (a == 0 || b == 0) {
            System.out.println("Cannot check multiples with zero");
        } else if (a % b == 0) {
            System.out.println(a + " is a multiple of " + b);
        } else if (b % a == 0) {
            System.out.println(b + " is a multiple of " + a);
        } else {
            System.out.println("Neither number is a multiple of the other");
        }

        sc.close();
    }
}
