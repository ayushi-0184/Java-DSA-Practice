//WAP to find the middle number among three

package If_Else;

import java.util.Scanner;

public class Q28_MiddleNumberOfThree {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.println("Enter first number: ");
        int x = sc.nextInt();
        System.out.println("Enter second number: ");
        int y = sc.nextInt();
        System.out.println("Enter third number: ");
        int z = sc.nextInt();
        int middle;

        //Logic and Output
        if((x <= y && y <= z) || (z <= y && y <= x)) {
            middle = y;
            System.out.println("Middle Number: " + middle);
        } else if((y <= x && x <= z) || (z <= x && x <= y)) {
            middle = x;
            System.out.println("Middle Number: " + middle);
        } else {
            middle = z;
            System.out.println("Middle Number: " + middle);
        }
        
        sc.close();
    }
}
