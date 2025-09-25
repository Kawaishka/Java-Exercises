package com.vlad.arrays;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        // multidimensional arrays
        char[][] syms  = new char[2][2]; // [[4, 6, 6], [5, 6, 7]]
        syms[0][0] = 't';
        System.out.println(syms[0][0]);

        byte[][] nums = new byte[][] {
                {5, 7},
                {7, 3},
                {2, 0}
        };

        nums[1][1] = 67;
        System.out.println(nums[1][1]);

//        for()
//            for()

    }
}
