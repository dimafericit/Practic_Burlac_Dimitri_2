package Repository;

import Model.Produkt;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Produktrepo implements ProduktInterface{

    private final List<Produkt> List;

    public Produktrepo() {
        List = new ArrayList<>();
    }

    @Override
    public Produkt addProdukt(String name, int preis, int sku, int anzahl) {
        Produkt prod = new Produkt(name, preis, sku, anzahl);
        List.add(prod);
        return prod;
    }

    @Override
    public void deleteProdukt(int Sku) {
        for (Produkt produkt : List)
            if (produkt.getSku() == Sku){
                List.remove(produkt);
                break;
            }
    }

    @Override
    public void updateActor(int sku, int anzahl) {
        for (Produkt prod :
                List) {
            if (Objects.equals(prod.getSku(), sku)) {
                prod.setAnzahl(prod.getAnzahl() + anzahl);
            }
        }
    }

    @Override
    public List<Produkt> getAll() {
        return List;
    }
}
