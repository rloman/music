package nl.rug.javatime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class App {

    public static void main(String[] args) {
        LocalDate myBirthDate = LocalDate.of(1968, 8, 9);

        System.out.println(myBirthDate.getDayOfMonth());
        System.out.println(myBirthDate.getMonth().getValue());
        System.out.println(myBirthDate.getYear());

        LocalDateTime myBirthMoment = LocalDateTime.of(1968,8,9,15,30,0);

        System.out.println(myBirthMoment);

        long aantalDagen = ChronoUnit.DAYS.between(myBirthDate, LocalDate.now());

        System.out.println(aantalDagen);
        System.out.println(LocalDate.now());

        LocalDate datumIn = LocalDate.of(2020, 9, 15);

        LocalDate uitersteReageerDatum = datumIn.plusWeeks(3);

        System.out.println(uitersteReageerDatum);


        Period period = Period.ofMonths(3);

        LocalDate erik = LocalDate.of(1980, 2, 17);

        Period eriksPeriode = Period.between(erik, LocalDate.now());

        System.out.println(eriksPeriode);

        System.out.println("Erik is nu "+eriksPeriode.getYears()+" jaren, en "+eriksPeriode.getMonths()+" maanden");





    }
}
