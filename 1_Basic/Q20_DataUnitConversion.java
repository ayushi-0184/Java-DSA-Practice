//Convert bytes into KB and MB

import java.util.Scanner;

public class Q20_DataUnitConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.print("Enter bytes: ");
        double bytes = sc.nextDouble();

        //Logic
        double kb = bytes / 1024;
        double mb = bytes / (1024 * 1024);

        //Output
        System.out.println("Bytes = " + bytes);
        System.out.println("Kilobytes (KB) = " + kb);
        System.out.println("Megabytes (MB) = " + mb);

        sc.close();
    }
}