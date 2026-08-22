//WAP to Calculate monthly EMI (simple version). onl lofic explain

import java.util.*;

public class Q29_EMI {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Input 
        System.out.print("Enter Principal Amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();
        System.out.print("Enter time in years: ");
        double time = sc.nextDouble();
 
        //Logic
        double simple_interest = (principal * rate * time) / 100;
        double total_amount = principal + simple_interest;
        double total_months = (time * 12);
        double monthly_EMI = (total_amount / total_months);

        //Output
        System.out.println("Simple Interest: " + simple_interest);
        System.out.println("Total Amount: " + total_amount);
        System.out.println("Total Months: " + total_months);
        System.out.println("EMI: " + monthly_EMI);

        sc.close();
    }
}
