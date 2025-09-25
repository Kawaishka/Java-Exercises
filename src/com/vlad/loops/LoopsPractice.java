package com.vlad.loops;

public class LoopsPractice {
    public static void main(String[] args) {

         for(float i = 5; i <= 25; i += 5) {
             if(i % 3 == 0)
                 continue;
             if (i >= 17)
                 break;

         System.out.println("Element: " + i + ".");
         }



    }
}
