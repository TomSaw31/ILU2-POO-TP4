package produits;

public class Poisson extends Produit {
	private String datePeche;

	public Poisson(String date) {
		super("poisson", Unite.PIECE);
		this.datePeche = date;
	}

	@Override
	public String decrireProduit() {
		return getNom() + "s pêchés " + datePeche + ".";
	}
}
