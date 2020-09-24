package nl.rug.formatting;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class App {


    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
//                System.out.println(i + "x" + j + "=" + i * j);

                System.out.printf("%02dx%02d=%03d%n", i, j, i * j);

            }

            System.out.println();
            System.out.println();

        }

        String name = "Oscar";


        String formattedString = String.format("De scheidsrechter heet '%-30s'", name);

        System.out.println(formattedString);

        LocalDate today = LocalDate.now();

        System.out.println(today.format(DateTimeFormatter.ISO_DATE));

        System.out.println("Groningen, " + today.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));

        LocalDateTime now = LocalDateTime.now();

        System.out.println("Groningen, " +
                now.format(DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss")));


        DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate date = LocalDate.parse("01 02 2015", f);
        LocalTime time = LocalTime.parse("11:22");
        System.out.println(date); // 2015-01-02
        System.out.println(time); // 11:22

        

    }


}
