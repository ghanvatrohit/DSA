package Phase_2.Level_4;
import java.util.Scanner;

public class PrintNumbersWithEvenSetBits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            int temp = i;
            int count = 0;

            while (temp > 0) {
                if (temp % 2 == 1) {
                    count++;
                }
                temp = temp / 2;
            }

            if (count % 2 == 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
