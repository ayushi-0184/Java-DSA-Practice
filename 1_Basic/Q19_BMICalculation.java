//WAP Calculate BMI using: BMI = Weight / (Height × Height)

import java.util.*;

public class Q19_BMICalculation {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter Weight (in Kg): ");
        float weight = sc.nextFloat();

        System.out.println("Enter Height (in meters): ");
        float height = sc.nextFloat();

        // Logic
        float bmi = weight / (height * height);

        // Output
        System.out.printf("BMI = %.2f%n", bmi);

        sc.close();
    }
}