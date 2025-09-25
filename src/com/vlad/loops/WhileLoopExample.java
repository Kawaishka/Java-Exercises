package com.vlad.loops;

public class WhileLoopExample {
    public static void main (String[] args) {
        //if-else

        int a = 15, b = 10;
        boolean isHasCar = true;

        if(isHasCar || a ==b || 10 > 0) {
            System.out.println("1 IF.");
            if(1 == 1) {
                System.out.println("1 = 1");
            }

        } else if (a != b) {
            System.out.println("2 IF");
            
        } else if (a >= b) {
            System.out.println("3 IF");

        } else if (a >= b) {
            System.out.println("4 IF");

        }
        else {
            System.out.println("ELSE");
        }
    }
}
