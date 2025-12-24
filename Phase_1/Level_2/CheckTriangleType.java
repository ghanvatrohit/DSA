// 2. If the sides form a valid triangle, determine its type

package Phase_1.Level_2;

import java.util.Scanner;

public class CheckTriangleType {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the three sides = ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Check valid triangle
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("This is a valid triangle.");

            if (a == b && b == c) {
                System.out.println("Equilateral triangle");
            } else if (a == b || b == c || a == c) {
                System.out.println("Isosceles triangle");
            } else {
                System.out.println("Scalene triangle");
            }

        } else {
            System.out.println("Not a valid triangle");
        }

        sc.close();
    }
}

// KNOWLEDGE (Simple Explanation – MEMORIZE THIS)
// 🔺 Triangle Validity Rule

// A triangle is valid only if:

// a + b > c
// a + c > b
// b + c > a

// 🔺 Types of Triangles
// 🔹 Equilateral

// ➡ All sides equal

// a == b && b == c

// Example: 5 5 5

// 🔹 Isosceles

// ➡ Any two sides equal

// a == b || b == c || a == c

// Example: 5 5 8

// 🔹 Scalene

// ➡ All sides different

// a != b && b != c && a != c

// Example: 4 5 6