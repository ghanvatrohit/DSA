// 10. Take a password string and check basic rules

package Phase_1.Level_4;

import java.util.Scanner;

public class CheckPasswordValidity {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the password = ");
        String pass = sc.nextLine();

        boolean hasDigit = false;

        if (pass.length() >= 8) {

            for (int i = 0; i < pass.length(); i++) {
                char ch = pass.charAt(i);

                if (ch >= '0' && ch <= '9') {
                    hasDigit = true;
                    break;
                }
            }

            if (hasDigit) {
                System.out.println("Password is valid");
            } else {
                System.out.println("Password must contain at least one digit");
            }

        } else {
            System.out.println("Password must be at least 8 characters long");
        }

        sc.close();
    }
}
