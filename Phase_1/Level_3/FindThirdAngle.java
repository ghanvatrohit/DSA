// 9. Take two angles of a triangle and compute the third angle.

package Phase_1.Level_3;

import java.util.Scanner;

public class FindThirdAngle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first angle = ");
        int first = sc.nextInt();

        System.out.print("Enter the second angle = ");
        int second = sc.nextInt();

        if (first > 0 && second > 0 && (first + second) < 180) {
            int third = 180 - (first + second);
            System.out.println("The third angle value is " + third);
        } else {
            System.out.println("Invalid input");
        }

        sc.close();
    }
}
