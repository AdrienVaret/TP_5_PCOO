package exercice_8;

public class CiterneLimiteAutovidante extends CiterneLimitee{

	public CiterneLimiteAutovidante(String nom, int quantiteMax) {
		super(nom, quantiteMax);
	}

	@Override
	public void recoit(int n) {
		
		
		if (getQuantite() > getQuantiteMax())
			gereSurplus();
	}
	
	@Override
	public void gereSurplus() {
		vide(getQuantiteMax() - getQuantite());
	}

}
