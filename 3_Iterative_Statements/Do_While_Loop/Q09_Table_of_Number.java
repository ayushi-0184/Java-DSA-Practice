//WAP to printthe table of number input by the user.

package Do_While_Loop;

import java.util.Scanner;

public class Q09_Table_of_Number {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int n = sc.nextInt();

        System.out.println("Table of " + n + ": ");
        int i = 1;
        do {
            System.out.println(i * n);
            i++;
        }while(i <= 10);
        
        sc.close();
    }
}
