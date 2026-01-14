// 10. Print Stars and Spaces Alternating (Stars and Blank Spaces)
import java.util.Scanner;

public class PrintStarsAndBPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                if (j >= n - i + 1 && (i + j) % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print("b");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
