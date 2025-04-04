package produits;

public abstract class Produit implements IProduit {
	private String nom;
	private Unite unite;

	protected Produit(String nom, Unite unite) {
		this.nom = nom;
		this.unite = unite;
	}

	public String getNom() {
		return nom;
	}
	
	public int calculerPrix(int prix) {
		return prix;
	}
}
