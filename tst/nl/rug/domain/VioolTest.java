package nl.rug.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VioolTest {

    private Instrument v;

    @BeforeEach
    public void setup() {
        v = new Viool(33);
    }

    @Test
    public void testGetPrice() {
        v.setPrice(555);
        assertEquals(555, v.getPrice());
    }

    @Test
    public void testGetWeight() {
        v.setWeight(35);
        assertEquals(35, v.getWeight());
    }

    @Test
    public void testGetSize() {
        v.setSize(150);
        assertEquals(150, v.getSize());
    }
}