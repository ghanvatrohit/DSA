package Phase_3.Level_1;
import java.util.Scanner;

public class CountPositiveNegativeAndZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array = ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the "+n+" value");
        for(int i=0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        int poscount = 0;
        int negcount = 0;
        int zerocount = 0;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]<0){
                negcount++;
            }else if(arr[i]==0){
                zerocount++;
            }else if(arr[i]>0){
                poscount++;
            }
        }
        System.out.println("Total Positive number is "+poscount);
        System.out.println("Total Negative number is "+negcount);
        System.out.print("Total Zero number is "+zerocount);
        sc.close();
    }
}
