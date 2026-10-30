//WAP to print numbrs divisible by 3 from 1 to N

package While_loop;

import java.util.Scanner;

public class Q05_DivisibleBy3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.println("Enter any number : ");
        int n = sc.nextInt();

        //Logic & output
        int i = 1;
        while(i <= n) {
            if(i % 3 == 0) {
                System.out.println(i); 
            }
            i++;
        }

        sc.close();
    }
}
