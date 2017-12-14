package com.polymorphism.animal;

public class Dog extends Animal
{
    public void sound() {
        System.out.print("woof");
    }
    
    public static void main(String args[]) {
        Animal obj = new Dog();
        obj.sound();
    }
}
