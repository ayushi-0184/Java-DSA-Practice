
//WAP to Convert minutes into hours and minutes

import java.util.*;

public class Q28_TimeConversion {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Inout
        System.out.print("Enter minutes: ");
        int minutes = sc.nextInt();

        //Logic
        int hours = (minutes / 60);
        int remaining_minutes = (minutes % 60);

        //Output
        System.out.println("Convert minutes into hours: " + hours);
        System.out.println("Remaining Minutes: " + remaining_minutes);
        System.out.println(minutes + " minutes = " + hours + " Hours and " + remaining_minutes + " Minutes");

        sc.close();
    }
    
}
