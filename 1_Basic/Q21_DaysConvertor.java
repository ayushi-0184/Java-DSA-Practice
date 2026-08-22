//WAP to Convert total days into weeks and remaining days.

import java.util.*;

public class Q21_DaysConvertor {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.print("Enter total number of days: ");
        int days = sc.nextInt();
        
        //Logic
        int weeks = (days / 7);
        int remaining_days = (days % 7);

        //Output
        System.out.println("Convert Days into Weeks: " + weeks);
        System.out.println("Remaining days: " + remaining_days);
        System.out.println(days + " Days = " + weeks + " Weeks and " + remaining_days + " Days");

        sc.close();
    }    
}
