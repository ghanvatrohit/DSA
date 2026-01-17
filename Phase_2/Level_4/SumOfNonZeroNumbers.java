package Phase_2.Level_4;
import java.util.Scanner;

public class SumOfNonZeroNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.print("Enter 5 numbers = ");

        for(int i=1 ; i<=5 ; i++){
            int num = sc.nextInt();

            if(num==0){
                continue;
            }

            sum = sum+num;
        }
        System.out.println("Sum of non-zero number = "+ sum);
        sc.close();
    }
}
