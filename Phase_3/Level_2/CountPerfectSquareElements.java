package Phase_3.Level_2;

import java.util.Scanner;

public class CountPerfectSquareElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the size of the array = ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("\nEnter the " + n + " number = ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];

            if (num >= 0) {
                int root = (int) Math.sqrt(num);
                if (root * root == num) {
                    count++;
                }
            }
        }

        System.out.println("Total count = " + count);
        sc.close();
    }
}
