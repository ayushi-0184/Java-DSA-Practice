//WAP to find area of rectangle, square, triangle, circle, cube, parallelogram and rhombus.

import java.util.*;

public class Q07_Area {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Area of Rectangle
        System.out.print("Enter the value of length: ");
        double l = sc.nextDouble();
        System.out.print("Enter the value of breadth: ");
        double b = sc.nextDouble();
        //Output
        System.out.println("Area of Rectangle: " + " " + (l*b));
        
        //Area of Square
        System.out.print("Enter the value of side: ");
        double side = sc.nextDouble();
        //Output
        System.out.println("Area of Square: " + " " + (side*side));

        //Area of Triangle
        System.out.print("Enter the value of triangle's base: ");
        double base = sc.nextDouble();
        System.out.print("Enter the value of triangle's height: ");
        double height = sc.nextDouble();
        //Output
        System.out.println("Area of Triangle: " + " " + (0.5*base*height));

        //Area of Circle
        System.out.print("Enter the value of radius: ");
        double r = sc.nextDouble();
        //Output
        System.out.println("Area of Circle: " + " " + (3.14*r*r));

        //Area of Cube
        System.out.print("Enter the valuse of cube'side: ");
        double c = sc.nextDouble();
        //output
        System.out.println("Area of Cube: " + (6 * c * c));

        //Area of Parallelogram
        System.out.print("Enter the value of base of parellelogram: ");
        int base1 =sc.nextInt();
        System.out.print("Enter the value of perpendicular of height: ");
        int h = sc.nextInt();
        //Output
        System.out.println("Area of Parallelogram: " + (base1 * h));

        //Area of Rhombus
        System.out.print("Enter the length of first diagonal (d1): ");
        int d1 = sc.nextInt();
        System.out.print("Enter the length of second diagonal (d2): ");
        int d2 = sc.nextInt();
        //Output
        System.out.println("Area of Rhombus: " + ((d1 *d2) / 2));

        sc.close();
    }
    
}
