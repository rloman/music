package nl.rug.designpatterns.visitor.model;

import nl.rug.designpatterns.visitor.Visitor;

public abstract class Fruit {

    public abstract void accept(Visitor visitor);
}
