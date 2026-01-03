// 10. Take a year and print the corresponding century

package Phase_1.Level_5;
import java.util.Scanner;

public class FindCenturyFromYear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year = ");
        int year = sc.nextInt();

        if (year <= 0) {
            System.out.println("Invalid input");
        } else {
            int century = (year - 1) / 100 + 1;
            String suffix;

            if (century % 100 >= 11 && century % 100 <= 13) {
                suffix = "th";
            } else if (century % 10 == 1) {
                suffix = "st";
            } else if (century % 10 == 2) {
                suffix = "nd";
            } else if (century % 10 == 3) {
                suffix = "rd";
            } else {
                suffix = "th";
            }

            System.out.println(century + suffix + " century");
        }

        sc.close();
    }
}
