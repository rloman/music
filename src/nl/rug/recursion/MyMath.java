package nl.rug.recursion;

public final class MyMath {

    public static int fac(int n) {
        // fac(3) = 3.2.1
        // fac(3) = 3 * fac(2)
        // fac2) = 2 * fac(1)
        // fac(1) = 1 * fac(0)
        // fac(0) = 1

        // 1) Simple geval
        // 2) Maak hem kleiner
        // 3) Roep aan met die versimpelder versie

        if(n == 0) {
            return 1;
        }
        else {
            return n * fac(n-1);
        }
    }

    private MyMath() {

    }
}
