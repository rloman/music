package nl.rug.designpatterns.visitor;

import nl.rug.designpatterns.visitor.model.Apple;
import nl.rug.designpatterns.visitor.model.Fruitmand;
import nl.rug.designpatterns.visitor.model.Pear;

public class App {

    public static void main(String[] args) {
        Fruitmand mand = new Fruitmand();
        mand.add(new Apple());
        mand.add(new Pear());

        Visitor visitor = new FruitCounterVisitor();
        mand.accept(visitor);

        System.out.println(visitor);


    }
}
