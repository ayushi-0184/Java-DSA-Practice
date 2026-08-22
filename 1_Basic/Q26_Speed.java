//Calculate speed using distance and time

import java.util.*;

public class Q26_Speed {
    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);

        //Input 
        System.out.print("Enter Distance in metre: ");
        double distance = sc.nextDouble();
        System.out.print("Enter Time in seconds: ");
        double time = sc.nextDouble();

        //Logic
        double speed = distance / time;

        //Output
        System.out.println("Speed = " + speed);

        sc.close();
    }
    
}
