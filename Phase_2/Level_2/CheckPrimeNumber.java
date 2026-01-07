// 8. Check if a number is prime or not.
package Phase_2.Level_2;
import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number to check is prime or not = ");
        int num = sc.nextInt();

        boolean isPrime = true;

        for(int i = 2; i <= num/2 ; i++){
            if(num % i == 0 ){
                isPrime = false;
            }
        }

        if(isPrime && num>1){
            System.out.println("Prime number");
        }else{
            System.out.println("Not a prime number");
        }

        sc.close();
    }
}
