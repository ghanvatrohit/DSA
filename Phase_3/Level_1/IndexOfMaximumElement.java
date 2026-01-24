package Phase_3.Level_1;
import java.util.Scanner;

public class IndexOfMaximumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array = ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the "+n+" value = ");
        for(int i=0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int maxIndex = 0;

        for(int i=1 ; i<arr.length ;i++){
            if(arr[i]>max){
                max = arr[i];
                maxIndex = i;
            }
        }
        System.out.println("Maximum element is = "+maxIndex);
        sc.close();
    }
}
