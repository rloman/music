package nl.rug.exceptions.demo;

public class AppParseInt {

//    private static final Logger LOGGER = LoggerFactory.getLogger(AppParseInt.class);

    public static void main(String[] args) {

        String input = "aap";

        boolean inputIsNumeric = isNumeric(input);

        System.out.println(inputIsNumeric);

        input = "42";

        inputIsNumeric = isNumeric(input);

        System.out.println(inputIsNumeric);


    }

    public static boolean isNumeric(String input) {
        try {
            int n = Integer.parseInt(input);

            return true;
        }
        catch(NumberFormatException nfe) {
//            LOGGER.debug("Dat is geen geldig getal"+input);
            return false;
        }
    }
}
