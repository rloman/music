package nl.rug.arrays.multi;

import nl.rug.domain.Instrument;
import nl.rug.domain.SnaarInstrument;

public class App {

    public static void main(String[] args) {

        String[][] vars1 = new String[3][2];
        vars1[0][1] = "set";

        Instrument[][] instruments = new Instrument[4][];

        SnaarInstrument harp = new SnaarInstrument(3.5);
        instruments[0] = new Instrument[3];
        instruments[0][0] = new SnaarInstrument(3.5);
        instruments[0][1] = harp;


    }
}
