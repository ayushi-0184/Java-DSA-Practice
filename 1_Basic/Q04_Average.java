//WAP to print average of 3 numbers

import java.util.*;

public class Q04_Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.print("Enter First Number: ");
        int x = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int y = sc.nextInt();
        System.out.print("Enter Third Number: ");
        int z = sc.nextInt();
        int avg;

        //Logic
        avg = ((x+y+z)/3);

        //output
        System.out.println("Average of # numbers is: " + avg);

        sc.close();
    }
}
