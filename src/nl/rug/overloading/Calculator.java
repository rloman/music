package nl.rug.overloading;

public class Calculator {

    public static int sum() {

        return 0;
    }

    public static double sum(double n) {

        return n;
    }


    public static int sum(int n, int m) {

        return n+m;
    }

    public static int sum(Integer n, Integer m) {
        return n+m;
    }

    public static double sum(double n, double m) {
        return n+m;
    }



    // int[] and int... zijn beiden arrays, => compile error
    /*
    public static void stom(int[] numbers) {

    }

    public static void stom(int... args) {

    }
     */
}
