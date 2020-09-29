package nl.rug.domain;

public class App {

    public static void main(String[] args) {
        Car c = new Car();

        // - als ik een object print dan wordt toString aangeroepen.
        System.out.println(c);
        c.setLicensePlate("AABBCC");
        System.out.println(c);

        // - als ik een object achter een String plaats wordt ook toString aangeroepen
        String veter = "Poedel: " +c;
        String nogEenVoorbeeld = c.toString();

        System.out.println(veter);

        SnaarInstrument piano = new SnaarInstrument(3.5);
        piano.setAantalSnaren(80);
        System.out.println(piano.getPrice());

        System.out.println(piano.getAantalSnaren());

        Instrument m = new SnaarInstrument(3.5);
        System.out.println(m.toString());
        System.out.println(m.getClass().getSimpleName());

        if(piano.equals(m)) {

        }

        int n = 15;

        char c2 = 'c';
        System.out.println(c2);
    }
}
