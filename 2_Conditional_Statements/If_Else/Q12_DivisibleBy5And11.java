//WAP to check whether a number is divisible by both 5 and 11

package If_Else;

import java.util.Scanner;

public class Q12_DivisibleBy5And11 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        //Input
        System.out.print("Enter any number: ");
        int num = sc.nextInt();

        //Logic & Output
        if(num % 5 == 0 && num % 11 == 0) {
            System.out.print(num + " is divisible by 5 and 11");
        } else {
            System.out.print(num + " is not divisible by 5 and 11");
        }

        sc.close();
    }
}
