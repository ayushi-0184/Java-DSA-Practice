//WAP to calculate income tax based on salary slabs.

package If_Else;

import java.util.Scanner;

public class Q18_IncomeTaxSalarySlab {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.println("Enter salary: ");
        float salary = sc.nextFloat();
        float IncomeTax_Amount;

        //Logic and Output
        if(salary <= 1200000) {
            System.out.println("No Income Tax");
        }else if(salary <= 1800000) {
            System.out.println("5% Income Tax");
            IncomeTax_Amount = (((salary - 1200000) * 5) / 100);
            System.out.println("Income Tax Amount: " + IncomeTax_Amount);
        }else if(salary <= 2400000) {
            System.out.println("10% Income Tax");
            IncomeTax_Amount = (((salary - 1800000) * 10)/100 + 30000);
            System.out.println("Income Tax Amount: " + IncomeTax_Amount);            
        }else if(salary <= 3000000) {
            System.out.println("15% Income Tax");
            IncomeTax_Amount = (((salary - 2400000) * 15) / 100 + 90000);
            System.out.println("Income Tax Amount: " + IncomeTax_Amount);
        }else if(salary <= 3600000) {
            System.out.println("20% Income Tax");
            IncomeTax_Amount = (((salary - 3000000) * 20) /100 + 180000);
            System.out.println("Income Tax Amount: " + IncomeTax_Amount);
        }else {
            System.out.println("30% Income Tax");
            IncomeTax_Amount = (((salary - 3600000) * 30) / 100 + 300000);
            System.out.println("Income Tax Amount: " + IncomeTax_Amount);
        }

        sc.close();
    }
    
}
