package nl.rug.domain;

public class Car {

    private String licensePlate;
    private double mileage;
    private int speed;

    public String getLicensePlate() {

        int age = 45;
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car {" +
                "licensePlate='" + licensePlate + '\'' +
                '}';
    }
}
