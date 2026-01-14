import java.util.Scanner;

public class PrintStarsInEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int n = sc.nextInt();

        for(int i=1 ; i<=n ;i++){
                for(int j=0 ; j<2*i ; j++){
                    System.out.print("*");
            }
            System.out.println();
        }sc.close();
    }
}
