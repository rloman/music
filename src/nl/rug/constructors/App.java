package nl.rug.constructors;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {

        Persoon p = new Persoon("Mieke", LocalDate.of(1993, 5, 5));

//        System.out.println(p.getName());
//        System.out.println(p.getDateOfBirth());

        p = new Persoon();

//        System.out.println(p.getDateOfBirth());
    }
}
