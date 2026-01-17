// 8. Print factorial of each number from 1 to n.
package Phase_2.Level_4;
import java.util.Scanner;

public class PrintFactorialFrom1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int n = sc.nextInt();

        int fact = 1;
        for(int i=1 ; i<=n ; i++){
            fact = fact *i;
            System.out.println(i + "! = " + fact);
        }
        
        sc.close();
    }
}
