//WAP to find the smallest of three numbers

package If_Else;

import java.util.Scanner;

public class Q03_SmallestOfThreeNumbers {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        //Input
        System.out.print("Enter first Number:");
        int x = sc.nextInt();
        System.out.print("Enter second Number:");
        int y = sc.nextInt();
        System.out.print("Enter third Number:");
        int z = sc.nextInt();

        //Logic and output
        if(x <= y && x <= z) {
            System.out.println(x + " is a smallest number");
        }else if(y <= x && y <= z) {
            System.out.println(y + " is a smallest number");
        }else {
            System.out.println(z + " is a smallest number");
        }
        sc.close();
    }    
}
