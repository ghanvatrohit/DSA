// Level 3: Mathematical & Logical Patterns
// 1. Print the squares of numbers from 1 to n
package Phase_2.Level_3;

import java.util.Scanner;

public class PrintSquaresFrom1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to print squares from 1 to n = ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int square = i * i;
            System.out.println(i + " ^2 = " + square);
        }
        sc.close();
    }
}
