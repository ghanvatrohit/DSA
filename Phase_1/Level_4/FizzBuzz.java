// 2. Take a number and print “Fizz”, “Buzz”, or “FizzBuzz”

package Phase_1.Level_4;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int num = sc.nextInt();

        if (num == 0) {
            System.out.println("Invalid input");
        } else if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (num % 3 == 0) {
            System.out.println("Fizz");
        } else if (num % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println("The number is not divisible by 3 or 5");
        }

        sc.close();
    }
}
