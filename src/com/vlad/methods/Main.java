package com.vlad.methods;

public class Main {
    public static void main(String[] args) {
        // functions = methods
//        info("Hello!");
//        String java = "Java";
//        info(java);
//        info("");

        int res1 = sum((short) 7, (short) 8);

        int res2 = sum((short) 8, (short) 8);
        info(String.valueOf(res1));

    }
    public static int sum(short a , short b) {
        int res = a + b;
        String result = "Result: " + res;
        info(result);
        return res;


    }
    public static void info(String word) {
        System.out.print(word);
        System.out.println("!");




    }



}
