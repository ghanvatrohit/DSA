// 1. Take a character and check if it is a letter, a digit, or niether
package Phase_1.Level_4;
import java.util.Scanner;
public class CheckCharacterTypeLevel4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character :- ");
        char ch = sc.next().charAt(0);

        if(ch>='a'&& ch<='z'|| ch>='A' && ch<='Z'){
            System.out.println("The given character is LETTER");
        }else if(ch>='0' && ch<='9' ){
            System.out.println("THe given number is DIGIT");
        }else{
            System.out.println("The character is NEITHER a letter nor a digit");
        }
        sc.close();
    }
}
