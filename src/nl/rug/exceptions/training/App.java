package nl.rug.exceptions.training;

public class App {

    public static void main(String[] args) {

        try {
            System.out.println(divide(5,1));
        } catch (ErwinException e) {
            e.printStackTrace();
        }
        finally {

        }

    }

    public static int divide(int n, int m ) throws ErwinException {
        return n/m;
    }
}


class ErwinException extends Exception {

}

class ErikException extends RuntimeException {

}
