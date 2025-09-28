package com.vlad.collection;

import java.util.LinkedList;

public class CollectionLinkedList {
    public static void main(String[] args) {
        LinkedList<Float> numbers = new LinkedList<>(); //better for remove, add opt.
        numbers.add(32.3f);
        numbers.add(21.4f);
        numbers.add(53.5f);
        numbers.add(7342.6f);
        numbers.add(82.7f);

        for(Float el : numbers) {
            System.out.println("Element: " + el);
        }

        float min = numbers.getFirst();
        float max = numbers.getFirst();

        for(int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) < min) {
                min = numbers.get(i);
            }
        }
        for(int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }

        System.out.println("Min. element: " + min);
        System.out.println("Max. element: " + max);
        }
    }

