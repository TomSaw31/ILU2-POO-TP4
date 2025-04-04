package villagegaulois;

import personnages.Gaulois;

public interface IEtal {
	Gaulois getVendeur();

	int contientProduit(String produit, int quantiteSouhaitee);

	int acheterProduit(int quantiteSouhaitee);

	String etatEtal();
}
