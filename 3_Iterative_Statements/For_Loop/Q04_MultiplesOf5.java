//WAP to print multiples of 5 from N to 1.

package For_Loop;

import java.util.Scanner;

public class Q04_MultiplesOf5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.println("Enter any number: ");
        int n = sc.nextInt();
        System.out.println("Multiples of 5 are: ");

        //Logic and Output
        for(int i = n; i >= 1; i--) {
            if(i % 5 == 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
