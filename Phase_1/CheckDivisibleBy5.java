package Phase_1;
import java.util.Scanner;

public class CheckDivisibleBy5 {
    public static void main(String[] arf){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number = ");
        int num = sc.nextInt();
        
        if(num%5==0){
            System.out.println("The number is Divisible by 5");
        }else{
            System.out.println("The number is not Divisible by 5 !");
        }
        sc.close();
    }
}
