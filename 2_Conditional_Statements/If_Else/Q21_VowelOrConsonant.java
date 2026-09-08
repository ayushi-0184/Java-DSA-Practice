//WAP to check whether a character is a vowel or consonant

package If_Else;

import java.util.Scanner;

public class Q21_VowelOrConsonant {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        //Input
        System.out.print("Enter any character: ");
        char ch = sc.next().charAt(0);

        //Logic & output
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {

                System.out.print(ch + " is a vowel");

            } else {
                System.out.print(ch + " is a consonant");
            }

        } else {
            System.out.print(ch + " is neither a vowel nor a consonant");
        }
        sc.close();
    }    
}
