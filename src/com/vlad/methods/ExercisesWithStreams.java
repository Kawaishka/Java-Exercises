package com.vlad.methods;

import java.util.Arrays;

public class ExercisesWithStreams {
    public static void main(String[] args) {

        int[] arr1 = {5, 6, 8};
        int sum1 = sumArray(arr1);
        System.out.println("Sum: " + sum1);

        int[] arr2 = {5, 6, 38, 90, 91};
        int sum2 = sumArray(arr2);
        System.out.println("Sum 2: " + sum2);
    }

    public static int sumArray(int[] arr) {
        return Arrays.stream(arr).sum();
    }
}
