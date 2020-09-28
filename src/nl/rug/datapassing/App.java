package nl.rug.datapassing;

public class App {

    public static void main(String[] args) {

        Ukelele u = new Ukelele();
        u.setWeight(500);

        System.out.println(u.getWeight());
        changeIt(u);


        System.out.println(u.getWeight());

        /*


        System.out.println(u.getWeight());

        changeNumber(u.getWeight());

        System.out.println(u.getWeight());

         */



    }

    public static void changeNumber(final double weight) {
//        weight = 345; // bad practice

    }

    public static void changeIt(final Ukelele victim) {

//        victim = new Ukelele(); // vout

//        victim = new Ukelele();
        victim.setWeight(900);

    }
}
