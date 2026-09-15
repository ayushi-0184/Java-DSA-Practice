//WAP to display a menu (Tea, Coffee, Juice, Water) and print the selected item.

package Switch;

import java.util.Scanner;

public class Q01_MenuSelection {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.println("Display a menu");
        System.out.println("1 - Tea");
        System.out.println("2 - Coffee");
        System.out.println("3 - Juice");
        System.out.println("4 - Water");
        System.out.println("Enter menu choice: ");
        int menu = sc.nextInt();

        //Logic and Output
        switch(menu) {
            case 1: System.out.println("Tea");
            break;
            case 2: System.out.println("Coffee");
            break;
            case 3: System.out.println("Juice");
            break;
            case 4: System.out.println("Water");
            break;
            default: System.out.println("Invalid menu");
        }

        sc.close();
    }
    
}
