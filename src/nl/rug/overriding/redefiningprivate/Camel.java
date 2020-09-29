package nl.rug.overriding.redefiningprivate;

public class Camel {
    private String getNumberOfHumps() {
        return "Undefined";
    }

}

class BactrianCamel extends Camel {

    public int getNumberOfHumps() {
        return 2;
    }
}
