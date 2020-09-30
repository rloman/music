package nl.rug.domain;

import java.util.Objects;

public class Viool extends SnaarInstrument {

    private String name;


    public Viool(double price) {
        super(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        Viool viool = (Viool) o;

        // Delegation of Control
        return this.name.equals(viool.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Viool{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void play() {
    }
}
