//WAP to print multiples of 5 from print N to 1.

package While_loop;

import java.util.Scanner;

public class Q04_MultiplesOf5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.println("Enter any number: ");
        int n = sc.nextInt();

        //Logic and Output
        int i = n;
        while(i >= 1) {
            if(i % 5 == 0) {
                System.out.println(i);
            }
            i--;
        }

        sc.close();
    }
}
