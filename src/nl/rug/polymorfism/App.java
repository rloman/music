package nl.rug.polymorfism;

import nl.rug.domain.Instrument;
import nl.rug.domain.SnaarInstrument;
import nl.rug.domain.Viool;
import nl.rug.interfaces.Samsung;
import nl.rug.interfaces.Televisie;

public class App {

    public static void main(String[] args) {

        Viool v = new Viool(3.5);

        SnaarInstrument viool = new Viool(555);
        viool.play();
//        viool.vout(); // vout

        Instrument i = new Piano(55);

        Object o = new Piano(66);

        Televisie t = new Samsung();
        t.on();
//        t.getStatus();

        // dynamic binding
        i.getPrice();

        int a = 3;
        byte b = 5;

        a = b;

//        b = a;// vout




    }
}


class Piano extends Instrument {

    public Piano(double price) {
        super(price);
    }

    @Override
    public void play() {

    }
}