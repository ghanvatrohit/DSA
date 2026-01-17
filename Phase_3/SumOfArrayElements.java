package Phase_3;
import java.util.Scanner;

public class SumOfArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input size of array
        System.out.print("Enter the size of array = ");
        int n = sc.nextInt();

        // // create array of size n
        int[] arr = new int[n];

        // // take input for array elements
        System.out.println("Enter "+n+" value = ");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        // calculate sum of array elements
        int sum = 0;
        for(int i=0; i<arr.length ; i++){
            sum = sum + arr[i];
        }
        System.out.print("Sum of array elements = "+sum);


        sc.close();
    }
}
