// 1. Take coordinates (x, y) and check if the point lies on the X-axis, Y-axis, or at the
// origin.
package Phase_1.Level_5;
import java.util.Scanner;

public class CheckPointPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the coordinate (X ,Y)= ");
        int X = sc.nextInt();
        int Y = sc.nextInt();

        if(X==0 && Y!=0){
            System.out.print("Point lies on the Y-axis");
        }else if(Y==0 && X!=0){
            System.out.print("Point lies on the X-axis");
        }else if(X==0 && Y==0){
            System.out.print("Point lies on the origin");
        }else{
            System.out.print("Point lies in the plane (not on any axis)");
        }
        sc.close();
    }
}
