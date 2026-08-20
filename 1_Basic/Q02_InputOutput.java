//WAP to print Input from users

import java.util.*;

public class Q02_InputOutput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your First Name: ");
        String first_name = sc.next();
        System.out.print("Enter Your Last Name: ");
        String last_name = sc.next();
        System.out.println(first_name +" " + last_name);

        sc.close();
    }
}
