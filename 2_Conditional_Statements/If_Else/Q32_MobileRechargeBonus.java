//WAP to calculate a mobile recharge bonus based on recharge amount
package If_Else;

import java.util.Scanner;

public class Q32_MobileRechargeBonus {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter mobile recharge amount: ");
        int amount = sc.nextInt();

        // Logic and Output
        if (amount >= 1000) {
            System.out.println("Bonus = Rs.100");
        } else if (amount >= 500) {
            System.out.println("Bonus = Rs.50");
        } else {
            System.out.println("Bonus = Rs.0");
        }

        sc.close();
    }
}