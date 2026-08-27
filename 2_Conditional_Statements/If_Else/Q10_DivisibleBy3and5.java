//WAP to check whether a number is divisible by both 3 and 5.

package If_Else;

import java.util.Scanner;

public class Q10_DivisibleBy3and5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        //Input
        System.out.print("Enter any number: ");
        int num = sc.nextInt();

        //logic and Output
        if( num % 5 == 0 && num % 3 == 0) {
            System.out.println(num + " is divisible by 3 and 5");
        }else {
            System.out.println(num + " is not divisible by 3 and 5");
        }

        sc.close();
    }    
}
