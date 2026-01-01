// 4. Take 24-hour time (hours and minutes) and print whether it is AM or PM.
package Phase_1.Level_4;

import java.util.Scanner;

public class CheckAMorPM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the hours in (0-23) = ");
        int hours = sc.nextInt();
        System.out.print("Enter the minutes in (0-59) = ");
        int minutes = sc.nextInt();

        if (hours < 0 || hours > 23 || minutes < 0 || minutes > 59) {
            System.out.println("Invalid input");
        } else if (hours < 12) {
            System.out.println(hours + " : " + minutes + " AM");
        } else {
            System.out.println(hours + " : " + minutes + " PM");
        }

        sc.close();
    }
}