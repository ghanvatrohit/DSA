// 5. Check if a number is a multiple of 7 or ends with 7

package Phase_1.Level_3;

import java.util.Scanner;

public class CheckMultipleOrEndsWith7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number = ");
        int num = sc.nextInt();

        if (num % 7 == 0 || Math.abs(num) % 10 == 7) {
            System.out.println("The number is a multiple of 7 or ends with 7");
        } else {
            System.out.println("The number is neither a multiple of 7 nor ends with 7");
        }

        sc.close();
    }
}
