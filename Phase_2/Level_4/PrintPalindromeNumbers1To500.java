package Phase_2.Level_4;

public class PrintPalindromeNumbers1To500 {
    public static void main(String[] args) {

        for (int i = 1; i <= 500; i++) {

            int original = i; // keep original number safe
            int temp = i; // copy for reversing
            int reverse = 0; // reset for each number

            while (temp > 0) {
                int digit = temp % 10;
                reverse = reverse * 10 + digit;
                temp = temp / 10;
            }

            if (original == reverse) {
                System.out.print(original + " ");
            }
        }
    }
}
