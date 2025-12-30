// 8. Check if a number lies within the range [100, 999].
package Phase_1.Level_3;

import java.util.Scanner;

public class CheckNumberRange {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number = ");
        int num = sc.nextInt();

        if (num >= 100 && num <= 999) {
            System.out.println("The number lies within the range [100, 999]");
        } else {
            System.out.println("The number does not lie within the range [100, 999]");
        }

        sc.close();
    }
}
