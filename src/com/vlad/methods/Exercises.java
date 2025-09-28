package com.vlad.methods;

public class Exercises {
    public static void main(String[] args) {

        int[] arr1 = new int[] {5, 6, 8};
        int sum1 = sumArray(arr1);
        System.out.println("Sum: " + sum1);

        int[] arr2 = new int[] {5, 6, 38, 90, 91};
        int sum2 = sumArray(arr2);
        System.out.println("Sum 2: " + sum2);


    }


    public static int sumArray(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

}
