//WAP to print all even and odd numbers from N to 1

package For_Loop;

import java.util.Scanner; 

public class Q03_PrintOddEvenNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.println("Enter any number: ");
        int n = sc.nextInt();

        //Logic and Output
        for(int i = n; i >= 1; i--) {
            if(i % 2 == 0) {
                System.out.println("Even number is: ");
                System.out.println(i);
            } else {
                System.out.println("Odd number is: ");
                System.out.println(i);
            }
        }
       sc.close();
    }
    
}
