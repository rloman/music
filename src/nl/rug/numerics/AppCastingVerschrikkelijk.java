package nl.rug.numerics;

public class AppCastingVerschrikkelijk {

    public static void main(String[] args) {
        int bacteries = 1_737_373_838;

        short diertjes = (short) bacteries;

        System.out.println("Aantal gevonden bateries: " + diertjes);
        //  1921222
        // 0101.0000.1100.0110


        int x = 3;

        int z = 2;

        z *= x;

        System.out.println(z);

        if (z == 7) {
            System.out.println("Jippie, goed zo!");
        }
        else {
            System.out.println("U mag eerst uw hoofdrekenen gaan bijspijkeren");
        }
    }
}
