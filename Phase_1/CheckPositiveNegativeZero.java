package Phase_1;
import java.util.Scanner;

public class CheckPositiveNegativeZero {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the nnumber :- ");
        int num = sc.nextInt();

        if(num>0){
            System.out.println("The value is positive");
        }else if (num==0){
            System.out.println("The number is zero");
        }else{
            System.out.println("The value is negative number");
        }
        sc.close();
    }
}
