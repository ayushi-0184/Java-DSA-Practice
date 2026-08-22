//WAP to Calculate discount on a product and final bill after discount

import java.util.*;

public class Q22_DiscountOnProduct {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();
        System.out.print("Enter Discount: ");
        double discount = sc.nextDouble();

        //Logic
        double discount_amount = amount * (discount / 100);
        double new_amount = amount - discount_amount;

        //Output
        System.out.println("Discount Amount is: " + discount_amount);
        System.out.println("Final bill after discount: " + new_amount);

        sc.close();
    }
}
