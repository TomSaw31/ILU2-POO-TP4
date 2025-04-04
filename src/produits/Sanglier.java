package produits;

import personnages.Gaulois;

public class Sanglier extends Produit {
	private int poids;
	private Gaulois chasseur;

	public Sanglier(int poids, Gaulois chasseur) {
		super("sanglier", Unite.KILOGRAMME);
		this.poids = poids;
		this.chasseur = chasseur;
	}

	@Override
	public String decrireProduit() {
		return getNom() + " de " + poids + " kg chassé par " + chasseur.getNom() + ".";
	}

	public int calculerPrix(int prix) {
		return prix * poids/1000;
	}
}
