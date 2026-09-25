//WAP to determine admission eligibility based on marks in three subjects

package If_Else;

import java.util.Scanner;

public class Q34_MarksBasedAdmission {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.println("Enter marks of first subject: ");
        double p = sc.nextDouble();
        System.out.println("Enter marks of second subject: ");
        double c = sc.nextDouble();
        System.out.println("Enter marks of third subject: ");
        double m = sc.nextDouble();

        double total = p+c+m;

        //Logic
        if(total > 190) {
            if (p >= 55 && c >= 50 && m >= 65) {
                System.out.println("The candidate is ELIGIBLE for admission");
            }else {
                System.out.println("The candidate is not ELIGIBLE for admission");
            }
        } else {
            System.out.println("The candidate is not ELIGIBLE for admission");
        }

        sc.close();
    }
    
}
