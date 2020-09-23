package nl.rug.arrays;

public class App {

    public static void main(String[] args) {


        {
            int[] fib = new int[6];
            fib[0] = 2;
            fib[1] = 3;
            fib[2] = 5;
            fib[3] = 8;
            fib[4] = 13;
            fib[5] = 21;

            System.out.println(fib[4]);
        }

        {
            int[] fib = new int[]{2, 3, 5, 8, 13, 21};
            System.out.println(fib[3]);


        }

        {
            int[] fib = new int[]{2, 3, 5, 8, 13, 21};
            System.out.println(fib[3]);
        }


        {
            int[] fib = new int[]{2, 3, 5, 8, 13, 21};
            // enhanced for   (for each in andere programmertalen)
            for (int element : fib) {
                System.out.println(element);
            }

            System.out.println(fib.length);

            // basic for over an array
            for (int i = 0; i < fib.length; i++) {
                System.out.println(i + ") " + fib[i]);
            }


        }


    }
}
