package Practice;
import java.util.Scanner;
// 153 = 1^3 + 5^3 + 3^3  (input == output)
public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number :-");
        int num = sc.nextInt();

        int original=num,sum=0;

        while(num>0){
            int digit = num%10;                   // extract digit   digit = 153 % 10 = 3
            sum= sum+(digit*digit*digit);         // cube and add    sum += 3 * 3 * 3 = 27
            num=num/10;                           // remove digit    num = 153 / 10 = 15
        }

        if(original==sum){
            System.out.println("The number is Armstrong number");
        }else{
            System.out.println("The number is not Armstrong number");
        }

        sc.close();
    }
}
