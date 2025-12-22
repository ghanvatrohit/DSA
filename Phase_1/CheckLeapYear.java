package Phase_1;
import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the year = ");
        int num=sc.nextInt();

        if(num%4==0 && num%100!=0 || num%400==0){
            System.out.println("The given year is a leap year");
        }else{System.out.println("The given year is not a leap year");
    }
    sc.close();
    }
}
