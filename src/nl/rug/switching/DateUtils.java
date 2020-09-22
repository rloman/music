package nl.rug.switching;

public class DateUtils {

    public int daysOfMonth(int monthNumber) {

        int age = 52; // valid identifier ::= start with a letter of $ of _, daarna eventueel cijfer

        int result = -1;

        switch (monthNumber) {

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                result = 31;
                break;

            case 2:
                result = 28;

                break;
            case 4:
            case 6:
            case 9:
            case 11:
                result = 30;

                break;

            default:
                result = 29;
                break;
        }

        return result;

    }
}
