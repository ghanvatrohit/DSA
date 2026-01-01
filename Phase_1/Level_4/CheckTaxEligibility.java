// 5. Take income and age, and check if eligible for tax with exact reason

package Phase_1.Level_4;

import java.util.Scanner;

public class CheckTaxEligibility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age = ");
        int age = sc.nextInt();

        System.out.print("Enter income = ");
        int income = sc.nextInt();

        if (age < 0 || income < 0) {
            System.out.println("Invalid input");
        } else if (age <= 18 && income <= 500000) {
            System.out.println("Not eligible for tax due to age and low income");
        } else if (age <= 18) {
            System.out.println("Not eligible for tax due to age");
        } else if (income <= 500000) {
            System.out.println("Not eligible for tax due to low income");
        } else {
            System.out.println("Eligible for tax");
        }

        sc.close();
    }
}
