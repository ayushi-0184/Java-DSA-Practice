//WAP to check whether a number is a multiple of 7

package If_Else;

import java.util.Scanner;

public class Q13_DivisibleBy7 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        //Input
        System.out.print("Enter any number: ");
        int num = sc.nextInt();

        //Logic & Output
        if ((num / 7) * 7 == num) {
            System.out.println(num + " is a multiple of 7");
        } else {
            System.out.println(num + " is not a multiple of 7");
        }

        sc.close();
    }   
}
