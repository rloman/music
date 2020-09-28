package nl.rug.access;

public class Dog {

    private String name;
    private int age;

    public static int dogCounter = 0;

    public static double belastingPercentage = 3.0;

    static {
        System.out.println("Starting static block");
        dogCounter = 500;
        belastingPercentage = 4.0;

        for( int i = 0;i<10;i++) {
//            System.out.println("in static block:"+i);
        }
        System.out.println("Einde static block");
    }

    public Dog() {
        System.out.println("Starting constructor");
        Dog.dogCounter++;
        System.out.println("Einde constructor");
    }

    public String getName() {
        verjaar();
        return name;
    }

    public void foo() {
        if (age <= 13) {
            return;
        }
        age++;
    }

    public int bar() {
        return new Byte(String.valueOf(3));
    }

    // default access modifier
    void setName(String name) {
        this.name = name;
    }

    protected void verjaar() {

        Dog andere = new Dog();
        andere.verjaar();
        age++;
    }
}
