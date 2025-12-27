// 8. Take an alphabet character and check if it lies between ‘a’ and ‘m’ or ‘n’ and ‘z’

package Phase_1.Level_2;
import java.util.Scanner;

public class CheckAlphabetRange {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the character = ");
        char ch = sc.next().charAt(0);

        if (ch >= 'a' && ch <= 'm') {
            System.out.println("The character lies between 'a' and 'm'");
        } else if (ch >= 'n' && ch <= 'z') {
            System.out.println("The character lies between 'n' and 'z'");
        } else {
            System.out.println("Invalid input");
        }

        sc.close();
    }
}
