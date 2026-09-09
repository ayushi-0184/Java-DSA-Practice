//WAP to find the largest of four numbers.  

package If_Else;

import java.util.Scanner;

public class Q22_LargestOfFourNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();
        System.out.print("Enter forth number: ");
        int d = sc.nextInt();

        //Logic and Output
        if(a >= b && a >= c && a >=d) {
            System.out.println(a + " is greatest");
        } else if(b >= a && b >= c && b >=d) {
            System.out.println(b + " is greatest");
        } else if(c >= a && c >= b && c >=d) {
            System.out.println(c + " is greatest");
        } else {
            System.out.println(d + " is greatest");
        }
        sc.close();
    }
}
