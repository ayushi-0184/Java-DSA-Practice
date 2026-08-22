


//WAP to Calculate electricity bill (without conditions, just multiplication).

import java.util.*;

public class Q24_ElectricityBill {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.print("Enter electricity units: ");
        double units = sc.nextDouble();
        System.out.print("Enter rate per unit: ");
        double rate = sc.nextDouble();

        //Logic
        double bill = (units * rate);

        //Output
        System.out.println("Electricity Bill: " + bill);

        sc.close();
    }
    
}
