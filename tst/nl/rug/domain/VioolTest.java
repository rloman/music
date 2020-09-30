package nl.rug.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VioolTest {

    private Instrument instrument;

    @BeforeEach
    public void setup() {
        instrument = new Viool(33);
    }

    @Test
    public void testGetPrice() {
        Instrument instrument = new Viool(33);
        instrument.setPrice(555);
        assertEquals(555, instrument.getPrice());
    }

    @Test
    public void testGetWeight() {
        instrument.setWeight(35);
        assertEquals(35, instrument.getWeight());
    }

    @Test
    public void testGetSize() {
        instrument.setSize(150);
        assertEquals(150, instrument.getSize());
    }
}