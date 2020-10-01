package nl.rug.gc;

public class App {

    public static void main(String[] args) throws InterruptedException {
        for(int i = 0;i<10;i++) {
            Pauk p = new Pauk(i);
            p = null;
        }
        // alle Pauken zijn nu eligible for GC

        System.gc();

        Thread.sleep(10000); // ms
    }
}
