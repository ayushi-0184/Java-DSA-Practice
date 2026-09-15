//WAP to build a simple calculator (+, -, *, /, %).

package Switch;

import java.util.Scanner; 

public class Q04_SimpleCalculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.println("Enter first number: ");
        float a = sc.nextFloat();
        System.out.println("Enter second number: ");
        float b = sc.nextFloat();
        System.out.println("Enter operator choice:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        int choice = sc.nextInt();

        //Logic and Output
        switch(choice){
            case 1: System.out.println("Addition: " + (a+b));
            break;
            case 2: System.out.println("Subtraction: " + (a-b));
            break;
            case 3: System.out.println("Multiplication: " + (a*b));
            break;
            case 4: if(b == 0) {
                System.out.println("Invalid Division");
            } else {
                System.out.println("Division: " + (a/b));

            }    
            break;
            case 5: if(b == 0) {
                System.out.println("Invalid Modulus");
            } else {
                System.out.println("Modulus: " + (a%b));
            }    
            break;
            default: System.out.println("Invalid");
        }

        sc.close();
    }    
}
