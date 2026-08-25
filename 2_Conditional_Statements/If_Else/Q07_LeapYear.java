//WAP to check whether a year is a leap year.

package If_Else;

import java.util.Scanner;

public class Q07_LeapYear {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        //Input
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        //logic and output
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.print(year + " is a leap year");
        } else {
            System.out.print(year + " is not a leap year");
        }

        sc.close();
    }
}
