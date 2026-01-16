// 4. Print numbers between 1–100 whose digits add up to a multiple of 3.
package Phase_2.Level_4;

public class PrintNumbersWithDigitSumMultipleOf3 {
    public static void main(String[] args) {
        for(int i=1 ; i<100 ; i++){
            int d1= i%10;
            int d2=i/10;
            int sum=d1 + d2;
            if(sum%3==0){
                System.out.println(i);
            }
        }
    }
}
