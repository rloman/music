package nl.rug.constructors;

import java.time.LocalDate;

public class Persoon {

    private String name;
    private LocalDate dateOfBirth;

    static {
        System.out.println("Static block 1 called");
    }

    static {
        System.out.println("Static block 3 called");
    }

    static {
        System.out.println("Static block 2 called");
    }

    public Persoon() {
        this("John Doe", LocalDate.of(1990, 1, 1));
    }

    public Persoon(String name, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        System.out.println("Constructor called");
    }

    public String getName() {
//        this.name ="Poedel"; // vout
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
}
