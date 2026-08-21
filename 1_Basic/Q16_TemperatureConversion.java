//WAP to convert Celsius to Fahrenheit and Fahrenheit to Celsius

import java.util.*;

public class Q16_TemperatureConversion {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Celsius to Fahrenheit
        //Input
        System.out.println("Celsius to Fahrenheit");
        System.out.print("Enter the value of Celsius: ");
        double celsius = sc.nextDouble();
        
        //Logic
        double fahrenheit = (celsius * 1.8) + 32;
        
        //Output
        System.out.println("Fahrenheit: " + fahrenheit);
       
        //Fahrenheit to Celsius
        //Input
        System.out.println("Fahrenheit to Celsius");
        System.out.print("Enter the value of Fahrenheit: ");
        double f = sc.nextDouble();

        //Logic
        double c = (f - 32) / 1.8;

        //Output
        System.out.println("Celsius: " + c);

        sc.close();
    }
}
