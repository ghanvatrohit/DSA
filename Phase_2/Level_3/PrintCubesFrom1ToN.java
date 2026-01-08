// 2. Print cubes of numbers from 1 to n.
package Phase_2.Level_3;
import java.util.Scanner;

public class PrintCubesFrom1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to print cubes from 1 to n = ");
        int n= sc.nextInt();

        for(int i=1 ; i<=n ; i++){
            int cube = i*i*i;
            System.out.println(i+" ^3 = "+cube);
        }sc.close();
    }
}
