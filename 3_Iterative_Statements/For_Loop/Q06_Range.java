//WAP to print numbers between two given numbers.

// WAP to print numbers between two given numbers.

package For_Loop;

import java.util.Scanner;

public class Q06_Range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter starting number: ");
        int start = sc.nextInt();

        System.out.println("Enter ending number: ");
        int end = sc.nextInt();

        // Logic and Output
        for(int i = start; i <= end; i++) {
            System.out.println(i);
        }

        sc.close();
    }
}