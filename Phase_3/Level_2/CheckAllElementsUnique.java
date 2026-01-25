// 5. Check if all elements in an array are unique.
package Phase_3.Level_2;
import java.util.Scanner;

public class CheckAllElementsUnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array = ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("\nEnter the "+n+" value = ");
        for(int i=0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        boolean isUnique = true;

        for(int i=0 ; i<arr.length ; i++){
            for(int j=i+1 ; j<arr.length ; j++){
                if(arr[i]==arr[j]){
                    isUnique = false;
                }
            }
            if(!isUnique){
                break;
            }
        }

        if(isUnique){
            System.out.print("\nGive array are not unique");
        }else{
            System.out.print("\nGive array are unique");
        }
        sc.close();
    }
}
