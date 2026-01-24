// 1. Input an element x — check if it exists in the array.
package Phase_3.Level_2;

import java.util.Scanner;

public class SearchElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of array = ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("\nEnter the " + n + " Element.");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("\nEnter the element to check exist or not = ");
        int x = sc.nextInt();
        boolean isPresent = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                isPresent = true;
                break;
            }
        }

        if (isPresent) {
            System.out.println(x + " is present in the array");
        } else {
            System.out.println(x + " is Not present in the array");

        }
        sc.close();
    }
}
