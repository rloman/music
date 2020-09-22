package nl.rug.arrays.solution;

public class App {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5};

        int sum = 0;
        for (int element : nums) {
            sum += element;
        }

        System.out.println(sum);

        // tafel van 1 t/m 4
        OUTER_LOOP:
        for (int i = 1; i <= 4; i++) {
            INNER_LOOP:
            for (int j = 1; j <= 4; j++) {
                int uitkomst = i*j;
                if(uitkomst == 6) {
                    break OUTER_LOOP;
                }
                System.out.println(j + "x" + i + "=" + uitkomst);
//                System.out.printf("%02dx%02d=%02d%n", j,i, i*j);
            }
            System.out.println();
            System.out.println();
        }
    }
}
