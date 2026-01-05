// 2. Print all even numbers between 1 and 100.
package Phase_2.Level_1;

public class PrintEvenNumbers1To100 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i+", ");
            }
        }
    }
}
