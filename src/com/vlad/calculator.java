package com.vlad;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Type first number: ");
        float num1 = scan.nextFloat();

        System.out.print("Type second number: ");
        float num2 = scan.nextFloat();

        float res1 = num1 + num2;
        float res2 = num1 - num2;
        float res3 = num1 * num2;
        float res4 = num1 / num2;

        System.out.println("Result + : " + res1);
        System.out.println("Result - : " + res2);
        System.out.println("Result * : " + res3);
        System.out.println("Result / : " + res4);







    }
}
