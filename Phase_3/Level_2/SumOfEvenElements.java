// 6. Find the sum of even elements only.
package Phase_3.Level_2;
import java.util.Scanner;

public class SumOfEvenElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array = ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.print("\nEnter the "+n+" value = ");
        for(int i=0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]%2==0){
                sum = sum + arr[i];
            }
        }
        System.out.print("Sum of the even elements = "+sum);
        sc.close();
    }
}
