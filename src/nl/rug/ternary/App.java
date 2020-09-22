package nl.rug.ternary;

public class App {

    public static boolean isSinger() {
        return true;
    }

    public static void main(String[] args) {

        int age = 50;

        String label = age < 50 && isSinger() ? "Jong" : "Senior " + isSinger();

        System.out.println(label);

    }
}
