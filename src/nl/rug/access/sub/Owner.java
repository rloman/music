package nl.rug.access.sub;

import nl.rug.access.Dog;

import java.time.LocalDate;

public class Owner extends Dog {

    private int age;


    public static void main(String[] args) {

//        age++; // vout, je moet een instance variable vanuit een instance method benaderen en
        // niet via de static method(s).

        System.out.println(Dog.dogCounter);
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        Dog d3 = new Dog();

        System.out.println(Dog.dogCounter);

        /*

        System.out.println(Math.sqrt(4));

        System.out.println(Math.PI);

        System.out.println(Math.pow(2,3));

        LocalDate now = LocalDate.now();


        System.out.println(Dog.dogCounter);
        */
    }

    public void bar2() {
        this.verjaar();
    }

}
