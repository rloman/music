package nl.rug.domain;

public class Demo {

    public static void main(String[] args) {
        Instrument i = new Viool(3);

        foo(i);
    }

    public static void foo(Instrument i) {

        // playVioline is here impossible since playVioline is in Viool
        if(i instanceof Viool) {
            // save to cast
            Viool v = (Viool) i;

            v.playVioline();
        }

        // dit is stom => // vrijdagmiddag 15:00 uur, beetje duf ...
        if(i instanceof Viool) {
//            Guitar g = (Guitar) i; // hartstikke vout
//            g.playGuitar();
        }

        /*
        String s = "aap";
        if(s instanceof Viool) { // vout, de beide operands moeten
        // in dezelfde inheritance (sub) tree zitten.

        }

         */

        byte b = (byte) 1035; // gevaarlijk
        System.out.println(b);

        for(byte b1 = 120;b1<150;b1++) {
            System.out.println("b1 is nu: "+b1);
        }


    }
}
