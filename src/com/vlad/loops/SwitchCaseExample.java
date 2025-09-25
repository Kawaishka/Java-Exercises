package com.vlad.loops;
import java.util.Scanner;

public class SwitchCaseExample {
    public static void main(String[] args) {
        //Switch-case
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type a number: ");
        int num = scanner.nextInt();
        scanner.close();
        switch (num) {
            case 1:
                System.out.println("Number is 1.");
                break;
            case 2:
                System.out.println("Number is 2.");
                break;
            case 5:
                System.out.println("Number is 5");
                break;
            case 10:
                System.out.println("Number is 10");
                break;
            default:
                System.out.println("Default");
                //После Default не нужен Break;

        }
    }
}
