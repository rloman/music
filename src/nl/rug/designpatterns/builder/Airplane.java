package nl.rug.designpatterns.builder;

public class Airplane {

    private int fuel;
    private String type;
    private int aantalStoelen;

    // and 50 more ...

    private Airplane(AirplaneBuilder builder) {
        this.fuel = builder.fuel;
        this.type = builder.type;
        this.aantalStoelen = builder.aantalStoelen;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAantalStoelen() {
        return aantalStoelen;
    }

    public void setAantalStoelen(int aantalStoelen) {
        this.aantalStoelen = aantalStoelen;
    }

    public static class AirplaneBuilder {

        private String type;
        private int fuel;
        private int aantalStoelen;


        // verplicht voor Airplane => verplicht voor de builder
        public AirplaneBuilder(String type, int aantalStoelen) {
            this.type = type;
        }

        public AirplaneBuilder fuel(int fuel) {
            this.fuel = fuel;

            return this;
        }

        public AirplaneBuilder aantalStoelen(int aantalStoelen) {
            this.aantalStoelen = aantalStoelen;

            return this;
        }

        public Airplane build() {
            return new Airplane(this);
        }

    }
}
