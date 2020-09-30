package nl.rug.designpatterns.factory.model;

// template class design pattern: Template Method
public abstract class Car {

    private String licensePlate;
    private int currentLevel;
    private int speed;

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(int currentLevel) {
        this.currentLevel = currentLevel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "licensePlate='" + licensePlate + '\'' +
                ", currentLevel=" + currentLevel +
                ", speed=" + speed +
                '}';
    }

    public void tank() {
        currentLevel++;
    }

    public abstract void drive();

    public void setSpeed(int i) {
        this.speed = i;
    }
}
