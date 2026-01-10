// 7. Find the sum of all factors of a number.
package Phase_2.Level_3;
import java.util.Scanner;

public class SumOfAllFactorsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int n = sc.nextInt();
        int sum = 0;

        for(int i=1 ; i<=n ;i++){
            if(n%i==0){
                System.out.println(i);
                sum = sum + i;
            }
        }
        System.out.print("Sum of the all factors is "+sum);
        sc.close();
    }
}
