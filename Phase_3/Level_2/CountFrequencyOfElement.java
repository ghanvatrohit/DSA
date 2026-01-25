// 2. Count how many times a given element appears.
package Phase_3.Level_2;
import java.util.Scanner;

public class CountFrequencyOfElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array = ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("\nEnter the "+n+" value = ");
        for(int i=0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("\nWhich element to check how many times appear = ");
        int x = sc.nextInt();
        int count = 0;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]==x){
                count++;
            }
        }
        System.out.print("\nThe given element appears " + count + " times");
        sc.close();
    }
}