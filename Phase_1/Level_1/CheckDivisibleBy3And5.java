package Phase_1.Level_1;
import java.util.Scanner;
public class CheckDivisibleBy3And5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number = ");
        int num = sc.nextInt();

        if(num%5==0 && num%3==0){
            System.out.println("The given number is Divisible by 3 and 5");
        }else{
            System.out.println("The given number is not Divisible by 3 and 5");
        }
        sc.close();
    }
}
