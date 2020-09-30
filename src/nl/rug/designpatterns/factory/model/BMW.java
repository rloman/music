package nl.rug.designpatterns.factory.model;

public class BMW extends Car {

    BMW() {

    }

    @Override
    public void drive() {

        System.out.println("Driving BMW");

    }
}
