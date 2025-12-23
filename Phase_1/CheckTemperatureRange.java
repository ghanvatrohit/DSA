// 8. Take a temperature value and print “Cold”, “Warm”, or “Hot” using range conditions.
package Phase_1;
import java.util.Scanner;

public class CheckTemperatureRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the temperature :- ");
        int temperature = sc.nextInt();

        if(temperature<20){
            System.out.println("Cold");
        }else if(temperature>=20 && temperature<=30){
            System.out.println("Warm");
        }else{System.out.println("Hot");
    }
    sc.close();
    }
}
