// 9. Take electricity units consumed and calculate the bill as per slabs

package Phase_1.Level_4;

import java.util.Scanner;

public class CalculateElectricityBill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the units consumed = ");
        int units = sc.nextInt();

        int bill;

        if (units < 0) {
            System.out.println("Invalid input");
        } else if (units <= 100) {
            bill = units * 1;
            System.out.println("Electricity bill = ₹" + bill);
        } else if (units <= 200) {
            bill = (100 * 1) + (units - 100) * 2;
            System.out.println("Electricity bill = ₹" + bill);
        } else {
            bill = (100 * 1) + (100 * 2) + (units - 200) * 3;
            System.out.println("Electricity bill = ₹" + bill);
        }

        sc.close();
    }
}
