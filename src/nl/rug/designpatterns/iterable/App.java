package nl.rug.designpatterns.iterable;

import java.math.BigInteger;

public class App {

    public static void main(String[] args) {
        for (FibonacciNumberGenerator it = new FibonacciNumberGenerator(508743843798L); it.hasNext(); ) {
            BigInteger i = it.next();
            System.out.println(i);
        }
        for (BigInteger i : new FibonacciNumberGenerator(3838L)) {
            System.out.println(i);
        }
    }
}
