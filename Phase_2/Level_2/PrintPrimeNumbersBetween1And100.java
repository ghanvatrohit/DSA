// 7. Print all prime numbers between 1 and 100
package Phase_2.Level_2;

public class PrintPrimeNumbersBetween1And100 {
    public static void main(String[] args) {

        for (int num = 2; num <= 100; num++) {   // outer loop: numbers to check
            boolean isPrime = true;

            for (int i = 2; i <= num / 2; i++) { // inner loop: divisor check
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}


// option 2
// for (int num = 2; num <= 100; num++) {
//     int count = 0;

//     for (int i = 1; i <= num; i++) {
//         if (num % i == 0) {
//             count++;
//         }
//     }

//     if (count == 2) {
//         System.out.print(num + " ");
//     }
// }
