package villagegaulois;

import personnages.Gaulois;
import produits.Produit;

public class Etal <P extends Produit> implements IEtal {
    private Gaulois vendeur;
    private P produit;
    private int quantiteDebutMarche;
    private int quantite;
    private boolean etalOccupe = false;
    
    @Override
    public boolean isEtalOccupe() {
        return etalOccupe;
    }

    @Override
    public P getProduit() {
        return produit;
    }

    @Override
    public Gaulois getVendeur() {
        return vendeur;
    }

    @Override
    public int getQuantite() {
        return quantite;
    }

}