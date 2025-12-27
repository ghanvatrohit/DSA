// Check voting eligibility for a given age (18+). give only file name
package Phase_1.Level_2;

import java.util.Scanner;

public class CheckVotingEligibility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the age = ");
        int age = sc.nextInt();

        if (age < 0) {
            System.out.println("Invalid input");
        } else if (age >= 18) {
            System.out.println("The candidate is eligible for vote");
        } else {
            System.out.println("The candidate is not eligible for vote");
        }

        sc.close();
    }
}
