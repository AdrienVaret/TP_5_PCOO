package exercice_8;

public class CiterneLimiteAutovidante extends CiterneLimitee{

	public CiterneLimiteAutovidante(String nom, int quantiteMax) {
		super(nom, quantiteMax, new GereSurplusVide());
	}
}
