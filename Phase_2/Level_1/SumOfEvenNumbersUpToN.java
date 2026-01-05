//7. Print the sum of all even numbers up to n.
package Phase_2.Level_1;

import java.util.Scanner;

public class SumOfEvenNumbersUpToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n to print sum of even number = ");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 0; i <= n; i=i+2) {//i=i+2 or i+=2
            sum = sum + i;
        }
        System.out.print(sum);
        sc.close();
    }
}
