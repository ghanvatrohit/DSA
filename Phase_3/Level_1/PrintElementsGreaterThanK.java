package Phase_3.Level_1;
import java.util.Scanner;

public class PrintElementsGreaterThanK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array = ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the "+n+" value = ");
        for(int i=0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("\nEnter the value of 'K' = ");
        int k = sc.nextInt();
        for(int i=0 ; i<arr.length ; i++){
            if(k<arr[i]){
                System.out.println(arr[i]+" is greater than "+k);
            }
        }
        sc.close();
    }
}
