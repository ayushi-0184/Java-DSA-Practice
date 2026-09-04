/* WAP to Assign grades based on percentage:
90-100 → A
80-89 → B
70-79 → C
60-69 → D
Below 60 → F */

package If_Else;

import java.util.Scanner;

public class Q17_GradeCalculator {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter your percentage: ");
        float percentage = sc.nextFloat();

        // Logic and Output
        if (percentage >= 90 && percentage <= 100) {
            System.out.println("Grade A");
        } 
        else if (percentage >= 80) {
            System.out.println("Grade B");
        } 
        else if (percentage >= 70) {
            System.out.println("Grade C");
        } 
        else if (percentage >= 60) {
            System.out.println("Grade D");
        } 
        else if (percentage >= 0) {
            System.out.println("Grade F");
        } 
        else {
            System.out.println("You entered a wrong percentage");
        }

        sc.close();
    }
}