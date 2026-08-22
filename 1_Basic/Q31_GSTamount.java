//WAP to Calculate GST amount (18%)

import java.util.*;

public class Q31_GSTamount {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        //Logic
        double  gst = (amount * 0.18);
        double new_amount = amount + gst;

        //Output
        System.out.println("GST: " + gst);
        System.out.println("After adding GST: " + new_amount);

        sc.close();
    }
}
