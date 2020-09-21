package nl.rug.scope;

import java.util.List;

public class Singer {

    public static int BTW = 21; // global variable

    private String name; // field, instance variable, attribute
    private int myAge;
    private List songs;

    public  Singer() {

    }

    public int getMyAge() {
        return myAge;
    }

    public void setMyAge(int myAge) {
        this.myAge = myAge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void foo() {

        int age = 45; // local variable

        System.out.println(age);

    }

    public void printit() {

        System.out.println(name);
        System.out.println(myAge);
    }
}
