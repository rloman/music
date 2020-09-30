package nl.rug.domain;

public class Guitar extends SnaarInstrument {
    public Guitar(double price) {
        super(price);
    }

    public void playGuitar() {
        System.out.println("Play guitar ...");
    }
}
