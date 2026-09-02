//WAP to calculate electricity bill based on units consumed

package If_Else;

import java.util.Scanner;

public class Q16_ElectricityBillCalculation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.println("Enter units consumed: ");
        int units = sc.nextInt();

        //Logic and Output
        if(units <= 100) {
            System.out.println("Electricity Bill of "+ units + " units: " +(units*5));
        } else if (units <= 200){
            System.out.println("Electricity Bill of "+ units + " units: " +(units*7));
        } else {
            System.out.println("Electricity Bill of "+ units + " units: " +(units*10));
        }

        sc.close();
    }    
}
