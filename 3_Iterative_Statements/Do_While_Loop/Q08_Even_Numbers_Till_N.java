//WAp to print even numbers till N. 

package Do_While_Loop;

import java.util.Scanner;

public class Q08_Even_Numbers_Till_N {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int n = sc.nextInt();
        System.out.println("Even Number till N: ");

        int i = 1;
        do{
            if(i % 2 == 0) {
                System.out.println(i); 
            }   
            i++; 
        } while(i <= n);

        sc.close();
    }
}
