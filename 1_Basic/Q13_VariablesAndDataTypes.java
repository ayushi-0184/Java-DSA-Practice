
//Write all data types

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class Q13_VariablesAndDataTypes {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        //Input
        System.out.print("Enter Your Age: ");
        int age = sc.nextInt();
        //Output
        System.out.println("Age: " + age);

        //Input
        System.out.print("Enter value of pi: ");
        double r = sc.nextDouble();
        //Output
        System.out.println("Pi Value: " + r);

        //Input
        System.out.print("Enter Your Name: ");
        String name = sc.next();
        //Output
        System.out.println("Name: " + name);

        float x = 19.524f;
        System.out.println("Float Value: " + x);      
       
        float rate = 0.123456f;
        String formattedRate = String.format("%.4f", rate);
        System.out.println(formattedRate); 

        float accurateEnough = 1.234567f;
        System.out.printf("Formatted: %.3f\n", accurateEnough); 
  
        // Always use String constructor for BigDecimal to avoid accuracy loss
        BigDecimal number = new BigDecimal("123.456789");
        // Round to 4 decimal places using Half-Up rounding (standard math rounding)
        BigDecimal rounded = number.setScale(4, RoundingMode.HALF_UP);
        System.out.println(rounded);

        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);

        sc.close();
    }
    
}
