package nl.rug.operators;

public class App {

    public static void main(String[] args) {


        // a++ => a = a+1
        // ++a => a = a + 1

        {
            int a =3;

            System.out.println(a++); // postfix increment. doe eerst, dan verhoog. eerst print, dan +1
            System.out.println(a);
        }

        System.out.println("Nu de prefix increment");
        {
            int a =3;

            System.out.println(++a); // prefix increment. verhoog eerst, dan doe. eerst +1 dan print
            System.out.println(a);
        }

        {
            int a =3;

            a = -a;

            System.out.println(a);
        }

        {
            boolean isMale = false;
            System.out.println(!isMale);
        }

        // mod, modulus
        {
            int size = 9;
            int trainees =  14;

            int buiten = 14 % 9;

            System.out.println(buiten);

        }

    }
}
