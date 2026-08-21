//WAP to Find the power of a number (using multiplication only for now).

import java.util.*;

public class Q17_Power {
    public static void main(String args[]) {
        Scanner sc =  new Scanner(System.in);

        //Input
        System.out.print("Enter a number for exponent 2: ");
        double num = sc.nextDouble();

        //Logic
        double result = (num * num);

        //Output
        System.out.println("Power of " + num + " = " + result);

        sc.close();
    }
    
}
