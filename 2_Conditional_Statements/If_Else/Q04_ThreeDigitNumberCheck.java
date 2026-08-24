//WAP to check whether a number is a three-digit number

package If_Else;

import java.util.Scanner;

public class Q04_ThreeDigitNumberCheck {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.print("Enter your number: ");
        int num = sc.nextInt();

        //Logic and Output
        if((num >= -999 && num <= -100) || (num >= 100 && num <= 999)) {
            System.out.println("Number is a three-digit number");
        }else {
            System.out.println("Number is not a three-digit number");
        }

        sc.close();
    }    
}
