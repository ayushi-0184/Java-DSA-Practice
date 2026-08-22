
//WAP to convert km to m and m to cm

import java.util.*;

public class Q23_DistanceUnitConversion {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.print("Enter the value of km: ");
        double km = sc.nextDouble();
        System.out.print("Enter the value of cm: ");
        double cm = sc.nextDouble();

        //Logic
        double metre = (km * 1000);
        double m = (cm * 10);

        //Output
        System.out.println("Convert Km to m: " + metre);
        System.out.println("Convert cm to m: " + m);

        sc.close();

    }   
}
