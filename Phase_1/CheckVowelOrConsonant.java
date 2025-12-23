// 9. Take a character and check if it’s a vowel or consonant.
package Phase_1;

import java.util.Scanner;

public class CheckVowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the character :- ");
        char ch = sc.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("The character is vowel");
        } else {
            System.out.println("The character is a consonant");
        }
        sc.close();
    }
}
