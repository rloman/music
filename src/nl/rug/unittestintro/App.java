package nl.rug.unittestintro;

import nl.rug.domain.Instrument;
import nl.rug.domain.Viool;

public class App {

    public static void main(String[] args) {
        Instrument i = new Viool(55);

        i.setPrice(333);

        System.out.println(i.getPrice());
    }
}
