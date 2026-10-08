//WAP to print first n natural numbers

package Do_While_Loop;

import java.util.Scanner;

public class Q07_NaturalNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.println("Enter any number: ");
        int n = sc.nextInt();

        //Logic & Output
        System.out.println("Printing first n natural numbers using a do-while loop: ");
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while(i <= n);
    
        sc.close();
    }
}
