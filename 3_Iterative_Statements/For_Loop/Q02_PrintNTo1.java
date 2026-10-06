// WAp to print N to 1 numbers.
package For_Loop;

import java.util.Scanner;

public class Q02_PrintNTo1 {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);

      //Input
      System.out.println("Enter any number: ");
      int n = sc.nextInt();

      for(int i = n; i >= 1; i--) {
         System.out.println(i);
      }

      sc.close();
   }
}
