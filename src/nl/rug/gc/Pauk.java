package nl.rug.gc;

public class Pauk {

    private long id;

    public Pauk(long id) {
        this.id = id;
    }

    @Override
    protected void finalize() throws Throwable {

        System.out.println("De pauk wordt nu opgeruimd met id: "+this.id);
    }
}
