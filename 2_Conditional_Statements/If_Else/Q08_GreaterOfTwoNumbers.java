//WAP to find the greater of two numbers.

package If_Else;

import java.util.Scanner;

public class Q08_GreaterOfTwoNumbers {
    public static void main(String args[]){

        Scanner sc =new Scanner(System.in);

        //Input
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();

        //Logic
        if(a > b) {
            System.out.print(a + " is greater than " + b);
        } else if(b > a) {
            System.out.print(b + " is greater than " + a);
        }else {
            System.out.print(a + " is equal to " + b);
        }
        sc.close();
    }
}
