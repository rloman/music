package nl.rug.designpatterns.factory.model;

public class Ferrari extends Car {

    Ferrari() {

    }

    @Override
    public void drive() {
        System.out.println("Driving Ferrari ... ");
    }
}
