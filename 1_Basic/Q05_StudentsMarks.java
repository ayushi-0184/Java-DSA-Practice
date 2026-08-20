//WAP to calculate total marks, percentage of 5 subjects

import java.util.*;

public class Q05_StudentsMarks {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Input 
        System.out.print("Enter the marks of Subject 1: ");
        double s1 = sc.nextDouble();
        System.out.print("Enter the marks of Subject 2: ");
        double s2 = sc.nextDouble();
        System.out.print("Enter the marks of Subject 3: ");
        double s3 = sc.nextDouble();
        System.out.print("Enter the marks of Subject 4: ");
        double s4 = sc.nextDouble();
        System.out.print("Enter the marks of Suubject 5: ");
        double s5 = sc.nextDouble();

        //Logic
        double total_marks = (s1+s2+s3+s4+s5);
        double percentage = (total_marks / 5);

        //Output
        System.out.println("Total Marks of 5 Subjects: " + total_marks);
        System.out.println("Percentage of 5 Subjecs: " + percentage);

        sc.close();
    }
    
}
