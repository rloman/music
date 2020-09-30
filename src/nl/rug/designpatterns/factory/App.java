package nl.rug.designpatterns.factory;

import nl.rug.designpatterns.factory.model.Car;
import nl.rug.designpatterns.factory.model.CarFactory;
import nl.rug.designpatterns.factory.model.CarType;

public class App {

    public static void main(String[] args) {
        Car bmw = CarFactory.getInstance(CarType.BMW);

//        Car andereBmw = new BMW(); // dit mag nu niet meer!!!

        System.out.println(bmw);
//        System.out.println(andereBmw);

        bmw = CarFactory.getInstance(CarType.BMW_MET_SNELHEID);

        System.out.println(bmw);
    }
}
