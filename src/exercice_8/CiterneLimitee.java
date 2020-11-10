package exercice_8;

public abstract class CiterneLimitee extends Citerne{

	private int quantiteMax;
	private GestionnaireSurplus gestionnaireSurplus;
	
	public CiterneLimitee(String nom, int quantiteMax, GestionnaireSurplus gestionnaireSurplus) {
		super(nom);
		this.quantiteMax = quantiteMax;
		this.gestionnaireSurplus = gestionnaireSurplus;
	}
	
	public int getQuantiteMax() {
		return quantiteMax;
	}
	
	public void recoit(int n) {	
		if (getQuantite() > getQuantiteMax())
			gereSurplus();
	}
	
	public void gereSurplus() {
		gestionnaireSurplus.gereSurplus(this);
	}

}
