package org.example;

public class Car extends Vehicle implements Driveable{
    @Override
    public void move() {
        //System.out.println(this.getClass().getSimpleName() + " is being driven!");

    }

    @Override
    public void drive() {
        System.out.println(this.getClass().getSimpleName() + " is being driven!");

    }
}
