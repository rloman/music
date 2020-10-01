package nl.rug.designpatterns.visitor;

import nl.rug.designpatterns.visitor.model.Apple;
import nl.rug.designpatterns.visitor.model.Pear;

public interface Visitor {

    void visit(Apple p);

    void visit(Pear pear);
}
