package org.example;

public class Van extends Vehicle implements Driveable{

    @Override
    public void drive() {
        System.out.println(this.getClass().getSimpleName() + " is being driven!");

    }

    @Override
    public void move() {

    }
}
