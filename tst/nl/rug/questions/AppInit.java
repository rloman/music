package nl.rug.questions;

import nl.rug.access.Dog;

public class AppInit extends Dog {

    public static void main(String[] args) {
       AppInit d = new AppInit();
       d.bar();
    }

    public void foo() {
        int x = 0;
        float y = 4;
        for (y = 0, x = 4; x < 5 && y < 10; x++, y++) {
            System.out.println(x + y);
        }

        this.bar();
    }
}
