package nl.rug.interfaces;

public class Samsung implements Televisie {

    private boolean on;
    private boolean soundOn;
    private int currentChannel;

    private double totaalBelasting;

    public void getStatus() {

    }

    @Override
    public void on() {
        this.on = true;

        add(2);
    }

    @Override
    public void add(int n) {
    }

    @Override
    public void off() {
        this.on = false;
    }

    @Override
    public void soundOff() {
        this.soundOn = false;
    }

    @Override
    public void soundOn() {
        this.soundOn = true;
    }

    @Override
    public int switchChannel(int newChannel) {
        return this.currentChannel = newChannel;
    }
}
