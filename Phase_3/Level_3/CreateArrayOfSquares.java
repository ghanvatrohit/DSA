//1. Create a new array containing squares of all numbers.
package Phase_3.Level_3;
import java.util.Arrays;
import java.util.Scanner;

public class CreateArrayOfSquares {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array = ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the "+n+" value = ");
        for(int i=0 ; i<arr.length ; i++){
            arr[i]=sc.nextInt();
        }

        int[] newArr = new int[n];
        for(int i=0 ; i<arr.length ; i++){
            newArr[i] = arr[i]*arr[i];
        }
        System.out.println("Squared new array = ");
        System.out.print(Arrays.toString(newArr));
        sc.close();
    }
}
