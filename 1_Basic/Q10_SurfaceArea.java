//WAP to Calculate the surface area of a cube.
//WAP to Calculate the surface area of a cuboid.
//WAP to Calculate the surface area of a sphere.
//WAP to Calculate the surface area of a ccylinder.

import java.util.*;

public class Q10_SurfaceArea {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Surface Area of Cube
        System.out.print("Enter the side of Cube: ");
        double a = sc.nextDouble();
        //Output
        System.out.println("Surface Area of Cube: " + (6 * a * a));

        //Surface Area of Cuboid
        System.out.print("Enter the value of length: ");
        double l = sc.nextDouble();
        System.out.print("Enter the value of width: ");
        double w = sc.nextDouble();
        System.out.print("Enter the value of breadth: ");
        double h = sc.nextDouble();
        //Output
        System.out.println("Surface Area of Cuboid: " + (2 * ((l * w) + (l * h) + (w * h))));
        
        //Surface Area of Cylinder
        System.out.print("Enter the radius: ");
        double r = sc.nextDouble();
        //Output
        System.out.println("Surface Area of Cylinder: " + ((2 * Math.PI * r * r) + (2 * Math.PI * r * h)));
        
        //Surface Area of Sphere
        //Output
        System.out.println("Surface Area of Sphere: " + (4 * Math.PI * r * r));

        sc.close();
    }
    
}
