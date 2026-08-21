//WAP to find Compound Interest

import java.util.*;

public class Q18_CompoundInterest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.print("Enter Principal Amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();
        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();

        //Logic
        double amount = principal * Math.pow((1 + rate / 100),time);
        double compund_interest = amount - principal;
        
        //Output
        System.out.println("Amount = " + amount);
        System.out.println("Compund Interest = " + compund_interest);

        sc.close();
    }   
}
