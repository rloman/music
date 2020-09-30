package nl.rug.recursion;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyMathTest {

    @Test
    public void testFac1() {
        assertEquals(6, MyMath.fac(3));
    }

    @Test
    public void testFac2() {
        assertEquals(24, MyMath.fac(4));
    }

    @Test
    public void testFac3() {
        assertEquals(120, MyMath.fac(5));
    }
}
