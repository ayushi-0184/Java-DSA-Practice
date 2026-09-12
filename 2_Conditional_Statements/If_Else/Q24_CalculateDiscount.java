//WAP to calculate discount based on purchase amount.

package If_Else;

import java.util.Scanner;

public class Q24_CalculateDiscount {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.print("Enter purchase amount: ");
        int amount = sc.nextInt();

        //Logic and Output
        if (amount < 0) {
            System.out.println("Invalid Amount");
        } else if(amount <= 999) {
            System.out.println("No Discount");
        } else if (amount <= 4999) {
            System.out.println("10 % Discount");
        } else if (amount <= 9999) {
            System.out.println("20 % Discount");
        } else {
            System.out.println("30 % Discount");
        }

        sc.close();
    }    
}