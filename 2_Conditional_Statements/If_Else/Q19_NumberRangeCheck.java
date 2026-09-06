//WAP to check whether a number is within a given range.

package If_Else;

import java.util.Scanner;

public class Q19_NumberRangeCheck {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.print("Enter your nummber: ");
        int num = sc.nextInt();
        System.out.print("Enter lower: ");
        int lower = sc.nextInt();
        System.out.print("Enter upper: ");
        int upper = sc.nextInt();

        //Logic ad Output
        if(num >= lower && num <= upper) {
            System.out.println(num + " number is within the range");
        } else {
            System.out.println(num + " number is Outside the range");
        }
        
        sc.close();
    }    
}
