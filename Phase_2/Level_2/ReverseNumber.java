// 2 .Print the reverse of a given number.
package Phase_2.Level_2;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to print reverse number = ");
        int n = sc.nextInt();
        int reverse = 0;
        while(n>0){
            int digit = n%10;
            reverse = reverse * 10 +digit;
            n = n/10;
        }
        System.out.print("Reverse number is "+reverse);
        sc.close();
    }
}
