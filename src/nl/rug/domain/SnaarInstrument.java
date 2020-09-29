package nl.rug.domain;

public class SnaarInstrument extends Instrument {

    private int aantalSnaren;
    private boolean leuk;

    public SnaarInstrument(double price) {
        super(price);
        this.leuk = true;
    }

    @Override
    public void play() {
        System.out.println("Playing snaarinstrument");

    }

    public int getAantalSnaren() {
        return aantalSnaren;
    }

    public void setAantalSnaren(int aantalSnaren) {
        this.aantalSnaren = aantalSnaren;
    }

}
