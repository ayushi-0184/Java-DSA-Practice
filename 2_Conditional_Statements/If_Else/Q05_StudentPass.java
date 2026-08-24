//WAP to check whether a student has passed (pass marks = 40).

package If_Else;

import java.util.Scanner;

public class Q05_StudentPass {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        //Input
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        //Logic
        if(marks >= 40) {
            System.out.println("You are pass");
        } else {
            System.out.println("You are fail");
        }

        sc.close();
    }
}
