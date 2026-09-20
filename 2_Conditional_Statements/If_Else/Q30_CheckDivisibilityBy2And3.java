//WAp to check whether a number is divisible by 2, 3, both, or neither.

package If_Else;

import java.util.Scanner;

public class Q30_CheckDivisibilityBy2And3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.println("Enter any number: ");
        int n = sc.nextInt();

        //Logic and Output
        if(n % 2 == 0 && n % 3 == 0) {
            System.out.println("Divisible by 2 and 3");
        } else if(n % 2 == 0) {
            System.out.println("Divisible by 2");
        } else if(n % 3 == 0) {
            System.out.println("Divisible by 3");
        } else {
            System.out.println("Neither divisible by 2 nor 3");
        }

        sc.close();
    }
}
