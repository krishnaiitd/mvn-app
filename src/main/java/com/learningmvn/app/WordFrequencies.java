package com.learningmvn.app;

import java.util.ArrayList;

public class WordFrequencies
{
    private ArrayList<String> myWords;
    private ArrayList<Integer> myFreqs;
    
    public WordFrequencies() {
        myWords = new ArrayList<String>();
        myFreqs =  new ArrayList<Integer>(); 
    }
    
    public void frequencies() {
        String resources = "This is word list for frequencies count, so write whatever you want like list count write etc";
        String[] words = resources.split(" ");
        for (String word : words) {
            word = word.toLowerCase();
            int index = myWords.indexOf(word);
            if (index != -1) {
                int value = myFreqs.get(index);
                myFreqs.set(index, value + 1);
            } else {
                myWords.add(word);
                myFreqs.add(1);
            }
        }
    }
    
}
