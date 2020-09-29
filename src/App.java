import nl.rug.domain.Instrument;
import nl.rug.domain.SnaarInstrument;

public class App {

        //psvm (enter) / psvm tab

    public static void main(String[] args) {

        SnaarInstrument mijnViool = new SnaarInstrument(5.5);

        mijnViool.setPrice(14.95);

        System.out.println(mijnViool.getPrice());

    }
}
