//WAP to printthe table of number input by the user.

package For_Loop;

import java.util.Scanner;

public class Q09_Table_of_Number {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter number: ");
    int n = sc.nextInt();

    System.out.println("Table of " + n + ":");
    for(int i = 1; i <= 10; i++) {
        System.out.println(n + " x " + i + " = " + (n * i));
    }

    sc.close();
  }  
}
