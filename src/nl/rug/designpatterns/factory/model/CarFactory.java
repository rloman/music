package nl.rug.designpatterns.factory.model;

public final class CarFactory {

    public static Car getInstance(CarType carType) {
        switch (carType) {
            case BMW:
                Car bmw = new BMW();
                bmw.setCurrentLevel(30);

                return bmw;

            case BMW_MET_SNELHEID:
                Car bmw2 = new BMW();
                bmw2.setSpeed(320);

                return bmw2;



            case MERCEDES:
                Car m = new Mercedes();
                m.setCurrentLevel(45);

                return m;

            case FERRARI:
                Car f = new Ferrari();
                f.setCurrentLevel(200);

                return f;

            default:
                throw new IllegalArgumentException();
        }
    }


    // prevent instantiation
    private CarFactory() {

    }


}
