//WAP to check number is Even or Odd

package If_Else;

import java.util.*;

public class Q01_EvenOdd {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        //Input
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();

        //Logic
        if(num%2 == 0) {
            System.out.println(num + " is an even number");
        } else {
            System.out.println(num + " is an odd number");     
        }

        sc.close();  
    }
    
}
