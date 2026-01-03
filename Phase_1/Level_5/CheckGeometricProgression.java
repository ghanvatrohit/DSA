// 6. Take three numbers and check if they are in geometric progression.
package Phase_1.Level_5;

import java.util.Scanner;

public class CheckGeometricProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers = ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (b * b == a * c) {
            System.out.print("The numbers are in Geometric Progression");
        } else {
            System.out.println("The numbers are NOT in Geometric Progression");
        }
        sc.close();
    }
}
