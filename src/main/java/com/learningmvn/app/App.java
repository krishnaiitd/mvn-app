package com.learningmvn.app;

import java.util.*;
/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
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
