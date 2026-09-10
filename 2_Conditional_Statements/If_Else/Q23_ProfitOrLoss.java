//WAP to find profit or loss based on cost price and selling price.

package If_Else;

import java.util.Scanner;

public class Q23_ProfitOrLoss {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.println("Enter the cost price: ");
        int cp = sc.nextInt();
        System.out.println("Enter the selling price: ");
        int sp = sc.nextInt();

        //Logic and Output
        if(sp > cp) {
            int p = sp - cp;
            System.out.println(p + " is a profit");
        }else if(sp< cp) {
            int l = cp - sp;
            System.out.println(l + " is a loss");
        }else {
            System.out.println("No Profit, No Loss");
        }

        sc.close();
    }    
}
