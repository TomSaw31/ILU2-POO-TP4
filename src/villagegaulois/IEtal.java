package villagegaulois;

import personnages.Gaulois;
import produits.Produit;

public interface IEtal {

    boolean isEtalOccupe();

    Produit getProduit();

    Gaulois getVendeur();

    int getQuantite();

}