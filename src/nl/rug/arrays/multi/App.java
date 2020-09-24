package nl.rug.arrays.multi;

import nl.rug.domain.Instrument;

public class App {

    public static void main(String[] args) {

        String[][] vars1 = new String[3][2];
        vars1[0][1] = "set";

        Instrument[][] instruments = new Instrument[4][];

        Instrument harp = new Instrument();
        instruments[0] = new Instrument[3];
        instruments[0][0] = new Instrument();
        instruments[0][1] = harp;


    }
}
