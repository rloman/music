package nl.rug.designpatterns.composite;

public class App {

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.add(5);
        tree.add(8);
        tree.add(6);


        tree.print();


    }
}
