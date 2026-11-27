//WAP to print the first N natural numbers.

package While_loop;

import java.util.Scanner;

public class Q07_NaturalNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int n = sc.nextInt();

        System.out.println("Natural Numbers are: ");
        int i = 1;
        while(i <= n) {
            System.out.println(i);
            i++;
        }

        sc.close();
    }
}
