// 10. Check whether a number is a perfect square (without using the square root function)

package Phase_1.Level_3;

import java.util.Scanner;

public class CheckPerfectSquare {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number = ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Not a perfect square");
        } else {
            boolean isPerfectSquare = false;

            for (int i = 1; i * i <= num; i++) {
                if (i * i == num) {
                    isPerfectSquare = true;
                    System.out.println("Perfect square found: " + i + " × " + i);
                    break;
                }
            }

            if (isPerfectSquare) {
                System.out.println("The number is a perfect square");
            } else {
                System.out.println("The number is not a perfect square");
            }
        }

        sc.close();
    }
}
