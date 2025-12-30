// 6. Take coordinates (x, y) and determine which quadrant the point lies in.
package Phase_1.Level_3;

import java.util.Scanner;

public class CheckQuadrant {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x coordinate = ");
        int x = sc.nextInt();

        System.out.print("Enter y coordinate = ");
        int y = sc.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("Point lies in First Quadrant");
        } else if (x < 0 && y > 0) {
            System.out.println("Point lies in Second Quadrant");
        } else if (x < 0 && y < 0) {
            System.out.println("Point lies in Third Quadrant");
        } else if (x > 0 && y < 0) {
            System.out.println("Point lies in Fourth Quadrant");
        } else if (x == 0 && y == 0) {
            System.out.println("Point lies at the Origin");
        } else if (x == 0) {
            System.out.println("Point lies on Y-axis");
        } else {
            System.out.println("Point lies on X-axis");
        }

        sc.close();
    }
}
