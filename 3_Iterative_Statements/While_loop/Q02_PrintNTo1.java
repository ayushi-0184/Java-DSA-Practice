//WAP to print N to 1 numbers

package While_loop;

import java.util.Scanner;

public class Q02_PrintNTo1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.println("Enter any number: ");
        int n = sc.nextInt();

        //Logic and Output
        int i = n;
        while(i >= 1) {
            System.out.println(i);
            i--;
        }

        sc.close();
    }
    
}
