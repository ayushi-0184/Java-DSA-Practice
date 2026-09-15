//WAP to find the second largest among three numbers.

package If_Else;

import java.util.Scanner; 

public class Q27_SecondLargestOfThree {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Enter third number: ");
        int c = sc.nextInt();

        //Logic and Output
        if(a >= b && a >= c) {
            if(b >= c) {
                System.out.println("Second Greator Number : " + b);
            } else {
                System.out.println("Second Greator Number : " + c);
            }
        }else if(b >= a && b >= c) {
            if(a >= c) {
                System.out.println("Second Greator Number : " + a);
            } else {
                System.out.println("Second Greator Number : " + c);
            }
        }else if(c >= a && c >= b) {
            if(a >= b) {
                System.out.println("Second Greator Number : " + a);
            } else {
                System.out.println("Second Greator Number : " + b);
            }
        }else {
            System.out.println("Invalid");
        }

        sc.close();
    }
}
