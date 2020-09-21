import nl.rug.domain.Instrument;

public class App {

        //psvm (enter) / psvm tab

    public static void main(String[] args) {

        Instrument mijnViool = new Instrument();

        mijnViool.setPrice(14.95);

        System.out.println(mijnViool.getPrice());

    }
}
