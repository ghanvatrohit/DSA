// 8. Take a weekday number (1–7) and determine if it is a weekday or weekend.
package Phase_1.Level_4;
import java.util.Scanner;

public class CheckWeekdayOrWeekend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the day(in numbers) :- ");
        int num=sc.nextInt();

        if(num>=1 && num<=7){
            if(num==6 || num==7){
                System.out.print("weekend");
            }else{
                System.out.print("Weekday");
            }
        }else{
            System.out.print("Invalid Input");
        }
        sc.close();
    }
}
