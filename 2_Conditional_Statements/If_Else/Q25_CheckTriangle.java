//WAP to check whether three sides can form a triangle.

package If_Else;

import java.util.Scanner;

public class Q25_CheckTriangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.println("Enter first side of a triangle: ");
        float a = sc.nextFloat(); 
        System.out.println("Enter second side of a triangle: ");
        float b = sc.nextFloat();
        System.out.println("Enter third side of a triangle: ");
        float c = sc.nextFloat();

        //Logic and Output
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Valid Triangle");
        } else {
            System.out.println("Invalid Triangle");
        }
        
        sc.close();
    }    
}
