package Phase_2.Level_3;
import java.util.Scanner;

public class PrintAllFactorsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i + " ");
            }
        }sc.close();
    }
}
