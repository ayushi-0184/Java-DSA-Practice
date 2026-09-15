//WAP to print the day of the week using a number (1-7).

package Switch; 

import java.util.Scanner;

public class Q05_DayOfWeekUsingNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.print("Enter the day of the week using a number (1-7): ");
        int day = sc.nextInt();

        //Logic and Output
        switch(day) {
            case 1:System.out.println("Monday");
            break;
            case 2: System.out.println("Tuesday");
            break;
            case 3: System.out.println("Wednesday");
            break;
            case 4: System.out.println("Thursday");
            break;
            case 5: System.out.println("Friday");
            break;
            case 6: System.out.println("Saturday");
            break;
            case 7:System.out.println("Sunday");
            break;
            default: System.out.println("Invalid");           
        }

        sc.close();
    }
}