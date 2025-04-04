package produits;

public interface IProduit <P extends Produit> {

	String decrireProduit();

	String getNom();

	int calculerPrix(int prix);
}