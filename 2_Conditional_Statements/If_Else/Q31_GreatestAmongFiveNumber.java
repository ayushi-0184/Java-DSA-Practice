//WAp to find the maximum among five numbers uisng nested if.

package If_Else;

import java.util.Scanner;

public class Q31_GreatestAmongFiveNumber {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        //Input
        System.out.println("Enter First Number: ");
        int a = sc.nextInt();

        System.out.println("Enter Second Number: ");
        int b = sc.nextInt();

        System.out.println("Enter Third Number: ");
        int c = sc.nextInt();

        System.out.println("Enter Fourth Number: ");
        int d = sc.nextInt();

        System.out.println("Enter Fifth Number: ");
        int e = sc.nextInt();

        //Logic and Output
        int max;

        if (a > b) {
            if (a > c) {
                if (a > d) {
                    if (a > e) {
                        max = a;
                    } else {
                        max = e;
                    }
                } else {
                    if (d > e) {
                        max = d;
                    } else {
                        max = e;
                    }
                }
            } else {
                if (c > d) {
                    if (c > e) {
                        max = c;
                    } else {
                        max = e;
                    }
                } else {
                    if (d > e) {
                        max = d;
                    } else {
                        max = e;
                    }
                }
            }
        } else {
            if (b > c) {
                if (b > d) {
                    if (b > e) {
                        max = b;
                    } else {
                        max = e;
                    }
                } else {
                    if (d > e) {
                        max = d;
                    } else {
                        max = e;
                    }
                }
            } else {
                if (c > d) {
                    if (c > e) {
                        max = c;
                    } else {
                        max = e;
                    }
                } else {
                    if (d > e) {
                        max = d;
                    } else {
                        max = e;
                    }
                }
            }
        }

        System.out.println("Maximum number = " + max);

        sc.close();
    }
}