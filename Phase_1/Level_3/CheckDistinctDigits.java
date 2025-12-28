package Phase_1.Level_3;
import java.util.Scanner;

public class CheckDistinctDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 3-digit number = ");
        int num = sc.nextInt();

        if (num < 100 || num > 999) {
            System.out.println("Invalid input (not a 3-digit number)");
        } else {
            int d1 = num / 100;        // hundreds
            int d2 = (num / 10) % 10; // tens
            int d3 = num % 10;        // units

            if (d1 == d2 || d2 == d3 || d1 == d3) {
                System.out.println("Digits are not distinct");
            } else {
                System.out.println("All digits are distinct");
            }
        }

        sc.close();
    }
}
