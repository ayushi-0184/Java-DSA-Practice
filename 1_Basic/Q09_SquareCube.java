//WAP to calculate Square of a number
//WAP to calculate cube of a number

import java.util.*;

public class Q09_SquareCube {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        //Logic
        int square = (num * num);
        int cube = (num * num * num);

        //output
        System.out.println("Square of a number: " + square);
        System.out.println("Cube of a number: " + cube);

        sc.close();
    }  
}
