package nl.rug.designpatterns.visitor.model;

import nl.rug.designpatterns.visitor.Visitor;

public class Pear extends Fruit {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
