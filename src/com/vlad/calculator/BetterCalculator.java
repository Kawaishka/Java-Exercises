package com.vlad.calculator;

import java.util.Scanner;

public class BetterCalculator {
    public static void main(String[] args) {
        double res =0;
        boolean valid = true;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите 1 число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите 2 число: ");
        double num2 = scanner.nextDouble();

        scanner.nextLine(); // ОЧИСТКА БУФЕРА
        System.out.print("Действие (+ - * /): ");
        String action = scanner.nextLine();


        switch (action) {
            case "+":
               res = num1 + num2;
               break;
            case "-":
                res = num1 - num2;
                break;
            case "*":
                res = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("На ноль делить нельзя");
                    valid = false;
                } else {
                    res = num1 / num2;
                }
                break;
            default:
                System.out.println("Ошибка: неизвестная операция");
                valid = false;
        }
        if (valid) {
            System.out.println("Результат: " + res);
        }
    }
}
