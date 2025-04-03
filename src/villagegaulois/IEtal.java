package villagegaulois;

import personnages.Gaulois;
import produits.Produit;

public interface IEtal<P extends Produit> {

    boolean isEtalOccupe();

    P getProduit();

    Gaulois getVendeur();

    int getQuantite();

}