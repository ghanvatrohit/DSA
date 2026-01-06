// 1 .Count the number of digits in a given number.
package Phase_2.Level_2;
import java.util.Scanner;

public class CountNumberOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int n = sc.nextInt();
        if(n==0){
            System.out.print("Count of the number is  1");
        }else{
            int count = 0;

            while(n>0){
                n = n/10;
                count++;
            }
            System.out.print("count of the number is "+count);
        }sc.close();
    }
}
