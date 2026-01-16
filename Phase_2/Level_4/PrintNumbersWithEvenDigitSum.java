package Phase_2.Level_4;

public class PrintNumbersWithEvenDigitSum {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 100; i++) {
            int d1 = i % 10;
            int d2 = i / 10;
            sum = d1 + d2;
            if (sum % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
