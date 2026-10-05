//WAP to print numbers between two given numbers.

package Do_While_Loop;

import java.util.Scanner;

public class Q06_Range {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.println("Enter first number: ");
        int start = sc.nextInt();
        System.out.println("Enter second number: ");
        int end = sc.nextInt();
        
        //Logic and output
        int current = start;
        System.out.println("Printing range using a do-while loop: ");
        do {
            System.out.println(current); 
            current ++;
        }
        while(current <= end);

        sc.close();
    }   
}
