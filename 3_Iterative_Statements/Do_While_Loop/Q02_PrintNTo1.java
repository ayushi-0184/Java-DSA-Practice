
package Do_While_Loop;

import java.util.Scanner;

public class Q02_PrintNTo1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.println("Enter any number: ");
        int n = sc.nextInt();

        //Logic and Output
        int i = n;
        do {
            System.out.println(i);
            i--;
        } while(i >= 1);

     sc.close();
    }
    
}
