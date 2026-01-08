// 3. Print all numbers between a and b divisible by 7.
package Phase_2.Level_3;

import java.util.Scanner;

public class PrintNumbersDivisibleBy7BetweenAAndB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Below nubers are divisible by 7");
        for (int i = a; i <= b; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
