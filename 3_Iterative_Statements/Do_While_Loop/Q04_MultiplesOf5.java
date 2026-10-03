//WAP to print multiples of 5 from  N to 1.

package Do_While_Loop;

import java.util.Scanner;

public class Q04_MultiplesOf5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        //Input
        System.out.println("Enter any number: ");
        int n = sc.nextInt();
        System.out.println("Multiples of 5 are: ");

        //logic and Output
        int i = n;
        do {
            if(i % 5 == 0) {
                System.out.println(i);
            } 
            i--;
        }while(i >= 1);

        sc.close();
    }
}
