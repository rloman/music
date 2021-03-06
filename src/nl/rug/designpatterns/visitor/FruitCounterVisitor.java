package nl.rug.designpatterns.visitor;

import nl.rug.designpatterns.visitor.model.Apple;
import nl.rug.designpatterns.visitor.model.Pear;

public class FruitCounterVisitor implements Visitor {

    private int apples;
    private int pears;


    @Override
    public void visit(Apple p) {
        this.apples++;
    }

    @Override
    public void visit(Pear pear) {
        this.pears++;
    }

    @Override
    public String toString() {
        return "FruitCounterVisitor{" +
                "apples=" + apples +
                ", pears=" + pears +
                '}';
    }
}
