//WAP to print Arithmetic Operators

import java.util.*;

public class Q03_ArithmeticOperations {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.print("Enter Your First Number: ");
        int x = sc.nextInt();
        System.out.print("Enter Your Second Number: ");
        int y = sc.nextInt();
        
        //Output
        System.out.println("Addition: " + (x+y));
        System.out.println("Subtraction: " + (x-y));
        System.out.println("Multiplication: " + (x*y));
        System.out.println("Division: " + (x/y));
        System.out.println("Modulo: " + (x/y));

        sc.close();

    }
}
