package org.example;

public class Aeroplane extends Vehicle implements Flyable{
    @Override
    public void fly() {
        System.out.println("Plane is flyijng..");

    }

    @Override
    public void move() {

    }
}
