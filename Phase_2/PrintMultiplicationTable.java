// 5. Print the table of a given number (n × 1 to n × 10).
package Phase_2;
import java.util.Scanner;

public class PrintMultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n(number) =");
        int n = sc.nextInt();
        
            for(int i=1 ; i<=10 ;i++){
                int result = n * i;
                System.out.println(n+" * "+i+" = "+ result);
            }
            sc.close();
        
    }
}
