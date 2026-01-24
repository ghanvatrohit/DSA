package Phase_3.Level_1;
import java.util.Scanner;

public class FindMinimumElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array = ");
        int n = sc.nextInt();

        int[] arr= new int[n];

        System.out.println("Enter "+n+" value");
        for(int i=0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        for(int i=0 ; i<arr.length ; i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        System.out.println("The smallest number is "+min);
        sc.close();
    }
}
