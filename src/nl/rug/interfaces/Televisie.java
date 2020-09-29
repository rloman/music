package nl.rug.interfaces;

public interface Televisie  {

    /* public static final */  double btw = 23.0;

    void on();
    void off();
    void soundOff();
    void soundOn();
    int switchChannel(int newChannel);

    default void add(int n) {
        System.out.println(btw+n);
    }

}
