// 3. Find the first occurrence of a given number
package Phase_3.Level_2;

import java.util.Scanner;

public class FirstOccurrenceOfElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array = ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the " + n + " value = ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the number to track first occurrence = ");
        int x = sc.nextInt();

        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("First occurrence at index " + index);
        } else {
            System.out.println("Element not found");
        }
        sc.close();
    }
}
