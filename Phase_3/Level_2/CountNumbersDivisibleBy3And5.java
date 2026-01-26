package Phase_3.Level_2;
import java.util.Scanner;

public class CountNumbersDivisibleBy3And5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array = ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the "+n+" value = ");
        for(int i=0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        int count = 0;
        for(int i=0 ; i<arr.length ; i++){
            if((arr[i]%3==0)&&(arr[i]%5==0)){
                count++;
            }
        }
        System.out.print("The count of divisible by 3 & 5 in array = "+count);
        sc.close();
    }
}
