// 4. Find the last occurrence of a given number.
package Phase_3.Level_2;

import java.util.Scanner;

public class LastOccurrenceOfElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array = ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the " + n + " value = ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the tracking number = ");
        int x = sc.nextInt();

        int lastOccur = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                lastOccur = i;
            }
        }

        if (lastOccur != -1) {
            System.out.println("The last occurrence of given number is = " + lastOccur);
        } else {
            System.out.println("Element not found");
        }

        sc.close();
    }
}
