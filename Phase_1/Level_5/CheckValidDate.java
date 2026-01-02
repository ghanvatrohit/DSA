// 3. Take day and month and check if it forms a valid calendar date (ignoring leap years)

package Phase_1.Level_5;

import java.util.Scanner;

public class CheckValidDate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the month = ");
        int month = sc.nextInt();

        System.out.print("Enter the day = ");
        int day = sc.nextInt();

        // First: basic validation
        if (month < 1 || month > 12 || day < 1) {
            System.out.println("Invalid calendar date");
        }
        // 31-day months
        else if (day <= 31 && (month == 1 || month == 3 || month == 5 ||
                month == 7 || month == 8 || month == 10 || month == 12)) {
            System.out.println("Valid calendar date");
        }
        // 30-day months
        else if (day <= 30 && (month == 4 || month == 6 ||
                month == 9 || month == 11)) {
            System.out.println("Valid calendar date");
        }
        // February (ignoring leap year)
        else if (day <= 28 && month == 2) {
            System.out.println("Valid calendar date");
        }
        // Everything else
        else {
            System.out.println("Invalid calendar date");
        }

        sc.close();
    }
}
