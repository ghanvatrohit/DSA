import java.util.Scanner;

public class PrintStarsInEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int n = sc.nextInt();

        for(int i=2 ; i<=n ;i+=2){
                for(int j=0 ; j<i ; j++){
                    System.out.print("*");
            }
            System.out.println();
        }sc.close();
    }
}
