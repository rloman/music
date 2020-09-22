package nl.rug.ifthen;

public class App {

    public static void main(String[] args) {

        int age = 52;

        if (age < 52) {
            // wordt uitgevoerd als expressie hierboven waar is
            System.out.println("U bent jong");
        } else {
            System.out.println("Fijn he");
        }

        boolean isFemale = false;
        if (isFemale == false) {
            System.out.println("U bent female");
        }
        else  {
            System.out.println("U bent male");
        }

        System.out.println(isFemale);
    }
}
