package nl.rug.finalling;

public class Bird {

    private final String name;

    public Bird(String name) {
        this.name = name;
    }

    public final boolean hasFeathers() {

        final int age  = 33;
//        age++; // vout
        return true;
    }
}


class Pinguin extends Bird {

    public Pinguin(String name) {
        super(name);
    }

    /*
    @Override // vout
    public boolean hasFeathers() {
        return false;
    }

     */
}

//class HumboltPinguin extends Pinguin { // vout, Pinguin is a final class

//}