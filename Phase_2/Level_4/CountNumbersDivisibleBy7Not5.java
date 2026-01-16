package Phase_2.Level_4;

public class CountNumbersDivisibleBy7Not5 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 500; i++) {
            if (i % 7 == 0 && i % 5 != 0) {
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println("\nTotal count = " + count);
    }
}
