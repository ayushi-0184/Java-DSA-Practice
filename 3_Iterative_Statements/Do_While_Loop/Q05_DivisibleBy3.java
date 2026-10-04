//WAp to print numbers divisible by 3 from 1 to N.

package Do_While_Loop;

import java.util.Scanner;

public class Q05_DivisibleBy3 {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);

        //Input
        System.out.println("Enter any number: ");
        int n = sc.nextInt();

        //Logic and Output
        int i = 1;
        do {
            if(i % 3 == 0) {
                System.out.println(i);
            }
            i++;
        }while(i <= n);

        sc.close();
    }
}
