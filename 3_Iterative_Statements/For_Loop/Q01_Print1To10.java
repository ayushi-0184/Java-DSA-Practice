// WAP to print 1 to 10 numbers
package For_Loop;

import java.util.Scanner;

public class Q01_Print1To10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.println("Enter any number: ");
        int n = sc.nextInt();

        //Logic & Output
        for(int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        sc.close();
    }
}