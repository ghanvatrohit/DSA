import java.util.Scanner;

public class PrintAlphabetOddSequenceTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int n = sc.nextInt();

        char ch = 'A';

        for (int i = 1; i <= n; i++) {
            int charsInRow = 2 * i - 1;   // 1, 3, 5, 7, ...

            for (int j = 1; j <= charsInRow; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

        sc.close();
    }
}