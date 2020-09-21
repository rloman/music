package nl.rug.domain;

public class Instrument {

    private double price; // kan ook float zijn maar float niet gebruiken
    private int size;
    private double weight;

    @Override
    public String toString() {
        return "Instrument{" +
                "size=" + size +
                ", weight=" + weight +
                '}';
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    void play() {
    }
}