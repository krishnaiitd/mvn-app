package com.learningmvn.app;

import java.util.ArrayList;

public class ArrayListExamples
{
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        words.add("Hello");
        words.add("World");
        String s = words.get(1);
        System.out.println("Word at 1 position is "+ s);
        int i = 0;
        for(String word: words) {
            System.out.println("Word at " + i + " position is " + word);
            i++;
        }
        words.set(0, "goodbye");
        int ii = 0;
        for(String w: words) {
            System.out.println("Word at " + ii + " position is " + w);
            ii++;
        }
    }
    
}
