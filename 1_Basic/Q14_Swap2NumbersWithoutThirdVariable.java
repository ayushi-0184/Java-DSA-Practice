//WAP to Swap 2 numbers without third variables and Addition & Subtraction

import java.util.*;

public class Q14_Swap2NumbersWithoutThirdVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.print("Enter Your First Number: ");
        int x = sc.nextInt();
        System.out.print("Enter Your Second Number: ");
        int y = sc.nextInt();

        //Logic
        x=x+y;
        y=x-y;
        x=x-y;

        //Output
        System.out.println("After Swapping");
        System.out.println("First Number: " + x);
        System.out.println("Second Number: " + y);

        sc.close();        
    }
}
