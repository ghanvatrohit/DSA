// 4. Replace all even numbers with 1 and all odd with 0.
package Phase_3.Level_3;
import java.util.Scanner;

public class ReplaceEvenOddWithOneZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array = ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the "+n+" value");
        for(int i=0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]%2==0){
                arr[i]=1;
            }else{
                arr[i]=0;
            }
        }

        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
