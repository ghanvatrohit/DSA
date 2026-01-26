package Phase_3.Level_2;

import java.util.Scanner;

public class CountPrimeNumbersInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array = ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("\nEnter the " + n + " value = ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int primeCount = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];

            if(num<=1){
                continue;
            }

            boolean isPrime = true;

            for(int j=2 ; j<num-1 ; j++){
                if(num%j==0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                primeCount++;
            }
        }
        System.out.println("Total prime numbers = " + primeCount);
        sc.close();
    }
}
