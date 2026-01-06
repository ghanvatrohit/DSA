// 3. Check if a number is a palindrome
package Phase_2.Level_2;
import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check palindrome = ");
        int n = sc.nextInt();
        int reverse = 0;
        int compare = n;
        while(n>0){
            int digit = n%10;
            reverse = reverse * 10 + digit;
            n = n/10;
        }

        if(reverse == compare){
            System.out.print("The given number is palindrome. ");
        }else{
            System.out.print("The given number is not palindrome !");
        }
        sc.close();
    }
}
