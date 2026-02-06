package Phase_3.Level_3;
import java.util.Scanner;
import java.util.Arrays;

public class EvenElementsArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array = ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the "+n+" value = ");
        for(int i=0 ; i<arr.length ; i++){
            arr[i]= sc.nextInt();
        }

        int count = 0;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]%2==0){
                count++;
            }
        }

        int[] arrEv = new int[count];

        int j = 0 ;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]%2==0){
                arrEv[j] = arr[i];
                j++;
            }
        }
        System.out.println("New array with Even element = ");
        System.out.println(Arrays.toString(arrEv));
        sc.close();
    }
}
