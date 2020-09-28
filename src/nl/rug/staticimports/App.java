package nl.rug.staticimports;

// topic: "Static imports" => dat doe je met: import static
import static java.lang.Math.*;

import static java.lang.Integer.MAX_VALUE;
//import static java.lang.Long.MAX_VALUE; // vout

public class App {

    public static void main(String[] args) {

        System.out.println(PI);
        System.out.println(E);


        System.out.println(max(3,4));
        System.out.println(Math.pow(3,4));

        System.out.println(MAX_VALUE);
        System.out.println(MAX_VALUE);

    }
}
