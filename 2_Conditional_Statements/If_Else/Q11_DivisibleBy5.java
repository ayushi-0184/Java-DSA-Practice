//WAP to check whether a number is divisible by 5.

package If_Else;

import java.util.Scanner;

public class Q11_DivisibleBy5 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        //Input
        System.out.print("Enter any number: ");
        int num = sc.nextInt();

        //Logic
        int lastDigit = num % 10; 
        if(lastDigit == 0 || lastDigit == 5) {
            System.out.print(num + " is divisible by 5");
        } else {
            System.out.print(num + " is not divisible by 5");
        }

        sc.close();
    }
}
