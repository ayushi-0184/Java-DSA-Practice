//WAP to check whether a character is a vowel using switch

package Switch;

import java.util.Scanner;

public class Q6_CheckVowel {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.println("Enter the character: ");
        char ch = sc.next().charAt(0);

        //Logic and Output
        switch(ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Vowel");
                break;

            default: System.out.println("Not a vowel");   
        }

        sc.close();
    }
}
