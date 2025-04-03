package produits;

public abstract class Produit {
	private String nom;
	private Unite unite;

	public abstract String decrireProduit();

	protected Produit(String nom, Unite unite) {
		this.nom = nom;
		this.unite = unite;
	}

	public String getNom() {
		return nom;
	}
}
