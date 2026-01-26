package Phase_3.Level_2;
import java.util.Scanner;

public class SumOfOddElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the size of the array = ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("\nEnter the "+n+" value = ");
        for(int i=0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        int sumOdd = 0;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]%2!=0){
                sumOdd = sumOdd+arr[i];
            }
        }
        System.out.print("\nThe sum of odd elements = "+sumOdd);
        sc.close();
    }
}
