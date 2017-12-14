package com.learningmvn.app;

import java.util.*;

/**
 * Hello world! ArrayList example HashMap example
 */
public class App
{
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        // Array List learning : generic type object should be string
        String text =
                "This is text for counting the words frquencies, so you can repeate the same worlds, like count you can etc";
        ArrayList<String> wordList = new ArrayList<String>();
        String[] wordArray = text.split(" ");
        System.out.println("Word list after splits");
        for (String ss : wordArray) {
            wordList.add(ss);
            System.out.println(ss);
        }
        // Example of iterator
        System.out.println("Word list using iterator");
        Iterator<String> itr = wordList.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        
        // Example of HashMap
        // e.g: count of words
        // put word as a key and value as count of words and increment by one if it is found again
        HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
        for (String word : wordArray) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }
        // Extracting all the keys of word count
        System.out.println("Word frquency");
        Set<String> wordsInString = wordCount.keySet();
        for (String word : wordsInString) {
            System.out.println(word + ":" + wordCount.get(word));
        }
        
        System.out.println("Hello World!");
        
        HashMap<String, String> uniqueKeys = new HashMap<String, String>();
        uniqueKeys.put("UNIQUE_KEY", "123_38484");
        System.out.println(uniqueKeys);
        
        HashMap<String, HashMap<String, Integer>> class_feature_counts;
        class_feature_counts = new HashMap<String, HashMap<String, Integer>>();
        
        HashMap<String, Integer> val = new HashMap<String, Integer>();
        // Do what you want to do with val
        val.put("UNIQUE_KEY", 9900);
        class_feature_counts.put("myKey", val);
        System.out.println(class_feature_counts);
        
    }
}
