//WAP to find Simple Interest

import java.util.*;

public class Q06_SimpleInterest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.print("Enter Principal: ");
        double principal = sc.nextDouble();
        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();
        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();

        //Logic
        double simple_interst = ((principal*rate*time)/100);

        //Output
        System.out.println("Simple Interest: " + " " + simple_interst);        

        sc.close();
    }
}