package com.vlad.oop;

import java.util.Scanner;

public class EqualsExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type your role: ");
        String role = scanner.nextLine();
        System.out.print("Type your Pass: ");
        String pass = scanner.nextLine();

        if(role.equals("Admin") && pass.equals("12345")) {
            System.out.println("All Users:");
        } else {
            System.out.println("Привет, как Вас зовут?");
            String name = scanner.nextLine();
        }
    }
}
