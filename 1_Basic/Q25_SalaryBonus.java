//WAP to Calculate salary after adding bonus

import java.util.*;

public class Q25_SalaryBonus {
    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);

        //Input
        System.out.print("Enter Your Salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter Bonus in percentage: ");
        double bonus = sc.nextDouble();

        //Logic
        double bonus_amount = salary * (bonus/100);
        double new_salary = salary + bonus_amount;

        //Output
        System.out.println("Bonus Amount: "  +bonus_amount);
        System.out.println("Final Salary after Adding Bonus: " + new_salary);

        sc.close();
    }
    
}
