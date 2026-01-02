// 5. Take three numbers and check if they are in arithmetic progression

package Phase_1.Level_5;

import java.util.Scanner;

public class CheckArithmeticProgression {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers = ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (b - a == c - b) {
            System.out.println("The numbers are in Arithmetic Progression");
        } else {
            System.out.println("The numbers are NOT in Arithmetic Progression");
        }

        sc.close();
    }
}
