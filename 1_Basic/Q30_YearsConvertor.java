//WAP to convert years into months and days.
import java.util.Scanner;

public class Q30_YearsConvertor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Input
        System.out.print("Enter number of years: ");
        int years = sc.nextInt();

        //Logic
        int months = years * 12;
        int days = years * 365;

        //Output
        System.out.println("Months: " + months);
        System.out.println("Days: " + days);

        sc.close();
    }
}