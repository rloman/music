package nl.rug.equalitydefined;

import nl.rug.domain.Viool;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App {

    public static void main(String[] args) {

        Viool v1 = new Viool(3);
        Viool v2 = new Viool(3);
        Viool v3 = new Viool(3);

        v1.setName("Stradivarius");
        v2.setName("Stradivarius");
        v3.setName("Rembrandt");


        System.out.println(v1 == v2);
        System.out.println(v1.equals(v2));

        Set<Viool> violen = new HashSet<>();
        violen.add(v1);
        violen.add(v2);
        violen.add(v3);

        System.out.println(violen);
//        kill(violen);
//        System.out.println(violen);
    }

    public static void kill(List <Viool> violen) {

        System.out.println(violen);

        Viool victim = new Viool(3);
        victim.setName("Stradivarius");
        violen.remove(victim);
    }
}
