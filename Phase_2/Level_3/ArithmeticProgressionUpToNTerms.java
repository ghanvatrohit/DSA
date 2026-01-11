// 9. Print first n terms of an arithmetic progression (a, d)
package Phase_2.Level_3;

import java.util.Scanner;

public class ArithmeticProgressionUpToNTerms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms (n): ");
        int n = sc.nextInt();

        System.out.print("Enter first term (a): ");
        int a = sc.nextInt();

        System.out.print("Enter common difference (d): ");
        int d = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int term = a + i * d;
            System.out.print(term + " ");
        }

        sc.close();
    }
}

// Approach 2: Using Incremental Logic
// int term = a;

// for (int i = 1; i <= n; i++) {
//     System.out.print(term + " ");
//     term = term + d;
// }