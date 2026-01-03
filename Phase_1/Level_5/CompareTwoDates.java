// 9. Take two dates (day and month) and determine which one comes first

package Phase_1.Level_5;
import java.util.Scanner;

public class CompareTwoDates {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first date (day month) = ");
        int d1 = sc.nextInt();
        int m1 = sc.nextInt();

        System.out.print("Enter second date (day month) = ");
        int d2 = sc.nextInt();
        int m2 = sc.nextInt();

        // Validate months
        if (m1 < 1 || m1 > 12 || m2 < 1 || m2 > 12) {
            System.out.println("Invalid month input");
        }
        // Validate days (simple, ignoring leap year)
        else if (d1 < 1 || d1 > 31 || d2 < 1 || d2 > 31) {
            System.out.println("Invalid date input");
        }
        // Compare dates
        else {
            if (m1 < m2) {
                System.out.println(d1 + "/" + m1 + " comes first");
            } else if (m2 < m1) {
                System.out.println(d2 + "/" + m2 + " comes first");
            } else { // same month
                if (d1 < d2) {
                    System.out.println(d1 + "/" + m1 + " comes first");
                } else if (d2 < d1) {
                    System.out.println(d2 + "/" + m2 + " comes first");
                } else {
                    System.out.println("Both dates are the same");
                }
            }
        }

        sc.close();
    }
}
