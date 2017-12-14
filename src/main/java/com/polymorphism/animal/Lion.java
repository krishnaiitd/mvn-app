package com.polymorphism.animal;

import java.util.HashMap;

public class Lion extends Animal
{
    public void sound() {
        System.out.print("Roar");
    }
    
    public static void main(String args[]) {
        //Animal obj = new Lion();
        //obj.sound();
        
        String test = "CGTTCAAGTTCAA";
        HashMap<String, Integer> codonCount = new HashMap<String, Integer>();
        for(int i = 0; i < test.length() - 3; i += 3) {
            String dna = test.substring(i, i+3);
            if (codonCount.containsKey(dna)) {
                codonCount.put(dna, codonCount.get(dna) + 1);
            } else {
                codonCount.put(dna, 1);
            }
        }
        
        for(String key : codonCount.keySet()) {
            System.out.println(key + "\t" + codonCount.get(key));
        }
    }
}
