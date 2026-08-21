
//WAP to swap 2 numbers with third variable

import java.util.*;

public class Q15_Swap2NumbersWithThirdVariable {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        //Input
        System.out.print("Enter Your First Number: ");
        int a = sc.nextInt();
        System.out.print("Enter Your Second Number: ");
        int b = sc.nextInt();
        int temp;

        //Logic
        temp=a;
        a=b;
        b=temp;

        //Output
        System.out.println("After Swapping");
        System.out.println("First Number: " + a);
        System.out.println("Second Number: "+ b);

        sc.close();
    }
    
}
