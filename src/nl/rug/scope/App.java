package nl.rug.scope;

public class App {

    public static void main(String[] args) {
        Singer paulSimon = new Singer();
        paulSimon.printit();

        System.out.println(paulSimon.getName());


        System.out.println(paulSimon.getName().length());

        System.out.println("Einde programma");
    }
}
