package nl.rug.designpatterns.iterable;

import java.math.BigInteger;
import java.util.Iterator;

public class FibonacciNumberGenerator implements Iterator<BigInteger>, Iterable<BigInteger> {

    private BigInteger first = new BigInteger("0");
    private BigInteger second = new BigInteger("1");

    private BigInteger max;

    public FibonacciNumberGenerator(long max) {
        this.max = new BigInteger(String.valueOf(max));
    }


    @Override
    public boolean hasNext() {
        return first.add(second).compareTo(max) <= 0;
    }

    @Override
    public BigInteger next() {
        BigInteger next = first.add(second);

        BigInteger min = first.min(second);
        if (first.equals(min)) {
            first = next;
        } else {
            second = next;
        }

        return next;
    }

    @Override
    public Iterator<BigInteger> iterator() {

        return this;
    }
}
