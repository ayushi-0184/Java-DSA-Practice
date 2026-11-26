//WAP to print numbers between two given numbers.

package While_loop;

import java.util.Scanner;

public class Q06_Range {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter starting number: ");
        int start = sc.nextInt();

        System.out.println("Enter ending number: ");
        int end = sc.nextInt();

        System.out.println("Between Numbers are: ");
        int i = start;
        while(i <= end) {
            System.out.println(i); 
            i++;
        }

        sc.close();
    }
}
