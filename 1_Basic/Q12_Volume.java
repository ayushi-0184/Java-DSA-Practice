//WAP to Calculate the volume of a cube and cuboid.
//WAP to Calculate the volume of a cylinder.
//WAP toC alculate the volume of a sphere.

import java.util.*;

public class Q12_Volume {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Volume of cube
        System.out.print("Enter the value of side: ");
        int side = sc.nextInt();
        //output
        System.out.println("Volume of Cube: " + (side * side * side));

        //volume of cuboid
        System.out.print("Enter the value of length: ");
        int l = sc.nextInt();
        System.out.print("Enter the value of width: ");
        int w = sc.nextInt();
        System.out.print("Enter the value of height: ");
        int h = sc.nextInt();
        //Output
        System.out.println("Volume of Cuboid: " + (l * w * h));

        //Volume of Cylinder
        System.out.print("Enter the value of radius of circular base: ");
        double r = sc.nextDouble();
        System.out.print("Enter the value of height of cylinder: ");
        double h1 = sc.nextDouble();
        //Output
        System.out.println("Volume of Cylinder: " + (Math.PI * r * r * h1));

        //Volume of Sphere
        System.out.println("Volume of Sphere:  " + ((4.0/3.0) * (Math.PI * r * r * r)));

        sc.close();

    }   
}