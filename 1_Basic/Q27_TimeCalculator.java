//WAP to Convert seconds into hours, minutes, and seconds

import java.util.*;

public class Q27_TimeCalculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.print("Enter Seconds: ");
        int total_seconds = sc.nextInt();

        //Logic
        int hours = (total_seconds / 3600);
        int remaining_minutes = (total_seconds % 3600);
        int minutes = (remaining_minutes / 60);
        int remaining_seconds = (total_seconds % 60);

        //Output
        System.out.println(hours + " Hours");
        System.out.println(minutes + " Minutes");
        System.out.println(remaining_seconds + " Seconds");

        sc.close();
    }
}
