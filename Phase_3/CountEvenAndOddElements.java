// 7. Count how many elements are even and odd.
package Phase_3;

import java.util.Scanner;

public class CountEvenAndOddElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array = ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the " + n + " value = ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else if (arr[i] % 2 != 0) {
                oddCount++;
            }
        }
        System.out.println("Total Even values = " + evenCount);
        System.out.println("Total Odd values = " + oddCount);

        sc.close();
    }
}
