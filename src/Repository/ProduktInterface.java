package Repository;

import Model.Produkt;

import java.util.List;

public interface ProduktInterface {


    Produkt addProdukt(String name, int preis, int sku, int anzahl);

    void deleteProdukt(int Sku);

    void updateActor(int sku, int anzahl);

    /**
     * Get all Products
     */
    List<Produkt> getAll();

}
