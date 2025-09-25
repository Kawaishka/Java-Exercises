package com.vlad.arrays;

public class Main {
    public static void main(String[] args) {
        //Arrays
        int[] numbers = new int[5];



        numbers[0] = 45;
        numbers[1] = 32;
        numbers[2] = 1;
        numbers[3] = 9;
        numbers[4] = 3;

        int res = numbers[2] + numbers[3];

       // System.out.println(res);

        //System.out.println(numbers[0]);

        float[] numbers2 = new float[] {5.0f, 6.45f, 89.984f};
        //System.out.println(numbers2[1]);

        for(int i = 0; i < numbers2.length; i++) {
            System.out.println("Element: " + numbers2[i]);
        }



    }
}
