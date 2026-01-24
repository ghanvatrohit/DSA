package Phase_3.Level_1;

import java.util.Scanner;

public class FindMaximumElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array = ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " value.");
        for (int i = 0; i <arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int large = arr[0];
        
        for (int i = 0; i < arr.length; i++) {
            if (large<arr[i]) {
                large = arr[i];
            }
        }
        System.out.println("Large number is = "+ large);
        sc.close();
    }
}
