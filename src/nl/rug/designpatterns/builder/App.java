package nl.rug.designpatterns.builder;

public class App {

    public static void main(String[] args) {

        Airplane plane = new Airplane.AirplaneBuilder("Boeing", 15)
                .aantalStoelen(4)
                .fuel(3)
                .build();

        String myName = new StringBuilder("Ray")
                .append("mond")
                .append(52)
                .reverse()
                .toString();

        System.out.println(myName);
    }
}
