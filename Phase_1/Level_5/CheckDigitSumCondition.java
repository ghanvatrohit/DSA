// 7. Take a 3-digit number and check if the sum of the first and last digit equals the middle digit
package Phase_1.Level_5;
import java.util.Scanner;

public class CheckDigitSumCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the three number =");
        int num = sc.nextInt();

        if(100<=num && 999>=num){
            int d1 = num/100;
            int d2 = (num/10)%10;
            int d3 = num%10;

            if((d1+d3)==d2){
                System.out.print("Sum of the first and last digit equals to middle digit.");
            }else{
                System.out.print("Sum of the first and last digit not equals to middle digit.");
            }
        }else{
            System.out.print("Invalid input");
        }sc.close();
    }
}
