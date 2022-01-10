package Repository;

import Model.Produkt;

import java.util.List;

public interface ProduktInterface {


    /**
     * @param name name of the product
     * @param preis price of the product
     * @param sku sku of the product
     * @param anzahl number of products
     * @return the added Product
     */
    Produkt addProdukt(String name, int preis, int sku, int anzahl);

    /**
     * @param Sku parameter after we search
     */
    void deleteProdukt(int Sku);

    /**
     * @param sku name of the product
     * @param anzahl number of products we add/subtract
     */
    void updateActor(int sku, int anzahl);

    /**
     * Get all Products
     */
    List<Produkt> getAll();

}
