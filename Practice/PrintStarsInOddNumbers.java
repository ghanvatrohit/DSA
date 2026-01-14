// 8. Print Stars in Odd Numbers (1, 3, 5, 7, 9)
import java.util.Scanner;

public class PrintStarsInOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int n = sc.nextInt();

        for(int i=1 ; i<=n ; i++){
            for(int j=0; j<i*2-1 ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
