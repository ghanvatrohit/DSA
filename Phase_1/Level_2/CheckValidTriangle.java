// 1. Take three sides and check if they form a valid triangle.
package Phase_1.Level_2;

import java.util.Scanner;

public class CheckValidTriangle {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three sides = ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a + b > c && a + c > b && c + b > a) {
            System.out.println("The given sides form a valid triangle");
        } else {
            System.out.println("The given sides do not form a valid triangle");
        }
        sc.close();
    }
}

// Logic (Triangle Validity Rule)

// A triangle is valid if:

// Sum of any two sides is greater than the third side

// That is:

// a + b > c
// a + c > b
// b + c > a

// Example 1
// a = 3
// b = 4
// c = 5

// ✔ 3 + 4 > 5
// ✔ 3 + 5 > 4
// ✔ 4 + 5 > 3
// ➡ Valid triangle