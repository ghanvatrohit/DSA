// 8. Take an integer (1–9999) and check if the sum of its digits is greater than the product of its digits.
package Phase_1.Level_5;
import java.util.Scanner;

public class CheckDigitSumVsProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number (1-9999) = ");
        int num= sc.nextInt();
        int temp = num;
        int sum = 0;
        int product = 1;

        if(num>0 && num<10000){
        while(temp>0){
            int digit = temp % 10;
            sum = sum + digit;
            product = product * digit;
            temp = temp / 10;
        }

        if(sum>product){
            System.out.print("True");
        }else{
            System.out.print("False");
        }
    }sc.close();
    }
}
