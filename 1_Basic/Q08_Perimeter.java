
//WAP to find perimeter of rectangle, square, triangle and circle

import java.util.*;

public class Q08_Perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.print("Enter value of length: ");
        double l = sc.nextDouble();
        System.out.print("Enter the value of breadth: ");
        double b = sc.nextDouble();
        //Output
        System.out.println("Perimeter of Rectangle: " + " " + (2*(l+b)));

        //Input
        System.out.print("Enter the value of side: ");
        double side = sc.nextDouble();
        //Output
        System.out.println("Perimeter of Square: " + " " + (4*side));

        //Input
        System.out.print("Enter the value of first side of triangle: ");
        double first_s = sc.nextDouble();
        System.out.print("Enter the value of second side of triangle: ");
        double second_s = sc.nextDouble();
        System.out.print("Enter the value of third side of triangle: ");
        double third_s = sc.nextDouble();
        //Output
        System.out.println("Perimeter of Triangle: " + " " + (first_s+second_s+third_s));

        //Input
        System.out.print("Enter value of radius: ");
        double r = sc.nextDouble();     
        //Output
        System.out.println("Perimeter of Circle: " + " " + (2*3.14*r));

        sc.close(); 
    }   
}
