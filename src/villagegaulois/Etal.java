package villagegaulois;

import personnages.Gaulois;
import produits.Produit;

public class Etal <P extends Produit> {
	private Gaulois vendeur;
	private P produit;
	private int quantiteDebutMarche;
	private int quantite;
	private boolean etalOccupe = false;

	public boolean isEtalOccupe() {
		return etalOccupe;
	}

	public Gaulois getVendeur() {
		return vendeur;
	}

	public int getQuantite() {
		return quantite;
	}
	
	public P getProduit() {
		return produit;
	}

}
