package nl.rug.lists;

import nl.rug.domain.Instrument;
import nl.rug.domain.SnaarInstrument;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class App {

    public static void main(String[] args) {
        ArrayList<Instrument> instruments = new ArrayList<>();

        instruments.add(new SnaarInstrument(3.4));
        instruments.add(new SnaarInstrument(3.5));
        instruments.add(new SnaarInstrument(5));

        System.out.println(instruments.size());

        instruments.clear();

        System.out.println(instruments.size());

        ArrayList<String> mensen = new ArrayList<>();

        mensen.add("Piet");
        mensen.add("Jan");
        mensen.add("Aalderink");

        Collections.sort(mensen);

        System.out.println(mensen.contains("Piet"));

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(0,1,1,2,3,5,8,13,21));

        ArrayList<Double> rapportCijfers = new ArrayList<>();

        rapportCijfers.add(8.6);

        for(double element: rapportCijfers) {
            System.out.println(element);
        }





    }
}
