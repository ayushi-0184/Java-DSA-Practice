//WAP to check whether a character is uppercase or lowercase.

package If_Else;

import java.util.Scanner; 
  
public class Q20_UpperLowerCase {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        //Input
        System.out.print("Enter any character: ");
        char ch = sc.next().charAt(0);

        //Logic & Output
        if(ch >=  'A' && ch <= 'Z') {
            System.out.print(ch + " is an uppercase character");
        } else if(ch >= 'a' && ch <= 'z') {
            System.out.print(ch + " is a lowercase character");
        } else {
            System.out.print(ch + " is not an alphabet");
        }

        sc.close();

    }
}
