// 6. Print the sum of first n natural numbers.
package Phase_2.Level_1;

import java.util.Scanner;

public class SumOfFirstNNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n to print sum of natural number =");
        int n = sc.nextInt();
        int sum = 0;
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                sum = sum + i;
            }
            System.out.print(+sum);
        } else {
            System.out.print("Invalid Input");
        }
        sc.close();
    }
}
