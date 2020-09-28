package nl.rug.overloading;

public class App {

    public static void main(String[] args) {


        System.out.println(Calculator.sum());

        System.out.println(Calculator.sum(3,4));


        System.out.println(Calculator.sum(5,8.5));

        System.out.println(Calculator.sum(8, 2));

//        System.out.println(Calculator.sum(8, new Integer(2))); // vout

    }
}
