package Phase_1.Level_1;

import java.util.Scanner;

public class CheckCharacterType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the character :- ");
        char ch = sc.next().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lower case");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Upper case");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("Digit");
        } else {
            System.out.println("Special character");
        }
        sc.close();

    }
}
