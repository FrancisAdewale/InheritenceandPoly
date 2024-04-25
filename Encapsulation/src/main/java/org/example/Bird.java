package org.example;

public abstract class Bird extends Animal implements Flyable{

    @Override
    public void fly() {
        System.out.println(this.getClass().getSimpleName() + " is flying!");
    }
}
