//WAP to check whether a number lies between two given numbers.

package If_Else;

import java.util.Scanner;

public class Q29_NumberBetweenTwoNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.println("Enter first number: ");
        int x = sc.nextInt();
        System.out.println("Enter second number: ");
        int y = sc.nextInt();
        System.out.println("Enter that number which you want to check");
        int n = sc.nextInt();
        
        //Logic and Output
        if((n >= y && n <= x) || (n >= x && n <= y)) {
            System.out.println("This number lies between these two numbers");
        } else {
            System.out.println("This number does not lies between these two numbers");
        }

        sc.close();
    }
}
