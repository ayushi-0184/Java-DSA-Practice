//WAP to identify the type of triangle (Equilateral, Isosceles, Scalene).

package If_Else;

import java.util.Scanner;

public class Q26_IdentiffyTriangleType {
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
        if ( a == b && b == c) {
            System.out.println("This is a Equilateral Triangle");
        } else if ( a == b || b == c|| a == c) {
            System.out.println("This is a Isosceles Triangle");
        } else {
            System.out.println("This is a Scalene Triangle");
        }

        sc.close();
    }    
}
