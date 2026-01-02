// 2. Take three numbers and check if they can form a Pythagorean triplet.
package Phase_1.Level_5;
import java.util.Scanner;

public class CheckPythagoreanTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the three values :- ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>0 && b>0 && c>0){
            if((a*a)+(b*b)==c*c){
                System.out.println("This numbers are Pythagorean triplet = "+a+"^2 + "+b+"^2 ="+c+"^2");
            }else if((a*a)+(c*c)==b*b){
                System.out.println("This numbers are Pythagorean triplet  = "+a+"^2 + "+c+"^2 ="+b+"^2");
            }else if((c*c)+(b*b)==a*a){
                System.out.println("This numbers are Pythagorean triplet  = "+c+"^2 + "+b+"^2 ="+a+"^2");
            }else{
                System.out.println("This number are not Pythagorean triplet");
            }
        }else{
            System.out.println("Invalid input");
        }sc.close();
    }
}
