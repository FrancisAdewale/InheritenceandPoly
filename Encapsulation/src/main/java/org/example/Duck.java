package org.example;

public class Duck extends Bird implements Swimmable, Flyable{
    @Override
    public void makeSound() {

    }

    @Override
    public void swim() {
        System.out.println(this.getClass().getSimpleName() + " is swimming!");

    }

    @Override
    public void fly() {
        System.out.println(this.getClass().getSimpleName() + " is flying!");


    }
}
