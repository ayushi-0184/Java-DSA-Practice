//WAP to print the table of number input by the user.

package While_loop;

import java.util.Scanner;

public class Q09_Table_of_Number {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int n = sc.nextInt();

        System.out.println("Table of " + n + ": ");
        int i = 1;
        while(i <= 10)
        {
            System.out.println(i * n);
            i++;
        }

        sc.close();
    }
}
