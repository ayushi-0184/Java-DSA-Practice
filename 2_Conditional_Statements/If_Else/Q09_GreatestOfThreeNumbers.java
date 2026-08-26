//WAP to find the largest of three numbers

package If_Else;

import java.util.*;

public class Q09_GreatestOfThreeNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.println("Enter First Number: ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int b = sc.nextInt();
        System.out.println("Enter Third Number: ");
        int c = sc.nextInt();

        //Logic & output
        if(a>=b && a>=c) {
            System.out.println(a + " is greatest number");
        } else if(b>=a && b>=c) {
            System.out.println(b + " is greatest number");
        } else {
            System.out.println(c + " is greatest number");
        } 
        sc.close();
    }
}
