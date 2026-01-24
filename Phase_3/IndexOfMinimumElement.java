package Phase_3;
import java.util.Scanner;

public class IndexOfMinimumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array = ");
        int n = sc.nextInt();

        int[] arr= new int[n];

        System.out.println("Enter the "+n+" value = ");
        for(int i=0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        int minIndex = 0;
        for(int i=1 ; i<arr.length ; i++){
            if(min>arr[i]){
                min = arr[i];
                minIndex = i;
            }
        }
        System.out.println("The minimum element index is "+minIndex);
        sc.close();
    }
}
