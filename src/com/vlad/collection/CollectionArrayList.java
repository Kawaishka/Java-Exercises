package com.vlad.collection;

import java.util.ArrayList;

public class CollectionArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(200);
        numbers.add(1, 99);



        //System.out.println(numbers.get(1)); // get first element
        numbers.remove(1); // remove first element

        //numbers.clear(); // clear all elements

        System.out.println("Size of collection: " + numbers.size());

        for(Integer el : numbers) {
            System.out.println(el);
        }
    }
}
