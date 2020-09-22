package nl.rug.looping.forloops;

public class AppBasicFor {

    public static void main(String[] args) {

        // basic for
        for(int i = 1;i<=10;i++) {
            System.out.println("Het kwadraat van "+i+"="+i*i);
        }

        String[] names = new String[]{"Floris", "Walter", "Gerard"};
        // enhanced for
        for(String name : names) {
            System.out.println(name);
        }

        // forever
//        for(;;) {
//            System.out.println("For ever and ever ... -- Demis Roussos");
//        }
    }

}
