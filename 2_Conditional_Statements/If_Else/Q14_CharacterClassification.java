//WAP to check whether a character is an alphabet, digit, or special character.

package If_Else;

import java.util.Scanner;

public class Q14_CharacterClassification {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.print("Enter any character: ");
        char ch = sc.next().charAt(0);

        //Logic and Output
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.print(ch + " is an alphabet character");
        } else if(ch >= 0 || ch <= 9) {
            System.out.print(ch + " is a digit character");
        } else {
            System.out.print(ch + " is a special character");
        }

        sc.close();
    }
}
