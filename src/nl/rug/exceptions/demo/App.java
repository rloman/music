package nl.rug.exceptions.demo;

import java.net.MalformedURLException;
import java.net.URL;

public class App {

    public static void main(String[] args) {

        try {
            System.out.println("Poedeltje");
        }
        finally {

        }

        try {
            URL url = new URL("http://www.nu.nl");

            System.out.println(url);

            return;
        } catch (MalformedURLException e) {
            System.err.println("Invalid url");

            return;
        }
        finally {
            System.out.println("Dat ging lekker ... :-)");
        }
        //

    }
}
