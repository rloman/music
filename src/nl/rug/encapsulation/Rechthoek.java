package nl.rug.encapsulation;


 // lengte = 3xbreedte
public class Rechthoek {

    private double breedte;

    public Rechthoek(int breedte) {
        this.breedte = breedte;
    }

    public double getLengte() {
        return 3 * this.breedte;
    }

    public double getBreedte() {
        return this.breedte;
    }

    public void setBreedte(double breedte) {
        this.breedte = breedte;
    }

    public void setLengte(double lengte) {
        this.breedte = lengte/3;
    }
}
