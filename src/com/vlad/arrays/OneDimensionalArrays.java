package com.vlad.arrays;

import java.util.Scanner;

public class OneDimensionalArrays {
    public static void main(String[] args) {
        //Arrays

        int[] arr = new int[4];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < arr.length; i++) {
            System.out.print("Type a number: ");
            int value = scanner.nextInt();
            arr[i] = value;
        }

        int min = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        int max  = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);



    }
}
