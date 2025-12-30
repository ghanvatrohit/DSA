// 7. Check if an amount can be evenly divided into 2000, 500, and 100 currency notes.
package Phase_1.Level_3;
import java.util.Scanner;

public class CheckCurrencyDivision {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount = ");
        int amount = sc.nextInt();

        if (amount <= 0) {
            System.out.println("Invalid amount");
        } else if (amount % 100 == 0) {
            System.out.println("Amount can be evenly divided into 2000, 500, and 100 notes");
        } else {
            System.out.println("Amount cannot be evenly divided into 2000, 500, and 100 notes");
        }

        sc.close();
    }
}

