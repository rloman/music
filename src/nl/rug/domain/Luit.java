package nl.rug.domain;

public class Luit extends Instrument {


    public Luit(double price) {
        super(price);
    }

    @Override
    public void play() {

        System.out.println("Playing luit");

    }
}
