package nl.rug.defaults;

public class App {


    public static void main(String[] args) {
        Guitar guitar = new Guitar();

        guitar.pp();
    }

}


class Guitar {

    private int strings;
    private String brand;

    public void pp() {

        String firstName = null;
        System.out.println(strings);
        System.out.println(brand);

        System.out.println(firstName);
    }

}