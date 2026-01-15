import java.util.Scanner;

public class PrintBinaryTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the three nunmber = ");
        int n = sc.nextInt();

        for(int i=1 ; i<=n ; i++ ){
            for(int j=1 ; j<=i ; j++){
                int val = (i+j)%2;
                System.out.print(val+" ");
            }System.out.println();
        }sc.close();
    }
}
