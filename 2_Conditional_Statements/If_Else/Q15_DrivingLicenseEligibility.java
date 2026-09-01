//WAP to check a person is eligible for a driving license.

package If_Else;

import java.util.Scanner;

public class Q15_DrivingLicenseEligibility {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        //Input
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        //Logic and Output
        if(age >= 18) {
            System.out.print("You are eligible for a driving license");
        } else {
            System.out.print("You are not eligible for a driving license");
        }

        sc.close();
    }
}
