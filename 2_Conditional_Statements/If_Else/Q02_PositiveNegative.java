//WAP to Check whether a number is positive or negative

package If_Else;

import java.util.Scanner;

public class Q02_PositiveNegative {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        //Input
        System.out.println("Enter any number: ");
        int num = sc.nextInt();

        //Logic & Output
        if(num > 0) {
            System.out.println(num + " is a positive number");
        } else if(num < 0) {
            System.out.println(num + " is a negative number");
        } else {
            System.out.println(num + " is zero" );
        }

        sc.close();
    }
}
