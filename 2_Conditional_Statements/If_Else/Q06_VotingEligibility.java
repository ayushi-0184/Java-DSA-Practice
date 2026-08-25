//WAP to check whether a person is eligible to vote.

package If_Else;

import java.util.Scanner;

public class Q06_VotingEligibility {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        //Input
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        //Logic and Output
        if(age >= 18) {
            System.out.print("You are eligible to vote");
        } else {
            System.out.print("You are not eligible to vote");
        }

        sc.close();
    }
}
