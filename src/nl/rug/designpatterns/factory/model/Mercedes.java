package nl.rug.designpatterns.factory.model;

public class Mercedes extends Car {

    Mercedes() {

    }

    @Override
    public void drive() {

        System.out.println("Driving Mercedes");

    }
}
