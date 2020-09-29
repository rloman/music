package nl.rug.overriding;

public class Canine {

    public double getAverageWeight() {
        return 50;
    }

    public Object foo() {
        return new Object();
    }

}

class Wolf extends Canine  {

    @Override
    public double getAverageWeight()  {
        return super.getAverageWeight() + 20;
    }

    @Override
    public String foo() {
        return "a name";
    }
}
