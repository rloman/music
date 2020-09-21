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
    }
}
