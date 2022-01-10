package Model;

public class Produkt {
    private String name;
    private int preis;
    private int sku;
    private int anzahl;


    /**
     * constructor
     */
    public Produkt(String name, int preis, int sku, int anzahl){
        this.name = name;
        this.preis = preis;
        this.sku = sku;
        this.anzahl = anzahl;
    }

    public int getSku() {
        return sku;
    }

    public String getName() {
        return name;
    }

    public int getAnzahl() {
        return anzahl;
    }

    public int getPreis() {
        return preis;
    }

    public void setPreis(int preis) {
        this.preis = preis;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAnzahl(int anzahl) {
        this.anzahl = anzahl;
    }

    public void setSku(int sku) {
        this.sku = sku;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "name='" + name + '\'' +
                ", preis=" + preis +
                ", sku=" + sku +
                ", anzahl=" + anzahl +
                '}';
    }
}
