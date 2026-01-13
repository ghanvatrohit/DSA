import java.util.Scanner;

public class PrintNStarsOnSameLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to print = ");
        int n = sc.nextInt();

        for(int i=1;i<=n ;i++){
            System.out.print("*");
        }
        sc.close();
    }
}
