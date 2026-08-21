
//WAP to Find quotient and remainder

import java.util.*;

public class Q11_QuotientRemainder {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.print("Enter a Divident: ");
        int divident = sc.nextInt();
        System.out.print("Enter Divisor: ");
        int divisor = sc.nextInt();

        //Logic
        int quotient = (divident / divisor);
        int remainder = (divident % divisor);

        //Output
        System.out.println("Quoitent: " + quotient);
        System.out.println("Remainder: " + remainder);

        sc.close();
    }    
}
