// WAP to print 1 to 10 numbers

package While_loop;

import java.util.Scanner;

public class Q01_Print1To10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.println("Enter any number: ");
        int n = sc.nextInt();

        //Logic & Output
        int i = 1;
        while(i <= n) {
            System.out.println(i);
            i=i+1;
        }

        sc.close();
    }
    
}
