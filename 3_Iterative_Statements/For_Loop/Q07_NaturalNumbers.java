//WAP to print the first N natural numbers.

package For_Loop;

import java.util.Scanner;

public class Q07_NaturalNumbers {
    public static void main(String args[]) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter number: ");
        int n = sc.nextInt();

        System.out.println("Natural numbers are: ");
        for(int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        sc.close();
    }
}
