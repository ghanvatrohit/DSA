// 5. Take the hour of the day (0–23) and print greeting

package Phase_1.Level_2;

import java.util.Scanner;

public class GreetingByHour {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the hour (0–23) = ");
        int hrs = sc.nextInt();

        if (hrs < 0 || hrs > 23) {
            System.out.println("Invalid Input");
        } else if (hrs >= 5 && hrs <= 11) {
            System.out.println("Good Morning");
        } else if (hrs >= 12 && hrs <= 16) {
            System.out.println("Good Afternoon");
        } else if (hrs >= 17 && hrs <= 20) {
            System.out.println("Good Evening");
        } else {
            System.out.println("Good Night");
        }

        sc.close();
    }
}
