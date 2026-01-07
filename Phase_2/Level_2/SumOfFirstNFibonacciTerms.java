// 10. Print sum of first n terms of Fibonacci series.
package Phase_2.Level_2;
import java.util.Scanner;

public class SumOfFirstNFibonacciTerms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to sum of first 'N' Fibonacci Terms = ");
        int n = sc.nextInt();
        int a= 0;
        int b=1;
        int sum = 0;

        if(n>=1){
            sum = sum + a;
            System.out.println(a+ " ");
        }
        if(n>=2){
            sum = sum+b;
            System.out.println(b+" ");
        }
        for(int i=3 ; i<=n ;i++){
            int c=a+b;
            System.out.println(c + " ");
            sum = sum+c;
            a = b;
            b= c;
        }
        System.out.println("Sum of first " + n + " Fibonacci terms = " + sum);
        sc.close();
    }
}
