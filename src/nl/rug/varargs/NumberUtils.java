package nl.rug.varargs;

public class NumberUtils {

    public static int max(int first, int... rest) {
        int max = first;

        for(int element: rest) {
            if(element > max) {
                max = element;
            }
        }

        return max;
    }
}
