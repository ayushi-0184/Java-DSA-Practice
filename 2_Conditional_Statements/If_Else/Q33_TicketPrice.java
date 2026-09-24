//WAP to determine ticket price based on age.

package If_Else;

import java.util.Scanner;

public class Q33_TicketPrice {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        //Logic & Output
        if(age <= 0) {
            System.out.println("Invalid age entered.");
        } else if (age <= 5) {
            System.out.println("Ticket Price = Rs.0.0");
        } else if (age <= 12) {
            System.out.println("Ticket Price = Rs.10.0");
        } else if (age <= 60) {
            System.out.println("Ticket Price = Rs.20.0");
        } else {
            System.out.println("Ticket Price = Rs.15.0");
        }

        sc.close();
    }
    
}
