// 6. Take two numbers and print the larger one.

package Phase_1;

import java.util.Scanner;

public class FindLargerNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the two number =");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        if(number1>number2){
            System.out.println("The larger number is = " + number1);
        }else if(number2>number1){
            System.out.println("The larger number is = " + number2);
        }else{System.out.println("Both numbers are equal ");
    }sc.close();
    }
}
