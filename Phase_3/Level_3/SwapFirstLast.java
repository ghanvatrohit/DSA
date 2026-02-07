package Phase_3.Level_3;
import java.util.Scanner;

public class SwapFirstLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array = ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        int lastIndex = arr.length-1;
        int firstIndex = arr[0];
        arr[0] = arr[lastIndex];
        arr[arr.length-1] = firstIndex;

        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
